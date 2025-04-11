package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import e.b.b.a.e.h;

public final class r0 extends h0<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final i<?> f3562b;

    public r0(i<?> iVar, h<Boolean> hVar) {
        super(4, hVar);
        this.f3562b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final /* bridge */ /* synthetic */ void a(n nVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final void b(e.a<?> aVar) {
        e0 remove = aVar.i().remove(this.f3562b);
        if (remove != null) {
            remove.f3536b.a(aVar.f(), this.a);
            remove.a.a();
            return;
        }
        this.a.b((T) false);
    }
}
