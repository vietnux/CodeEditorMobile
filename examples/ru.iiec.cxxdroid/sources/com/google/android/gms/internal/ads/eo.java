package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class eo implements pj {
    private final SecretKey a;

    public eo(byte[] bArr) {
        this.a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.pj
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a2 = hp.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            Cipher a3 = to.f5645f.a("AES/GCM/NoPadding");
            a3.init(1, this.a, new GCMParameterSpec(128, a2));
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a3.updateAAD(bArr2);
            a3.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
