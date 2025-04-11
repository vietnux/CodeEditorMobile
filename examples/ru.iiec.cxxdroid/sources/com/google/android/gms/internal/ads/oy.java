package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class oy implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final tx f5193b;

    /* renamed from: c  reason: collision with root package name */
    private final xp f5194c;

    public oy(tx txVar, xp xpVar) {
        this.f5193b = txVar;
        this.f5194c = xpVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f5193b.l() != null) {
            this.f5193b.l().get();
        }
        xp k2 = this.f5193b.k();
        if (k2 == null) {
            return null;
        }
        try {
            synchronized (this.f5194c) {
                iv.a(this.f5194c, iv.a(k2));
            }
            return null;
        } catch (hv unused) {
            return null;
        }
    }
}
