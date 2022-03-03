package com.google.android.gms.common.api.internal;

import c.e.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import e.b.b.a.e.h;
import java.util.Map;
import java.util.Set;

public final class t0 {
    private final a<s0<?>, b> a;

    /* renamed from: b  reason: collision with root package name */
    private final a<s0<?>, String> f3566b;

    /* renamed from: c  reason: collision with root package name */
    private final h<Map<s0<?>, String>> f3567c;

    /* renamed from: d  reason: collision with root package name */
    private int f3568d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3569e;

    public final Set<s0<?>> a() {
        return this.a.keySet();
    }

    public final void a(s0<?> s0Var, b bVar, String str) {
        this.a.put(s0Var, bVar);
        this.f3566b.put(s0Var, str);
        this.f3568d--;
        if (!bVar.x()) {
            this.f3569e = true;
        }
        if (this.f3568d != 0) {
            return;
        }
        if (this.f3569e) {
            this.f3567c.a(new c(this.a));
            return;
        }
        this.f3567c.a(this.f3566b);
    }
}
