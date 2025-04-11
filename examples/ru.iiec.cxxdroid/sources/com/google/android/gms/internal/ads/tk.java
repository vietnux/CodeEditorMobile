package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class tk implements xj<wj> {
    tk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final wj c(fq fqVar) {
        try {
            nm b2 = nm.b(fqVar);
            if (b2 instanceof nm) {
                mp.a(b2.i(), 0);
                zk.a(b2.j());
                jm j2 = b2.j();
                pm i2 = j2.i();
                return new ko(oo.a(zk.a(i2.i()), b2.k().b(), b2.o().b()), i2.k().b(), zk.a(i2.j()), zk.a(j2.k()), new bl(j2.j().i()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ wj b(ss ssVar) {
        if (ssVar instanceof nm) {
            nm nmVar = (nm) ssVar;
            mp.a(nmVar.i(), 0);
            zk.a(nmVar.j());
            jm j2 = nmVar.j();
            pm i2 = j2.i();
            return new ko(oo.a(zk.a(i2.i()), nmVar.k().b(), nmVar.o().b()), i2.k().b(), zk.a(i2.j()), zk.a(j2.k()), new bl(j2.j().i()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
