package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import java.util.List;

public abstract class ub0 extends gz implements tb0 {
    public ub0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static tb0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof tb0 ? (tb0) queryLocalInterface : new vb0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str;
        IInterface iInterface;
        switch (i2) {
            case 1:
                str = i(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                iInterface = m(parcel.readString());
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 3:
                List<String> C0 = C0();
                parcel2.writeNoException();
                parcel2.writeStringList(C0);
                return true;
            case 4:
                str = n();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                e(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                c();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterface = U0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 10:
                boolean q = q(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                hz.a(parcel2, q);
                return true;
            case 11:
                iInterface = w();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            default:
                return false;
        }
    }
}
