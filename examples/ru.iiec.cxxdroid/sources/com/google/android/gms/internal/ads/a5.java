package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class a5 implements e0<Object> {
    private final /* synthetic */ y4 a;

    a5(y4 y4Var) {
        this.a = y4Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.f6068b) {
            if (!this.a.f6071e.isDone()) {
                e5 e5Var = new e5(-2, map);
                if (this.a.f6069c.equals(e5Var.h())) {
                    String c2 = e5Var.c();
                    if (c2 == null) {
                        qc.d("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (c2.contains("%40mediation_adapters%40")) {
                        String replaceAll = c2.replaceAll("%40mediation_adapters%40", f9.a(this.a.a, map.get("check_adapters"), this.a.f6070d));
                        e5Var.a(replaceAll);
                        String valueOf = String.valueOf(replaceAll);
                        l9.e(valueOf.length() != 0 ? "Ad request URL modified to ".concat(valueOf) : new String("Ad request URL modified to "));
                    }
                    this.a.f6071e.b(e5Var);
                }
            }
        }
    }
}
