package e.b.b.a.c.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class l implements Parcelable.Creator<k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            if (b.a(a) != 2) {
                b.q(parcel, a);
            } else {
                bundle = b.a(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new k(bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i2) {
        return new k[i2];
    }
}
