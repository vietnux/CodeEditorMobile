package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class kq {
    private final sq a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4835b;

    private kq(int i2) {
        this.f4835b = new byte[i2];
        this.a = sq.a(this.f4835b);
    }

    /* synthetic */ kq(int i2, gq gqVar) {
        this(i2);
    }

    public final fq a() {
        this.a.b();
        return new mq(this.f4835b);
    }

    public final sq b() {
        return this.a;
    }
}
