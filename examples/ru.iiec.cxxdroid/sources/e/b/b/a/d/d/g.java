package e.b.b.a.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.z;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: b  reason: collision with root package name */
    private final int f7783b;

    /* renamed from: c  reason: collision with root package name */
    private final z f7784c;

    g(int i2, z zVar) {
        this.f7783b = i2;
        this.f7784c = zVar;
    }

    public g(z zVar) {
        this(1, zVar);
    }

    public z t() {
        return this.f7784c;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f7783b);
        c.a(parcel, 2, (Parcelable) t(), i2, false);
        c.a(parcel, a);
    }
}
