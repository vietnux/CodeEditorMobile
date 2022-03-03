package e.b.b.a.d.d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public a createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.f0.b.b(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = com.google.android.gms.common.internal.f0.b.a(parcel);
            int a2 = com.google.android.gms.common.internal.f0.b.a(a);
            if (a2 == 1) {
                i2 = com.google.android.gms.common.internal.f0.b.m(parcel, a);
            } else if (a2 == 2) {
                i3 = com.google.android.gms.common.internal.f0.b.m(parcel, a);
            } else if (a2 != 3) {
                com.google.android.gms.common.internal.f0.b.q(parcel, a);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.f0.b.a(parcel, a, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.f0.b.g(parcel, b2);
        return new a(i2, i3, intent);
    }

    @Override // android.os.Parcelable.Creator
    public a[] newArray(int i2) {
        return new a[i2];
    }
}
