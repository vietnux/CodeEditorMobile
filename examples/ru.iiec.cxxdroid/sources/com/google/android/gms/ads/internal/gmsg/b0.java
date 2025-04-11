package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.lg;
import java.util.Map;

final class b0 implements e0<lg> {
    b0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            lgVar2.B1();
        } else if ("resume".equals(str)) {
            lgVar2.A1();
        }
    }
}
