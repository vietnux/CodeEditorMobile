package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class fj extends fz implements dj {
    fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final a a(String str, a aVar, String str2, String str3, String str4) {
        Parcel M = M();
        M.writeString(str);
        hz.a(M, aVar);
        M.writeString(str2);
        M.writeString(str3);
        M.writeString(str4);
        Parcel a = a(3, M);
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final void a(a aVar, a aVar2) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, aVar2);
        b(5, M);
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final String getVersion() {
        Parcel a = a(6, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final void n(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final boolean r(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        Parcel a = a(2, M);
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.dj
    public final void s(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(4, M);
    }
}
