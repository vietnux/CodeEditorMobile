package e.b.b.a.c.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f7051b;

    public k(Bundle bundle) {
        this.f7051b = bundle;
    }

    public final Bundle t() {
        return this.f7051b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7051b, false);
        c.a(parcel, a);
    }
}
