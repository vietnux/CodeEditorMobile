package e.b.b.a.c.d;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // e.b.b.a.c.d.d
    public final void a(Message message) {
        Parcel M = M();
        c.a(M, message);
        a(1, M);
    }
}
