package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.f0.b;

public class h implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        e[] eVarArr = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                bundle = b.a(parcel, a);
            } else if (a2 != 2) {
                b.q(parcel, a);
            } else {
                eVarArr = (e[]) b.b(parcel, a, e.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new g(bundle, eVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public g[] newArray(int i2) {
        return new g[i2];
    }
}
