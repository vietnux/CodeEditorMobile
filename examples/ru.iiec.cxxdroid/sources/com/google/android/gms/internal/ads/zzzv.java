package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.c.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.common.util.n;

@k2
public final class zzzv implements MediationInterstitialAdapter {
    private Activity a;

    /* renamed from: b  reason: collision with root package name */
    private d f6239b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f6240c;

    @Override // com.google.android.gms.ads.mediation.b
    public final void onDestroy() {
        qc.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final void onPause() {
        qc.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final void onResume() {
        qc.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, d dVar, Bundle bundle, a aVar, Bundle bundle2) {
        this.f6239b = dVar;
        if (this.f6239b == null) {
            qc.d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            qc.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f6239b.a(this, 0);
        } else {
            if (!(n.c() && i90.a(context))) {
                qc.d("Default browser does not support custom tabs. Bailing out.");
                this.f6239b.a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                qc.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f6239b.a(this, 0);
                return;
            }
            this.a = (Activity) context;
            this.f6240c = Uri.parse(string);
            this.f6239b.b(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        c a2 = new c.a().a();
        a2.a.setData(this.f6240c);
        u9.f5718h.post(new sk0(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.c(a2.a), null, new rk0(this), null, new sc(0, 0, false))));
        x0.j().h();
    }
}
