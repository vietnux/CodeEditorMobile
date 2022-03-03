package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class fz implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f4357b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4358c;

    protected fz(IBinder iBinder, String str) {
        this.f4357b = iBinder;
        this.f4358c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel M() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4358c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4357b.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f4357b;
    }

    /* access modifiers changed from: protected */
    public final void b(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4357b.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
