package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.b;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.l;
import com.google.android.gms.common.m;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class f4 extends g9 {

    /* renamed from: j  reason: collision with root package name */
    private static final long f4269j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: k  reason: collision with root package name */
    private static final Object f4270k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f4271l = false;

    /* renamed from: m  reason: collision with root package name */
    private static hg0 f4272m = null;
    private static HttpClient n = null;
    private static b o = null;
    private static e0<Object> p = null;

    /* renamed from: d  reason: collision with root package name */
    private final m2 f4273d;

    /* renamed from: e  reason: collision with root package name */
    private final k3 f4274e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4275f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final Context f4276g;

    /* renamed from: h  reason: collision with root package name */
    private ug0 f4277h;

    /* renamed from: i  reason: collision with root package name */
    private v20 f4278i;

    public f4(Context context, k3 k3Var, m2 m2Var, v20 v20) {
        super(true);
        this.f4273d = m2Var;
        this.f4276g = context;
        this.f4274e = k3Var;
        this.f4278i = v20;
        synchronized (f4270k) {
            if (!f4271l) {
                o = new b();
                n = new HttpClient(context.getApplicationContext(), k3Var.f4765j);
                p = new n4();
                f4272m = new hg0(this.f4276g.getApplicationContext(), this.f4274e.f4765j, (String) a50.g().a(k80.a), new m4(), new l4());
                f4271l = true;
            }
        }
    }

    private final n3 a(j3 j3Var) {
        x0.f();
        String b2 = u9.b();
        JSONObject a = a(j3Var, b2);
        if (a == null) {
            return new n3(0);
        }
        long b3 = x0.m().b();
        Future<JSONObject> a2 = o.a(b2);
        fc.a.post(new h4(this, a, b2));
        try {
            JSONObject jSONObject = a2.get(f4269j - (x0.m().b() - b3), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new n3(-1);
            }
            n3 a3 = x4.a(this.f4276g, j3Var, jSONObject.toString());
            return (a3.f5028g == -3 || !TextUtils.isEmpty(a3.f5026e)) ? a3 : new n3(3);
        } catch (InterruptedException | CancellationException unused) {
            return new n3(-1);
        } catch (TimeoutException unused2) {
            return new n3(2);
        } catch (ExecutionException unused3) {
            return new n3(0);
        }
    }

    private final JSONObject a(j3 j3Var, String str) {
        g5 g5Var;
        AdvertisingIdClient.Info info;
        Bundle bundle = j3Var.f4662d.f4676d.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            g5Var = x0.q().a(this.f4276g).get();
        } catch (Exception e2) {
            qc.c("Error grabbing device info: ", e2);
            g5Var = null;
        }
        Context context = this.f4276g;
        q4 q4Var = new q4();
        q4Var.f5299j = j3Var;
        q4Var.f5300k = g5Var;
        JSONObject a = x4.a(context, q4Var);
        if (a == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.f4276g);
        } catch (l | m | IOException | IllegalStateException e3) {
            qc.c("Cannot get advertising id info", e3);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return x0.f().a(hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected static void a(vf0 vf0) {
        vf0.b("/loadAd", o);
        vf0.b("/fetchHttpRequest", n);
        vf0.b("/invalidRequest", p);
    }

    protected static void b(vf0 vf0) {
        vf0.a("/loadAd", o);
        vf0.a("/fetchHttpRequest", n);
        vf0.a("/invalidRequest", p);
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
        synchronized (this.f4275f) {
            fc.a.post(new k4(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        qc.b("SdkLessAdLoaderBackgroundTask started.");
        String b2 = x0.C().b(this.f4276g);
        j3 j3Var = new j3(this.f4274e, -1, x0.C().k(this.f4276g), x0.C().a(this.f4276g), b2);
        x0.C().f(this.f4276g, b2);
        n3 a = a(j3Var);
        fc.a.post(new g4(this, new r8(j3Var, a, null, null, a.f5028g, x0.m().b(), a.p, null, this.f4278i)));
    }
}
