package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
public final class zx {
    static wj a;

    static boolean a(tx txVar) {
        Method a2;
        if (a != null) {
            return true;
        }
        String str = (String) a50.g().a(k80.J1);
        if (str == null || str.length() == 0) {
            str = null;
            if (!(txVar == null || (a2 = txVar.a("4o7tecxtkw7XaNt5hPj+0H1LvOi0SgxCIJTY9VcbazM/HSl/sFlxBFwnc8glnvoB", "RgSY6YxU2k1vLXOV3vapBnQwJDzYDlmX50wbm2tDcnw=")) == null)) {
                str = (String) a2.invoke(null, new Object[0]);
            }
            if (str == null) {
                return false;
            }
        }
        try {
            yj a3 = ck.a(bw.a(str, true));
            for (jn jnVar : uk.a.i()) {
                if (jnVar.i().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                } else if (jnVar.j().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                } else if (!jnVar.p().isEmpty()) {
                    fk.a(jnVar.i(), fk.a(jnVar.p()).a(jnVar.i(), jnVar.j(), jnVar.k()), jnVar.o());
                } else {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
            }
            a = xk.a(a3);
            return a != null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
