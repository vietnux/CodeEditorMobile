package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class t extends fz implements r {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.r
    public final boolean G0() {
        Parcel a = a(11, M());
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void S0() {
        b(9, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void V0() {
        b(7, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void a(int i2, int i3, Intent intent) {
        Parcel M = M();
        M.writeInt(i2);
        M.writeInt(i3);
        hz.a(M, intent);
        b(12, M);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void e1() {
        b(2, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void h(Bundle bundle) {
        Parcel M = M();
        hz.a(M, bundle);
        Parcel a = a(6, M);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void i(Bundle bundle) {
        Parcel M = M();
        hz.a(M, bundle);
        b(1, M);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void i(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(13, M);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onDestroy() {
        b(8, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onPause() {
        b(5, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onResume() {
        b(4, M());
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void u0() {
        b(3, M());
    }
}
