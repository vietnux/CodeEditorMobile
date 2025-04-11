package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ug implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f5735b;

    /* renamed from: c  reason: collision with root package name */
    private final zh f5736c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5737d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5738e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5739f;

    /* renamed from: g  reason: collision with root package name */
    private final cx f5740g;

    /* renamed from: h  reason: collision with root package name */
    private final sc f5741h;

    /* renamed from: i  reason: collision with root package name */
    private final x80 f5742i;

    /* renamed from: j  reason: collision with root package name */
    private final q0 f5743j;

    /* renamed from: k  reason: collision with root package name */
    private final u1 f5744k;

    /* renamed from: l  reason: collision with root package name */
    private final r20 f5745l;

    ug(Context context, zh zhVar, String str, boolean z, boolean z2, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        this.f5735b = context;
        this.f5736c = zhVar;
        this.f5737d = str;
        this.f5738e = z;
        this.f5739f = z2;
        this.f5740g = cxVar;
        this.f5741h = scVar;
        this.f5742i = x80;
        this.f5743j = q0Var;
        this.f5744k = u1Var;
        this.f5745l = r20;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f5735b;
        zh zhVar = this.f5736c;
        String str = this.f5737d;
        boolean z = this.f5738e;
        boolean z2 = this.f5739f;
        xg xgVar = new xg(yg.a(context, zhVar, str, z, z2, this.f5740g, this.f5741h, this.f5742i, this.f5743j, this.f5744k, this.f5745l));
        xgVar.setWebViewClient(x0.h().a(xgVar, z2));
        xgVar.setWebChromeClient(new dg(xgVar));
        return xgVar;
    }
}
