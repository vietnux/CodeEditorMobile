package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.x;

public final class s0<O extends a.d> {
    private final boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    private final int f3563b;

    /* renamed from: c  reason: collision with root package name */
    private final a<O> f3564c;

    /* renamed from: d  reason: collision with root package name */
    private final O f3565d;

    private s0(a<O> aVar, O o) {
        this.f3564c = aVar;
        this.f3565d = o;
        this.f3563b = x.a(this.f3564c, this.f3565d);
    }

    public static <O extends a.d> s0<O> a(a<O> aVar, O o) {
        return new s0<>(aVar, o);
    }

    public final String a() {
        return this.f3564c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return !this.a && !s0Var.a && x.a(this.f3564c, s0Var.f3564c) && x.a(this.f3565d, s0Var.f3565d);
    }

    public final int hashCode() {
        return this.f3563b;
    }
}
