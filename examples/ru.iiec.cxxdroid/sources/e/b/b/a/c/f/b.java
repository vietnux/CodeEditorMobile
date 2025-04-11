package e.b.b.a.c.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class b extends e implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // e.b.b.a.c.f.d
    public final int a(int i2, String str, String str2) {
        Parcel M = M();
        M.writeInt(i2);
        M.writeString(str);
        M.writeString(str2);
        Parcel a = a(1, M);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, Bundle bundle) {
        Parcel M = M();
        M.writeInt(3);
        M.writeString(str);
        M.writeString(str2);
        g.a(M, bundle);
        Parcel a = a(2, M);
        Bundle bundle2 = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel M = M();
        M.writeInt(10);
        M.writeString(str);
        M.writeString(str2);
        g.a(M, bundle);
        g.a(M, bundle2);
        Parcel a = a(901, M);
        Bundle bundle3 = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle3;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, String str3) {
        Parcel M = M();
        M.writeInt(3);
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        Parcel a = a(4, M);
        Bundle bundle = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel M = M();
        M.writeInt(9);
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        g.a(M, bundle);
        Parcel a = a(11, M);
        Bundle bundle2 = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, String str3, String str4) {
        Parcel M = M();
        M.writeInt(3);
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        M.writeString(null);
        Parcel a = a(3, M);
        Bundle bundle = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle a(int i2, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel M = M();
        M.writeInt(i2);
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        M.writeString(null);
        g.a(M, bundle);
        Parcel a = a(8, M);
        Bundle bundle2 = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    @Override // e.b.b.a.c.f.d
    public final Bundle b(int i2, String str, String str2, Bundle bundle) {
        Parcel M = M();
        M.writeInt(9);
        M.writeString(str);
        M.writeString(str2);
        g.a(M, bundle);
        Parcel a = a(902, M);
        Bundle bundle2 = (Bundle) g.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
