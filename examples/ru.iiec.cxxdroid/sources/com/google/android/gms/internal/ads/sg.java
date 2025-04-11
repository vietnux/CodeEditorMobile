package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;

@k2
public final class sg {
    public static ld<lg> a(Context context, sc scVar, String str, cx cxVar, u1 u1Var) {
        return ad.a(ad.a((Object) null), new tg(context, cxVar, scVar, u1Var, str), rd.a);
    }

    public static lg a(Context context, zh zhVar, String str, boolean z, boolean z2, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        k80.a(context);
        if (((Boolean) a50.g().a(k80.x0)).booleanValue()) {
            return fi.a(context, zhVar, str, z2, z, cxVar, scVar, x80, q0Var, u1Var, r20);
        }
        try {
            return (lg) wb.a(new ug(context, zhVar, str, z, z2, cxVar, scVar, x80, q0Var, u1Var, r20));
        } catch (Throwable th) {
            throw new wg("Webview initialization failed.", th);
        }
    }
}
