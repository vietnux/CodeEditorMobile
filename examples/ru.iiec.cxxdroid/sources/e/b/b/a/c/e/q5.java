package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class q5 implements Parcelable.Creator<p5> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p5 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    j2 = b.n(parcel, a);
                    break;
                case 4:
                    l2 = b.o(parcel, a);
                    break;
                case 5:
                    f2 = b.k(parcel, a);
                    break;
                case 6:
                    str2 = b.d(parcel, a);
                    break;
                case 7:
                    str3 = b.d(parcel, a);
                    break;
                case 8:
                    d2 = b.i(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new p5(i2, str, j2, l2, f2, str2, str3, d2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p5[] newArray(int i2) {
        return new p5[i2];
    }
}
