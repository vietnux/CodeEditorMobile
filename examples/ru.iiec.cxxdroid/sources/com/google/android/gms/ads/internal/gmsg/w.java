package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qc;
import java.util.Map;

final class w implements e0<lg> {
    w() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        d P = lgVar2.P();
        if (P != null) {
            P.f2();
            return;
        }
        d o0 = lgVar2.o0();
        if (o0 != null) {
            o0.f2();
        } else {
            qc.d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
