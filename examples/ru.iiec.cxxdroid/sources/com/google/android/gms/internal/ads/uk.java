package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao;
import java.security.GeneralSecurityException;

public final class uk {
    public static final ao a;

    static {
        ao.a j2 = ao.j();
        j2.a((mr) ik.a);
        ao.a aVar = j2;
        aVar.a(sj.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        aVar.a(sj.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        aVar.a("TINK_HYBRID_1_0_0");
        a = (ao) aVar.h();
        ao.a j3 = ao.j();
        j3.a((mr) a);
        ao.a aVar2 = j3;
        aVar2.a("TINK_HYBRID_1_1_0");
        ao aoVar = (ao) aVar2.h();
        try {
            fk.a("TinkHybridEncrypt", new wk());
            fk.a("TinkHybridDecrypt", new vk());
            ik.a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
