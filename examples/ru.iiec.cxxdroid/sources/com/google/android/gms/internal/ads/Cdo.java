package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.do  reason: invalid class name */
public final class Cdo implements pj {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4127b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f4128c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4129d;

    public Cdo(byte[] bArr, int i2) {
        if (i2 == 12 || i2 == 16) {
            this.f4129d = i2;
            this.f4128c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f4128c);
            this.a = a(instance.doFinal(new byte[16]));
            this.f4127b = a(this.a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] a(Cipher cipher, int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(b(bArr3, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        byte[] bArr4 = doFinal;
        int i5 = 0;
        while (i4 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArr4[i6] = (byte) (bArr4[i6] ^ bArr[(i3 + i5) + i6]);
            }
            bArr4 = cipher.doFinal(bArr4);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            bArr2 = b(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f4127b, 16);
            for (int i7 = 0; i7 < copyOfRange.length; i7++) {
                copyOf[i7] = (byte) (copyOf[i7] ^ copyOfRange[i7]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(b(bArr4, bArr2));
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 15) {
            int i4 = i3 + 1;
            bArr2[i3] = (byte) ((bArr[i3] << 1) ^ ((bArr[i4] & 255) >>> 7));
            i3 = i4;
        }
        int i5 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i5 ^ i2);
        return bArr2;
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.pj
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.f4129d;
        if (length <= (Integer.MAX_VALUE - i2) - 16) {
            byte[] bArr3 = new byte[(bArr.length + i2 + 16)];
            byte[] a2 = hp.a(i2);
            System.arraycopy(a2, 0, bArr3, 0, this.f4129d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f4128c);
            byte[] a3 = a(instance, 0, a2, 0, a2.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a4 = a(instance, 1, bArr4, 0, bArr4.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.f4128c, new IvParameterSpec(a3));
            instance2.doFinal(bArr, 0, bArr.length, bArr3, this.f4129d);
            byte[] a5 = a(instance, 2, bArr3, this.f4129d, bArr.length);
            int length2 = bArr.length + this.f4129d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[length2 + i3] = (byte) ((a4[i3] ^ a3[i3]) ^ a5[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
