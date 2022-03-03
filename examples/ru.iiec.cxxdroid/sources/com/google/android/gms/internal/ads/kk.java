package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.kl;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
public final class kk implements xj<ep> {
    kk() {
    }

    private static void a(ol olVar) {
        if (olVar.i() < 12 || olVar.i() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final co c(fq fqVar) {
        try {
            kl b2 = kl.b(fqVar);
            if (b2 instanceof kl) {
                mp.a(b2.i(), 0);
                mp.a(b2.k().size());
                a(b2.j());
                return new co(b2.k().b(), b2.j().i());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.AesCtrKey");
        o.a(((kl) b(fqVar)).e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof ml) {
            ml mlVar = (ml) ssVar;
            mp.a(mlVar.i());
            a(mlVar.j());
            kl.a o = kl.o();
            o.a(mlVar.j());
            o.a(fq.a(hp.a(mlVar.i())));
            o.a(0);
            return o.h();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(ml.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ ep b(ss ssVar) {
        if (ssVar instanceof kl) {
            kl klVar = (kl) ssVar;
            mp.a(klVar.i(), 0);
            mp.a(klVar.k().size());
            a(klVar.j());
            return new co(klVar.k().b(), klVar.j().i());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
