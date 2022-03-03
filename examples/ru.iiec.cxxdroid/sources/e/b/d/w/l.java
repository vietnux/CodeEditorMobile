package e.b.d.w;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class l {

    /* access modifiers changed from: package-private */
    public static class a extends l {
        final /* synthetic */ Method a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f7963b;

        a(Method method, Object obj) {
            this.a = method;
            this.f7963b = obj;
        }

        @Override // e.b.d.w.l
        public <T> T a(Class<T> cls) {
            l.b(cls);
            return (T) this.a.invoke(this.f7963b, cls);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends l {
        final /* synthetic */ Method a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f7964b;

        b(Method method, int i2) {
            this.a = method;
            this.f7964b = i2;
        }

        @Override // e.b.d.w.l
        public <T> T a(Class<T> cls) {
            l.b(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.f7964b));
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends l {
        final /* synthetic */ Method a;

        c(Method method) {
            this.a = method;
        }

        @Override // e.b.d.w.l
        public <T> T a(Class<T> cls) {
            l.b(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends l {
        d() {
        }

        @Override // e.b.d.w.l
        public <T> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static l a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public abstract <T> T a(Class<T> cls);
}
