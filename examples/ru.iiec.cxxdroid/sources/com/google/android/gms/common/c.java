package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 == 2) {
                i3 = b.m(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                b.q(parcel, a);
            } else {
                str = b.d(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new b(i2, i3, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public b[] newArray(int i2) {
        return new b[i2];
    }
}
