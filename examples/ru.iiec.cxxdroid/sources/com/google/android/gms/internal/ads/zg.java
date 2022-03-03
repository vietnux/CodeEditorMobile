package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

final class zg implements e0<lg> {
    private final /* synthetic */ yg a;

    zg(yg ygVar) {
        this.a = ygVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.a) {
                        if (this.a.C != parseInt) {
                            this.a.C = parseInt;
                            this.a.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    qc.c("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
