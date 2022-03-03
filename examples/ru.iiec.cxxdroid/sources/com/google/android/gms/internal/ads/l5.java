package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class l5 extends n5 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4846b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f4847c;

    /* renamed from: d  reason: collision with root package name */
    private final ih0<JSONObject, JSONObject> f4848d;

    public l5(Context context, ih0<JSONObject, JSONObject> ih0) {
        this.f4846b = context.getApplicationContext();
        this.f4848d = ih0;
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final ld<Void> a() {
        synchronized (this.a) {
            if (this.f4847c == null) {
                this.f4847c = this.f4846b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (x0.m().a() - this.f4847c.getLong("js_last_update", 0) < ((Long) a50.g().a(k80.T1)).longValue()) {
            return ad.a((Object) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", sc.t().f5529b);
            jSONObject.put("mf", a50.g().a(k80.U1));
            jSONObject.put("cl", "191880412");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return ad.a(this.f4848d.a(jSONObject), new m5(this), rd.f5433b);
        } catch (JSONException e2) {
            qc.b("Unable to populate SDK Core Constants parameters.", e2);
            return ad.a((Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(JSONObject jSONObject) {
        k80.a(this.f4846b, 1, jSONObject);
        this.f4847c.edit().putLong("js_last_update", x0.m().a()).apply();
        return null;
    }
}
