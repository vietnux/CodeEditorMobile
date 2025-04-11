package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class o0 implements Parcelable.Creator<n0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        k0 k0Var = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                str = b.d(parcel, a);
            } else if (a2 == 3) {
                k0Var = (k0) b.a(parcel, a, k0.CREATOR);
            } else if (a2 == 4) {
                str2 = b.d(parcel, a);
            } else if (a2 != 5) {
                b.q(parcel, a);
            } else {
                j2 = b.n(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new n0(str, k0Var, str2, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0[] newArray(int i2) {
        return new n0[i2];
    }
}
