package e.b.b.a.c.a;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements d {
    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new f(iBinder);
    }
}
