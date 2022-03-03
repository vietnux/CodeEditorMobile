package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bm;
import com.google.android.gms.internal.ads.cn;
import java.security.GeneralSecurityException;

final class nk implements xj<pj> {
    nk() {
    }

    private static bm a() {
        bm.a k2 = bm.k();
        k2.a(0);
        k2.a(fq.a(hp.a(32)));
        return (bm) k2.h();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final pj c(fq fqVar) {
        try {
            bm b2 = bm.b(fqVar);
            if (b2 instanceof bm) {
                mp.a(b2.i(), 0);
                if (b2.j().size() == 32) {
                    return new ho(b2.j().b());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        bm a = a();
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        o.a(a.e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        return a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        if (ssVar instanceof bm) {
            bm bmVar = (bm) ssVar;
            mp.a(bmVar.i(), 0);
            if (bmVar.j().size() == 32) {
                return new ho(bmVar.j().b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
