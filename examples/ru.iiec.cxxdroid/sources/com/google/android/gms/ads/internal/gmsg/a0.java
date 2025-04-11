package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.lg;
import java.util.Map;

final class a0 implements e0<lg> {
    a0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        if (((Boolean) a50.g().a(k80.s1)).booleanValue()) {
            lgVar2.e(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
