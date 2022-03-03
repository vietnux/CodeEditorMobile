package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.r8;

final class f0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r8 f3145b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e0 f3146c;

    f0(e0 e0Var, r8 r8Var) {
        this.f3146c = e0Var;
        this.f3145b = r8Var;
    }

    public final void run() {
        this.f3146c.a(new q8(this.f3145b, null, null, null, null, null, null, null));
    }
}
