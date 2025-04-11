package com.google.firebase.components;

import e.b.c.e.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class u implements c {
    private final Set<Class<?>> a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f6588b;

    /* renamed from: c  reason: collision with root package name */
    private final c f6589c;

    public u(Iterable<f> iterable, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (f fVar : iterable) {
            boolean c2 = fVar.c();
            Class<?> a2 = fVar.a();
            if (c2) {
                hashSet.add(a2);
            } else {
                hashSet2.add(a2);
            }
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f6588b = Collections.unmodifiableSet(hashSet2);
        this.f6589c = cVar;
    }

    @Override // com.google.firebase.components.c
    public final <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            return (T) this.f6589c.a(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", cls));
    }

    @Override // com.google.firebase.components.c
    public final <T> a<T> b(Class<T> cls) {
        if (this.f6588b.contains(cls)) {
            return this.f6589c.b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", cls));
    }
}
