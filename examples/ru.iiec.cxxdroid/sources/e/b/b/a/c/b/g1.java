package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class g1 extends a {
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7048b;

    public g1(byte[] bArr) {
        this.f7048b = bArr;
    }

    public final byte[] t() {
        return this.f7048b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7048b, false);
        c.a(parcel, a);
    }
}
