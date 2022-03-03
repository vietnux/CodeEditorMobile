package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class tc0 extends gz implements sc0 {
    public tc0() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str;
        IInterface iInterface;
        qc0 qc0;
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
                iInterface = B();
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
                double t = t();
                parcel2.writeNoException();
                parcel2.writeDouble(t);
                return true;
            case 9:
                str = A();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                str = x();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 12:
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterface = l();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 15:
                c((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean b3 = b((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                hz.a(parcel2, b3);
                return true;
            case 17:
                d((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                iInterface = w();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 19:
                iInterface = i();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 20:
                Bundle m2 = m();
                parcel2.writeNoException();
                hz.b(parcel2, m2);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qc0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    qc0 = queryLocalInterface instanceof qc0 ? (qc0) queryLocalInterface : new rc0(readStrongBinder);
                }
                a(qc0);
                parcel2.writeNoException();
                return true;
            case 22:
                D();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
