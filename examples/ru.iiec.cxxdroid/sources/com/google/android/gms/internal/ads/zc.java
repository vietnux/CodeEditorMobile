package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class zc implements xc {
    private final /* synthetic */ String a;

    zc(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void a(Throwable th) {
        x0.j().a(th, this.a);
    }
}
