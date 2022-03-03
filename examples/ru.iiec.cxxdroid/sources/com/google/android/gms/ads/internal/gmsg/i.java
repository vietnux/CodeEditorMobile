package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.qc;
import java.util.Map;

@k2
public final class i implements e0<Object> {
    private final j a;

    public i(j jVar) {
        this.a = jVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            o7 o7Var = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    o7Var = new o7(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                qc.c("Unable to parse reward amount.", e2);
            }
            this.a.b(o7Var);
        } else if ("video_start".equals(str)) {
            this.a.e2();
        } else if ("video_complete".equals(str)) {
            if (((Boolean) a50.g().a(k80.v0)).booleanValue()) {
                if (((Boolean) a50.g().a(k80.v0)).booleanValue()) {
                    this.a.Q1();
                }
            }
        }
    }
}
