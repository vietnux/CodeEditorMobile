package e.b.b.a.c.f;

import android.os.IBinder;
import android.os.IInterface;

public abstract class c extends f implements d {
    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }
}
