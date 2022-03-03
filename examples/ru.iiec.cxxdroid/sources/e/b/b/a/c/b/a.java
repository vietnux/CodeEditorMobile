package e.b.b.a.c.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7018c;

    protected a(IBinder iBinder, String str) {
        this.f7017b = iBinder;
        this.f7018c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7018c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7017b.transact(8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7017b;
    }
}
