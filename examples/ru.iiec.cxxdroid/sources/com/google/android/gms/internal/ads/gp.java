package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class gp {
    private static long a(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    private static long a(byte[] bArr, int i2, int i3) {
        return (a(bArr, i2) >> i3) & 67108863;
    }

    private static void a(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) ((int) (255 & j2));
            i3++;
            j2 >>= 8;
        }
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long a = a(bArr, 0, 0) & 67108863;
            int i2 = 2;
            int i3 = 3;
            long a2 = a(bArr, 3, 2) & 67108611;
            long a3 = a(bArr, 6, 4) & 67092735;
            long a4 = a(bArr, 9, 6) & 66076671;
            long a5 = a(bArr, 12, 8) & 1048575;
            long j2 = a2 * 5;
            long j3 = a3 * 5;
            long j4 = a4 * 5;
            long j5 = a5 * 5;
            byte[] bArr3 = new byte[17];
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            int i4 = 0;
            while (i4 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i4);
                System.arraycopy(bArr2, i4, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long a6 = j10 + a(bArr3, 0, 0);
                long a7 = j6 + a(bArr3, i3, i2);
                long a8 = j7 + a(bArr3, 6, 4);
                long a9 = j8 + a(bArr3, 9, 6);
                long a10 = j9 + (a(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j11 = (a6 * a) + (a7 * j5) + (a8 * j4) + (a9 * j3) + (a10 * j2);
                long j12 = (a6 * a2) + (a7 * a) + (a8 * j5) + (a9 * j4) + (a10 * j3) + (j11 >> 26);
                long j13 = (a6 * a3) + (a7 * a2) + (a8 * a) + (a9 * j5) + (a10 * j4) + (j12 >> 26);
                long j14 = (a6 * a4) + (a7 * a3) + (a8 * a2) + (a9 * a) + (a10 * j5) + (j13 >> 26);
                long j15 = (a6 * a5) + (a7 * a4) + (a8 * a3) + (a9 * a2) + (a10 * a) + (j14 >> 26);
                long j16 = (j11 & 67108863) + ((j15 >> 26) * 5);
                j6 = (j12 & 67108863) + (j16 >> 26);
                i4 += 16;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                j9 = j15 & 67108863;
                j10 = j16 & 67108863;
                i2 = 2;
                i3 = 3;
            }
            long j17 = j7 + (j6 >> 26);
            long j18 = j17 & 67108863;
            long j19 = j8 + (j17 >> 26);
            long j20 = j19 & 67108863;
            long j21 = j9 + (j19 >> 26);
            long j22 = j21 & 67108863;
            long j23 = j10 + ((j21 >> 26) * 5);
            long j24 = j23 & 67108863;
            long j25 = (j6 & 67108863) + (j23 >> 26);
            long j26 = j24 + 5;
            long j27 = j26 & 67108863;
            long j28 = (j26 >> 26) + j25;
            long j29 = j18 + (j28 >> 26);
            long j30 = j20 + (j29 >> 26);
            long j31 = (j22 + (j30 >> 26)) - 67108864;
            long j32 = j31 >> 63;
            long j33 = ~j32;
            long j34 = (j24 & j32) | (j27 & j33);
            long j35 = (j25 & j32) | (j28 & 67108863 & j33);
            long j36 = (j18 & j32) | (j29 & 67108863 & j33);
            long j37 = (j20 & j32) | (j30 & 67108863 & j33);
            long j38 = ((j31 & j33) | (j22 & j32)) << 8;
            long a11 = (((j35 << 26) | j34) & 4294967295L) + a(bArr, 16);
            long j39 = a11 & 4294967295L;
            long a12 = (((j35 >> 6) | (j36 << 20)) & 4294967295L) + a(bArr, 20) + (a11 >> 32);
            long a13 = (((j36 >> 12) | (j37 << 14)) & 4294967295L) + a(bArr, 24) + (a12 >> 32);
            byte[] bArr4 = new byte[16];
            a(bArr4, j39, 0);
            a(bArr4, a12 & 4294967295L, 4);
            a(bArr4, a13 & 4294967295L, 8);
            a(bArr4, (((j38 | (j37 >> 18)) & 4294967295L) + a(bArr, 28) + (a13 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
