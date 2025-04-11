package com.google.firebase.components;

import e.b.c.e.a;

final class r<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f6585c = new Object();
    private volatile Object a = f6585c;

    /* renamed from: b  reason: collision with root package name */
    private volatile a<T> f6586b;

    r(d<T> dVar, c cVar) {
        this.f6586b = new s(dVar, cVar);
    }

    @Override // e.b.c.e.a
    public final T get() {
        T t = (T) this.a;
        if (t == f6585c) {
            synchronized (this) {
                t = this.a;
                if (t == f6585c) {
                    t = this.f6586b.get();
                    this.a = t;
                    this.f6586b = null;
                }
            }
        }
        return t;
    }
}
