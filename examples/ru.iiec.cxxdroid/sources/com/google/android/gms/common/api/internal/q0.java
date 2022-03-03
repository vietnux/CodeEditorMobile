package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import e.b.b.a.e.h;

public final class q0<ResultT> extends t {
    private final l<a.b, ResultT> a;

    /* renamed from: b  reason: collision with root package name */
    private final h<ResultT> f3559b;

    /* renamed from: c  reason: collision with root package name */
    private final k f3560c;

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(Status status) {
        this.f3559b.b(this.f3560c.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(e.a<?> aVar) {
        try {
            this.a.a(aVar.f(), this.f3559b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(t.a(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(n nVar, boolean z) {
        nVar.a(this.f3559b, z);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(RuntimeException runtimeException) {
        this.f3559b.b(runtimeException);
    }

    public final com.google.android.gms.common.e[] a() {
        return this.a.b();
    }

    public final boolean b() {
        return this.a.a();
    }
}
