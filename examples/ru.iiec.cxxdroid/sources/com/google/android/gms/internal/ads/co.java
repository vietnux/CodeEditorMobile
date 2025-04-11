package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class co implements ep {
    private final SecretKeySpec a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4040b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4041c = to.f5645f.a("AES/CTR/NoPadding").getBlockSize();

    public co(byte[] bArr, int i2) {
        this.a = new SecretKeySpec(bArr, "AES");
        if (i2 < 12 || i2 > this.f4041c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4040b = i2;
    }

    @Override // com.google.android.gms.internal.ads.ep
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f4040b;
        if (length <= Integer.MAX_VALUE - i2) {
            byte[] bArr2 = new byte[(bArr.length + i2)];
            byte[] a2 = hp.a(i2);
            System.arraycopy(a2, 0, bArr2, 0, this.f4040b);
            int length2 = bArr.length;
            int i3 = this.f4040b;
            Cipher a3 = to.f5645f.a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f4041c];
            System.arraycopy(a2, 0, bArr3, 0, this.f4040b);
            a3.init(1, this.a, new IvParameterSpec(bArr3));
            if (a3.doFinal(bArr, 0, length2, bArr2, i3) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i4 = Integer.MAX_VALUE - i2;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i4);
        throw new GeneralSecurityException(sb.toString());
    }
}
