package e.b.b.a.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class q6 extends l6 implements o6 {
    q6(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // e.b.b.a.c.e.o6
    public final Bundle g(Bundle bundle) {
        Parcel M = M();
        n6.a(M, bundle);
        Parcel a = a(1, M);
        Bundle bundle2 = (Bundle) n6.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
