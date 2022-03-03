package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import e.b.b.a.c.f.a;

/* access modifiers changed from: package-private */
public final class c0 extends BroadcastReceiver {
    private final j a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2708b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d0 f2709c;

    /* synthetic */ c0(d0 d0Var, j jVar, b0 b0Var) {
        this.f2709c = d0Var;
        this.a = jVar;
    }

    public final void a(Context context) {
        if (this.f2708b) {
            context.unregisterReceiver(this.f2709c.f2722b);
            this.f2708b = false;
            return;
        }
        a.b("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void a(Context context, IntentFilter intentFilter) {
        if (!this.f2708b) {
            context.registerReceiver(this.f2709c.f2722b, intentFilter);
            this.f2708b = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(a.a(intent, "BillingBroadcastManager"), a.a(intent.getExtras()));
    }
}
