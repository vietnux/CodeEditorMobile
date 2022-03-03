package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class a1 implements e0<Object> {
    private final /* synthetic */ t90 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w0 f3743b;

    a1(w0 w0Var, t90 t90) {
        this.f3743b = w0Var;
        this.a = t90;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        this.f3743b.a((w0) this.a, (tb0) map.get("asset"));
    }
}
