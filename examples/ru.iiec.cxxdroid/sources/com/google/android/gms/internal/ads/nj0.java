package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class nj0 extends p60 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5103b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile r60 f5104c;

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean K0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float L0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final r60 M0() {
        r60 r60;
        synchronized (this.f5103b) {
            r60 = this.f5104c;
        }
        return r60;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final int Q0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean X0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void a(r60 r60) {
        synchronized (this.f5103b) {
            this.f5104c = r60;
        }
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void c1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean d1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void k(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float n1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float v1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void y() {
        throw new RemoteException();
    }
}
