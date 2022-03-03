package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.e;
import e.b.b.a.e.h;

/* access modifiers changed from: package-private */
public abstract class h0<T> extends t {
    protected final h<T> a;

    public h0(int i2, h<T> hVar) {
        super(i2);
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public void a(Status status) {
        this.a.b(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(e.a<?> aVar) {
        try {
            b(aVar);
        } catch (DeadObjectException e2) {
            a(t.a(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(t.a(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public void a(RuntimeException runtimeException) {
        this.a.b(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void b(e.a<?> aVar);
}
