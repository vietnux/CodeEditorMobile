package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.v20;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.w7;
import com.google.android.gms.internal.ads.x7;

@k2
public final class u1 {
    public final bg a;

    /* renamed from: b  reason: collision with root package name */
    public final ve f3340b;

    /* renamed from: c  reason: collision with root package name */
    public final c8 f3341c;

    /* renamed from: d  reason: collision with root package name */
    public final v20 f3342d;

    private u1(bg bgVar, ve veVar, c8 c8Var, v20 v20) {
        this.a = bgVar;
        this.f3340b = veVar;
        this.f3341c = c8Var;
        this.f3342d = v20;
    }

    public static u1 a(Context context) {
        return new u1(new qf(), new cf(), new w7(new x7()), new v20(context));
    }
}
