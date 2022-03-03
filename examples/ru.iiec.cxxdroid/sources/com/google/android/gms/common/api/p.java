package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class p implements Parcelable.Creator<Status> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i3 = b.m(parcel, a);
            } else if (a2 == 2) {
                str = b.d(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                b.q(parcel, a);
            } else {
                i2 = b.m(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new Status(i2, i3, str, pendingIntent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }
}
