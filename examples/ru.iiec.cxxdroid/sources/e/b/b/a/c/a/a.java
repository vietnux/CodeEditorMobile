package e.b.b.a.c.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7015b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7016c;

    protected a(IBinder iBinder, String str) {
        this.f7015b = iBinder;
        this.f7016c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7016c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7015b.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7015b;
    }
}
