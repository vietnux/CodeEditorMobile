package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.y;

public final class yg0 extends ce<vf0> {

    /* renamed from: e  reason: collision with root package name */
    private final Object f6127e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private za<vf0> f6128f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6129g;

    /* renamed from: h  reason: collision with root package name */
    private int f6130h;

    public yg0(za<vf0> zaVar) {
        this.f6128f = zaVar;
        this.f6129g = false;
        this.f6130h = 0;
    }

    private final void f() {
        synchronized (this.f6127e) {
            y.b(this.f6130h >= 0);
            if (!this.f6129g || this.f6130h != 0) {
                l9.e("There are still references to the engine. Not destroying.");
            } else {
                l9.e("No reference is left (including root). Cleaning up engine.");
                a(new bh0(this), new ae());
            }
        }
    }

    public final ug0 c() {
        ug0 ug0 = new ug0(this);
        synchronized (this.f6127e) {
            a(new zg0(this, ug0), new ah0(this, ug0));
            y.b(this.f6130h >= 0);
            this.f6130h++;
        }
        return ug0;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        synchronized (this.f6127e) {
            y.b(this.f6130h > 0);
            l9.e("Releasing 1 reference for JS Engine");
            this.f6130h--;
            f();
        }
    }

    public final void e() {
        synchronized (this.f6127e) {
            y.b(this.f6130h >= 0);
            l9.e("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f6129g = true;
            f();
        }
    }
}
