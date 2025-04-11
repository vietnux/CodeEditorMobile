package com.google.android.gms.internal.ads;

@k2
public final class zh {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6210b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6211c;

    private zh(int i2, int i3, int i4) {
        this.a = i2;
        this.f6211c = i3;
        this.f6210b = i4;
    }

    public static zh a(int i2, int i3) {
        return new zh(1, i2, i3);
    }

    public static zh a(n40 n40) {
        return n40.f5049e ? new zh(3, 0, 0) : n40.f5054j ? new zh(2, 0, 0) : n40.f5053i ? e() : a(n40.f5051g, n40.f5048d);
    }

    public static zh e() {
        return new zh(0, 0, 0);
    }

    public static zh f() {
        return new zh(4, 0, 0);
    }

    public final boolean a() {
        return this.a == 2;
    }

    public final boolean b() {
        return this.a == 3;
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        return this.a == 4;
    }
}
