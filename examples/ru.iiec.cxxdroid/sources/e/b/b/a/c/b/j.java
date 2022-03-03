package e.b.b.a.c.b;

import android.os.IBinder;
import android.os.Parcel;

public final class j extends a implements i {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.config.internal.IConfigService");
    }

    @Override // e.b.b.a.c.b.i
    public final void a(g gVar, c cVar) {
        Parcel M = M();
        m0.a(M, gVar);
        m0.a(M, cVar);
        a(8, M);
    }
}
