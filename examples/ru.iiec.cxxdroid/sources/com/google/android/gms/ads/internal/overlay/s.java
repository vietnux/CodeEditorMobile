package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.k2;
import e.b.b.a.b.a;

@k2
public final class s extends com.google.android.gms.internal.ads.s {

    /* renamed from: b  reason: collision with root package name */
    private AdOverlayInfoParcel f3301b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f3302c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3303d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3304e = false;

    public s(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f3301b = adOverlayInfoParcel;
        this.f3302c = activity;
    }

    private final synchronized void f2() {
        if (!this.f3304e) {
            if (this.f3301b.f3257d != null) {
                this.f3301b.f3257d.C1();
            }
            this.f3304e = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final boolean G0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void S0() {
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void V0() {
        if (this.f3302c.isFinishing()) {
            f2();
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void a(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void e1() {
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void h(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3303d);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void i(Bundle bundle) {
        n nVar;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3301b;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                d40 d40 = adOverlayInfoParcel.f3256c;
                if (d40 != null) {
                    d40.d();
                }
                if (!(this.f3302c.getIntent() == null || !this.f3302c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (nVar = this.f3301b.f3257d) == null)) {
                    nVar.D1();
                }
            }
            x0.c();
            Activity activity = this.f3302c;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3301b;
            if (!a.a(activity, adOverlayInfoParcel2.f3255b, adOverlayInfoParcel2.f3263j)) {
                this.f3302c.finish();
                return;
            }
            return;
        }
        this.f3302c.finish();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void i(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onDestroy() {
        if (this.f3302c.isFinishing()) {
            f2();
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onPause() {
        n nVar = this.f3301b.f3257d;
        if (nVar != null) {
            nVar.onPause();
        }
        if (this.f3302c.isFinishing()) {
            f2();
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onResume() {
        if (this.f3303d) {
            this.f3302c.finish();
            return;
        }
        this.f3303d = true;
        n nVar = this.f3301b.f3257d;
        if (nVar != null) {
            nVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void r1() {
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void u0() {
    }
}
