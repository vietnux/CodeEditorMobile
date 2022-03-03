package e.b.b.a.c.g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 16777215) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (b(i2, parcel, parcel2, i3)) {
            return true;
        }
        return a(i2, parcel, parcel2, i3);
    }
}
