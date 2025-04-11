package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;

@k2
public final class fi {
    public static lg a(Context context, zh zhVar, String str, boolean z, boolean z2, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        try {
            return (lg) wb.a(new gi(context, zhVar, str, z, z2, cxVar, scVar, x80, q0Var, u1Var, r20));
        } catch (Throwable th) {
            x0.j().a(th, "AdWebViewFactory.newAdWebView2");
            throw new wg("Webview initialization failed.", th);
        }
    }
}
