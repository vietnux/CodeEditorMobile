package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.List;

public final class jj0 extends fz implements hj0 {
    jj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a C() {
        Parcel a = a(20, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final boolean G() {
        Parcel a = a(11, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final boolean H() {
        Parcel a = a(12, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a K() {
        Parcel a = a(15, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void a(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(9, M);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void a(a aVar, a aVar2, a aVar3) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, aVar2);
        hz.a(M, aVar3);
        b(22, M);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final List b() {
        Parcel a = a(3, M());
        ArrayList b2 = hz.b(a);
        a.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void b(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(14, M);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void c() {
        b(8, M());
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void c(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(10, M);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String g() {
        Parcel a = a(2, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final o60 getVideoController() {
        Parcel a = a(16, M());
        o60 a2 = p60.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String h() {
        Parcel a = a(4, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a i() {
        Parcel a = a(21, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String j() {
        Parcel a = a(6, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final Bundle m() {
        Parcel a = a(13, M());
        Bundle bundle = (Bundle) hz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String z() {
        Parcel a = a(7, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final ya0 z0() {
        Parcel a = a(5, M());
        ya0 a2 = za0.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
