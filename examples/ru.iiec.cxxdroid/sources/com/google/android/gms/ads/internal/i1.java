package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.r8;

/* access modifiers changed from: package-private */
public final class i1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r8 f3209b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ g1 f3210c;

    i1(g1 g1Var, r8 r8Var) {
        this.f3210c = g1Var;
        this.f3209b = r8Var;
    }

    public final void run() {
        this.f3210c.a(new q8(this.f3209b, null, null, null, null, null, null, null));
    }
}
