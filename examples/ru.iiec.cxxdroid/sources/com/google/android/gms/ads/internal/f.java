package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.vc;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements vc {
    static final vc a = new f();

    private f() {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ld b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            x0.j().m().f(jSONObject.getString("appSettingsJson"));
        }
        return ad.a((Object) null);
    }
}
