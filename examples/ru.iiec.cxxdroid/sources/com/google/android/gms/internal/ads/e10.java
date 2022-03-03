package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.n;

@k2
public final class e10 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private f10 f4156b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4157c = false;

    public final Activity a() {
        synchronized (this.a) {
            if (!n.b()) {
                return null;
            }
            if (this.f4156b == null) {
                return null;
            }
            return this.f4156b.a();
        }
    }

    public final void a(Context context) {
        synchronized (this.a) {
            if (!this.f4157c) {
                if (n.b()) {
                    if (((Boolean) a50.g().a(k80.E0)).booleanValue()) {
                        Application application = null;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        }
                        if (application == null) {
                            qc.d("Can not cast Context to Application");
                            return;
                        }
                        if (this.f4156b == null) {
                            this.f4156b = new f10();
                        }
                        this.f4156b.a(application, context);
                        this.f4157c = true;
                    }
                }
            }
        }
    }

    public final void a(h10 h10) {
        synchronized (this.a) {
            if (n.b()) {
                if (((Boolean) a50.g().a(k80.E0)).booleanValue()) {
                    if (this.f4156b == null) {
                        this.f4156b = new f10();
                    }
                    this.f4156b.a(h10);
                }
            }
        }
    }

    public final Context b() {
        synchronized (this.a) {
            if (!n.b()) {
                return null;
            }
            if (this.f4156b == null) {
                return null;
            }
            return this.f4156b.b();
        }
    }
}
