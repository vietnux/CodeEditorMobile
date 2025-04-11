package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a<T> {
    private final Set<Class<? super T>> a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f> f6573b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6574c;

    /* renamed from: d  reason: collision with root package name */
    private final d<T> f6575d;

    /* renamed from: com.google.firebase.components.a$a  reason: collision with other inner class name */
    public static class C0092a<T> {
        private final Set<Class<? super T>> a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<f> f6576b;

        /* renamed from: c  reason: collision with root package name */
        private int f6577c;

        /* renamed from: d  reason: collision with root package name */
        private d<T> f6578d;

        private C0092a(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.f6576b = new HashSet();
            this.f6577c = 0;
            t.a(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                t.a(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        private final C0092a<T> a(int i2) {
            t.a(this.f6577c == 0, "Instantiation type has already been set.");
            this.f6577c = i2;
            return this;
        }

        public C0092a<T> a() {
            a(1);
            return this;
        }

        public C0092a<T> a(d<T> dVar) {
            t.a(dVar, "Null factory");
            this.f6578d = dVar;
            return this;
        }

        public C0092a<T> a(f fVar) {
            t.a(fVar, "Null dependency");
            if (!this.a.contains(fVar.a())) {
                this.f6576b.add(fVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public a<T> b() {
            t.a(this.f6578d != null, "Missing required property: factory.");
            return new a<>(new HashSet(this.a), new HashSet(this.f6576b), this.f6577c, this.f6578d);
        }
    }

    private a(Set<Class<? super T>> set, Set<f> set2, int i2, d<T> dVar) {
        this.a = Collections.unmodifiableSet(set);
        this.f6573b = Collections.unmodifiableSet(set2);
        this.f6574c = i2;
        this.f6575d = dVar;
    }

    public static <T> C0092a<T> a(Class<T> cls) {
        return new C0092a<>(cls, new Class[0]);
    }

    public static <T> a<T> a(Class<T> cls, T t) {
        C0092a a2 = a(cls);
        a2.a(new j(t));
        return a2.b();
    }

    public final Set<Class<? super T>> a() {
        return this.a;
    }

    public final Set<f> b() {
        return this.f6573b;
    }

    public final d<T> c() {
        return this.f6575d;
    }

    public final boolean d() {
        return this.f6574c == 1;
    }

    public final boolean e() {
        return this.f6574c == 2;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.f6574c + ", deps=" + Arrays.toString(this.f6573b.toArray()) + "}";
    }
}
