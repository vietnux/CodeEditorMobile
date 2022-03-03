package e.b.b.a.c.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class e implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7748b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7749c = "com.android.vending.billing.IInAppBillingService";

    protected e(IBinder iBinder, String str) {
        this.f7748b = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7749c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7748b.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f7748b;
    }
}
