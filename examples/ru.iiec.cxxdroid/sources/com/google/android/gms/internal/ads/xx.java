package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class xx implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f6055b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f6056c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ tx f6057d;

    xx(tx txVar, int i2, boolean z) {
        this.f6057d = txVar;
        this.f6055b = i2;
        this.f6056c = z;
    }

    public final void run() {
        xp b2 = this.f6057d.b(this.f6055b, this.f6056c);
        this.f6057d.f5672j = b2;
        if (tx.a(this.f6055b, b2)) {
            this.f6057d.a(this.f6055b + 1, this.f6056c);
        }
    }
}
