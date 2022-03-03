package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class x20 {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f5981b;

    /* renamed from: c  reason: collision with root package name */
    private int f5982c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v20 f5983d;

    private x20(v20 v20, byte[] bArr) {
        this.f5983d = v20;
        this.a = bArr;
    }

    public final x20 a(int i2) {
        this.f5981b = i2;
        return this;
    }

    public final synchronized void a() {
        try {
            if (this.f5983d.f5803b) {
                this.f5983d.a.a(this.a);
                this.f5983d.a.f(this.f5981b);
                this.f5983d.a.g(this.f5982c);
                this.f5983d.a.a((int[]) null);
                this.f5983d.a.p1();
            }
        } catch (RemoteException e2) {
            qc.a("Clearcut log failed", e2);
        }
    }

    public final x20 b(int i2) {
        this.f5982c = i2;
        return this;
    }
}
