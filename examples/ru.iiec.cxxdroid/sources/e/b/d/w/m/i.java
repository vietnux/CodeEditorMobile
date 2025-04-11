package e.b.d.w.m;

import e.b.d.d;
import e.b.d.e;
import e.b.d.r;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.h;
import e.b.d.w.j;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i implements u {

    /* renamed from: b  reason: collision with root package name */
    private final e.b.d.w.c f7978b;

    /* renamed from: c  reason: collision with root package name */
    private final d f7979c;

    /* renamed from: d  reason: collision with root package name */
    private final e.b.d.w.d f7980d;

    /* renamed from: e  reason: collision with root package name */
    private final d f7981e;

    /* renamed from: f  reason: collision with root package name */
    private final e.b.d.w.n.b f7982f = e.b.d.w.n.b.a();

    /* access modifiers changed from: package-private */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f7983d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7984e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f7985f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7986g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.b.d.x.a f7987h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f7988i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, String str, boolean z, boolean z2, Field field, boolean z3, t tVar, e eVar, e.b.d.x.a aVar, boolean z4) {
            super(str, z, z2);
            this.f7983d = field;
            this.f7984e = z3;
            this.f7985f = tVar;
            this.f7986g = eVar;
            this.f7987h = aVar;
            this.f7988i = z4;
        }

        /* access modifiers changed from: package-private */
        @Override // e.b.d.w.m.i.c
        public void a(e.b.d.y.a aVar, Object obj) {
            Object a = this.f7985f.a(aVar);
            if (a != null || !this.f7988i) {
                this.f7983d.set(obj, a);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // e.b.d.w.m.i.c
        public void a(e.b.d.y.c cVar, Object obj) {
            (this.f7984e ? this.f7985f : new m(this.f7986g, this.f7985f, this.f7987h.b())).a(cVar, this.f7983d.get(obj));
        }

        @Override // e.b.d.w.m.i.c
        public boolean a(Object obj) {
            return this.f7990b && this.f7983d.get(obj) != obj;
        }
    }

    public static final class b<T> extends t<T> {
        private final h<T> a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f7989b;

        b(h<T> hVar, Map<String, c> map) {
            this.a = hVar;
            this.f7989b = map;
        }

        @Override // e.b.d.t
        public T a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.m();
                while (aVar.r()) {
                    c cVar = this.f7989b.get(aVar.y());
                    if (cVar != null) {
                        if (cVar.f7991c) {
                            cVar.a(aVar, a2);
                        }
                    }
                    aVar.C();
                }
                aVar.p();
                return a2;
            } catch (IllegalStateException e2) {
                throw new r(e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // e.b.d.t
        public void a(e.b.d.y.c cVar, T t) {
            if (t == null) {
                cVar.s();
                return;
            }
            cVar.m();
            try {
                for (c cVar2 : this.f7989b.values()) {
                    if (cVar2.a(t)) {
                        cVar.b(cVar2.a);
                        cVar2.a(cVar, t);
                    }
                }
                cVar.o();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {
        final String a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f7990b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f7991c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.f7990b = z;
            this.f7991c = z2;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(e.b.d.y.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void a(e.b.d.y.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean a(Object obj);
    }

    public i(e.b.d.w.c cVar, d dVar, e.b.d.w.d dVar2, d dVar3) {
        this.f7978b = cVar;
        this.f7979c = dVar;
        this.f7980d = dVar2;
        this.f7981e = dVar3;
    }

    private c a(e eVar, Field field, String str, e.b.d.x.a<?> aVar, boolean z, boolean z2) {
        boolean a2 = j.a((Type) aVar.a());
        e.b.d.v.b bVar = (e.b.d.v.b) field.getAnnotation(e.b.d.v.b.class);
        t<?> a3 = bVar != null ? this.f7981e.a(this.f7978b, eVar, aVar, bVar) : null;
        boolean z3 = a3 != null;
        if (a3 == null) {
            a3 = eVar.a((e.b.d.x.a) aVar);
        }
        return new a(this, str, z, z2, field, z3, a3, eVar, aVar, a2);
    }

    private List<String> a(Field field) {
        e.b.d.v.c cVar = (e.b.d.v.c) field.getAnnotation(e.b.d.v.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f7979c.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private Map<String, c> a(e eVar, e.b.d.x.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b2 = aVar.b();
        e.b.d.x.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean a2 = a(field, true);
                boolean a3 = a(field, z);
                if (a2 || a3) {
                    this.f7982f.a(field);
                    Type a4 = e.b.d.w.b.a(aVar2.b(), cls2, field.getGenericType());
                    List<String> a5 = a(field);
                    int size = a5.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = a5.get(i3);
                        boolean z2 = i3 != 0 ? false : a2;
                        cVar = cVar == null ? (c) linkedHashMap.put(str, a(eVar, field, str, e.b.d.x.a.a(a4), z2, a3)) : cVar;
                        i3++;
                        a2 = z2;
                        a5 = a5;
                        size = size;
                        field = field;
                    }
                    if (cVar != null) {
                        throw new IllegalArgumentException(b2 + " declares multiple JSON fields named " + cVar.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = e.b.d.x.a.a(e.b.d.w.b.a(aVar2.b(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.a();
        }
        return linkedHashMap;
    }

    static boolean a(Field field, boolean z, e.b.d.w.d dVar) {
        return !dVar.a(field.getType(), z) && !dVar.a(field, z);
    }

    @Override // e.b.d.u
    public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
        Class<? super T> a2 = aVar.a();
        if (!Object.class.isAssignableFrom(a2)) {
            return null;
        }
        return new b(this.f7978b.a(aVar), a(eVar, (e.b.d.x.a<?>) aVar, (Class<?>) a2));
    }

    public boolean a(Field field, boolean z) {
        return a(field, z, this.f7980d);
    }
}
