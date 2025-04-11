package c.h.i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import c.h.i.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* access modifiers changed from: package-private */
public class c {
    private static final Comparator<byte[]> a = new a();

    class a implements Comparator<byte[]> {
        a() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            if (bArr.length != bArr2.length) {
                i3 = bArr.length;
                i2 = bArr2.length;
            } else {
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    if (bArr[i4] != bArr2[i4]) {
                        i3 = bArr[i4];
                        i2 = bArr2[i4];
                    }
                }
                return 0;
            }
            return (i3 == 1 ? 1 : 0) - (i2 == 1 ? 1 : 0);
        }
    }

    static ProviderInfo a(PackageManager packageManager, d dVar, Resources resources) {
        String d2 = dVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (resolveContentProvider.packageName.equals(dVar.e())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, a);
            List<List<byte[]>> a3 = a(dVar, resources);
            for (int i2 = 0; i2 < a3.size(); i2++) {
                ArrayList arrayList = new ArrayList(a3.get(i2));
                Collections.sort(arrayList, a);
                if (a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + dVar.e());
        }
    }

    static f.a a(Context context, d dVar, CancellationSignal cancellationSignal) {
        ProviderInfo a2 = a(context.getPackageManager(), dVar, context.getResources());
        return a2 == null ? f.a.a(1, null) : f.a.a(0, a(context, dVar, a2.authority, cancellationSignal));
    }

    private static List<List<byte[]>> a(d dVar, Resources resources) {
        return dVar.a() != null ? dVar.a() : c.h.d.d.c.a(resources, dVar.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static f.b[] a(Context context, d dVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.f()}, null, cancellationSignal) : context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.f()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(f.b.a(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f.b[]) arrayList.toArray(new f.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
