package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.nn;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
public final class gk {
    static {
        Charset.forName("UTF-8");
    }

    public static nn a(ln lnVar) {
        nn.a i2 = nn.i();
        i2.a(lnVar.i());
        for (ln.b bVar : lnVar.j()) {
            nn.b.a i3 = nn.b.i();
            i3.a(bVar.j().i());
            i3.a(bVar.k());
            i3.a(bVar.p());
            i3.a(bVar.o());
            i2.a((nn.b) i3.h());
        }
        return (nn) i2.h();
    }

    public static void b(ln lnVar) {
        if (lnVar.k() != 0) {
            int i2 = lnVar.i();
            boolean z = false;
            boolean z2 = true;
            for (ln.b bVar : lnVar.j()) {
                if (!bVar.i()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bVar.o())));
                } else if (bVar.p() == yn.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bVar.o())));
                } else if (bVar.k() != fn.UNKNOWN_STATUS) {
                    if (bVar.k() == fn.ENABLED && bVar.o() == i2) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (bVar.j().k() != cn.b.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bVar.o())));
                }
            }
            if (!(z || z2)) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
