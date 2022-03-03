package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.a;
import java.util.Date;
import java.util.Set;

@k2
public final class oj0 implements a {
    private final Date a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5181b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f5182c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5183d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f5184e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5185f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5186g;

    public oj0(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2) {
        this.a = date;
        this.f5181b = i2;
        this.f5182c = set;
        this.f5184e = location;
        this.f5183d = z;
        this.f5185f = i3;
        this.f5186g = z2;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final boolean a() {
        return this.f5186g;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Date d() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final boolean e() {
        return this.f5183d;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Set<String> f() {
        return this.f5182c;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int i() {
        return this.f5185f;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Location k() {
        return this.f5184e;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int m() {
        return this.f5181b;
    }
}
