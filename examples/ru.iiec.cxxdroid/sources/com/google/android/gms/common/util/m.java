package com.google.android.gms.common.util;

public class m {
    public static int a(byte[] bArr, int i2, int i3, int i4) {
        int i5 = (i3 & -4) + i2;
        while (i2 < i5) {
            int i6 = ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24)) * -862048943;
            int i7 = i4 ^ (((i6 << 15) | (i6 >>> 17)) * 461845907);
            i4 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i8 = 0;
        int i9 = i3 & 3;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i8 = (bArr[i5 + 2] & 255) << 16;
                }
                int i10 = i4 ^ i3;
                int i11 = (i10 ^ (i10 >>> 16)) * -2048144789;
                int i12 = (i11 ^ (i11 >>> 13)) * -1028477387;
                return i12 ^ (i12 >>> 16);
            }
            i8 |= (bArr[i5 + 1] & 255) << 8;
        }
        int i13 = ((bArr[i5] & 255) | i8) * -862048943;
        i4 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        int i102 = i4 ^ i3;
        int i112 = (i102 ^ (i102 >>> 16)) * -2048144789;
        int i122 = (i112 ^ (i112 >>> 13)) * -1028477387;
        return i122 ^ (i122 >>> 16);
    }
}
