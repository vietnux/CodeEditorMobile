package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public class e implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public DataHolder createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                strArr = b.e(parcel, a);
            } else if (a2 == 2) {
                cursorWindowArr = (CursorWindow[]) b.b(parcel, a, CursorWindow.CREATOR);
            } else if (a2 == 3) {
                i3 = b.m(parcel, a);
            } else if (a2 == 4) {
                bundle = b.a(parcel, a);
            } else if (a2 != 1000) {
                b.q(parcel, a);
            } else {
                i2 = b.m(parcel, a);
            }
        }
        b.g(parcel, b2);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.w();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public DataHolder[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
