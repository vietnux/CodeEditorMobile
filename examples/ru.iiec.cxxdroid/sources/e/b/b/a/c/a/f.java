package e.b.b.a.c.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // e.b.b.a.c.a.d
    public final boolean L() {
        Parcel a = a(6, M());
        boolean a2 = c.a(a);
        a.recycle();
        return a2;
    }

    @Override // e.b.b.a.c.a.d
    public final String getId() {
        Parcel a = a(1, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // e.b.b.a.c.a.d
    public final boolean l(boolean z) {
        Parcel M = M();
        c.a(M, true);
        Parcel a = a(2, M);
        boolean a2 = c.a(a);
        a.recycle();
        return a2;
    }
}
