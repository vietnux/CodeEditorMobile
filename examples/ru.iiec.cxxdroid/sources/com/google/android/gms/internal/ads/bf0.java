package com.google.android.gms.internal.ads;

import android.os.Bundle;

@k2
public final class bf0 {

    /* renamed from: f  reason: collision with root package name */
    private static bf0 f3886f = new bf0();
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f3887b;

    /* renamed from: c  reason: collision with root package name */
    private int f3888c;

    /* renamed from: d  reason: collision with root package name */
    private int f3889d;

    /* renamed from: e  reason: collision with root package name */
    private int f3890e;

    public static bf0 j() {
        return f3886f;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f3887b++;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.a += i2;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f3888c++;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f3889d++;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f3890e++;
    }

    public final int e() {
        return this.f3887b;
    }

    public final int f() {
        return this.f3888c;
    }

    public final int g() {
        return this.f3889d;
    }

    public final int h() {
        return this.f3890e;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.a);
        bundle.putInt("ipds", this.f3887b);
        bundle.putInt("ipde", this.f3888c);
        bundle.putInt("iph", this.f3889d);
        bundle.putInt("ipm", this.f3890e);
        return bundle;
    }
}
