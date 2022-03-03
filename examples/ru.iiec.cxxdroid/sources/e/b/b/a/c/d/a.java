package e.b.b.a.c.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f7136b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7137c;

    protected a(IBinder iBinder, String str) {
        this.f7136b = iBinder;
        this.f7137c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7137c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Parcel parcel) {
        try {
            this.f7136b.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7136b;
    }
}
