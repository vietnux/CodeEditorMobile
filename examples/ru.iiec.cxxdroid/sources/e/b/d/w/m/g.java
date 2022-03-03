package e.b.d.w.m;

import e.b.d.e;
import e.b.d.j;
import e.b.d.o;
import e.b.d.r;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.c;
import e.b.d.w.h;
import e.b.d.w.k;
import e.b.d.y.b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class g implements u {

    /* renamed from: b  reason: collision with root package name */
    private final c f7972b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f7973c;

    private final class a<K, V> extends t<Map<K, V>> {
        private final t<K> a;

        /* renamed from: b  reason: collision with root package name */
        private final t<V> f7974b;

        /* renamed from: c  reason: collision with root package name */
        private final h<? extends Map<K, V>> f7975c;

        public a(e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, h<? extends Map<K, V>> hVar) {
            this.a = new m(eVar, tVar, type);
            this.f7974b = new m(eVar, tVar2, type2);
            this.f7975c = hVar;
        }

        private String a(j jVar) {
            if (jVar.g()) {
                o c2 = jVar.c();
                if (c2.t()) {
                    return String.valueOf(c2.m());
                }
                if (c2.o()) {
                    return Boolean.toString(c2.h());
                }
                if (c2.u()) {
                    return c2.n();
                }
                throw new AssertionError();
            } else if (jVar.e()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // e.b.d.t
        public Map<K, V> a(e.b.d.y.a aVar) {
            b B = aVar.B();
            if (B == b.NULL) {
                aVar.z();
                return null;
            }
            Map<K, V> map = (Map) this.f7975c.a();
            if (B == b.BEGIN_ARRAY) {
                aVar.l();
                while (aVar.r()) {
                    aVar.l();
                    K a2 = this.a.a(aVar);
                    if (map.put(a2, this.f7974b.a(aVar)) == null) {
                        aVar.o();
                    } else {
                        throw new r("duplicate key: " + ((Object) a2));
                    }
                }
                aVar.o();
            } else {
                aVar.m();
                while (aVar.r()) {
                    e.b.d.w.e.a.a(aVar);
                    K a3 = this.a.a(aVar);
                    if (map.put(a3, this.f7974b.a(aVar)) != null) {
                        throw new r("duplicate key: " + ((Object) a3));
                    }
                }
                aVar.p();
            }
            return map;
        }

        @Override // e.b.d.t
        public /* bridge */ /* synthetic */ void a(e.b.d.y.c cVar, Object obj) {
            a(cVar, (Map) ((Map) obj));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: e.b.d.t<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: e.b.d.t<V> */
        /* JADX WARN: Multi-variable type inference failed */
        public void a(e.b.d.y.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.s();
            } else if (!g.this.f7973c) {
                cVar.m();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.b(String.valueOf(entry.getKey()));
                    this.f7974b.a(cVar, entry.getValue());
                }
                cVar.o();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    j a2 = this.a.a(entry2.getKey());
                    arrayList.add(a2);
                    arrayList2.add(entry2.getValue());
                    z |= a2.d() || a2.f();
                }
                if (z) {
                    cVar.l();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.l();
                        k.a((j) arrayList.get(i2), cVar);
                        this.f7974b.a(cVar, arrayList2.get(i2));
                        cVar.n();
                        i2++;
                    }
                    cVar.n();
                    return;
                }
                cVar.m();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    cVar.b(a((j) arrayList.get(i2)));
                    this.f7974b.a(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.o();
            }
        }
    }

    public g(c cVar, boolean z) {
        this.f7972b = cVar;
        this.f7973c = z;
    }

    private t<?> a(e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f8006f : eVar.a((e.b.d.x.a) e.b.d.x.a.a(type));
    }

    @Override // e.b.d.u
    public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
        Type b2 = aVar.b();
        if (!Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        Type[] b3 = e.b.d.w.b.b(b2, e.b.d.w.b.e(b2));
        return new a(eVar, b3[0], a(eVar, b3[0]), b3[1], eVar.a((e.b.d.x.a) e.b.d.x.a.a(b3[1])), this.f7972b.a(aVar));
    }
}
