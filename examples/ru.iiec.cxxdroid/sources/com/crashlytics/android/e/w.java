package com.crashlytics.android.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public class w {

    /* renamed from: f  reason: collision with root package name */
    private static final IntentFilter f3037f = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: g  reason: collision with root package name */
    private static final IntentFilter f3038g = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    /* renamed from: h  reason: collision with root package name */
    private static final IntentFilter f3039h = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final Context f3040b;

    /* renamed from: c  reason: collision with root package name */
    private final BroadcastReceiver f3041c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final BroadcastReceiver f3042d = new a();

    /* renamed from: e  reason: collision with root package name */
    private boolean f3043e;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            w.this.f3043e = true;
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        public void onReceive(Context context, Intent intent) {
            w.this.f3043e = false;
        }
    }

    public w(Context context) {
        this.f3040b = context;
    }

    public void a() {
        if (this.a.getAndSet(false)) {
            this.f3040b.unregisterReceiver(this.f3042d);
            this.f3040b.unregisterReceiver(this.f3041c);
        }
    }

    public void b() {
        boolean z = true;
        if (!this.a.getAndSet(true)) {
            Intent registerReceiver = this.f3040b.registerReceiver(null, f3037f);
            int i2 = -1;
            if (registerReceiver != null) {
                i2 = registerReceiver.getIntExtra("status", -1);
            }
            if (!(i2 == 2 || i2 == 5)) {
                z = false;
            }
            this.f3043e = z;
            this.f3040b.registerReceiver(this.f3042d, f3038g);
            this.f3040b.registerReceiver(this.f3041c, f3039h);
        }
    }

    public boolean c() {
        return this.f3043e;
    }
}
