package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.List;

public final class rb0 extends fz implements pb0 {
    rb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final List b() {
        Parcel a = a(4, M());
        ArrayList b2 = hz.b(a);
        a.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String g() {
        Parcel a = a(3, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final o60 getVideoController() {
        Parcel a = a(11, M());
        o60 a2 = p60.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String h() {
        Parcel a = a(5, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String j() {
        Parcel a = a(7, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final ua0 l() {
        ua0 ua0;
        Parcel a = a(15, M());
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

    @Override // com.google.android.gms.internal.ads.pb0
    public final a w() {
        Parcel a = a(2, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String z() {
        Parcel a = a(8, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final ya0 z0() {
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
}
