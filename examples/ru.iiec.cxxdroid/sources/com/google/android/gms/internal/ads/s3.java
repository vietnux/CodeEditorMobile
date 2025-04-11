package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class s3 extends gz implements r3 {
    public s3() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        x3 x3Var;
        x3 x3Var2;
        if (i2 != 1) {
            u3 u3Var = null;
            if (i2 == 2) {
                j3 j3Var = (j3) hz.a(parcel, j3.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    u3Var = queryLocalInterface instanceof u3 ? (u3) queryLocalInterface : new w3(readStrongBinder);
                }
                a(j3Var, u3Var);
                parcel2.writeNoException();
            } else if (i2 == 4) {
                c4 c4Var = (c4) hz.a(parcel, c4.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    x3Var = queryLocalInterface2 instanceof x3 ? (x3) queryLocalInterface2 : new y3(readStrongBinder2);
                } else {
                    x3Var = null;
                }
                a(c4Var, x3Var);
                throw null;
            } else if (i2 != 5) {
                return false;
            } else {
                c4 c4Var2 = (c4) hz.a(parcel, c4.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    x3Var2 = queryLocalInterface3 instanceof x3 ? (x3) queryLocalInterface3 : new y3(readStrongBinder3);
                } else {
                    x3Var2 = null;
                }
                b(c4Var2, x3Var2);
                throw null;
            }
        } else {
            n3 a = a((j3) hz.a(parcel, j3.CREATOR));
            parcel2.writeNoException();
            hz.b(parcel2, a);
        }
        return true;
    }
}
