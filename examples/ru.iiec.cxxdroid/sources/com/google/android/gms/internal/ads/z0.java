package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class z0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wd f6170b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6171c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w0 f6172d;

    z0(w0 w0Var, wd wdVar, String str) {
        this.f6172d = w0Var;
        this.f6170b = wdVar;
        this.f6171c = str;
    }

    public final void run() {
        this.f6170b.b(this.f6172d.f5857d.u2().get(this.f6171c));
    }
}
