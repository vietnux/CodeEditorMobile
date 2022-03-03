package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import e.b.b.a.b.a;

@k2
public final class cf0 extends s50 {

    /* renamed from: b  reason: collision with root package name */
    private final String f4013b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4014c;

    /* renamed from: d  reason: collision with root package name */
    private final rd0 f4015d;

    /* renamed from: e  reason: collision with root package name */
    private m f4016e;

    /* renamed from: f  reason: collision with root package name */
    private final te0 f4017f;

    public cf0(Context context, String str, ri0 ri0, sc scVar, u1 u1Var) {
        this(str, new rd0(context, ri0, scVar, u1Var));
    }

    private cf0(String str, rd0 rd0) {
        this.f4013b = str;
        this.f4015d = rd0;
        this.f4017f = new te0();
        x0.s().a(rd0);
    }

    private final void f2() {
        if (this.f4016e == null) {
            this.f4016e = this.f4015d.a(this.f4013b);
            this.f4017f.a(this.f4016e);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final n40 B0() {
        m mVar = this.f4016e;
        if (mVar != null) {
            return mVar.B0();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void E() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean N() {
        m mVar = this.f4016e;
        return mVar != null && mVar.N();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a60 P0() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a T0() {
        m mVar = this.f4016e;
        if (mVar != null) {
            return mVar.T0();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(a60 a60) {
        te0 te0 = this.f4017f;
        te0.f5612c = a60;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d0 d0Var, String str) {
        qc.d("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d50 d50) {
        te0 te0 = this.f4017f;
        te0.f5614e = d50;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(e90 e90) {
        te0 te0 = this.f4017f;
        te0.f5613d = e90;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(l6 l6Var) {
        te0 te0 = this.f4017f;
        te0.f5615f = l6Var;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(n40 n40) {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.a(n40);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(t70 t70) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(u60 u60) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(w50 w50) {
        te0 te0 = this.f4017f;
        te0.f5611b = w50;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(y yVar) {
        qc.d("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(boolean z) {
        this.f4014c = z;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g50 g50) {
        te0 te0 = this.f4017f;
        te0.a = g50;
        m mVar = this.f4016e;
        if (mVar != null) {
            te0.a(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g60 g60) {
        f2();
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.b(g60);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(String str) {
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean b(j40 j40) {
        if (!we0.a(j40).contains("gw")) {
            f2();
        }
        if (we0.a(j40).contains("_skipMediation")) {
            f2();
        }
        if (j40.f4683k != null) {
            f2();
        }
        m mVar = this.f4016e;
        if (mVar != null) {
            return mVar.b(j40);
        }
        we0 s = x0.s();
        if (we0.a(j40).contains("_ad")) {
            s.b(j40, this.f4013b);
        }
        ze0 a = s.a(j40, this.f4013b);
        if (a != null) {
            if (!a.f6202e) {
                a.a();
                bf0.j().d();
            } else {
                bf0.j().c();
            }
            this.f4016e = a.a;
            a.f6200c.a(this.f4017f);
            this.f4017f.a(this.f4016e);
            return a.f6203f;
        }
        f2();
        bf0.j().d();
        return this.f4016e.b(j40);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void destroy() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final g50 f1() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final o60 getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void i(boolean z) {
        f2();
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.i(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k() {
        m mVar = this.f4016e;
        if (mVar != null) {
            return mVar.k();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k0() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void k1() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.k1();
        } else {
            qc.d("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String m0() {
        m mVar = this.f4016e;
        if (mVar != null) {
            return mVar.m0();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean m1() {
        m mVar = this.f4016e;
        return mVar != null && mVar.m1();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final Bundle q0() {
        m mVar = this.f4016e;
        return mVar != null ? mVar.q0() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.a(this.f4014c);
            this.f4016e.showInterstitial();
            return;
        }
        qc.d("Interstitial ad must be loaded before showInterstitial().");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void stopLoading() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.stopLoading();
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void y() {
        m mVar = this.f4016e;
        if (mVar != null) {
            mVar.y();
        }
    }
}
