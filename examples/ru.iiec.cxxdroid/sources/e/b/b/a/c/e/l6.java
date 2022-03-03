package e.b.b.a.c.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class l6 implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7421b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7422c;

    protected l6(IBinder iBinder, String str) {
        this.f7421b = iBinder;
        this.f7422c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7422c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7421b.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7421b;
    }

    /* access modifiers changed from: protected */
    public final void b(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7421b.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
