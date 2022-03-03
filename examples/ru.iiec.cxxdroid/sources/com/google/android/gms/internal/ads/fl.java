package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao;
import java.security.GeneralSecurityException;

public final class fl {
    public static final ao a;

    static {
        ao.a j2 = ao.j();
        j2.a("TINK_MAC_1_0_0");
        j2.a(sj.a("TinkMac", "Mac", "HmacKey", 0, true));
        a = (ao) j2.h();
        ao.a j3 = ao.j();
        j3.a((mr) a);
        ao.a aVar = j3;
        aVar.a("TINK_MAC_1_1_0");
        ao aoVar = (ao) aVar.h();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        fk.a("TinkMac", new el());
    }
}
