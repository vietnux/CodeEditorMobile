package e.b.b.a.c.d;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements d {
    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new f(iBinder);
    }
}
