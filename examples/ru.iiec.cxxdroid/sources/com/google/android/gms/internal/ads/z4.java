package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class z4 implements e0<Object> {
    private final /* synthetic */ y4 a;

    z4(y4 y4Var) {
        this.a = y4Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.f6068b) {
            if (!this.a.f6071e.isDone()) {
                if (this.a.f6069c.equals(map.get("request_id"))) {
                    e5 e5Var = new e5(1, map);
                    String b2 = e5Var.b();
                    String valueOf = String.valueOf(e5Var.d());
                    StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 24 + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(b2);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    qc.d(sb.toString());
                    this.a.f6071e.b(e5Var);
                }
            }
        }
    }
}
