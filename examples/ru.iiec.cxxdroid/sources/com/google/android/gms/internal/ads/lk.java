package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.ql;
import java.security.GeneralSecurityException;

final class lk implements xj<pj> {
    lk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final pj c(fq fqVar) {
        try {
            ql b2 = ql.b(fqVar);
            if (b2 instanceof ql) {
                mp.a(b2.i(), 0);
                mp.a(b2.j().size());
                if (b2.k().i() != 12) {
                    if (b2.k().i() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new Cdo(b2.j().b(), b2.k().i());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        o.a(((ql) b(fqVar)).e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof tl) {
            tl tlVar = (tl) ssVar;
            mp.a(tlVar.i());
            if (tlVar.j().i() == 12 || tlVar.j().i() == 16) {
                ql.a o = ql.o();
                o.a(fq.a(hp.a(tlVar.i())));
                o.a(tlVar.j());
                o.a(0);
                return o.h();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(tl.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        if (ssVar instanceof ql) {
            ql qlVar = (ql) ssVar;
            mp.a(qlVar.i(), 0);
            mp.a(qlVar.j().size());
            if (qlVar.k().i() == 12 || qlVar.k().i() == 16) {
                return new Cdo(qlVar.j().b(), qlVar.k().i());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
