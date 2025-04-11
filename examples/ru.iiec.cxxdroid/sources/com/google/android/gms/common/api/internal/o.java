package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* access modifiers changed from: package-private */
public final class o implements g.a {
    private final /* synthetic */ BasePendingResult a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f3557b;

    o(n nVar, BasePendingResult basePendingResult) {
        this.f3557b = nVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f3557b.a.remove(this.a);
    }
}
