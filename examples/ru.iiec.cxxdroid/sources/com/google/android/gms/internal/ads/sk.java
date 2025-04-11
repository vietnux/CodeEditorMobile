package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.nm;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class sk implements xj<vj> {
    sk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final vj c(fq fqVar) {
        try {
            lm b2 = lm.b(fqVar);
            if (b2 instanceof lm) {
                mp.a(b2.i(), 0);
                zk.a(b2.k().j());
                jm j2 = b2.k().j();
                pm i2 = j2.i();
                qo a = zk.a(i2.i());
                byte[] b3 = b2.j().b();
                return new jo((ECPrivateKey) to.f5649j.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b3), oo.a(a))), i2.k().b(), zk.a(i2.j()), zk.a(j2.k()), new bl(j2.j().i()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        o.a(((lm) b(fqVar)).e());
        o.a(cn.b.ASYMMETRIC_PRIVATE);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof hm) {
            hm hmVar = (hm) ssVar;
            zk.a(hmVar.i());
            KeyPair a = oo.a(oo.a(zk.a(hmVar.i().i().i())));
            ECPoint w = ((ECPublicKey) a.getPublic()).getW();
            nm.a p = nm.p();
            p.a(0);
            p.a(hmVar.i());
            p.a(fq.a(w.getAffineX().toByteArray()));
            p.b(fq.a(w.getAffineY().toByteArray()));
            lm.a o = lm.o();
            o.a(0);
            o.a((nm) p.h());
            o.a(fq.a(((ECPrivateKey) a.getPrivate()).getS().toByteArray()));
            return o.h();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(hm.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ vj b(ss ssVar) {
        if (ssVar instanceof lm) {
            lm lmVar = (lm) ssVar;
            mp.a(lmVar.i(), 0);
            zk.a(lmVar.k().j());
            jm j2 = lmVar.k().j();
            pm i2 = j2.i();
            qo a = zk.a(i2.i());
            byte[] b2 = lmVar.j().b();
            return new jo((ECPrivateKey) to.f5649j.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b2), oo.a(a))), i2.k().b(), zk.a(i2.j()), zk.a(j2.k()), new bl(j2.j().i()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
