package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class og0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ yg0 f5166b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vf0 f5167c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ hg0 f5168d;

    og0(hg0 hg0, yg0 yg0, vf0 vf0) {
        this.f5168d = hg0;
        this.f5166b = yg0;
        this.f5167c = vf0;
    }

    public final void run() {
        synchronized (this.f5168d.a) {
            if (this.f5166b.a() != -1) {
                if (this.f5166b.a() != 1) {
                    this.f5166b.b();
                    Executor executor = rd.a;
                    vf0 vf0 = this.f5167c;
                    vf0.getClass();
                    executor.execute(pg0.a(vf0));
                    l9.e("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }
}
