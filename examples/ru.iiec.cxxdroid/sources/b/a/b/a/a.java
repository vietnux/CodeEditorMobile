package b.a.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: b.a.b.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0029a extends Binder implements a {

        /* access modifiers changed from: private */
        /* renamed from: b.a.b.a.a$a$a  reason: collision with other inner class name */
        public static class C0030a implements a {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f1773b;

            C0030a(IBinder iBinder) {
                this.f1773b = iBinder;
            }

            public IBinder asBinder() {
                return this.f1773b;
            }
        }

        public AbstractBinderC0029a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0030a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void a(int i2, Bundle bundle);
}
