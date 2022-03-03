package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* access modifiers changed from: package-private */
public final class d0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f2722b;

    d0(Context context, j jVar) {
        this.a = context;
        this.f2722b = new c0(this, jVar, null);
    }

    /* access modifiers changed from: package-private */
    public final j a() {
        return c0.a(this.f2722b);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f2722b.a(this.a);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f2722b.a(this.a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
