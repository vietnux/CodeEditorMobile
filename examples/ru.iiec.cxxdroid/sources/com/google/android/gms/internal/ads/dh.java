package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dh implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final bh f4107b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4108c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4109d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4110e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4111f;

    dh(bh bhVar, int i2, int i3, boolean z, boolean z2) {
        this.f4107b = bhVar;
        this.f4108c = i2;
        this.f4109d = i3;
        this.f4110e = z;
        this.f4111f = z2;
    }

    public final void run() {
        this.f4107b.a(this.f4108c, this.f4109d, this.f4110e, this.f4111f);
    }
}
