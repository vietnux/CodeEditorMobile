package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.n.c;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class bb0 extends c.b {
    private final ya0 a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f3859b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f3860c;

    /* renamed from: d  reason: collision with root package name */
    private final double f3861d;

    public bb0(ya0 ya0) {
        Drawable drawable;
        this.a = ya0;
        Uri uri = null;
        try {
            a j1 = this.a.j1();
            if (j1 != null) {
                drawable = (Drawable) b.y(j1);
                this.f3859b = drawable;
                uri = this.a.t1();
                this.f3860c = uri;
                double d2 = 1.0d;
                d2 = this.a.F0();
                this.f3861d = d2;
            }
        } catch (RemoteException e2) {
            qc.b("", e2);
        }
        drawable = null;
        this.f3859b = drawable;
        try {
            uri = this.a.t1();
        } catch (RemoteException e3) {
            qc.b("", e3);
        }
        this.f3860c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.a.F0();
        } catch (RemoteException e4) {
            qc.b("", e4);
        }
        this.f3861d = d22;
    }

    @Override // com.google.android.gms.ads.n.c.b
    public final Drawable a() {
        return this.f3859b;
    }

    @Override // com.google.android.gms.ads.n.c.b
    public final double b() {
        return this.f3861d;
    }

    @Override // com.google.android.gms.ads.n.c.b
    public final Uri c() {
        return this.f3860c;
    }
}
