package e.b.b.a.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.f0.b;

public class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public i createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        com.google.android.gms.common.b bVar = null;
        int i2 = 0;
        b0 b0Var = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 == 2) {
                bVar = (com.google.android.gms.common.b) b.a(parcel, a, com.google.android.gms.common.b.CREATOR);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                b0Var = (b0) b.a(parcel, a, b0.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new i(i2, bVar, b0Var);
    }

    @Override // android.os.Parcelable.Creator
    public i[] newArray(int i2) {
        return new i[i2];
    }
}
