package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao;
import java.security.GeneralSecurityException;

public final class ik {
    public static final ao a;

    static {
        ao.a j2 = ao.j();
        j2.a((mr) fl.a);
        ao.a aVar = j2;
        aVar.a(sj.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        aVar.a(sj.a("TinkAead", "Aead", "AesEaxKey", 0, true));
        aVar.a(sj.a("TinkAead", "Aead", "AesGcmKey", 0, true));
        aVar.a(sj.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        aVar.a(sj.a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        aVar.a(sj.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        aVar.a("TINK_AEAD_1_0_0");
        a = (ao) aVar.h();
        ao.a j3 = ao.j();
        j3.a((mr) a);
        ao.a aVar2 = j3;
        aVar2.a("TINK_AEAD_1_1_0");
        ao aoVar = (ao) aVar2.h();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        fk.a("TinkAead", new hk());
        fl.a();
    }
}
