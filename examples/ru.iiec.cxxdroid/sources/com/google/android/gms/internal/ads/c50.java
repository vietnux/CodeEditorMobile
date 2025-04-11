package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a;

@k2
public class c50 extends a {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private a f3993b;

    @Override // com.google.android.gms.ads.a
    public void a() {
        synchronized (this.a) {
            if (this.f3993b != null) {
                this.f3993b.a();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void a(int i2) {
        synchronized (this.a) {
            if (this.f3993b != null) {
                this.f3993b.a(i2);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (this.a) {
            this.f3993b = aVar;
        }
    }

    @Override // com.google.android.gms.ads.a
    public void c() {
        synchronized (this.a) {
            if (this.f3993b != null) {
                this.f3993b.c();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void e() {
        synchronized (this.a) {
            if (this.f3993b != null) {
                this.f3993b.e();
            }
        }
    }

    @Override // com.google.android.gms.ads.a
    public void f() {
        synchronized (this.a) {
            if (this.f3993b != null) {
                this.f3993b.f();
            }
        }
    }
}
