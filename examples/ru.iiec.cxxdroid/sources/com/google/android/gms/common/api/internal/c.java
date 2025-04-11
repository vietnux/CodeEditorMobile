package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.y;

public abstract class c<R extends j, A extends a.b> extends BasePendingResult<R> implements d<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected c(a<?> aVar, f fVar) {
        super(fVar);
        y.a(fVar, "GoogleApiClient must not be null");
        y.a(aVar, "Api must not be null");
        aVar.a();
    }

    private void a(RemoteException remoteException) {
        c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    public abstract void a(A a);

    public final void b(A a) {
        if (a instanceof d0) {
            a = ((d0) a).B();
        }
        try {
            a(a);
        } catch (DeadObjectException e2) {
            a(e2);
            throw e2;
        } catch (RemoteException e3) {
            a(e3);
        }
    }

    /* access modifiers changed from: protected */
    public void b(R r) {
    }

    public final void c(Status status) {
        y.a(!status.w(), "Failed result must not be success");
        R a = a(status);
        a(a);
        b(a);
    }
}
