package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.xl;
import java.security.GeneralSecurityException;

final class mk implements xj<pj> {
    mk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final pj c(fq fqVar) {
        try {
            xl b2 = xl.b(fqVar);
            if (b2 instanceof xl) {
                mp.a(b2.i(), 0);
                mp.a(b2.j().size());
                return new eo(b2.j().b());
            }
            throw new GeneralSecurityException("expected AesGcmKey proto");
        } catch (sr unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        o.a(((xl) b(fqVar)).e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof zl) {
            zl zlVar = (zl) ssVar;
            mp.a(zlVar.i());
            xl.a k2 = xl.k();
            k2.a(fq.a(hp.a(zlVar.i())));
            k2.a(0);
            return k2.h();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(zl.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        if (ssVar instanceof xl) {
            xl xlVar = (xl) ssVar;
            mp.a(xlVar.i(), 0);
            mp.a(xlVar.j().size());
            return new eo(xlVar.j().b());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
