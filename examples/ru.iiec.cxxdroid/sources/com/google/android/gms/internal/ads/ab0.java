package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class ab0 extends fz implements ya0 {
    ab0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final double F0() {
        Parcel a = a(3, M());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final a j1() {
        Parcel a = a(1, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final Uri t1() {
        Parcel a = a(2, M());
        Uri uri = (Uri) hz.a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }
}
