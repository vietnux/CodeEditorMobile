package e.b.d.w.m;

import e.b.d.e;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.c;
import e.b.d.w.h;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements u {

    /* renamed from: b  reason: collision with root package name */
    private final c f7967b;

    private static final class a<E> extends t<Collection<E>> {
        private final t<E> a;

        /* renamed from: b  reason: collision with root package name */
        private final h<? extends Collection<E>> f7968b;

        public a(e eVar, Type type, t<E> tVar, h<? extends Collection<E>> hVar) {
            this.a = new m(eVar, tVar, type);
            this.f7968b = hVar;
        }

        @Override // e.b.d.t
        public Collection<E> a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            Collection<E> collection = (Collection) this.f7968b.a();
            aVar.l();
            while (aVar.r()) {
                collection.add(this.a.a(aVar));
            }
            aVar.o();
            return collection;
        }

        @Override // e.b.d.t
        public /* bridge */ /* synthetic */ void a(e.b.d.y.c cVar, Object obj) {
            a(cVar, (Collection) ((Collection) obj));
        }

        public void a(e.b.d.y.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.s();
                return;
            }
            cVar.l();
            for (E e2 : collection) {
                this.a.a(cVar, e2);
            }
            cVar.n();
        }
    }

    public b(c cVar) {
        this.f7967b = cVar;
    }

    @Override // e.b.d.u
    public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
        Type b2 = aVar.b();
        Class<? super T> a2 = aVar.a();
        if (!Collection.class.isAssignableFrom(a2)) {
            return null;
        }
        Type a3 = e.b.d.w.b.a(b2, (Class<?>) a2);
        return new a(eVar, a3, eVar.a((e.b.d.x.a) e.b.d.x.a.a(a3)), this.f7967b.a(aVar));
    }
}
