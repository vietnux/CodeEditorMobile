package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.f0.b;

public final class f implements Parcelable.Creator<e> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        DataHolder dataHolder = null;
        DataHolder dataHolder2 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                i2 = b.m(parcel, a);
            } else if (a2 == 3) {
                dataHolder = (DataHolder) b.a(parcel, a, DataHolder.CREATOR);
            } else if (a2 == 4) {
                j2 = b.n(parcel, a);
            } else if (a2 != 5) {
                b.q(parcel, a);
            } else {
                dataHolder2 = (DataHolder) b.a(parcel, a, DataHolder.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new e(i2, dataHolder, j2, dataHolder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i2) {
        return new e[i2];
    }
}
