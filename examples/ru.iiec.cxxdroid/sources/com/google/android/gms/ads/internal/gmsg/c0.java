package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.lg;
import java.util.Map;

final class c0 implements e0<lg> {
    c0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        if (map.keySet().contains("start")) {
            lgVar2.M().b();
        } else if (map.keySet().contains("stop")) {
            lgVar2.M().i();
        } else if (map.keySet().contains("cancel")) {
            lgVar2.M().d();
        }
    }
}
