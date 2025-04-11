package com.google.android.gms.internal.ads;

import android.content.Context;

@k2
public final class g3 extends c3 {

    /* renamed from: d  reason: collision with root package name */
    private final Context f4380d;

    public g3(Context context, yd<j3> ydVar, a3 a3Var) {
        super(ydVar, a3Var);
        this.f4380d = context;
    }

    @Override // com.google.android.gms.internal.ads.c3
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.c3
    public final r3 c() {
        Context context = this.f4380d;
        return s4.a(context, r4.a(context));
    }
}
