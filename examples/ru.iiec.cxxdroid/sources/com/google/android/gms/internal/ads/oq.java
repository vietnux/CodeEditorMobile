package com.google.android.gms.internal.ads;

public abstract class oq {
    int a;

    /* renamed from: b  reason: collision with root package name */
    int f5187b;

    /* renamed from: c  reason: collision with root package name */
    rq f5188c;

    private oq() {
        this.f5187b = 100;
    }

    public static long a(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    static oq a(byte[] bArr, int i2, int i3, boolean z) {
        qq qqVar = new qq(bArr, i2, i3, z);
        try {
            qqVar.c(i3);
            return qqVar;
        } catch (sr e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int e(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract double a();

    public abstract void a(int i2);

    public abstract float b();

    public abstract boolean b(int i2);

    public abstract int c(int i2);

    public abstract String c();

    public abstract int d();

    public abstract void d(int i2);

    public abstract long e();

    public abstract long f();

    public abstract int g();

    public abstract long h();

    public abstract int i();

    public abstract boolean j();

    public abstract String k();

    public abstract fq l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract boolean s();

    public abstract int t();
}
