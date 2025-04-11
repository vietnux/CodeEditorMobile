package e.b.d.w;

import e.b.d.b;
import e.b.d.e;
import e.b.d.t;
import e.b.d.u;
import e.b.d.y.c;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class d implements u, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final d f7925h = new d();

    /* renamed from: b  reason: collision with root package name */
    private double f7926b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    private int f7927c = 136;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7928d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7929e;

    /* renamed from: f  reason: collision with root package name */
    private List<e.b.d.a> f7930f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private List<e.b.d.a> f7931g = Collections.emptyList();

    class a extends t<T> {
        private t<T> a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7932b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f7934d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.b.d.x.a f7935e;

        a(boolean z, boolean z2, e eVar, e.b.d.x.a aVar) {
            this.f7932b = z;
            this.f7933c = z2;
            this.f7934d = eVar;
            this.f7935e = aVar;
        }

        private t<T> b() {
            t<T> tVar = this.a;
            if (tVar != null) {
                return tVar;
            }
            t<T> a2 = this.f7934d.a(d.this, this.f7935e);
            this.a = a2;
            return a2;
        }

        @Override // e.b.d.t
        public T a(e.b.d.y.a aVar) {
            if (!this.f7932b) {
                return (T) b().a(aVar);
            }
            aVar.C();
            return null;
        }

        @Override // e.b.d.t
        public void a(c cVar, T t) {
            if (this.f7933c) {
                cVar.s();
            } else {
                b().a(cVar, t);
            }
        }
    }

    private boolean a(e.b.d.v.d dVar) {
        return dVar == null || dVar.value() <= this.f7926b;
    }

    private boolean a(e.b.d.v.d dVar, e.b.d.v.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(e.b.d.v.e eVar) {
        return eVar == null || eVar.value() > this.f7926b;
    }

    private boolean a(Class<?> cls) {
        if (this.f7926b == -1.0d || a((e.b.d.v.d) cls.getAnnotation(e.b.d.v.d.class), (e.b.d.v.e) cls.getAnnotation(e.b.d.v.e.class))) {
            return (!this.f7928d && c(cls)) || b(cls);
        }
        return true;
    }

    private boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean b(Class<?> cls, boolean z) {
        for (e.b.d.a aVar : z ? this.f7930f : this.f7931g) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // e.b.d.u
    public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
        Class<? super T> a2 = aVar.a();
        boolean a3 = a(a2);
        boolean z = a3 || b(a2, true);
        boolean z2 = a3 || b(a2, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    public boolean a(Class<?> cls, boolean z) {
        return a(cls) || b(cls, z);
    }

    public boolean a(Field field, boolean z) {
        e.b.d.v.a aVar;
        if ((this.f7927c & field.getModifiers()) != 0) {
            return true;
        }
        if (!(this.f7926b == -1.0d || a((e.b.d.v.d) field.getAnnotation(e.b.d.v.d.class), (e.b.d.v.e) field.getAnnotation(e.b.d.v.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f7929e && ((aVar = (e.b.d.v.a) field.getAnnotation(e.b.d.v.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f7928d && c(field.getType())) || b(field.getType())) {
            return true;
        }
        List<e.b.d.a> list = z ? this.f7930f : this.f7931g;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (e.b.d.a aVar2 : list) {
            if (aVar2.a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
