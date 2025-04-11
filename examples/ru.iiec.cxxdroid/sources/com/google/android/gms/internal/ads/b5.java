package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class b5 implements e0<Object> {
    private final /* synthetic */ y4 a;

    b5(y4 y4Var) {
        this.a = y4Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.f6068b) {
            if (!this.a.f6071e.isDone()) {
                e5 e5Var = new e5(-2, map);
                if (this.a.f6069c.equals(e5Var.h())) {
                    this.a.f6071e.b(e5Var);
                }
            }
        }
    }
}
