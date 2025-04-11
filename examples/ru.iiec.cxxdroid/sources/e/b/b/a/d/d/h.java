package e.b.b.a.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import com.google.android.gms.common.internal.z;

public class h implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        z zVar = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 != 2) {
                b.q(parcel, a);
            } else {
                zVar = (z) b.a(parcel, a, z.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new g(i2, zVar);
    }

    @Override // android.os.Parcelable.Creator
    public g[] newArray(int i2) {
        return new g[i2];
    }
}
