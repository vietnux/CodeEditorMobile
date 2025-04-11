package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import e.b.b.a.e.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class l0 {

    /* renamed from: e  reason: collision with root package name */
    private static l0 f6628e;
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f6629b;

    /* renamed from: c  reason: collision with root package name */
    private n0 f6630c = new n0(this);

    /* renamed from: d  reason: collision with root package name */
    private int f6631d = 1;

    private l0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6629b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i2;
        i2 = this.f6631d;
        this.f6631d = i2 + 1;
        return i2;
    }

    public static synchronized l0 a(Context context) {
        l0 l0Var;
        synchronized (l0.class) {
            if (f6628e == null) {
                f6628e = new l0(context, Executors.newSingleThreadScheduledExecutor());
            }
            l0Var = f6628e;
        }
        return l0Var;
    }

    private final synchronized <T> g<T> a(d<T> dVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(dVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f6630c.a(dVar)) {
            this.f6630c = new n0(this);
            this.f6630c.a(dVar);
        }
        return dVar.f6607b.a();
    }

    public final g<Void> a(int i2, Bundle bundle) {
        return a(new c(a(), 2, bundle));
    }

    public final g<Bundle> b(int i2, Bundle bundle) {
        return a(new f(a(), 1, bundle));
    }
}
