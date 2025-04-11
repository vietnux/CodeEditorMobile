package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class q3 implements Parcelable.Creator<p3> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p3 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                z = b.h(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                arrayList = b.f(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new p3(z, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p3[] newArray(int i2) {
        return new p3[i2];
    }
}
