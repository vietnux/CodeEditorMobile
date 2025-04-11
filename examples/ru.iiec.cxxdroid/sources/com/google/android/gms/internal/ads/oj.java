package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class oj extends fz implements nj {
    oj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final lj a(jj jjVar) {
        Parcel M = M();
        hz.a(M, jjVar);
        Parcel a = a(1, M);
        lj ljVar = (lj) hz.a(a, lj.CREATOR);
        a.recycle();
        return ljVar;
    }
}
