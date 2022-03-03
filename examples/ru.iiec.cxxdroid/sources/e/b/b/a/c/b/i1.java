package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class i1 extends a {
    public static final Parcelable.Creator<i1> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    private final String f7049b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7050c;

    public i1(String str, String str2) {
        this.f7049b = str;
        this.f7050c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7049b, false);
        c.a(parcel, 3, this.f7050c, false);
        c.a(parcel, a);
    }
}
