package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class v0 implements Parcelable.Creator<u0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                str = b.d(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                str2 = b.d(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new u0(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0[] newArray(int i2) {
        return new u0[i2];
    }
}
