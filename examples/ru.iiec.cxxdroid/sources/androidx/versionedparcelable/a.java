package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
    protected final c.e.a<String, Method> a;

    /* renamed from: b  reason: collision with root package name */
    protected final c.e.a<String, Method> f1735b;

    /* renamed from: c  reason: collision with root package name */
    protected final c.e.a<String, Class> f1736c;

    public a(c.e.a<String, Method> aVar, c.e.a<String, Method> aVar2, c.e.a<String, Class> aVar3) {
        this.a = aVar;
        this.f1735b = aVar2;
        this.f1736c = aVar3;
    }

    private Class a(Class<? extends c> cls) {
        Class cls2 = this.f1736c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1736c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method b(Class cls) {
        Method method = this.f1735b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a2 = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", cls, a.class);
        this.f1735b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Method b(String str) {
        Method method = this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(c cVar) {
        try {
            a(a((Class<? extends c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public int a(int i2, int i3) {
        return !a(i3) ? i2 : g();
    }

    public <T extends Parcelable> T a(T t, int i2) {
        return !a(i2) ? t : (T) h();
    }

    public <T extends c> T a(T t, int i2) {
        return !a(i2) ? t : (T) j();
    }

    /* access modifiers changed from: protected */
    public <T extends c> T a(String str, a aVar) {
        try {
            return (T) ((c) b(str).invoke(null, aVar));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public CharSequence a(CharSequence charSequence, int i2) {
        return !a(i2) ? charSequence : f();
    }

    public String a(String str, int i2) {
        return !a(i2) ? str : i();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        if (cVar == null) {
            a((String) null);
            return;
        }
        b(cVar);
        a b2 = b();
        a(cVar, b2);
        b2.a();
    }

    /* access modifiers changed from: protected */
    public <T extends c> void a(T t, a aVar) {
        try {
            b(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2);

    public boolean a(boolean z, int i2) {
        return !a(i2) ? z : d();
    }

    public byte[] a(byte[] bArr, int i2) {
        return !a(i2) ? bArr : e();
    }

    /* access modifiers changed from: protected */
    public abstract a b();

    /* access modifiers changed from: protected */
    public abstract void b(int i2);

    public void b(int i2, int i3) {
        b(i3);
        c(i2);
    }

    public void b(Parcelable parcelable, int i2) {
        b(i2);
        a(parcelable);
    }

    public void b(c cVar, int i2) {
        b(i2);
        a(cVar);
    }

    public void b(CharSequence charSequence, int i2) {
        b(i2);
        a(charSequence);
    }

    public void b(String str, int i2) {
        b(i2);
        a(str);
    }

    public void b(boolean z, int i2) {
        b(i2);
        a(z);
    }

    public void b(byte[] bArr, int i2) {
        b(i2);
        a(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void c(int i2);

    public boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: protected */
    public abstract byte[] e();

    /* access modifiers changed from: protected */
    public abstract CharSequence f();

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T h();

    /* access modifiers changed from: protected */
    public abstract String i();

    /* access modifiers changed from: protected */
    public <T extends c> T j() {
        String i2 = i();
        if (i2 == null) {
            return null;
        }
        return (T) a(i2, b());
    }
}
