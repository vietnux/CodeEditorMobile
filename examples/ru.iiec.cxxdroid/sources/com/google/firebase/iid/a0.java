package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.s.a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class a0 implements ServiceConnection {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f6600b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f6601c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<w> f6602d;

    /* renamed from: e  reason: collision with root package name */
    private y f6603e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6604f;

    public a0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private a0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f6602d = new ArrayDeque();
        this.f6604f = false;
        this.a = context.getApplicationContext();
        this.f6600b = new Intent(str).setPackage(this.a.getPackageName());
        this.f6601c = scheduledExecutorService;
    }

    private final synchronized void a() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (!this.f6602d.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            if (this.f6603e == null || !this.f6603e.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z = !this.f6604f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    Log.d("EnhancedIntentService", sb.toString());
                }
                if (!this.f6604f) {
                    this.f6604f = true;
                    try {
                        if (!a.a().a(this.a, this.f6600b, this, 65)) {
                            Log.e("EnhancedIntentService", "binding to the service failed");
                            while (!this.f6602d.isEmpty()) {
                                this.f6602d.poll().a();
                            }
                        } else {
                            return;
                        }
                    } catch (SecurityException e2) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e2);
                    }
                }
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
            }
            this.f6603e.a(this.f6602d.poll());
        }
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f6602d.add(new w(intent, pendingResult, this.f6601c));
        a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f6604f = false;
            this.f6603e = (y) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        a();
    }
}
