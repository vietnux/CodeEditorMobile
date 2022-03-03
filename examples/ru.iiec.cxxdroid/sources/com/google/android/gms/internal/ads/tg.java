package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final /* synthetic */ class tg implements vc {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final cx f5620b;

    /* renamed from: c  reason: collision with root package name */
    private final sc f5621c;

    /* renamed from: d  reason: collision with root package name */
    private final u1 f5622d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5623e;

    tg(Context context, cx cxVar, sc scVar, u1 u1Var, String str) {
        this.a = context;
        this.f5620b = cxVar;
        this.f5621c = scVar;
        this.f5622d = u1Var;
        this.f5623e = str;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ld b(Object obj) {
        Context context = this.a;
        cx cxVar = this.f5620b;
        sc scVar = this.f5621c;
        u1 u1Var = this.f5622d;
        String str = this.f5623e;
        x0.g();
        lg a2 = sg.a(context, zh.e(), "", false, false, cxVar, scVar, null, null, u1Var, r20.a());
        vd c2 = vd.c(a2);
        a2.M().a(new vg(c2));
        a2.loadUrl(str);
        return c2;
    }
}
