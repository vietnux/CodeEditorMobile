package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class d implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        DataHolder dataHolder = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList = null;
        ArrayList arrayList2 = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    j2 = b.n(parcel, a);
                    break;
                case 4:
                    dataHolder = (DataHolder) b.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 5:
                    str2 = b.d(parcel, a);
                    break;
                case 6:
                    str3 = b.d(parcel, a);
                    break;
                case 7:
                    str4 = b.d(parcel, a);
                    break;
                case 8:
                    arrayList = b.f(parcel, a);
                    break;
                case 9:
                    i2 = b.m(parcel, a);
                    break;
                case 10:
                    arrayList2 = b.c(parcel, a, u0.CREATOR);
                    break;
                case 11:
                    i3 = b.m(parcel, a);
                    break;
                case 12:
                    i4 = b.m(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new c(str, j2, dataHolder, str2, str3, str4, arrayList, i2, arrayList2, i3, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i2) {
        return new c[i2];
    }
}
