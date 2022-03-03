package com.google.android.gms.internal.ads;

public final class ug0 extends ce<eh0> {

    /* renamed from: e  reason: collision with root package name */
    private final Object f5746e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final yg0 f5747f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5748g;

    public ug0(yg0 yg0) {
        this.f5747f = yg0;
    }

    public final void c() {
        synchronized (this.f5746e) {
            if (!this.f5748g) {
                this.f5748g = true;
                a(new vg0(this), new ae());
                a(new wg0(this), new xg0(this));
            }
        }
    }
}
