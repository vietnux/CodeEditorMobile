package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class t60 extends fz implements r60 {
    t60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void R0() {
        b(1, M());
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void W0() {
        b(3, M());
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void Y0() {
        b(2, M());
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void h(boolean z) {
        Parcel M = M();
        hz.a(M, z);
        b(5, M);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void w0() {
        b(4, M());
    }
}
