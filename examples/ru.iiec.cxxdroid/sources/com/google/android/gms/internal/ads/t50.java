package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class t50 extends fz implements r50 {
    t50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final n40 B0() {
        Parcel a = a(12, M());
        n40 n40 = (n40) hz.a(a, n40.CREATOR);
        a.recycle();
        return n40;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void E() {
        b(6, M());
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a T0() {
        Parcel a = a(1, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(a60 a60) {
        Parcel M = M();
        hz.a(M, a60);
        b(8, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d50 d50) {
        Parcel M = M();
        hz.a(M, d50);
        b(20, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(e90 e90) {
        Parcel M = M();
        hz.a(M, e90);
        b(19, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(l6 l6Var) {
        Parcel M = M();
        hz.a(M, l6Var);
        b(24, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(n40 n40) {
        Parcel M = M();
        hz.a(M, n40);
        b(13, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(t70 t70) {
        Parcel M = M();
        hz.a(M, t70);
        b(29, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(w50 w50) {
        Parcel M = M();
        hz.a(M, w50);
        b(36, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(boolean z) {
        Parcel M = M();
        hz.a(M, z);
        b(34, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g50 g50) {
        Parcel M = M();
        hz.a(M, g50);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g60 g60) {
        Parcel M = M();
        hz.a(M, g60);
        b(21, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean b(j40 j40) {
        Parcel M = M();
        hz.a(M, j40);
        Parcel a = a(4, M);
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void destroy() {
        b(2, M());
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final o60 getVideoController() {
        o60 o60;
        Parcel a = a(26, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            o60 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            o60 = queryLocalInterface instanceof o60 ? (o60) queryLocalInterface : new q60(readStrongBinder);
        }
        a.recycle();
        return o60;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void i(boolean z) {
        Parcel M = M();
        hz.a(M, z);
        b(22, M);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k0() {
        Parcel a = a(31, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String m0() {
        Parcel a = a(35, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean m1() {
        Parcel a = a(3, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final Bundle q0() {
        Parcel a = a(37, M());
        Bundle bundle = (Bundle) hz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        b(9, M());
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void y() {
        b(5, M());
    }
}
