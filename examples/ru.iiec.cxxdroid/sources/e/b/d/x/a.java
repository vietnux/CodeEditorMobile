package e.b.d.x;

import e.b.d.w.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {
    final Class<? super T> a;

    /* renamed from: b  reason: collision with root package name */
    final Type f8029b;

    /* renamed from: c  reason: collision with root package name */
    final int f8030c;

    protected a() {
        this.f8029b = b(a.class);
        this.a = (Class<? super T>) b.e(this.f8029b);
        this.f8030c = this.f8029b.hashCode();
    }

    a(Type type) {
        e.b.d.w.a.a(type);
        this.f8029b = b.b(type);
        this.a = (Class<? super T>) b.e(this.f8029b);
        this.f8030c = this.f8029b.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    static Type b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> a() {
        return this.a;
    }

    public final Type b() {
        return this.f8029b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.a(this.f8029b, ((a) obj).f8029b);
    }

    public final int hashCode() {
        return this.f8030c;
    }

    public final String toString() {
        return b.h(this.f8029b);
    }
}
