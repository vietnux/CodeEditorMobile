package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.x80;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

final class g0 implements Callable<da0> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3148b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ JSONArray f3149c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3150d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ r8 f3151e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ e0 f3152f;

    g0(e0 e0Var, int i2, JSONArray jSONArray, int i3, r8 r8Var) {
        this.f3152f = e0Var;
        this.f3148b = i2;
        this.f3149c = jSONArray;
        this.f3150d = i3;
        this.f3151e = r8Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ da0 call() {
        Bundle bundle;
        if (this.f3148b >= this.f3149c.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f3149c.get(this.f3148b));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        e0 e0Var = this.f3152f;
        y0 y0Var = e0Var.f3125g;
        e0 e0Var2 = new e0(y0Var.f3368d, e0Var.f3131m, y0Var.f3374j, y0Var.f3367c, e0Var.n, y0Var.f3370f, true);
        e0 e0Var3 = this.f3152f;
        e0.a(e0Var3, e0Var3.f3125g, e0Var2.f3125g);
        e0Var2.p2();
        e0Var2.a(this.f3152f.f3121c);
        x80 x80 = e0Var2.f3120b;
        int i2 = this.f3148b;
        x80.a("num_ads_requested", String.valueOf(this.f3150d));
        x80.a("ad_index", String.valueOf(i2));
        j3 j3Var = this.f3151e.a;
        String jSONObject2 = jSONObject.toString();
        if (j3Var.f4662d.f4676d == null) {
            bundle = new Bundle();
        }
        bundle.putString("_ad", jSONObject2);
        j40 j40 = j3Var.f4662d;
        e0Var2.a(new k3(j3Var.f4661c, new j40(j40.f4674b, j40.f4675c, bundle, j40.f4677e, j40.f4678f, j40.f4679g, j40.f4680h, j40.f4681i, j40.f4682j, j40.f4683k, j40.f4684l, j40.f4685m, j40.n, j40.o, j40.p, j40.q, j40.r, j40.s), j3Var.f4663e, j3Var.f4664f, j3Var.f4665g, j3Var.f4666h, j3Var.f4668j, j3Var.f4669k, j3Var.f4670l, j3Var.f4671m, j3Var.o, j3Var.A, j3Var.p, j3Var.q, j3Var.r, j3Var.s, j3Var.t, j3Var.u, j3Var.v, j3Var.w, j3Var.x, j3Var.y, j3Var.z, j3Var.C, j3Var.D, j3Var.J, j3Var.E, j3Var.F, j3Var.G, j3Var.H, ad.a(j3Var.I), j3Var.K, j3Var.L, j3Var.M, j3Var.N, j3Var.O, j3Var.P, j3Var.Q, j3Var.R, j3Var.V, ad.a(j3Var.f4667i), j3Var.W, j3Var.X, j3Var.Y, 1, j3Var.a0, j3Var.b0, j3Var.c0, j3Var.d0), e0Var2.f3120b);
        return e0Var2.r2().get();
    }
}
