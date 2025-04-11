package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final wd f4414b;

    /* renamed from: c  reason: collision with root package name */
    private final ld f4415c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f4416d;

    /* renamed from: e  reason: collision with root package name */
    private final vc f4417e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f4418f;

    gd(wd wdVar, ld ldVar, Class cls, vc vcVar, Executor executor) {
        this.f4414b = wdVar;
        this.f4415c = ldVar;
        this.f4416d = cls;
        this.f4417e = vcVar;
        this.f4418f = executor;
    }

    public final void run() {
        ad.a(this.f4414b, this.f4415c, this.f4416d, this.f4417e, this.f4418f);
    }
}
