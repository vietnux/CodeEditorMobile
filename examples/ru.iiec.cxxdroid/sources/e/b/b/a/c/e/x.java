package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class x implements Parcelable.Creator<w> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        p5 p5Var = null;
        String str3 = null;
        n0 n0Var = null;
        n0 n0Var2 = null;
        n0 n0Var3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    str2 = b.d(parcel, a);
                    break;
                case 4:
                    p5Var = (p5) b.a(parcel, a, p5.CREATOR);
                    break;
                case 5:
                    j2 = b.n(parcel, a);
                    break;
                case 6:
                    z = b.h(parcel, a);
                    break;
                case 7:
                    str3 = b.d(parcel, a);
                    break;
                case 8:
                    n0Var = (n0) b.a(parcel, a, n0.CREATOR);
                    break;
                case 9:
                    j3 = b.n(parcel, a);
                    break;
                case 10:
                    n0Var2 = (n0) b.a(parcel, a, n0.CREATOR);
                    break;
                case 11:
                    j4 = b.n(parcel, a);
                    break;
                case 12:
                    n0Var3 = (n0) b.a(parcel, a, n0.CREATOR);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new w(str, str2, p5Var, j2, z, str3, n0Var, j3, n0Var2, j4, n0Var3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w[] newArray(int i2) {
        return new w[i2];
    }
}
