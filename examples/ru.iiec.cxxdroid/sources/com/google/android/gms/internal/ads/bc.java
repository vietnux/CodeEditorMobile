package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@k2
public final class bc {
    private final BroadcastReceiver a = new cc(this);

    /* renamed from: b  reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f3862b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f3863c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3864d;

    /* renamed from: e  reason: collision with root package name */
    private Context f3865e;

    /* access modifiers changed from: private */
    public final synchronized void a(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f3862b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }

    public final synchronized void a(Context context) {
        if (!this.f3863c) {
            this.f3865e = context.getApplicationContext();
            if (this.f3865e == null) {
                this.f3865e = context;
            }
            k80.a(this.f3865e);
            this.f3864d = ((Boolean) a50.g().a(k80.g2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f3865e.registerReceiver(this.a, intentFilter);
            this.f3863c = true;
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f3864d) {
            this.f3862b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f3864d) {
            this.f3862b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
