package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.pn;
import java.security.GeneralSecurityException;

final class ok implements xj<pj> {
    ok() {
    }

    private static pj c(ss ssVar) {
        if (ssVar instanceof pn) {
            pn pnVar = (pn) ssVar;
            mp.a(pnVar.i(), 0);
            String i2 = pnVar.j().i();
            return ak.a(i2).b(i2);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    private static pj d(fq fqVar) {
        try {
            return c(pn.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        o.a(((pn) b(fqVar)).e());
        o.a(cn.b.REMOTE);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof rn) {
            pn.a o = pn.o();
            o.a((rn) ssVar);
            o.a(0);
            return o.h();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(rn.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        return c(ssVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj c(fq fqVar) {
        return d(fqVar);
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
