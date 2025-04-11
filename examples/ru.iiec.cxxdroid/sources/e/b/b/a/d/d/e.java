package e.b.b.a.d.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface e extends IInterface {

    public static abstract class a extends b implements e {

        /* renamed from: e.b.b.a.d.d.e$a$a  reason: collision with other inner class name */
        public static class C0103a extends e.b.b.a.c.g.a implements e {
            C0103a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
            }

            @Override // e.b.b.a.d.d.e
            public void a(g gVar, d dVar) {
                Parcel M = M();
                c.a(M, gVar);
                c.a(M, dVar);
                b(12, M);
            }
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return queryLocalInterface instanceof e ? (e) queryLocalInterface : new C0103a(iBinder);
        }
    }

    void a(g gVar, d dVar);
}
