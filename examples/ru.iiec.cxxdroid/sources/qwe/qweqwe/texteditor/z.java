package qwe.qweqwe.texteditor;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.i;
import com.google.android.material.snackbar.Snackbar;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.u0.v;
import qwe.qweqwe.texteditor.u0.x;

public class z {
    private final h a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f9914b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9915c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f9916d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9917e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f9918f = 90000;

    class a extends com.google.android.gms.ads.a {
        a() {
        }

        @Override // com.google.android.gms.ads.a
        public void a() {
            z.this.a((z) "Loading ad on callback");
            z.this.b();
            z.this.d();
        }

        @Override // com.google.android.gms.ads.a
        public void a(int i2) {
            z zVar = z.this;
            zVar.a((z) ("onAdFailedToLoad: " + i2));
        }

        @Override // com.google.android.gms.ads.a
        public void e() {
            z.this.a((z) "onAdLoaded");
        }
    }

    public z(e0 e0Var) {
        this.f9914b = e0Var;
        JSONObject c2 = this.f9914b.c("ads_frequency");
        this.f9918f = c2.optLong("time", this.f9918f);
        this.f9917e = c2.optBoolean("disabled", this.f9917e);
        int optInt = c2.optInt("launches_without_ads", 1);
        int a2 = x.a((Context) this.f9914b, "ad_launch_time", 1);
        if (a2 <= optInt) {
            x.b((Context) this.f9914b, "ad_launch_time", a2 + 1);
            this.f9917e = true;
        }
        String string = this.f9914b.getString(q0.admob_add_id);
        String string2 = this.f9914b.getString(q0.admob_interstitial_ad_id);
        if ("qwe".equals(string) || "qwe".equals(string2)) {
            i0.b("AdsManager", "replace admob_add_id!");
        }
        i.a(e0Var);
        i.a(0.0f);
        this.a = new h(this.f9914b);
        this.a.a(b0.c() ? "ca-app-pub-3940256099942544/1033173712" : string2);
        this.a.a(new a());
        a("Ad frequency: " + this.f9918f);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str) {
        i0.a("AdsManager", str);
    }

    private long c() {
        return this.f9918f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d() {
        c.a aVar = new c.a();
        if (!d0.a((Context) this.f9914b)) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            aVar.a(AdMobAdapter.class, bundle);
        }
        this.a.a(aVar.a());
    }

    private void e() {
        boolean z;
        if (this.a.a()) {
            a("Ad is loaded, showing");
            this.a.b();
            return;
        }
        if (!this.f9915c) {
            a("Loading first time Ads");
            d();
            z = true;
        } else {
            i0.a("AdsManager", "The interstitial wasn't loaded yet.");
            a("PROBLEMES: The interstitial wasn't loaded yet.");
            z = false;
        }
        this.f9915c = z;
    }

    public /* synthetic */ void a(View view) {
        v.a(this.f9914b, "snack_after_ad");
    }

    public boolean a() {
        if (!this.f9914b.D() && !this.f9917e) {
            long c2 = c();
            if (c2 <= 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.f9916d;
            if (j2 > c2) {
                this.f9916d = currentTimeMillis;
                e();
                return true;
            }
            a("seconds without ads: " + (j2 / 1000));
        }
        return false;
    }

    public void b() {
        String d2 = this.f9914b.d("show_snack_after_ads");
        long a2 = x.a((Context) this.f9914b, "snack_after_ad_shown_times", -1L) + 1;
        x.b(this.f9914b, "snack_after_ad_shown_times", a2);
        if (!"true".equals(d2)) {
            return;
        }
        if (a2 % 3 == 0 || a2 < 6) {
            Snackbar a3 = Snackbar.a(this.f9914b.findViewById(16908290), a2 < 6 ? q0.snack_ads_message_1 : q0.snack_ads_message_2, 0);
            a3.a(q0.snack_ads_action, new a(this));
            a3.k();
        }
    }
}
