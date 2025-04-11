package e.b.b.a.c.b;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class h extends a0 implements g {
    public h() {
        super("com.google.android.gms.config.internal.IConfigCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.a0
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a((Status) m0.a(parcel, Status.CREATOR), parcel.createByteArray());
            throw null;
        } else if (i2 == 2) {
            a((Status) m0.a(parcel, Status.CREATOR), m0.a(parcel));
            throw null;
        } else if (i2 == 3) {
            a((Status) m0.a(parcel, Status.CREATOR));
            throw null;
        } else if (i2 != 4) {
            return false;
        } else {
            a((Status) m0.a(parcel, Status.CREATOR), (e) m0.a(parcel, e.CREATOR));
            return true;
        }
    }
}
