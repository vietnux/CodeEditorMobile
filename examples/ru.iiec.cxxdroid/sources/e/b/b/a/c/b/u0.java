package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class u0 extends a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();

    /* renamed from: b  reason: collision with root package name */
    private final String f7088b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7089c;

    public u0(String str, String str2) {
        this.f7088b = str;
        this.f7089c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7088b, false);
        c.a(parcel, 3, this.f7089c, false);
        c.a(parcel, a);
    }
}
