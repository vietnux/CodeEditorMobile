package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class wa0 extends fz implements ua0 {
    wa0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final List<ya0> O0() {
        Parcel a = a(3, M());
        ArrayList b2 = hz.b(a);
        a.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final String v() {
        Parcel a = a(2, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
