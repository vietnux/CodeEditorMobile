package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gi implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4425b;

    /* renamed from: c  reason: collision with root package name */
    private final zh f4426c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4427d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4428e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4429f;

    /* renamed from: g  reason: collision with root package name */
    private final cx f4430g;

    /* renamed from: h  reason: collision with root package name */
    private final sc f4431h;

    /* renamed from: i  reason: collision with root package name */
    private final x80 f4432i;

    /* renamed from: j  reason: collision with root package name */
    private final q0 f4433j;

    /* renamed from: k  reason: collision with root package name */
    private final u1 f4434k;

    /* renamed from: l  reason: collision with root package name */
    private final r20 f4435l;

    gi(Context context, zh zhVar, String str, boolean z, boolean z2, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        this.f4425b = context;
        this.f4426c = zhVar;
        this.f4427d = str;
        this.f4428e = z;
        this.f4429f = z2;
        this.f4430g = cxVar;
        this.f4431h = scVar;
        this.f4432i = x80;
        this.f4433j = q0Var;
        this.f4434k = u1Var;
        this.f4435l = r20;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f4425b;
        zh zhVar = this.f4426c;
        String str = this.f4427d;
        boolean z = this.f4428e;
        boolean z2 = this.f4429f;
        hi a = hi.a(context, zhVar, str, z, z2, this.f4430g, this.f4431h, this.f4432i, this.f4433j, this.f4434k, this.f4435l);
        xg xgVar = new xg(a);
        ai aiVar = new ai(xgVar, z2);
        a.setWebChromeClient(new dg(xgVar));
        a.a((oi) aiVar);
        a.a((ti) aiVar);
        a.a((si) aiVar);
        a.a((qi) aiVar);
        a.a(aiVar);
        return xgVar;
    }
}
