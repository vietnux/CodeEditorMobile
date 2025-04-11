package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.x0;

@k2
public final class c20 {
    private final Runnable a = new d20(this);

    /* renamed from: b  reason: collision with root package name */
    private final Object f3961b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private j20 f3962c;

    /* renamed from: d  reason: collision with root package name */
    private Context f3963d;

    /* renamed from: e  reason: collision with root package name */
    private n20 f3964e;

    /* access modifiers changed from: private */
    public final void b() {
        synchronized (this.f3961b) {
            if (this.f3963d != null) {
                if (this.f3962c == null) {
                    this.f3962c = new j20(this.f3963d, x0.u().b(), new f20(this), new g20(this));
                    this.f3962c.j();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c() {
        synchronized (this.f3961b) {
            if (this.f3962c != null) {
                if (this.f3962c.a() || this.f3962c.d()) {
                    this.f3962c.g();
                }
                this.f3962c = null;
                this.f3964e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final h20 a(k20 k20) {
        synchronized (this.f3961b) {
            if (this.f3964e == null) {
                return new h20();
            }
            try {
                return this.f3964e.a(k20);
            } catch (RemoteException e2) {
                qc.b("Unable to call into cache service.", e2);
                return new h20();
            }
        }
    }

    public final void a() {
        if (((Boolean) a50.g().a(k80.E2)).booleanValue()) {
            synchronized (this.f3961b) {
                b();
                x0.f();
                u9.f5718h.removeCallbacks(this.a);
                x0.f();
                u9.f5718h.postDelayed(this.a, ((Long) a50.g().a(k80.F2)).longValue());
            }
        }
    }

    public final void a(Context context) {
        if (context != null) {
            synchronized (this.f3961b) {
                if (this.f3963d == null) {
                    this.f3963d = context.getApplicationContext();
                    if (((Boolean) a50.g().a(k80.D2)).booleanValue()) {
                        b();
                    } else {
                        if (((Boolean) a50.g().a(k80.C2)).booleanValue()) {
                            x0.i().a(new e20(this));
                        }
                    }
                }
            }
        }
    }
}
