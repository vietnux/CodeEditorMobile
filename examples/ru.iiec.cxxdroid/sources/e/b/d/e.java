package e.b.d;

import e.b.d.w.m.g;
import e.b.d.w.m.h;
import e.b.d.w.m.i;
import e.b.d.w.m.j;
import e.b.d.w.m.k;
import e.b.d.w.m.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class e {

    /* renamed from: k  reason: collision with root package name */
    private static final e.b.d.x.a<?> f7899k = e.b.d.x.a.a(Object.class);
    private final ThreadLocal<Map<e.b.d.x.a<?>, f<?>>> a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<e.b.d.x.a<?>, t<?>> f7900b;

    /* renamed from: c  reason: collision with root package name */
    private final e.b.d.w.c f7901c;

    /* renamed from: d  reason: collision with root package name */
    private final e.b.d.w.m.d f7902d;

    /* renamed from: e  reason: collision with root package name */
    final List<u> f7903e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f7904f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f7905g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f7906h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f7907i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f7908j;

    /* access modifiers changed from: package-private */
    public class a extends t<Number> {
        a(e eVar) {
        }

        /* Return type fixed from 'java.lang.Double' to match base method */
        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Double.valueOf(aVar.v());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Number number) {
            if (number == null) {
                cVar.s();
                return;
            }
            e.a(number.doubleValue());
            cVar.a(number);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends t<Number> {
        b(e eVar) {
        }

        /* Return type fixed from 'java.lang.Float' to match base method */
        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Float.valueOf((float) aVar.v());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Number number) {
            if (number == null) {
                cVar.s();
                return;
            }
            e.a((double) number.floatValue());
            cVar.a(number);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends t<Number> {
        c() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Long.valueOf(aVar.x());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Number number) {
            if (number == null) {
                cVar.s();
            } else {
                cVar.d(number.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends t<AtomicLong> {
        final /* synthetic */ t a;

        d(t tVar) {
            this.a = tVar;
        }

        @Override // e.b.d.t
        public AtomicLong a(e.b.d.y.a aVar) {
            return new AtomicLong(((Number) this.a.a(aVar)).longValue());
        }

        public void a(e.b.d.y.c cVar, AtomicLong atomicLong) {
            this.a.a(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.b.d.e$e  reason: collision with other inner class name */
    public static class C0109e extends t<AtomicLongArray> {
        final /* synthetic */ t a;

        C0109e(t tVar) {
            this.a = tVar;
        }

        @Override // e.b.d.t
        public AtomicLongArray a(e.b.d.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.l();
            while (aVar.r()) {
                arrayList.add(Long.valueOf(((Number) this.a.a(aVar)).longValue()));
            }
            aVar.o();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        public void a(e.b.d.y.c cVar, AtomicLongArray atomicLongArray) {
            cVar.l();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.a(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.n();
        }
    }

    /* access modifiers changed from: package-private */
    public static class f<T> extends t<T> {
        private t<T> a;

        f() {
        }

        @Override // e.b.d.t
        public T a(e.b.d.y.a aVar) {
            t<T> tVar = this.a;
            if (tVar != null) {
                return tVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        public void a(t<T> tVar) {
            if (this.a == null) {
                this.a = tVar;
                return;
            }
            throw new AssertionError();
        }

        @Override // e.b.d.t
        public void a(e.b.d.y.c cVar, T t) {
            t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public e() {
        this(e.b.d.w.d.f7925h, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    e(e.b.d.w.d dVar, d dVar2, Map<Type, f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s sVar, String str, int i2, int i3, List<u> list, List<u> list2, List<u> list3) {
        this.a = new ThreadLocal<>();
        this.f7900b = new ConcurrentHashMap();
        this.f7901c = new e.b.d.w.c(map);
        this.f7904f = z;
        this.f7905g = z3;
        this.f7906h = z4;
        this.f7907i = z5;
        this.f7908j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.Y);
        arrayList.add(h.f7977b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.D);
        arrayList.add(n.f8013m);
        arrayList.add(n.f8007g);
        arrayList.add(n.f8009i);
        arrayList.add(n.f8011k);
        t<Number> a2 = a(sVar);
        arrayList.add(n.a(Long.TYPE, Long.class, a2));
        arrayList.add(n.a(Double.TYPE, Double.class, a(z7)));
        arrayList.add(n.a(Float.TYPE, Float.class, b(z7)));
        arrayList.add(n.x);
        arrayList.add(n.o);
        arrayList.add(n.q);
        arrayList.add(n.a(AtomicLong.class, a(a2)));
        arrayList.add(n.a(AtomicLongArray.class, b(a2)));
        arrayList.add(n.s);
        arrayList.add(n.z);
        arrayList.add(n.F);
        arrayList.add(n.H);
        arrayList.add(n.a(BigDecimal.class, n.B));
        arrayList.add(n.a(BigInteger.class, n.C));
        arrayList.add(n.J);
        arrayList.add(n.L);
        arrayList.add(n.P);
        arrayList.add(n.R);
        arrayList.add(n.W);
        arrayList.add(n.N);
        arrayList.add(n.f8004d);
        arrayList.add(e.b.d.w.m.c.f7969b);
        arrayList.add(n.U);
        arrayList.add(k.f7993b);
        arrayList.add(j.f7992b);
        arrayList.add(n.S);
        arrayList.add(e.b.d.w.m.a.f7965c);
        arrayList.add(n.f8002b);
        arrayList.add(new e.b.d.w.m.b(this.f7901c));
        arrayList.add(new g(this.f7901c, z2));
        this.f7902d = new e.b.d.w.m.d(this.f7901c);
        arrayList.add(this.f7902d);
        arrayList.add(n.Z);
        arrayList.add(new i(this.f7901c, dVar2, dVar, this.f7902d));
        this.f7903e = Collections.unmodifiableList(arrayList);
    }

    private static t<Number> a(s sVar) {
        return sVar == s.DEFAULT ? n.t : new c();
    }

    private static t<AtomicLong> a(t<Number> tVar) {
        return new d(tVar).a();
    }

    private t<Number> a(boolean z) {
        return z ? n.v : new a(this);
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static void a(Object obj, e.b.d.y.a aVar) {
        if (obj != null) {
            try {
                if (aVar.B() != e.b.d.y.b.END_DOCUMENT) {
                    throw new k("JSON document was not fully consumed.");
                }
            } catch (e.b.d.y.d e2) {
                throw new r(e2);
            } catch (IOException e3) {
                throw new k(e3);
            }
        }
    }

    private static t<AtomicLongArray> b(t<Number> tVar) {
        return new C0109e(tVar).a();
    }

    private t<Number> b(boolean z) {
        return z ? n.u : new b(this);
    }

    public <T> t<T> a(u uVar, e.b.d.x.a<T> aVar) {
        if (!this.f7903e.contains(uVar)) {
            uVar = this.f7902d;
        }
        boolean z = false;
        for (u uVar2 : this.f7903e) {
            if (z) {
                t<T> a2 = uVar2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (uVar2 == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.Map<e.b.d.x.a<?>, e.b.d.t<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: e.b.d.t<T>, e.b.d.t<?> */
    public <T> t<T> a(e.b.d.x.a<T> aVar) {
        t<T> tVar = (t<T>) this.f7900b.get(aVar == null ? f7899k : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<e.b.d.x.a<?>, f<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (u uVar : this.f7903e) {
                t tVar2 = (t<T>) uVar.a(this, aVar);
                if (tVar2 != null) {
                    fVar2.a((t<?>) tVar2);
                    this.f7900b.put(aVar, tVar2);
                    return tVar2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> t<T> a(Class<T> cls) {
        return a((e.b.d.x.a) e.b.d.x.a.a((Class) cls));
    }

    public e.b.d.y.a a(Reader reader) {
        e.b.d.y.a aVar = new e.b.d.y.a(reader);
        aVar.a(this.f7908j);
        return aVar;
    }

    public e.b.d.y.c a(Writer writer) {
        if (this.f7905g) {
            writer.write(")]}'\n");
        }
        e.b.d.y.c cVar = new e.b.d.y.c(writer);
        if (this.f7907i) {
            cVar.c("  ");
        }
        cVar.c(this.f7904f);
        return cVar;
    }

    public <T> T a(e.b.d.y.a aVar, Type type) {
        boolean s = aVar.s();
        boolean z = true;
        aVar.a(true);
        try {
            aVar.B();
            z = false;
            T a2 = a((e.b.d.x.a) e.b.d.x.a.a(type)).a(aVar);
            aVar.a(s);
            return a2;
        } catch (EOFException e2) {
            if (z) {
                aVar.a(s);
                return null;
            }
            throw new r(e2);
        } catch (IllegalStateException e3) {
            throw new r(e3);
        } catch (IOException e4) {
            throw new r(e4);
        } catch (Throwable th) {
            aVar.a(s);
            throw th;
        }
    }

    public <T> T a(Reader reader, Type type) {
        e.b.d.y.a a2 = a(reader);
        T t = (T) a(a2, type);
        a(t, a2);
        return t;
    }

    public <T> T a(String str, Class<T> cls) {
        return (T) e.b.d.w.j.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public String a(j jVar) {
        StringWriter stringWriter = new StringWriter();
        a(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String a(Object obj) {
        return obj == null ? a((j) l.a) : a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(j jVar, e.b.d.y.c cVar) {
        boolean r = cVar.r();
        cVar.b(true);
        boolean q = cVar.q();
        cVar.a(this.f7906h);
        boolean p = cVar.p();
        cVar.c(this.f7904f);
        try {
            e.b.d.w.k.a(jVar, cVar);
            cVar.b(r);
            cVar.a(q);
            cVar.c(p);
        } catch (IOException e2) {
            throw new k(e2);
        } catch (Throwable th) {
            cVar.b(r);
            cVar.a(q);
            cVar.c(p);
            throw th;
        }
    }

    public void a(j jVar, Appendable appendable) {
        try {
            a(jVar, a(e.b.d.w.k.a(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public void a(Object obj, Type type, e.b.d.y.c cVar) {
        t a2 = a((e.b.d.x.a) e.b.d.x.a.a(type));
        boolean r = cVar.r();
        cVar.b(true);
        boolean q = cVar.q();
        cVar.a(this.f7906h);
        boolean p = cVar.p();
        cVar.c(this.f7904f);
        try {
            a2.a(cVar, obj);
            cVar.b(r);
            cVar.a(q);
            cVar.c(p);
        } catch (IOException e2) {
            throw new k(e2);
        } catch (Throwable th) {
            cVar.b(r);
            cVar.a(q);
            cVar.c(p);
            throw th;
        }
    }

    public void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(e.b.d.w.k.a(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f7904f + ",factories:" + this.f7903e + ",instanceCreators:" + this.f7901c + "}";
    }
}
