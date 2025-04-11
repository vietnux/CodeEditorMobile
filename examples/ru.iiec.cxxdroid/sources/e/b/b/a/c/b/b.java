package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<i1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i1 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.f0.b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a = com.google.android.gms.common.internal.f0.b.a(parcel);
            int a2 = com.google.android.gms.common.internal.f0.b.a(a);
            if (a2 == 2) {
                str = com.google.android.gms.common.internal.f0.b.d(parcel, a);
            } else if (a2 != 3) {
                com.google.android.gms.common.internal.f0.b.q(parcel, a);
            } else {
                str2 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
            }
        }
        com.google.android.gms.common.internal.f0.b.g(parcel, b2);
        return new i1(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i1[] newArray(int i2) {
        return new i1[i2];
    }
}
