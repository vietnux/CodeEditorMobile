package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.n;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class l0 implements ServiceConnection {
    private final Set<ServiceConnection> a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f3684b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3685c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f3686d;

    /* renamed from: e  reason: collision with root package name */
    private final n.a f3687e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f3688f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ k0 f3689g;

    public l0(k0 k0Var, n.a aVar) {
        this.f3689g = k0Var;
        this.f3687e = aVar;
    }

    public final IBinder a() {
        return this.f3686d;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        k0.d(this.f3689g).a(k0.c(this.f3689g), serviceConnection, str, this.f3687e.a(k0.c(this.f3689g)));
        this.a.add(serviceConnection);
    }

    public final void a(String str) {
        this.f3684b = 3;
        this.f3685c = k0.d(this.f3689g).a(k0.c(this.f3689g), str, this.f3687e.a(k0.c(this.f3689g)), this, this.f3687e.a());
        if (this.f3685c) {
            k0.b(this.f3689g).sendMessageDelayed(k0.b(this.f3689g).obtainMessage(1, this.f3687e), k0.e(this.f3689g));
            return;
        }
        this.f3684b = 2;
        try {
            k0.d(this.f3689g).b(k0.c(this.f3689g), this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final ComponentName b() {
        return this.f3688f;
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        k0.d(this.f3689g).a(k0.c(this.f3689g), serviceConnection);
        this.a.remove(serviceConnection);
    }

    public final void b(String str) {
        k0.b(this.f3689g).removeMessages(1, this.f3687e);
        k0.d(this.f3689g).b(k0.c(this.f3689g), this);
        this.f3685c = false;
        this.f3684b = 2;
    }

    public final int c() {
        return this.f3684b;
    }

    public final boolean d() {
        return this.f3685c;
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (k0.a(this.f3689g)) {
            k0.b(this.f3689g).removeMessages(1, this.f3687e);
            this.f3686d = iBinder;
            this.f3688f = componentName;
            for (ServiceConnection serviceConnection : this.a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f3684b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (k0.a(this.f3689g)) {
            k0.b(this.f3689g).removeMessages(1, this.f3687e);
            this.f3686d = null;
            this.f3688f = componentName;
            for (ServiceConnection serviceConnection : this.a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f3684b = 2;
        }
    }
}
