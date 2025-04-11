package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.gl;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class jk implements xj<pj> {
    static {
        Logger.getLogger(jk.class.getName());
    }

    jk() {
        fk.a("type.googleapis.com/google.crypto.tink.AesCtrKey", new kk());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final pj c(fq fqVar) {
        try {
            gl a = gl.a(fqVar);
            if (a instanceof gl) {
                mp.a(a.i(), 0);
                return new so((ep) fk.b("type.googleapis.com/google.crypto.tink.AesCtrKey", a.j()), (bk) fk.b("type.googleapis.com/google.crypto.tink.HmacKey", a.k()), a.k().k().j());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        o.a(((gl) b(fqVar)).e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof il) {
            il ilVar = (il) ssVar;
            gl.a o = gl.o();
            o.a((kl) fk.a("type.googleapis.com/google.crypto.tink.AesCtrKey", ilVar.i()));
            o.a((wm) fk.a("type.googleapis.com/google.crypto.tink.HmacKey", ilVar.j()));
            o.a(0);
            return o.h();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(il.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ pj b(ss ssVar) {
        if (ssVar instanceof gl) {
            gl glVar = (gl) ssVar;
            mp.a(glVar.i(), 0);
            return new so((ep) fk.b("type.googleapis.com/google.crypto.tink.AesCtrKey", glVar.j()), (bk) fk.b("type.googleapis.com/google.crypto.tink.HmacKey", glVar.k()), glVar.k().k().j());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
