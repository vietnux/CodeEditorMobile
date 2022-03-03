package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.u.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class u extends Service {

    /* renamed from: b  reason: collision with root package name */
    final ExecutorService f6663b;

    /* renamed from: c  reason: collision with root package name */
    private Binder f6664c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6665d;

    /* renamed from: e  reason: collision with root package name */
    private int f6666e;

    /* renamed from: f  reason: collision with root package name */
    private int f6667f;

    public u() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f6663b = Executors.newSingleThreadExecutor(new a(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        this.f6665d = new Object();
        this.f6667f = 0;
    }

    /* access modifiers changed from: private */
    public final void d(Intent intent) {
        if (intent != null) {
            c.o.a.a.a(intent);
        }
        synchronized (this.f6665d) {
            this.f6667f--;
            if (this.f6667f == 0) {
                stopSelfResult(this.f6666e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Intent a(Intent intent);

    public boolean b(Intent intent) {
        return false;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f6664c == null) {
            this.f6664c = new y(this);
        }
        return this.f6664c;
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f6665d) {
            this.f6666e = i3;
            this.f6667f++;
        }
        Intent a = a(intent);
        if (a == null) {
            d(intent);
            return 2;
        } else if (b(a)) {
            d(intent);
            return 2;
        } else {
            this.f6663b.execute(new v(this, a, intent));
            return 3;
        }
    }
}
