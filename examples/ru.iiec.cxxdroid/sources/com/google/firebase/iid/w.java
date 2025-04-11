package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class w {
    final Intent a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f6671b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6672c = false;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledFuture<?> f6673d;

    w(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.f6671b = pendingResult;
        this.f6673d = scheduledExecutorService.schedule(new x(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.f6672c) {
            this.f6671b.finish();
            this.f6673d.cancel(false);
            this.f6672c = true;
        }
    }
}
