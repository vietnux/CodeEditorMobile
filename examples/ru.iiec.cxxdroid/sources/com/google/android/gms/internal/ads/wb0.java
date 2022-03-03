package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.n.i;
import e.b.b.a.b.b;
import java.util.WeakHashMap;

@k2
public final class wb0 implements i {

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<IBinder, wb0> f5916b = new WeakHashMap<>();
    private final tb0 a;

    private wb0(tb0 tb0) {
        Context context;
        new k();
        this.a = tb0;
        try {
            context = (Context) b.y(tb0.U0());
        } catch (RemoteException | NullPointerException e2) {
            qc.b("", e2);
            context = null;
        }
        if (context != null) {
            try {
                this.a.q(b.a(new com.google.android.gms.ads.n.b(context)));
            } catch (RemoteException e3) {
                qc.b("", e3);
            }
        }
    }

    public static wb0 a(tb0 tb0) {
        synchronized (f5916b) {
            wb0 wb0 = f5916b.get(tb0.asBinder());
            if (wb0 != null) {
                return wb0;
            }
            wb0 wb02 = new wb0(tb0);
            f5916b.put(tb0.asBinder(), wb02);
            return wb02;
        }
    }

    public final tb0 a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.n.i
    public final String n() {
        try {
            return this.a.n();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }
}
