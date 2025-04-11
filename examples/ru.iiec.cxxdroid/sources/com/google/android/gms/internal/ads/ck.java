package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.ln;
import java.security.GeneralSecurityException;

public final class ck {
    @Deprecated
    public static final yj a(byte[] bArr) {
        try {
            ln a = ln.a(bArr);
            for (ln.b bVar : a.j()) {
                if (bVar.j().k() == cn.b.UNKNOWN_KEYMATERIAL || bVar.j().k() == cn.b.SYMMETRIC || bVar.j().k() == cn.b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return yj.a(a);
        } catch (sr unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
