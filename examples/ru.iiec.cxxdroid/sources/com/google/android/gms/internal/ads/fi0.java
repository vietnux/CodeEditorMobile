package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.n.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class fi0 implements ji0 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final ri0 f4322b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4323c;

    /* renamed from: d  reason: collision with root package name */
    private final bi0 f4324d;

    /* renamed from: e  reason: collision with root package name */
    private final ai0 f4325e;

    /* renamed from: f  reason: collision with root package name */
    private j40 f4326f;

    /* renamed from: g  reason: collision with root package name */
    private final n40 f4327g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f4328h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f4329i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final sc f4330j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f4331k;

    /* renamed from: l  reason: collision with root package name */
    private final na0 f4332l;

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f4333m;
    private final List<String> n;
    private final List<String> o;
    private final boolean p;
    private ui0 q;
    private int r = -2;
    private aj0 s;

    public fi0(Context context, String str, ri0 ri0, bi0 bi0, ai0 ai0, j40 j40, n40 n40, sc scVar, boolean z, boolean z2, na0 na0, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        this.f4328h = context;
        this.f4322b = ri0;
        this.f4325e = ai0;
        this.a = "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? b() : str2;
        this.f4324d = bi0;
        long j2 = ai0.u;
        if (j2 != -1) {
            this.f4323c = j2;
        } else {
            long j3 = bi0.f3913b;
            this.f4323c = j3 == -1 ? 10000 : j3;
        }
        this.f4326f = j40;
        this.f4327g = n40;
        this.f4330j = scVar;
        this.f4331k = z;
        this.p = z2;
        this.f4332l = na0;
        this.f4333m = list;
        this.n = list2;
        this.o = list3;
    }

    private static ui0 a(b bVar) {
        return new pj0(bVar);
    }

    private final String a(String str) {
        if (str != null && e() && !b(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                qc.d("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public final void a(ei0 ei0) {
        String a2 = a(this.f4325e.f3816k);
        try {
            if (this.f4330j.f5531d >= 4100000) {
                if (!this.f4331k) {
                    if (!this.f4325e.b()) {
                        if (this.f4327g.f5049e) {
                            this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4326f, a2, this.f4325e.a, ei0);
                            return;
                        } else if (!this.p) {
                            this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4327g, this.f4326f, a2, this.f4325e.a, ei0);
                            return;
                        } else if (this.f4325e.o != null) {
                            this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4326f, a2, this.f4325e.a, ei0, new na0(b(this.f4325e.s)), this.f4325e.r);
                            return;
                        } else {
                            this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4327g, this.f4326f, a2, this.f4325e.a, ei0);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f4333m);
                if (this.n != null) {
                    for (String str : this.n) {
                        String str2 = ":false";
                        if (this.o != null && this.o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + str2.length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4326f, a2, this.f4325e.a, ei0, this.f4332l, arrayList);
            } else if (this.f4327g.f5049e) {
                this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4326f, a2, ei0);
            } else {
                this.q.a(e.b.b.a.b.b.a(this.f4328h), this.f4327g, this.f4326f, a2, ei0);
            }
        } catch (RemoteException e2) {
            qc.c("Could not request ad from mediation adapter.", e2);
            a(5);
        }
    }

    private static d b(String str) {
        d.a aVar = new d.a();
        if (str == null) {
            return aVar.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = 0;
            aVar.a(jSONObject.optBoolean("multiple_images", false));
            aVar.b(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i2 = 2;
            } else if ("portrait".equals(optString)) {
                i2 = 1;
            } else if (!"any".equals(optString)) {
                i2 = -1;
            }
            aVar.b(i2);
        } catch (JSONException e2) {
            qc.c("Exception occurred when creating native ad options", e2);
        }
        return aVar.a();
    }

    private final String b() {
        try {
            return (TextUtils.isEmpty(this.f4325e.f3810e) || !this.f4322b.k(this.f4325e.f3810e)) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (RemoteException unused) {
            qc.d("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* access modifiers changed from: private */
    public final boolean b(int i2) {
        try {
            Bundle u1 = this.f4331k ? this.q.u1() : this.f4327g.f5049e ? this.q.getInterstitialAdapterInfo() : this.q.zzmq();
            return u1 != null && (u1.getInt("capabilities", 0) & i2) == i2;
        } catch (RemoteException unused) {
            qc.d("Could not get adapter info. Returning false");
            return false;
        }
    }

    private final aj0 c() {
        if (this.r != 0 || !e()) {
            return null;
        }
        try {
            if (!(!b(4) || this.s == null || this.s.i1() == 0)) {
                return this.s;
            }
        } catch (RemoteException unused) {
            qc.d("Could not get cpm value from MediationResponseMetadata");
        }
        return new hi0(f());
    }

    /* access modifiers changed from: private */
    public final ui0 d() {
        String valueOf = String.valueOf(this.a);
        qc.c(valueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(valueOf) : new String("Instantiating mediation adapter: "));
        if (!this.f4331k && !this.f4325e.b()) {
            if (((Boolean) a50.g().a(k80.v1)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return a(new AdMobAdapter());
            }
            if (((Boolean) a50.g().a(k80.w1)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                return a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new pj0(new zzzv());
            }
        }
        try {
            return this.f4322b.h(this.a);
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(this.a);
            qc.a(valueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(valueOf2) : new String("Could not instantiate mediation adapter: "), e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean e() {
        return this.f4324d.f3924m != -1;
    }

    private final int f() {
        String str = this.f4325e.f3816k;
        if (str == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException unused) {
            qc.d("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public final ii0 a(long j2, long j3) {
        ii0 ii0;
        synchronized (this.f4329i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ei0 ei0 = new ei0();
            u9.f5718h.post(new gi0(this, ei0));
            long j4 = this.f4323c;
            while (this.r == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j5 = j4 - (elapsedRealtime2 - elapsedRealtime);
                long j6 = j3 - (elapsedRealtime2 - j2);
                if (j5 <= 0 || j6 <= 0) {
                    qc.c("Timed out waiting for adapter.");
                    this.r = 3;
                } else {
                    try {
                        this.f4329i.wait(Math.min(j5, j6));
                    } catch (InterruptedException unused) {
                        this.r = 5;
                    }
                }
            }
            ii0 = new ii0(this.f4325e, this.q, this.a, ei0, this.r, c(), x0.m().b() - elapsedRealtime);
        }
        return ii0;
    }

    public final void a() {
        synchronized (this.f4329i) {
            try {
                if (this.q != null) {
                    this.q.destroy();
                }
            } catch (RemoteException e2) {
                qc.c("Could not destroy mediation adapter.", e2);
            }
            this.r = -1;
            this.f4329i.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void a(int i2) {
        synchronized (this.f4329i) {
            this.r = i2;
            this.f4329i.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void a(int i2, aj0 aj0) {
        synchronized (this.f4329i) {
            this.r = 0;
            this.s = aj0;
            this.f4329i.notify();
        }
    }
}
