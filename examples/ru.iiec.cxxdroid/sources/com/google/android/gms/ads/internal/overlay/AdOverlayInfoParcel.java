package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.gmsg.m;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.sc;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new m();

    /* renamed from: b  reason: collision with root package name */
    public final c f3255b;

    /* renamed from: c  reason: collision with root package name */
    public final d40 f3256c;

    /* renamed from: d  reason: collision with root package name */
    public final n f3257d;

    /* renamed from: e  reason: collision with root package name */
    public final lg f3258e;

    /* renamed from: f  reason: collision with root package name */
    public final m f3259f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3260g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3261h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3262i;

    /* renamed from: j  reason: collision with root package name */
    public final t f3263j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3264k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3265l;

    /* renamed from: m  reason: collision with root package name */
    public final String f3266m;
    public final sc n;
    public final String o;
    public final r p;
    public final k q;

    AdOverlayInfoParcel(c cVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, sc scVar, String str4, r rVar, IBinder iBinder6) {
        this.f3255b = cVar;
        this.f3256c = (d40) b.y(a.AbstractBinderC0100a.a(iBinder));
        this.f3257d = (n) b.y(a.AbstractBinderC0100a.a(iBinder2));
        this.f3258e = (lg) b.y(a.AbstractBinderC0100a.a(iBinder3));
        this.q = (k) b.y(a.AbstractBinderC0100a.a(iBinder6));
        this.f3259f = (m) b.y(a.AbstractBinderC0100a.a(iBinder4));
        this.f3260g = str;
        this.f3261h = z;
        this.f3262i = str2;
        this.f3263j = (t) b.y(a.AbstractBinderC0100a.a(iBinder5));
        this.f3264k = i2;
        this.f3265l = i3;
        this.f3266m = str3;
        this.n = scVar;
        this.o = str4;
        this.p = rVar;
    }

    public AdOverlayInfoParcel(c cVar, d40 d40, n nVar, t tVar, sc scVar) {
        this.f3255b = cVar;
        this.f3256c = d40;
        this.f3257d = nVar;
        this.f3258e = null;
        this.q = null;
        this.f3259f = null;
        this.f3260g = null;
        this.f3261h = false;
        this.f3262i = null;
        this.f3263j = tVar;
        this.f3264k = -1;
        this.f3265l = 4;
        this.f3266m = null;
        this.n = scVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(d40 d40, n nVar, k kVar, m mVar, t tVar, lg lgVar, boolean z, int i2, String str, sc scVar) {
        this.f3255b = null;
        this.f3256c = d40;
        this.f3257d = nVar;
        this.f3258e = lgVar;
        this.q = kVar;
        this.f3259f = mVar;
        this.f3260g = null;
        this.f3261h = z;
        this.f3262i = null;
        this.f3263j = tVar;
        this.f3264k = i2;
        this.f3265l = 3;
        this.f3266m = str;
        this.n = scVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(d40 d40, n nVar, k kVar, m mVar, t tVar, lg lgVar, boolean z, int i2, String str, String str2, sc scVar) {
        this.f3255b = null;
        this.f3256c = d40;
        this.f3257d = nVar;
        this.f3258e = lgVar;
        this.q = kVar;
        this.f3259f = mVar;
        this.f3260g = str2;
        this.f3261h = z;
        this.f3262i = str;
        this.f3263j = tVar;
        this.f3264k = i2;
        this.f3265l = 3;
        this.f3266m = null;
        this.n = scVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(d40 d40, n nVar, t tVar, lg lgVar, int i2, sc scVar, String str, r rVar) {
        this.f3255b = null;
        this.f3256c = d40;
        this.f3257d = nVar;
        this.f3258e = lgVar;
        this.q = null;
        this.f3259f = null;
        this.f3260g = null;
        this.f3261h = false;
        this.f3262i = null;
        this.f3263j = tVar;
        this.f3264k = i2;
        this.f3265l = 1;
        this.f3266m = null;
        this.n = scVar;
        this.o = str;
        this.p = rVar;
    }

    public AdOverlayInfoParcel(d40 d40, n nVar, t tVar, lg lgVar, boolean z, int i2, sc scVar) {
        this.f3255b = null;
        this.f3256c = d40;
        this.f3257d = nVar;
        this.f3258e = lgVar;
        this.q = null;
        this.f3259f = null;
        this.f3260g = null;
        this.f3261h = z;
        this.f3262i = null;
        this.f3263j = tVar;
        this.f3264k = i2;
        this.f3265l = 2;
        this.f3266m = null;
        this.n = scVar;
        this.o = null;
        this.p = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f3255b, i2, false);
        c.a(parcel, 3, b.a(this.f3256c).asBinder(), false);
        c.a(parcel, 4, b.a(this.f3257d).asBinder(), false);
        c.a(parcel, 5, b.a(this.f3258e).asBinder(), false);
        c.a(parcel, 6, b.a(this.f3259f).asBinder(), false);
        c.a(parcel, 7, this.f3260g, false);
        c.a(parcel, 8, this.f3261h);
        c.a(parcel, 9, this.f3262i, false);
        c.a(parcel, 10, b.a(this.f3263j).asBinder(), false);
        c.a(parcel, 11, this.f3264k);
        c.a(parcel, 12, this.f3265l);
        c.a(parcel, 13, this.f3266m, false);
        c.a(parcel, 14, (Parcelable) this.n, i2, false);
        c.a(parcel, 16, this.o, false);
        c.a(parcel, 17, (Parcelable) this.p, i2, false);
        c.a(parcel, 18, b.a(this.q).asBinder(), false);
        c.a(parcel, a);
    }
}
