package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class o9 extends q9 {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Context f5132d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ n9 f5133e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o9(n9 n9Var, Context context) {
        super(null);
        this.f5133e = n9Var;
        this.f5132d = context;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        SharedPreferences sharedPreferences = this.f5132d.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f5133e.a) {
            this.f5133e.f5067d = sharedPreferences;
            this.f5133e.f5068e = edit;
            n9 n9Var = this.f5133e;
            n9 n9Var2 = this.f5133e;
            n9Var.f5069f = n9.n();
            this.f5133e.f5070g = this.f5133e.f5067d.getBoolean("use_https", this.f5133e.f5070g);
            this.f5133e.s = this.f5133e.f5067d.getBoolean("content_url_opted_out", this.f5133e.s);
            this.f5133e.f5071h = this.f5133e.f5067d.getString("content_url_hashes", this.f5133e.f5071h);
            this.f5133e.f5073j = this.f5133e.f5067d.getBoolean("auto_collect_location", this.f5133e.f5073j);
            this.f5133e.t = this.f5133e.f5067d.getBoolean("content_vertical_opted_out", this.f5133e.t);
            this.f5133e.f5072i = this.f5133e.f5067d.getString("content_vertical_hashes", this.f5133e.f5072i);
            this.f5133e.p = this.f5133e.f5067d.getInt("version_code", this.f5133e.p);
            this.f5133e.f5074k = this.f5133e.f5067d.getString("app_settings_json", this.f5133e.f5074k);
            this.f5133e.f5075l = this.f5133e.f5067d.getLong("app_settings_last_update_ms", this.f5133e.f5075l);
            this.f5133e.f5076m = this.f5133e.f5067d.getLong("app_last_background_time_ms", this.f5133e.f5076m);
            this.f5133e.o = this.f5133e.f5067d.getInt("request_in_session_count", this.f5133e.o);
            this.f5133e.n = this.f5133e.f5067d.getLong("first_ad_req_time_ms", this.f5133e.n);
            this.f5133e.q = this.f5133e.f5067d.getStringSet("never_pool_slots", this.f5133e.q);
            try {
                this.f5133e.r = new JSONObject(this.f5133e.f5067d.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                qc.c("Could not convert native advanced settings to json object", e2);
            }
            this.f5133e.a((n9) this.f5133e.p());
        }
    }
}
