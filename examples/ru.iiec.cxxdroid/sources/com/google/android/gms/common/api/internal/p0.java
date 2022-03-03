package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.j;

public final class p0<A extends c<? extends j, a.b>> extends t {
    private final A a;

    public p0(int i2, A a2) {
        super(i2);
        this.a = a2;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(Status status) {
        this.a.c(status);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(e.a<?> aVar) {
        try {
            this.a.b(aVar.f());
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(n nVar, boolean z) {
        nVar.a(this.a, z);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.c(new Status(10, sb.toString()));
    }
}
