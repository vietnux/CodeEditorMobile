package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class a {

    /* renamed from: c  reason: collision with root package name */
    static a f1456c = new a();
    private final Map<Class<?>, C0021a> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f1457b = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0021a {
        final Map<f.b, List<b>> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, f.b> f1458b;

        C0021a(Map<b, f.b> map) {
            this.f1458b = map;
            for (Map.Entry<b, f.b> entry : map.entrySet()) {
                f.b value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void a(List<b> list, i iVar, f.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar, f.b bVar, Object obj) {
            a(this.a.get(bVar), iVar, bVar, obj);
            a(this.a.get(f.b.ON_ANY), iVar, bVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        final int a;

        /* renamed from: b  reason: collision with root package name */
        final Method f1459b;

        b(int i2, Method method) {
            this.a = i2;
            this.f1459b = method;
            this.f1459b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar, f.b bVar, Object obj) {
            try {
                int i2 = this.a;
                if (i2 == 0) {
                    this.f1459b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f1459b.invoke(obj, iVar);
                } else if (i2 == 2) {
                    this.f1459b.invoke(obj, iVar, bVar);
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.f1459b.getName().equals(bVar.f1459b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.f1459b.getName().hashCode();
        }
    }

    a() {
    }

    private C0021a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0021a a2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f1458b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.b> entry : a(cls2).f1458b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            p pVar = (p) method.getAnnotation(p.class);
            if (pVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(i.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                f.b value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == f.b.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0021a aVar = new C0021a(hashMap);
        this.a.put(cls, aVar);
        this.f1457b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private void a(Map<b, f.b> map, b bVar, f.b bVar2, Class<?> cls) {
        f.b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f1459b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    private Method[] c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public C0021a a(Class<?> cls) {
        C0021a aVar = this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* access modifiers changed from: package-private */
    public boolean b(Class<?> cls) {
        Boolean bool = this.f1457b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((p) method.getAnnotation(p.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f1457b.put(cls, false);
        return false;
    }
}
