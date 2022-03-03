package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.List;

public abstract class ij0 extends gz implements hj0 {
    public ij0() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str;
        IInterface iInterface;
        boolean z;
        switch (i2) {
            case 2:
                str = g();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List b2 = b();
                parcel2.writeNoException();
                parcel2.writeList(b2);
                return true;
            case 4:
                str = h();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                iInterface = z0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 6:
                str = j();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                str = z();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                c();
                parcel2.writeNoException();
                return true;
            case 9:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                c(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                z = G();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 12:
                z = H();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 13:
                Bundle m2 = m();
                parcel2.writeNoException();
                hz.b(parcel2, m2);
                return true;
            case 14:
                b(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = K();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                iInterface = l();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 20:
                iInterface = C();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 21:
                iInterface = i();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 22:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), a.AbstractBinderC0100a.a(parcel.readStrongBinder()), a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
