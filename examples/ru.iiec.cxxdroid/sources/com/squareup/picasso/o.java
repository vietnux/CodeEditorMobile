package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;

/* access modifiers changed from: package-private */
public class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f6849b = {"orientation"};

    /* access modifiers changed from: package-private */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: b  reason: collision with root package name */
        final int f6854b;

        /* renamed from: c  reason: collision with root package name */
        final int f6855c;

        /* renamed from: d  reason: collision with root package name */
        final int f6856d;

        private a(int i2, int i3, int i4) {
            this.f6854b = i2;
            this.f6855c = i3;
            this.f6856d = i4;
        }
    }

    o(Context context) {
        super(context);
    }

    static int a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f6849b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i2 = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i2;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (0 != 0) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    static a a(int i2, int i3) {
        a aVar = a.MICRO;
        if (i2 <= aVar.f6855c && i3 <= aVar.f6856d) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i2 > aVar2.f6855c || i3 > aVar2.f6856d) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        Bitmap bitmap;
        ContentResolver contentResolver = this.a.getContentResolver();
        int a2 = a(contentResolver, wVar.f6912d);
        String type = contentResolver.getType(wVar.f6912d);
        boolean z = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a a3 = a(wVar.f6916h, wVar.f6917i);
            if (!z && a3 == a.FULL) {
                return new y.a(null, l.a(c(wVar)), t.e.DISK, a2);
            }
            long parseId = ContentUris.parseId(wVar.f6912d);
            BitmapFactory.Options b2 = y.b(wVar);
            b2.inJustDecodeBounds = true;
            y.a(wVar.f6916h, wVar.f6917i, a3.f6855c, a3.f6856d, b2, wVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, a3 == a.FULL ? 1 : a3.f6854b, b2);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, a3.f6854b, b2);
            }
            if (bitmap != null) {
                return new y.a(bitmap, null, t.e.DISK, a2);
            }
        }
        return new y.a(null, l.a(c(wVar)), t.e.DISK, a2);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean a(w wVar) {
        Uri uri = wVar.f6912d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
