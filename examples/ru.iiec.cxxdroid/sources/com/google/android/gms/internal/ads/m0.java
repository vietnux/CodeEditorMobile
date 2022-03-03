package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.e0;
import com.google.android.gms.common.util.n;

@k2
public final class m0 {
    public static na a(Context context, a aVar, r8 r8Var, cx cxVar, lg lgVar, ri0 ri0, n0 n0Var, x80 x80) {
        na naVar;
        n3 n3Var = r8Var.f5394b;
        if (n3Var.f5031j) {
            naVar = new s0(context, r8Var, ri0, n0Var, x80, lgVar);
        } else if (n3Var.v || (aVar instanceof e0)) {
            naVar = (!n3Var.v || !(aVar instanceof e0)) ? new p0(r8Var, n0Var) : new u0(context, (e0) aVar, r8Var, cxVar, n0Var, x80);
        } else {
            naVar = (!((Boolean) a50.g().a(k80.f0)).booleanValue() || !n.g() || n.i() || lgVar == null || !lgVar.g0().b()) ? new o0(context, r8Var, lgVar, n0Var) : new r0(context, r8Var, lgVar, n0Var);
        }
        String valueOf = String.valueOf(naVar.getClass().getName());
        qc.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        naVar.a();
        return naVar;
    }
}
