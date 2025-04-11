package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.List;

public final class nb0 extends fz implements lb0 {
    nb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String A() {
        Parcel a = a(9, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final ya0 B() {
        ya0 ya0;
        Parcel a = a(6, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ya0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            ya0 = queryLocalInterface instanceof ya0 ? (ya0) queryLocalInterface : new ab0(readStrongBinder);
        }
        a.recycle();
        return ya0;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final List b() {
        Parcel a = a(4, M());
        ArrayList b2 = hz.b(a);
        a.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String g() {
        Parcel a = a(3, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final o60 getVideoController() {
        Parcel a = a(13, M());
        o60 a2 = p60.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String h() {
        Parcel a = a(5, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String j() {
        Parcel a = a(7, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final ua0 l() {
        ua0 ua0;
        Parcel a = a(17, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ua0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            ua0 = queryLocalInterface instanceof ua0 ? (ua0) queryLocalInterface : new wa0(readStrongBinder);
        }
        a.recycle();
        return ua0;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final double t() {
        Parcel a = a(8, M());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final a w() {
        Parcel a = a(2, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String x() {
        Parcel a = a(10, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
