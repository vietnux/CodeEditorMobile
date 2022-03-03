package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class y1 implements e0<lg> {
    private final /* synthetic */ lg a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wd f6060b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s1 f6061c;

    y1(s1 s1Var, lg lgVar, wd wdVar) {
        this.f6061c = s1Var;
        this.a = lgVar;
        this.f6060b = wdVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f6061c.f5494h.equals(jSONObject.optString("ads_id", ""))) {
                this.a.a("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f6060b.b(jSONObject2);
            }
        } catch (Throwable th) {
            qc.b("Error while preprocessing json.", th);
            this.f6060b.a(th);
        }
    }
}
