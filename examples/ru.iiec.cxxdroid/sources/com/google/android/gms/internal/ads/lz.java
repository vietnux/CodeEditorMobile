package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class lz extends fz implements jz {
    lz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void a(a aVar, String str, String str2) {
        Parcel M = M();
        hz.a(M, aVar);
        M.writeString(str);
        M.writeString(null);
        b(8, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void a(byte[] bArr) {
        Parcel M = M();
        M.writeByteArray(bArr);
        b(5, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void a(int[] iArr) {
        Parcel M = M();
        M.writeIntArray(null);
        b(4, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void b(a aVar, String str) {
        Parcel M = M();
        hz.a(M, aVar);
        M.writeString(str);
        b(2, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void f(int i2) {
        Parcel M = M();
        M.writeInt(i2);
        b(6, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void g(int i2) {
        Parcel M = M();
        M.writeInt(i2);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void p1() {
        b(3, M());
    }
}
