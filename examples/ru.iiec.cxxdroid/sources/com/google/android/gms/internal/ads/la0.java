package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class la0 implements e0<Object> {
    private final /* synthetic */ o1 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ha0 f4857b;

    la0(ha0 ha0, o1 o1Var) {
        this.f4857b = ha0;
        this.a = o1Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        lg lgVar = (lg) this.f4857b.a.get();
        if (lgVar == null) {
            this.a.a("/hideOverlay", this);
        } else {
            lgVar.getView().setVisibility(8);
        }
    }
}
