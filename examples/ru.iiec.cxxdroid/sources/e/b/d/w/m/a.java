package e.b.d.w.m;

import e.b.d.e;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.b;
import e.b.d.y.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends t<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f7965c = new C0113a();
    private final Class<E> a;

    /* renamed from: b  reason: collision with root package name */
    private final t<E> f7966b;

    /* renamed from: e.b.d.w.m.a$a  reason: collision with other inner class name */
    static class C0113a implements u {
        C0113a() {
        }

        @Override // e.b.d.u
        public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
            Type b2 = aVar.b();
            if (!(b2 instanceof GenericArrayType) && (!(b2 instanceof Class) || !((Class) b2).isArray())) {
                return null;
            }
            Type d2 = b.d(b2);
            return new a(eVar, eVar.a((e.b.d.x.a) e.b.d.x.a.a(d2)), b.e(d2));
        }
    }

    public a(e eVar, t<E> tVar, Class<E> cls) {
        this.f7966b = new m(eVar, tVar, cls);
        this.a = cls;
    }

    @Override // e.b.d.t
    public Object a(e.b.d.y.a aVar) {
        if (aVar.B() == e.b.d.y.b.NULL) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.l();
        while (aVar.r()) {
            arrayList.add(this.f7966b.a(aVar));
        }
        aVar.o();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: e.b.d.t<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.b.d.t
    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.s();
            return;
        }
        cVar.l();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f7966b.a(cVar, Array.get(obj, i2));
        }
        cVar.n();
    }
}
