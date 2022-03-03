package com.google.android.gms.internal.ads;

public final class y10 implements c0 {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f6062b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6063c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6064d;

    public y10() {
        this(2500, 1, 1.0f);
    }

    private y10(int i2, int i3, float f2) {
        this.a = 2500;
        this.f6063c = 1;
        this.f6064d = 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final int L() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final int M() {
        return this.f6062b;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final void a(d3 d3Var) {
        boolean z = true;
        this.f6062b++;
        int i2 = this.a;
        this.a = (int) (((float) i2) + (((float) i2) * this.f6064d));
        if (this.f6062b > this.f6063c) {
            z = false;
        }
        if (!z) {
            throw d3Var;
        }
    }
}
