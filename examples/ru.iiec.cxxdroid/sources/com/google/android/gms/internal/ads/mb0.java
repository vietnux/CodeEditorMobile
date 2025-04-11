package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class mb0 extends gz implements lb0 {
    public mb0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IInterface iInterface;
        String str;
        switch (i2) {
            case 2:
                iInterface = w();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 3:
                str = g();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                List b2 = b();
                parcel2.writeNoException();
                parcel2.writeList(b2);
                return true;
            case 5:
                str = h();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                iInterface = B();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 7:
                str = j();
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
                Bundle m2 = m();
                parcel2.writeNoException();
                hz.b(parcel2, m2);
                return true;
            case 12:
                destroy();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 14:
                c((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean b3 = b((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                hz.a(parcel2, b3);
                return true;
            case 16:
                d((Bundle) hz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                iInterface = l();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 18:
                iInterface = i();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 19:
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
