package e.b.b.a.c.e;

import android.os.IBinder;
import android.os.IInterface;

public abstract class p6 extends m6 implements o6 {
    public static o6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof o6 ? (o6) queryLocalInterface : new q6(iBinder);
    }
}
