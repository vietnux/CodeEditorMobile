package com.google.android.gms.internal.ads;

@k2
public final class ei0 extends yi0 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f4220b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private ji0 f4221c;

    /* renamed from: d  reason: collision with root package name */
    private ci0 f4222d;

    @Override // com.google.android.gms.internal.ads.xi0
    public final void A0() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.V1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void X() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.U1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void a(aj0 aj0) {
        synchronized (this.f4220b) {
            if (this.f4221c != null) {
                this.f4221c.a(0, aj0);
                this.f4221c = null;
                return;
            }
            if (this.f4222d != null) {
                this.f4222d.O1();
            }
        }
    }

    public final void a(ci0 ci0) {
        synchronized (this.f4220b) {
            this.f4222d = ci0;
        }
    }

    public final void a(ji0 ji0) {
        synchronized (this.f4220b) {
            this.f4221c = ji0;
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void a(tb0 tb0, String str) {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.b(tb0, str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void a(String str, String str2) {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.b(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void c(int i2) {
        synchronized (this.f4220b) {
            if (this.f4221c != null) {
                this.f4221c.a(i2 == 3 ? 1 : 2);
                this.f4221c = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void d() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.M1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void f0() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.d2();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void j0() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.X1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void l(String str) {
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void n0() {
        synchronized (this.f4220b) {
            if (this.f4221c != null) {
                this.f4221c.a(0);
                this.f4221c = null;
                return;
            }
            if (this.f4222d != null) {
                this.f4222d.O1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void w0() {
        synchronized (this.f4220b) {
            if (this.f4222d != null) {
                this.f4222d.a2();
            }
        }
    }
}
