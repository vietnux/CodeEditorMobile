package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class fc0 extends gz implements ec0 {
    public fc0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static ec0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof ec0 ? (ec0) queryLocalInterface : new gc0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        tb0 tb0;
        if (i2 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            tb0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            tb0 = queryLocalInterface instanceof tb0 ? (tb0) queryLocalInterface : new vb0(readStrongBinder);
        }
        a(tb0, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
