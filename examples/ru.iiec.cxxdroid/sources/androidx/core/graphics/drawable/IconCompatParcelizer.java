package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = aVar.a(iconCompat.a, 1);
        iconCompat.f1064c = aVar.a(iconCompat.f1064c, 2);
        iconCompat.f1065d = aVar.a(iconCompat.f1065d, 3);
        iconCompat.f1066e = aVar.a(iconCompat.f1066e, 4);
        iconCompat.f1067f = aVar.a(iconCompat.f1067f, 5);
        iconCompat.f1068g = (ColorStateList) aVar.a(iconCompat.f1068g, 6);
        iconCompat.f1070i = aVar.a(iconCompat.f1070i, 7);
        iconCompat.f1071j = aVar.a(iconCompat.f1071j, 8);
        iconCompat.d();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.a(true, true);
        iconCompat.a(aVar.c());
        int i2 = iconCompat.a;
        if (-1 != i2) {
            aVar.b(i2, 1);
        }
        byte[] bArr = iconCompat.f1064c;
        if (bArr != null) {
            aVar.b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1065d;
        if (parcelable != null) {
            aVar.b(parcelable, 3);
        }
        int i3 = iconCompat.f1066e;
        if (i3 != 0) {
            aVar.b(i3, 4);
        }
        int i4 = iconCompat.f1067f;
        if (i4 != 0) {
            aVar.b(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f1068g;
        if (colorStateList != null) {
            aVar.b(colorStateList, 6);
        }
        String str = iconCompat.f1070i;
        if (str != null) {
            aVar.b(str, 7);
        }
        String str2 = iconCompat.f1071j;
        if (str2 != null) {
            aVar.b(str2, 8);
        }
    }
}
