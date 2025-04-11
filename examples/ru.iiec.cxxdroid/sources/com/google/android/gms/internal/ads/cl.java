package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.wm;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class cl implements xj<bk> {
    cl() {
    }

    private static void a(an anVar) {
        if (anVar.j() >= 10) {
            int i2 = dl.a[anVar.i().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (anVar.j() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (anVar.j() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (anVar.j() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final bk c(fq fqVar) {
        try {
            wm a = wm.a(fqVar);
            if (a instanceof wm) {
                mp.a(a.i(), 0);
                if (a.j().size() >= 16) {
                    a(a.k());
                    um i2 = a.k().i();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(a.j().b(), "HMAC");
                    int j2 = a.k().j();
                    int i3 = dl.a[i2.ordinal()];
                    if (i3 == 1) {
                        return new fp("HMACSHA1", secretKeySpec, j2);
                    }
                    if (i3 == 2) {
                        return new fp("HMACSHA256", secretKeySpec, j2);
                    }
                    if (i3 == 3) {
                        return new fp("HMACSHA512", secretKeySpec, j2);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final cn a(fq fqVar) {
        cn.a o = cn.o();
        o.a("type.googleapis.com/google.crypto.tink.HmacKey");
        o.a(((wm) b(fqVar)).e());
        o.a(cn.b.SYMMETRIC);
        return (cn) o.h();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss a(ss ssVar) {
        if (ssVar instanceof ym) {
            ym ymVar = (ym) ssVar;
            if (ymVar.i() >= 16) {
                a(ymVar.j());
                wm.a o = wm.o();
                o.a(0);
                o.a(ymVar.j());
                o.a(fq.a(hp.a(ymVar.i())));
                return o.h();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final ss b(fq fqVar) {
        try {
            return a(ym.a(fqVar));
        } catch (sr e2) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.xj
    public final /* synthetic */ bk b(ss ssVar) {
        if (ssVar instanceof wm) {
            wm wmVar = (wm) ssVar;
            mp.a(wmVar.i(), 0);
            if (wmVar.j().size() >= 16) {
                a(wmVar.k());
                um i2 = wmVar.k().i();
                SecretKeySpec secretKeySpec = new SecretKeySpec(wmVar.j().b(), "HMAC");
                int j2 = wmVar.k().j();
                int i3 = dl.a[i2.ordinal()];
                if (i3 == 1) {
                    return new fp("HMACSHA1", secretKeySpec, j2);
                }
                if (i3 == 2) {
                    return new fp("HMACSHA256", secretKeySpec, j2);
                }
                if (i3 == 3) {
                    return new fp("HMACSHA512", secretKeySpec, j2);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final int getVersion() {
        return 0;
    }
}
