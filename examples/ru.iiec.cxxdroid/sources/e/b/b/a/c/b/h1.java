package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class h1 implements Parcelable.Creator<g1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g1 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            if (b.a(a) != 2) {
                b.q(parcel, a);
            } else {
                bArr = b.b(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new g1(bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g1[] newArray(int i2) {
        return new g1[i2];
    }
}
