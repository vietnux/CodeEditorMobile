package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

final class q {
    private final a<?> a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<q> f6583b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final Set<q> f6584c = new HashSet();

    q(a<?> aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public final Set<q> a() {
        return this.f6583b;
    }

    /* access modifiers changed from: package-private */
    public final void a(q qVar) {
        this.f6583b.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public final a<?> b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void b(q qVar) {
        this.f6584c.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public final void c(q qVar) {
        this.f6584c.remove(qVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.f6584c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.f6583b.isEmpty();
    }
}
