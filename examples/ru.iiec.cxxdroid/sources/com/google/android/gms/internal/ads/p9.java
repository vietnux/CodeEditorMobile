package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class p9 extends q9 {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f5216d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ n9 f5217e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p9(n9 n9Var, Bundle bundle) {
        super(null);
        this.f5217e = n9Var;
        this.f5216d = bundle;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        Iterator it = this.f5217e.f5066c.iterator();
        while (it.hasNext()) {
            ((r9) it.next()).a(this.f5216d);
        }
    }
}
