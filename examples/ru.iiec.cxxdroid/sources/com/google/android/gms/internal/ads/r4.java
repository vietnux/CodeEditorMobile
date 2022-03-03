package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;

@k2
public final class r4 {
    public final m20 a;

    /* renamed from: b  reason: collision with root package name */
    public final l8 f5376b;

    /* renamed from: c  reason: collision with root package name */
    public final y70 f5377c;

    /* renamed from: d  reason: collision with root package name */
    public final n5 f5378d;

    /* renamed from: e  reason: collision with root package name */
    public final xh0 f5379e;

    /* renamed from: f  reason: collision with root package name */
    public final o5 f5380f;

    /* renamed from: g  reason: collision with root package name */
    public final p5 f5381g;

    /* renamed from: h  reason: collision with root package name */
    public final x f5382h;

    /* renamed from: i  reason: collision with root package name */
    public final p8 f5383i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5384j = true;

    /* renamed from: k  reason: collision with root package name */
    public final w4 f5385k;

    private r4(d5 d5Var, m20 m20, l8 l8Var, y70 y70, n5 n5Var, xh0 xh0, o5 o5Var, p5 p5Var, x xVar, p8 p8Var, boolean z, w4 w4Var) {
        this.a = m20;
        this.f5376b = l8Var;
        this.f5377c = y70;
        this.f5378d = n5Var;
        this.f5379e = xh0;
        this.f5380f = o5Var;
        this.f5381g = p5Var;
        this.f5382h = xVar;
        this.f5383i = p8Var;
        this.f5385k = w4Var;
    }

    public static r4 a(Context context) {
        x0.D().a(context);
        t5 t5Var = new t5(context);
        return new r4(null, new p20(), new m8(), new x70(), new l5(context, t5Var.a()), new yh0(), new r5(), new s5(), new w(), new n8(), true, t5Var);
    }
}
