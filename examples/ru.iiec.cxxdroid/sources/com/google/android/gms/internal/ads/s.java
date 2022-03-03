package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class s extends gz implements r {
    public s() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static r a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new t(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                i((Bundle) hz.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                e1();
                break;
            case 3:
                u0();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) hz.a(parcel, Bundle.CREATOR);
                h(bundle);
                parcel2.writeNoException();
                hz.b(parcel2, bundle);
                return true;
            case 7:
                V0();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                S0();
                break;
            case 10:
                r1();
                break;
            case 11:
                boolean G0 = G0();
                parcel2.writeNoException();
                hz.a(parcel2, G0);
                return true;
            case 12:
                a(parcel.readInt(), parcel.readInt(), (Intent) hz.a(parcel, Intent.CREATOR));
                break;
            case 13:
                i(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
