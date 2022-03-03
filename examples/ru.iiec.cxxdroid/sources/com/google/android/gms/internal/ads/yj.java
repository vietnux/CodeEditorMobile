package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class yj {
    private ln a;

    private yj(ln lnVar) {
        this.a = lnVar;
    }

    static final yj a(ln lnVar) {
        if (lnVar != null && lnVar.k() > 0) {
            return new yj(lnVar);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final ln a() {
        return this.a;
    }

    public final String toString() {
        return gk.a(this.a).toString();
    }
}
