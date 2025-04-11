package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.n.g;
import com.google.android.gms.ads.n.h;
import com.google.android.gms.ads.n.i;
import com.google.android.gms.ads.n.k;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@k2
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, l, n, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private com.google.android.gms.ads.e zzgw;
    private h zzgx;
    private com.google.android.gms.ads.b zzgy;
    private Context zzgz;
    private h zzha;
    private com.google.android.gms.ads.reward.mediation.a zzhb;
    private final com.google.android.gms.ads.p.c zzhc = new g(this);

    static class a extends g {
        private final com.google.android.gms.ads.n.g p;

        public a(com.google.android.gms.ads.n.g gVar) {
            this.p = gVar;
            c(gVar.d().toString());
            a(gVar.f());
            a(gVar.b().toString());
            a(gVar.e());
            b(gVar.c().toString());
            if (gVar.h() != null) {
                a(gVar.h().doubleValue());
            }
            if (gVar.i() != null) {
                e(gVar.i().toString());
            }
            if (gVar.g() != null) {
                d(gVar.g().toString());
            }
            b(true);
            a(true);
            a(gVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.f
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.n.e) {
                ((com.google.android.gms.ads.n.e) view).setNativeAd(this.p);
            }
            com.google.android.gms.ads.n.f fVar = com.google.android.gms.ads.n.f.f3434c.get(view);
            if (fVar != null) {
                fVar.a(this.p);
            }
        }
    }

    static class b extends com.google.android.gms.ads.mediation.h {
        private final com.google.android.gms.ads.n.h n;

        public b(com.google.android.gms.ads.n.h hVar) {
            this.n = hVar;
            d(hVar.e().toString());
            a(hVar.f());
            b(hVar.c().toString());
            if (hVar.g() != null) {
                a(hVar.g());
            }
            c(hVar.d().toString());
            a(hVar.b().toString());
            b(true);
            a(true);
            a(hVar.h());
        }

        @Override // com.google.android.gms.ads.mediation.f
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.n.e) {
                ((com.google.android.gms.ads.n.e) view).setNativeAd(this.n);
            }
            com.google.android.gms.ads.n.f fVar = com.google.android.gms.ads.n.f.f3434c.get(view);
            if (fVar != null) {
                fVar.a(this.n);
            }
        }
    }

    static class c extends m {
        private final k r;

        public c(k kVar) {
            this.r = kVar;
            d(kVar.d());
            a(kVar.f());
            b(kVar.b());
            a(kVar.e());
            c(kVar.c());
            a(kVar.a());
            a(kVar.h());
            f(kVar.i());
            e(kVar.g());
            a(kVar.l());
            b(true);
            a(true);
            a(kVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.m
        public final void a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof com.google.android.gms.ads.n.l) {
                ((com.google.android.gms.ads.n.l) view).setNativeAd(this.r);
                return;
            }
            com.google.android.gms.ads.n.f fVar = com.google.android.gms.ads.n.f.f3434c.get(view);
            if (fVar != null) {
                fVar.a(this.r);
            }
        }
    }

    static final class d extends com.google.android.gms.ads.a implements com.google.android.gms.ads.m.a, d40 {

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f3090b;

        /* renamed from: c  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.c f3091c;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.c cVar) {
            this.f3090b = abstractAdViewAdapter;
            this.f3091c = cVar;
        }

        @Override // com.google.android.gms.ads.a
        public final void a() {
            this.f3091c.a(this.f3090b);
        }

        @Override // com.google.android.gms.ads.a
        public final void a(int i2) {
            this.f3091c.a(this.f3090b, i2);
        }

        @Override // com.google.android.gms.ads.m.a
        public final void a(String str, String str2) {
            this.f3091c.a(this.f3090b, str, str2);
        }

        @Override // com.google.android.gms.ads.a
        public final void c() {
            this.f3091c.d(this.f3090b);
        }

        @Override // com.google.android.gms.internal.ads.d40, com.google.android.gms.ads.a
        public final void d() {
            this.f3091c.b(this.f3090b);
        }

        @Override // com.google.android.gms.ads.a
        public final void e() {
            this.f3091c.c(this.f3090b);
        }

        @Override // com.google.android.gms.ads.a
        public final void f() {
            this.f3091c.e(this.f3090b);
        }
    }

    static final class e extends com.google.android.gms.ads.a implements d40 {

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f3092b;

        /* renamed from: c  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.d f3093c;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.d dVar) {
            this.f3092b = abstractAdViewAdapter;
            this.f3093c = dVar;
        }

        @Override // com.google.android.gms.ads.a
        public final void a() {
            this.f3093c.c(this.f3092b);
        }

        @Override // com.google.android.gms.ads.a
        public final void a(int i2) {
            this.f3093c.a(this.f3092b, i2);
        }

        @Override // com.google.android.gms.ads.a
        public final void c() {
            this.f3093c.a(this.f3092b);
        }

        @Override // com.google.android.gms.internal.ads.d40, com.google.android.gms.ads.a
        public final void d() {
            this.f3093c.d(this.f3092b);
        }

        @Override // com.google.android.gms.ads.a
        public final void e() {
            this.f3093c.b(this.f3092b);
        }

        @Override // com.google.android.gms.ads.a
        public final void f() {
            this.f3093c.e(this.f3092b);
        }
    }

    static final class f extends com.google.android.gms.ads.a implements g.a, h.a, i.a, i.b, k.a {

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f3094b;

        /* renamed from: c  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.e f3095c;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.e eVar) {
            this.f3094b = abstractAdViewAdapter;
            this.f3095c = eVar;
        }

        @Override // com.google.android.gms.ads.a
        public final void a() {
            this.f3095c.c(this.f3094b);
        }

        @Override // com.google.android.gms.ads.a
        public final void a(int i2) {
            this.f3095c.a(this.f3094b, i2);
        }

        @Override // com.google.android.gms.ads.n.g.a
        public final void a(com.google.android.gms.ads.n.g gVar) {
            this.f3095c.a(this.f3094b, new a(gVar));
        }

        @Override // com.google.android.gms.ads.n.h.a
        public final void a(com.google.android.gms.ads.n.h hVar) {
            this.f3095c.a(this.f3094b, new b(hVar));
        }

        @Override // com.google.android.gms.ads.n.i.b
        public final void a(i iVar) {
            this.f3095c.a(this.f3094b, iVar);
        }

        @Override // com.google.android.gms.ads.n.i.a
        public final void a(i iVar, String str) {
            this.f3095c.a(this.f3094b, iVar, str);
        }

        @Override // com.google.android.gms.ads.n.k.a
        public final void a(k kVar) {
            this.f3095c.a(this.f3094b, new c(kVar));
        }

        @Override // com.google.android.gms.ads.a
        public final void b() {
            this.f3095c.e(this.f3094b);
        }

        @Override // com.google.android.gms.ads.a
        public final void c() {
            this.f3095c.b(this.f3094b);
        }

        @Override // com.google.android.gms.ads.a
        public final void d() {
            this.f3095c.d(this.f3094b);
        }

        @Override // com.google.android.gms.ads.a
        public final void e() {
        }

        @Override // com.google.android.gms.ads.a
        public final void f() {
            this.f3095c.a(this.f3094b);
        }
    }

    private final com.google.android.gms.ads.c zza(Context context, com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        c.a aVar2 = new c.a();
        Date d2 = aVar.d();
        if (d2 != null) {
            aVar2.a(d2);
        }
        int m2 = aVar.m();
        if (m2 != 0) {
            aVar2.a(m2);
        }
        Set<String> f2 = aVar.f();
        if (f2 != null) {
            for (String str : f2) {
                aVar2.a(str);
            }
        }
        Location k2 = aVar.k();
        if (k2 != null) {
            aVar2.a(k2);
        }
        if (aVar.e()) {
            a50.b();
            aVar2.b(fc.a(context));
        }
        if (aVar.i() != -1) {
            boolean z = true;
            if (aVar.i() != 1) {
                z = false;
            }
            aVar2.b(z);
        }
        aVar2.a(aVar.a());
        aVar2.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzgw;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public Bundle getInterstitialAdapterInfo() {
        b.a aVar = new b.a();
        aVar.a(1);
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.n
    public o60 getVideoController() {
        com.google.android.gms.ads.k videoController;
        com.google.android.gms.ads.e eVar = this.zzgw;
        if (eVar == null || (videoController = eVar.getVideoController()) == null) {
            return null;
        }
        return videoController.a();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, com.google.android.gms.ads.reward.mediation.a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = aVar2;
        this.zzhb.c(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzhb != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgz;
        if (context == null || this.zzhb == null) {
            qc.a("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new com.google.android.gms.ads.h(context);
        this.zzha.b(true);
        this.zzha.a(getAdUnitId(bundle));
        this.zzha.a(this.zzhc);
        this.zzha.a(new h(this));
        this.zzha.a(zza(this.zzgz, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.b
    public void onDestroy() {
        com.google.android.gms.ads.e eVar = this.zzgw;
        if (eVar != null) {
            eVar.a();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public void onImmersiveModeUpdated(boolean z) {
        com.google.android.gms.ads.h hVar = this.zzgx;
        if (hVar != null) {
            hVar.a(z);
        }
        com.google.android.gms.ads.h hVar2 = this.zzha;
        if (hVar2 != null) {
            hVar2.a(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.b
    public void onPause() {
        com.google.android.gms.ads.e eVar = this.zzgw;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.b
    public void onResume() {
        com.google.android.gms.ads.e eVar = this.zzgw;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.c cVar, Bundle bundle, com.google.android.gms.ads.d dVar, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzgw = new com.google.android.gms.ads.e(context);
        this.zzgw.setAdSize(new com.google.android.gms.ads.d(dVar.b(), dVar.a()));
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setAdListener(new d(this, cVar));
        this.zzgw.a(zza(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzgx = new com.google.android.gms.ads.h(context);
        this.zzgx.a(getAdUnitId(bundle));
        this.zzgx.a(new e(this, dVar));
        this.zzgx.a(zza(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, com.google.android.gms.ads.mediation.i iVar, Bundle bundle2) {
        f fVar = new f(this, eVar);
        b.a aVar = new b.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.a((com.google.android.gms.ads.a) fVar);
        com.google.android.gms.ads.n.d h2 = iVar.h();
        if (h2 != null) {
            aVar.a(h2);
        }
        if (iVar.j()) {
            aVar.a((k.a) fVar);
        }
        if (iVar.c()) {
            aVar.a((g.a) fVar);
        }
        if (iVar.l()) {
            aVar.a((h.a) fVar);
        }
        if (iVar.g()) {
            for (String str : iVar.b().keySet()) {
                aVar.a(str, fVar, iVar.b().get(str).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = aVar.a();
        this.zzgy.a(zza(context, iVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzgx.b();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzha.b();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
