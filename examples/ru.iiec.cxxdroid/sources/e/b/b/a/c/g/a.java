package e.b.b.a.c.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7760b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7761c;

    protected a(IBinder iBinder, String str) {
        this.f7760b = iBinder;
        this.f7761c = str;
    }

    /* access modifiers changed from: protected */
    public Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7761c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7760b.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7760b;
    }

    /* access modifiers changed from: protected */
    public void b(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7760b.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
