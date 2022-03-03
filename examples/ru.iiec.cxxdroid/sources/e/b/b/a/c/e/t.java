package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class t implements Parcelable.Creator<s> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = b.d(parcel, a);
                    break;
                case 5:
                    str4 = b.d(parcel, a);
                    break;
                case 6:
                    j2 = b.n(parcel, a);
                    break;
                case 7:
                    j3 = b.n(parcel, a);
                    break;
                case 8:
                    str5 = b.d(parcel, a);
                    break;
                case 9:
                    z = b.h(parcel, a);
                    break;
                case 10:
                    z2 = b.h(parcel, a);
                    break;
                case 11:
                    j6 = b.n(parcel, a);
                    break;
                case 12:
                    str6 = b.d(parcel, a);
                    break;
                case 13:
                    j4 = b.n(parcel, a);
                    break;
                case 14:
                    j5 = b.n(parcel, a);
                    break;
                case 15:
                    i2 = b.m(parcel, a);
                    break;
                case 16:
                    z3 = b.h(parcel, a);
                    break;
                case 17:
                    z4 = b.h(parcel, a);
                    break;
                case 18:
                    z5 = b.h(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new s(str, str2, str3, str4, j2, j3, str5, z, z2, j6, str6, j4, j5, i2, z3, z4, z5);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i2) {
        return new s[i2];
    }
}
