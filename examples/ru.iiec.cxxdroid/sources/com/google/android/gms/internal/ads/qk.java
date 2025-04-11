package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.tn;
import java.security.GeneralSecurityException;

final class qk implements xj<pj> {
    qk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final pj c(fq fqVar) {
        try {
            tn a = tn.a(fqVar);
            if (a instanceof tn) {
                mp.a(a.i(), 0);
                String i2 = a.j().i();
                return new pk(a.j().j(), ak.a(i2).b(i2));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        o.a(((tn) b(fqVar)).e());
        o.a(cn.b.REMOTE);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof wn) {
            tn.a k2 = tn.k();
            k2.a((wn) ssVar);
            k2.a(0);
            return k2.h();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(wn.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        if (ssVar instanceof tn) {
            tn tnVar = (tn) ssVar;
            mp.a(tnVar.i(), 0);
            String i2 = tnVar.j().i();
            return new pk(tnVar.j().j(), ak.a(i2).b(i2));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
