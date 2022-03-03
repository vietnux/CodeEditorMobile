package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class vy implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ bc0 f5852b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ux f5853c;

    vy(ux uxVar, bc0 bc0) {
        this.f5853c = uxVar;
        this.f5852b = bc0;
    }

    public final void run() {
        try {
            this.f5853c.f5792c.put(this.f5852b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
