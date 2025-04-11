package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.n.c;
import java.util.ArrayList;
import java.util.List;

@k2
public final class xa0 extends c.a {
    private final ua0 a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f6015b = new ArrayList();

    public xa0(ua0 ua0) {
        ya0 ya0;
        IBinder iBinder;
        this.a = ua0;
        try {
            this.a.v();
        } catch (RemoteException e2) {
            qc.b("", e2);
        }
        try {
            for (ya0 ya02 : ua0.O0()) {
                if (!(ya02 instanceof IBinder) || (iBinder = (IBinder) ya02) == null) {
                    ya0 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    ya0 = queryLocalInterface instanceof ya0 ? (ya0) queryLocalInterface : new ab0(iBinder);
                }
                if (ya0 != null) {
                    this.f6015b.add(new bb0(ya0));
                }
            }
        } catch (RemoteException e3) {
            qc.b("", e3);
        }
    }
}
