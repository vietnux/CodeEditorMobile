package e.b.b.a.d.d;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface d extends IInterface {

    public static abstract class a extends b implements d {
        public a() {
            super("com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        /* access modifiers changed from: protected */
        @Override // e.b.b.a.c.g.b
        public boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 3) {
                a((com.google.android.gms.common.b) c.a(parcel, com.google.android.gms.common.b.CREATOR), (a) c.a(parcel, a.CREATOR));
            } else if (i2 == 4) {
                b((Status) c.a(parcel, Status.CREATOR));
            } else if (i2 == 6) {
                c((Status) c.a(parcel, Status.CREATOR));
            } else if (i2 == 7) {
                a((Status) c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR));
            } else if (i2 != 8) {
                return false;
            } else {
                a((i) c.a(parcel, i.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(Status status, GoogleSignInAccount googleSignInAccount);

    void a(com.google.android.gms.common.b bVar, a aVar);

    void a(i iVar);

    void b(Status status);

    void c(Status status);
}
