package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.qc;
import org.json.JSONObject;

final class g0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JSONObject f3172b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f0 f3173c;

    g0(f0 f0Var, JSONObject jSONObject) {
        this.f3173c = f0Var;
        this.f3172b = jSONObject;
    }

    public final void run() {
        this.f3173c.f3169c.a("fetchHttpRequestCompleted", this.f3172b);
        qc.b("Dispatched http response.");
    }
}
