package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.List;

public final class wi0 extends fz implements ui0 {
    wi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void E() {
        b(9, M());
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final dj0 H0() {
        dj0 dj0;
        Parcel a = a(15, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dj0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            dj0 = queryLocalInterface instanceof dj0 ? (dj0) queryLocalInterface : new gj0(readStrongBinder);
        }
        a.recycle();
        return dj0;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final boolean J0() {
        Parcel a = a(22, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final hj0 Z0() {
        hj0 hj0;
        Parcel a = a(16, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            hj0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            hj0 = queryLocalInterface instanceof hj0 ? (hj0) queryLocalInterface : new jj0(readStrongBinder);
        }
        a.recycle();
        return hj0;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str) {
        Parcel M = M();
        hz.a(M, j40);
        M.writeString(str);
        b(11, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str, String str2) {
        Parcel M = M();
        hz.a(M, j40);
        M.writeString(str);
        M.writeString(str2);
        b(20, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, k7 k7Var, String str2) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, j40);
        M.writeString(str);
        hz.a(M, k7Var);
        M.writeString(str2);
        b(10, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, xi0 xi0) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, j40);
        M.writeString(str);
        hz.a(M, xi0);
        b(3, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, j40);
        M.writeString(str);
        M.writeString(str2);
        hz.a(M, xi0);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0, na0 na0, List<String> list) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, j40);
        M.writeString(str);
        M.writeString(str2);
        hz.a(M, xi0);
        hz.a(M, na0);
        M.writeStringList(list);
        b(14, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, k7 k7Var, List<String> list) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, k7Var);
        M.writeStringList(list);
        b(23, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, xi0 xi0) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        hz.a(M, j40);
        M.writeString(str);
        hz.a(M, xi0);
        b(1, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, String str2, xi0 xi0) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        hz.a(M, j40);
        M.writeString(str);
        M.writeString(str2);
        hz.a(M, xi0);
        b(6, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(boolean z) {
        Parcel M = M();
        hz.a(M, z);
        b(25, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final tb0 a1() {
        Parcel a = a(24, M());
        tb0 a2 = ub0.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void destroy() {
        b(5, M());
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle getInterstitialAdapterInfo() {
        Parcel a = a(18, M());
        Bundle bundle = (Bundle) hz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final a getView() {
        Parcel a = a(2, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final boolean isInitialized() {
        Parcel a = a(13, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void l(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(21, M);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final kj0 q1() {
        kj0 kj0;
        Parcel a = a(27, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            kj0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            kj0 = queryLocalInterface instanceof kj0 ? (kj0) queryLocalInterface : new mj0(readStrongBinder);
        }
        a.recycle();
        return kj0;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showInterstitial() {
        b(4, M());
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showVideo() {
        b(12, M());
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle u1() {
        Parcel a = a(19, M());
        Bundle bundle = (Bundle) hz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void y() {
        b(8, M());
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle zzmq() {
        Parcel a = a(17, M());
        Bundle bundle = (Bundle) hz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
