package e.b.d.w;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {
    private final Map<Type, e.b.d.f<?>> a;

    /* renamed from: b  reason: collision with root package name */
    private final e.b.d.w.n.b f7920b = e.b.d.w.n.b.a();

    /* access modifiers changed from: package-private */
    public class a implements h<T> {
        a(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements h<T> {
        b(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.b.d.w.c$c  reason: collision with other inner class name */
    public class C0111c implements h<T> {
        C0111c(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements h<T> {
        d(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new g();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements h<T> {
        private final l a = l.a();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f7921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f7922c;

        e(c cVar, Class cls, Type type) {
            this.f7921b = cls;
            this.f7922c = type;
        }

        @Override // e.b.d.w.h
        public T a() {
            try {
                return (T) this.a.a(this.f7921b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f7922c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    class f implements h<T> {
        final /* synthetic */ e.b.d.f a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f7923b;

        f(c cVar, e.b.d.f fVar, Type type) {
            this.a = fVar;
            this.f7923b = type;
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) this.a.a(this.f7923b);
        }
    }

    class g implements h<T> {
        final /* synthetic */ e.b.d.f a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f7924b;

        g(c cVar, e.b.d.f fVar, Type type) {
            this.a = fVar;
            this.f7924b = type;
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) this.a.a(this.f7924b);
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements h<T> {
        final /* synthetic */ Constructor a;

        h(c cVar, Constructor constructor) {
            this.a = constructor;
        }

        @Override // e.b.d.w.h
        public T a() {
            try {
                return (T) this.a.newInstance(null);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements h<T> {
        i(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements h<T> {
        final /* synthetic */ Type a;

        j(c cVar, Type type) {
            this.a = type;
        }

        @Override // e.b.d.w.h
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new e.b.d.k("Invalid EnumSet type: " + this.a.toString());
            }
            throw new e.b.d.k("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public class k implements h<T> {
        k(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    public class l implements h<T> {
        l(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* access modifiers changed from: package-private */
    public class m implements h<T> {
        m(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    public class n implements h<T> {
        n(c cVar) {
        }

        @Override // e.b.d.w.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, e.b.d.f<?>> map) {
        this.a = map;
    }

    private <T> h<T> a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f7920b.a(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> h<T> a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(e.b.d.x.a.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) ? new d(this) : new C0111c(this);
        }
        return null;
    }

    private <T> h<T> b(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> h<T> a(e.b.d.x.a<T> aVar) {
        Type b2 = aVar.b();
        Class<? super T> a2 = aVar.a();
        e.b.d.f<?> fVar = this.a.get(b2);
        if (fVar != null) {
            return new f(this, fVar, b2);
        }
        e.b.d.f<?> fVar2 = this.a.get(a2);
        if (fVar2 != null) {
            return new g(this, fVar2, b2);
        }
        h<T> a3 = a(a2);
        if (a3 != null) {
            return a3;
        }
        h<T> a4 = a(b2, a2);
        return a4 != null ? a4 : b(b2, a2);
    }

    public String toString() {
        return this.a.toString();
    }
}
