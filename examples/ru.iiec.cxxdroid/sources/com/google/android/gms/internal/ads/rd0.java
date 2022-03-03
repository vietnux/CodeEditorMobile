package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.u1;

@k2
public final class rd0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final ri0 f5434b;

    /* renamed from: c  reason: collision with root package name */
    private final sc f5435c;

    /* renamed from: d  reason: collision with root package name */
    private final u1 f5436d;

    rd0(Context context, ri0 ri0, sc scVar, u1 u1Var) {
        this.a = context;
        this.f5434b = ri0;
        this.f5435c = scVar;
        this.f5436d = u1Var;
    }

    public final Context a() {
        return this.a.getApplicationContext();
    }

    public final m a(String str) {
        return new m(this.a, new n40(), str, this.f5434b, this.f5435c, this.f5436d);
    }

    public final m b(String str) {
        return new m(this.a.getApplicationContext(), new n40(), str, this.f5434b, this.f5435c, this.f5436d);
    }

    public final rd0 b() {
        return new rd0(this.a.getApplicationContext(), this.f5434b, this.f5435c, this.f5436d);
    }
}
