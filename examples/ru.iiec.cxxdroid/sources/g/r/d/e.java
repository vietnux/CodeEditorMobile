package g.r.d;

import g.o.i;
import g.o.y;
import g.o.z;
import g.r.c.b;
import g.r.c.d;
import g.r.c.f;
import g.r.c.g;
import g.r.c.h;
import g.r.c.j;
import g.r.c.k;
import g.r.c.l;
import g.r.c.m;
import g.r.c.n;
import g.r.c.o;
import g.r.c.p;
import g.r.c.q;
import g.r.c.r;
import g.r.c.s;
import g.r.c.t;
import g.r.c.u;
import g.r.c.v;
import g.r.c.w;
import g.t.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e implements c<Object>, d {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends g.c<?>>, Integer> f8621c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f8622d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f8623e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f8624f;

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f8625b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        int i2 = 0;
        List list = i.a((Object[]) new Class[]{g.r.c.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, g.r.c.c.class, d.class, g.r.c.e.class, f.class, g.class, h.class, g.r.c.i.class, j.class, k.class, m.class, n.class, o.class});
        ArrayList arrayList = new ArrayList(g.o.j.a(list, 10));
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(g.j.a((Class) obj, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                g.o.g.b();
                throw null;
            }
        }
        f8621c = z.a(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f8622d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f8623e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f8622d);
        hashMap3.putAll(f8623e);
        Collection<String> values = f8622d.values();
        i.b(values, "primitiveFqNames.values");
        for (T t : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.b(t, "kotlinName");
            sb.append(g.v.o.a((String) t, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            g.h a2 = g.j.a(sb2, ((String) t) + ".Companion");
            hashMap3.put(a2.d(), a2.e());
        }
        for (Map.Entry<Class<? extends g.c<?>>, Integer> entry : f8621c.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f8624f = hashMap3;
        HashMap<String, String> hashMap4 = f8624f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.a(hashMap4.size()));
        for (T t2 : hashMap4.entrySet()) {
            linkedHashMap.put(t2.getKey(), g.v.o.a((String) t2.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public e(Class<?> cls) {
        i.c(cls, "jClass");
        this.f8625b = cls;
    }

    @Override // g.r.d.d
    public Class<?> a() {
        return this.f8625b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && i.a(g.r.a.a(this), g.r.a.a((c) obj));
    }

    public int hashCode() {
        return g.r.a.a(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
