package e.b.d.w.m;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class n {
    public static final e.b.d.t<String> A = new g();
    public static final e.b.d.t<BigDecimal> B = new h();
    public static final e.b.d.t<BigInteger> C = new i();
    public static final e.b.d.u D = a(String.class, A);
    public static final e.b.d.t<StringBuilder> E = new j();
    public static final e.b.d.u F = a(StringBuilder.class, E);
    public static final e.b.d.t<StringBuffer> G = new l();
    public static final e.b.d.u H = a(StringBuffer.class, G);
    public static final e.b.d.t<URL> I = new m();
    public static final e.b.d.u J = a(URL.class, I);
    public static final e.b.d.t<URI> K = new C0114n();
    public static final e.b.d.u L = a(URI.class, K);
    public static final e.b.d.t<InetAddress> M = new o();
    public static final e.b.d.u N = b(InetAddress.class, M);
    public static final e.b.d.t<UUID> O = new p();
    public static final e.b.d.u P = a(UUID.class, O);
    public static final e.b.d.t<Currency> Q = new q().a();
    public static final e.b.d.u R = a(Currency.class, Q);
    public static final e.b.d.u S = new r();
    public static final e.b.d.t<Calendar> T = new s();
    public static final e.b.d.u U = b(Calendar.class, GregorianCalendar.class, T);
    public static final e.b.d.t<Locale> V = new t();
    public static final e.b.d.u W = a(Locale.class, V);
    public static final e.b.d.t<e.b.d.j> X = new u();
    public static final e.b.d.u Y = b(e.b.d.j.class, X);
    public static final e.b.d.u Z = new w();
    public static final e.b.d.t<Class> a = new k().a();

    /* renamed from: b  reason: collision with root package name */
    public static final e.b.d.u f8002b = a(Class.class, a);

    /* renamed from: c  reason: collision with root package name */
    public static final e.b.d.t<BitSet> f8003c = new v().a();

    /* renamed from: d  reason: collision with root package name */
    public static final e.b.d.u f8004d = a(BitSet.class, f8003c);

    /* renamed from: e  reason: collision with root package name */
    public static final e.b.d.t<Boolean> f8005e = new c0();

    /* renamed from: f  reason: collision with root package name */
    public static final e.b.d.t<Boolean> f8006f = new d0();

    /* renamed from: g  reason: collision with root package name */
    public static final e.b.d.u f8007g = a(Boolean.TYPE, Boolean.class, f8005e);

    /* renamed from: h  reason: collision with root package name */
    public static final e.b.d.t<Number> f8008h = new e0();

    /* renamed from: i  reason: collision with root package name */
    public static final e.b.d.u f8009i = a(Byte.TYPE, Byte.class, f8008h);

    /* renamed from: j  reason: collision with root package name */
    public static final e.b.d.t<Number> f8010j = new f0();

    /* renamed from: k  reason: collision with root package name */
    public static final e.b.d.u f8011k = a(Short.TYPE, Short.class, f8010j);

    /* renamed from: l  reason: collision with root package name */
    public static final e.b.d.t<Number> f8012l = new g0();

    /* renamed from: m  reason: collision with root package name */
    public static final e.b.d.u f8013m = a(Integer.TYPE, Integer.class, f8012l);
    public static final e.b.d.t<AtomicInteger> n = new h0().a();
    public static final e.b.d.u o = a(AtomicInteger.class, n);
    public static final e.b.d.t<AtomicBoolean> p = new i0().a();
    public static final e.b.d.u q = a(AtomicBoolean.class, p);
    public static final e.b.d.t<AtomicIntegerArray> r = new a().a();
    public static final e.b.d.u s = a(AtomicIntegerArray.class, r);
    public static final e.b.d.t<Number> t = new b();
    public static final e.b.d.t<Number> u = new c();
    public static final e.b.d.t<Number> v = new d();
    public static final e.b.d.t<Number> w = new e();
    public static final e.b.d.u x = a(Number.class, w);
    public static final e.b.d.t<Character> y = new f();
    public static final e.b.d.u z = a(Character.TYPE, Character.class, y);

    static class a extends e.b.d.t<AtomicIntegerArray> {
        a() {
        }

        @Override // e.b.d.t
        public AtomicIntegerArray a(e.b.d.y.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.l();
            while (aVar.r()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.w()));
                } catch (NumberFormatException e2) {
                    throw new e.b.d.r(e2);
                }
            }
            aVar.o();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        public void a(e.b.d.y.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.l();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.g((long) atomicIntegerArray.get(i2));
            }
            cVar.n();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a0 implements e.b.d.u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f8014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.b.d.t f8015c;

        class a extends e.b.d.t<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            @Override // e.b.d.t
            public T1 a(e.b.d.y.a aVar) {
                T1 t1 = (T1) a0.this.f8015c.a(aVar);
                if (t1 == null || this.a.isInstance(t1)) {
                    return t1;
                }
                throw new e.b.d.r("Expected a " + this.a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // e.b.d.t
            public void a(e.b.d.y.c cVar, T1 t1) {
                a0.this.f8015c.a(cVar, t1);
            }
        }

        a0(Class cls, e.b.d.t tVar) {
            this.f8014b = cls;
            this.f8015c = tVar;
        }

        @Override // e.b.d.u
        public <T2> e.b.d.t<T2> a(e.b.d.e eVar, e.b.d.x.a<T2> aVar) {
            Class<? super T2> a2 = aVar.a();
            if (!this.f8014b.isAssignableFrom(a2)) {
                return null;
            }
            return new a(a2);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f8014b.getName() + ",adapter=" + this.f8015c + "]";
        }
    }

    static class b extends e.b.d.t<Number> {
        b() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Long.valueOf(aVar.x());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b0 {
        static final /* synthetic */ int[] a = new int[e.b.d.y.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.m.n.b0.<clinit>():void");
        }
    }

    static class c extends e.b.d.t<Number> {
        c() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Float.valueOf((float) aVar.v());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class c0 extends e.b.d.t<Boolean> {
        c0() {
        }

        @Override // e.b.d.t
        public Boolean a(e.b.d.y.a aVar) {
            e.b.d.y.b B = aVar.B();
            if (B != e.b.d.y.b.NULL) {
                return B == e.b.d.y.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.A())) : Boolean.valueOf(aVar.u());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Boolean bool) {
            cVar.a(bool);
        }
    }

    static class d extends e.b.d.t<Number> {
        d() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Double.valueOf(aVar.v());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class d0 extends e.b.d.t<Boolean> {
        d0() {
        }

        @Override // e.b.d.t
        public Boolean a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return Boolean.valueOf(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, Boolean bool) {
            cVar.d(bool == null ? "null" : bool.toString());
        }
    }

    static class e extends e.b.d.t<Number> {
        e() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            e.b.d.y.b B = aVar.B();
            int i2 = b0.a[B.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new e.b.d.w.f(aVar.A());
            }
            if (i2 == 4) {
                aVar.z();
                return null;
            }
            throw new e.b.d.r("Expecting number, got: " + B);
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class e0 extends e.b.d.t<Number> {
        e0() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.w());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class f extends e.b.d.t<Character> {
        f() {
        }

        @Override // e.b.d.t
        public Character a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            String A = aVar.A();
            if (A.length() == 1) {
                return Character.valueOf(A.charAt(0));
            }
            throw new e.b.d.r("Expecting character, got: " + A);
        }

        public void a(e.b.d.y.c cVar, Character ch) {
            cVar.d(ch == null ? null : String.valueOf(ch));
        }
    }

    static class f0 extends e.b.d.t<Number> {
        f0() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.w());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class g extends e.b.d.t<String> {
        g() {
        }

        @Override // e.b.d.t
        public String a(e.b.d.y.a aVar) {
            e.b.d.y.b B = aVar.B();
            if (B != e.b.d.y.b.NULL) {
                return B == e.b.d.y.b.BOOLEAN ? Boolean.toString(aVar.u()) : aVar.A();
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, String str) {
            cVar.d(str);
        }
    }

    static class g0 extends e.b.d.t<Number> {
        g0() {
        }

        @Override // e.b.d.t
        public Number a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Integer.valueOf(aVar.w());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, Number number) {
            cVar.a(number);
        }
    }

    static class h extends e.b.d.t<BigDecimal> {
        h() {
        }

        @Override // e.b.d.t
        public BigDecimal a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigDecimal(aVar.A());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, BigDecimal bigDecimal) {
            cVar.a(bigDecimal);
        }
    }

    static class h0 extends e.b.d.t<AtomicInteger> {
        h0() {
        }

        @Override // e.b.d.t
        public AtomicInteger a(e.b.d.y.a aVar) {
            try {
                return new AtomicInteger(aVar.w());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, AtomicInteger atomicInteger) {
            cVar.g((long) atomicInteger.get());
        }
    }

    static class i extends e.b.d.t<BigInteger> {
        i() {
        }

        @Override // e.b.d.t
        public BigInteger a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigInteger(aVar.A());
            } catch (NumberFormatException e2) {
                throw new e.b.d.r(e2);
            }
        }

        public void a(e.b.d.y.c cVar, BigInteger bigInteger) {
            cVar.a(bigInteger);
        }
    }

    static class i0 extends e.b.d.t<AtomicBoolean> {
        i0() {
        }

        @Override // e.b.d.t
        public AtomicBoolean a(e.b.d.y.a aVar) {
            return new AtomicBoolean(aVar.u());
        }

        public void a(e.b.d.y.c cVar, AtomicBoolean atomicBoolean) {
            cVar.d(atomicBoolean.get());
        }
    }

    static class j extends e.b.d.t<StringBuilder> {
        j() {
        }

        @Override // e.b.d.t
        public StringBuilder a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return new StringBuilder(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, StringBuilder sb) {
            cVar.d(sb == null ? null : sb.toString());
        }
    }

    private static final class j0<T extends Enum<T>> extends e.b.d.t<T> {
        private final Map<String, T> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f8017b = new HashMap();

        public j0(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    e.b.d.v.c cVar = (e.b.d.v.c) cls.getField(name).getAnnotation(e.b.d.v.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.f8017b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // e.b.d.t
        public T a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return this.a.get(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, T t) {
            cVar.d(t == null ? null : this.f8017b.get(t));
        }
    }

    static class k extends e.b.d.t<Class> {
        k() {
        }

        @Override // e.b.d.t
        public Class a(e.b.d.y.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void a(e.b.d.y.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.b.d.y.c, java.lang.Object] */
        @Override // e.b.d.t
        public /* bridge */ /* synthetic */ void a(e.b.d.y.c cVar, Class cls) {
            a(cVar, cls);
            throw null;
        }
    }

    static class l extends e.b.d.t<StringBuffer> {
        l() {
        }

        @Override // e.b.d.t
        public StringBuffer a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return new StringBuffer(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, StringBuffer stringBuffer) {
            cVar.d(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    static class m extends e.b.d.t<URL> {
        m() {
        }

        @Override // e.b.d.t
        public URL a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            String A = aVar.A();
            if ("null".equals(A)) {
                return null;
            }
            return new URL(A);
        }

        public void a(e.b.d.y.c cVar, URL url) {
            cVar.d(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: e.b.d.w.m.n$n  reason: collision with other inner class name */
    static class C0114n extends e.b.d.t<URI> {
        C0114n() {
        }

        @Override // e.b.d.t
        public URI a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            try {
                String A = aVar.A();
                if ("null".equals(A)) {
                    return null;
                }
                return new URI(A);
            } catch (URISyntaxException e2) {
                throw new e.b.d.k(e2);
            }
        }

        public void a(e.b.d.y.c cVar, URI uri) {
            cVar.d(uri == null ? null : uri.toASCIIString());
        }
    }

    static class o extends e.b.d.t<InetAddress> {
        o() {
        }

        @Override // e.b.d.t
        public InetAddress a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return InetAddress.getByName(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, InetAddress inetAddress) {
            cVar.d(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    static class p extends e.b.d.t<UUID> {
        p() {
        }

        @Override // e.b.d.t
        public UUID a(e.b.d.y.a aVar) {
            if (aVar.B() != e.b.d.y.b.NULL) {
                return UUID.fromString(aVar.A());
            }
            aVar.z();
            return null;
        }

        public void a(e.b.d.y.c cVar, UUID uuid) {
            cVar.d(uuid == null ? null : uuid.toString());
        }
    }

    static class q extends e.b.d.t<Currency> {
        q() {
        }

        @Override // e.b.d.t
        public Currency a(e.b.d.y.a aVar) {
            return Currency.getInstance(aVar.A());
        }

        public void a(e.b.d.y.c cVar, Currency currency) {
            cVar.d(currency.getCurrencyCode());
        }
    }

    static class r implements e.b.d.u {

        class a extends e.b.d.t<Timestamp> {
            final /* synthetic */ e.b.d.t a;

            a(r rVar, e.b.d.t tVar) {
                this.a = tVar;
            }

            @Override // e.b.d.t
            public Timestamp a(e.b.d.y.a aVar) {
                Date date = (Date) this.a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public void a(e.b.d.y.c cVar, Timestamp timestamp) {
                this.a.a(cVar, timestamp);
            }
        }

        r() {
        }

        @Override // e.b.d.u
        public <T> e.b.d.t<T> a(e.b.d.e eVar, e.b.d.x.a<T> aVar) {
            if (aVar.a() != Timestamp.class) {
                return null;
            }
            return new a(this, eVar.a((Class) Date.class));
        }
    }

    static class s extends e.b.d.t<Calendar> {
        s() {
        }

        @Override // e.b.d.t
        public Calendar a(e.b.d.y.a aVar) {
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            aVar.m();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.B() != e.b.d.y.b.END_OBJECT) {
                String y = aVar.y();
                int w = aVar.w();
                if ("year".equals(y)) {
                    i2 = w;
                } else if ("month".equals(y)) {
                    i3 = w;
                } else if ("dayOfMonth".equals(y)) {
                    i4 = w;
                } else if ("hourOfDay".equals(y)) {
                    i5 = w;
                } else if ("minute".equals(y)) {
                    i6 = w;
                } else if ("second".equals(y)) {
                    i7 = w;
                }
            }
            aVar.p();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        public void a(e.b.d.y.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.s();
                return;
            }
            cVar.m();
            cVar.b("year");
            cVar.g((long) calendar.get(1));
            cVar.b("month");
            cVar.g((long) calendar.get(2));
            cVar.b("dayOfMonth");
            cVar.g((long) calendar.get(5));
            cVar.b("hourOfDay");
            cVar.g((long) calendar.get(11));
            cVar.b("minute");
            cVar.g((long) calendar.get(12));
            cVar.b("second");
            cVar.g((long) calendar.get(13));
            cVar.o();
        }
    }

    static class t extends e.b.d.t<Locale> {
        t() {
        }

        @Override // e.b.d.t
        public Locale a(e.b.d.y.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.B() == e.b.d.y.b.NULL) {
                aVar.z();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.A(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        public void a(e.b.d.y.c cVar, Locale locale) {
            cVar.d(locale == null ? null : locale.toString());
        }
    }

    static class u extends e.b.d.t<e.b.d.j> {
        u() {
        }

        @Override // e.b.d.t
        public e.b.d.j a(e.b.d.y.a aVar) {
            switch (b0.a[aVar.B().ordinal()]) {
                case 1:
                    return new e.b.d.o(new e.b.d.w.f(aVar.A()));
                case 2:
                    return new e.b.d.o(Boolean.valueOf(aVar.u()));
                case 3:
                    return new e.b.d.o(aVar.A());
                case 4:
                    aVar.z();
                    return e.b.d.l.a;
                case 5:
                    e.b.d.g gVar = new e.b.d.g();
                    aVar.l();
                    while (aVar.r()) {
                        gVar.a(a(aVar));
                    }
                    aVar.o();
                    return gVar;
                case 6:
                    e.b.d.m mVar = new e.b.d.m();
                    aVar.m();
                    while (aVar.r()) {
                        mVar.a(aVar.y(), a(aVar));
                    }
                    aVar.p();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void a(e.b.d.y.c cVar, e.b.d.j jVar) {
            if (jVar == null || jVar.e()) {
                cVar.s();
            } else if (jVar.g()) {
                e.b.d.o c2 = jVar.c();
                if (c2.t()) {
                    cVar.a(c2.m());
                } else if (c2.o()) {
                    cVar.d(c2.h());
                } else {
                    cVar.d(c2.n());
                }
            } else if (jVar.d()) {
                cVar.l();
                Iterator<e.b.d.j> it = jVar.a().iterator();
                while (it.hasNext()) {
                    a(cVar, it.next());
                }
                cVar.n();
            } else if (jVar.f()) {
                cVar.m();
                for (Map.Entry<String, e.b.d.j> entry : jVar.b().h()) {
                    cVar.b(entry.getKey());
                    a(cVar, entry.getValue());
                }
                cVar.o();
            } else {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
        }
    }

    static class v extends e.b.d.t<BitSet> {
        v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.w() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        @Override // e.b.d.t
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet a(e.b.d.y.a r8) {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.m.n.v.a(e.b.d.y.a):java.util.BitSet");
        }

        public void a(e.b.d.y.c cVar, BitSet bitSet) {
            cVar.l();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.g(bitSet.get(i2) ? 1 : 0);
            }
            cVar.n();
        }
    }

    static class w implements e.b.d.u {
        w() {
        }

        @Override // e.b.d.u
        public <T> e.b.d.t<T> a(e.b.d.e eVar, e.b.d.x.a<T> aVar) {
            Class<? super Object> a = aVar.a();
            if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
                return null;
            }
            if (!a.isEnum()) {
                a = a.getSuperclass();
            }
            return new j0(a);
        }
    }

    /* access modifiers changed from: package-private */
    public static class x implements e.b.d.u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f8018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.b.d.t f8019c;

        x(Class cls, e.b.d.t tVar) {
            this.f8018b = cls;
            this.f8019c = tVar;
        }

        @Override // e.b.d.u
        public <T> e.b.d.t<T> a(e.b.d.e eVar, e.b.d.x.a<T> aVar) {
            if (aVar.a() == this.f8018b) {
                return this.f8019c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8018b.getName() + ",adapter=" + this.f8019c + "]";
        }
    }

    /* access modifiers changed from: package-private */
    public static class y implements e.b.d.u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f8020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f8021c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e.b.d.t f8022d;

        y(Class cls, Class cls2, e.b.d.t tVar) {
            this.f8020b = cls;
            this.f8021c = cls2;
            this.f8022d = tVar;
        }

        @Override // e.b.d.u
        public <T> e.b.d.t<T> a(e.b.d.e eVar, e.b.d.x.a<T> aVar) {
            Class<? super T> a = aVar.a();
            if (a == this.f8020b || a == this.f8021c) {
                return this.f8022d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8021c.getName() + "+" + this.f8020b.getName() + ",adapter=" + this.f8022d + "]";
        }
    }

    /* access modifiers changed from: package-private */
    public static class z implements e.b.d.u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f8023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f8024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e.b.d.t f8025d;

        z(Class cls, Class cls2, e.b.d.t tVar) {
            this.f8023b = cls;
            this.f8024c = cls2;
            this.f8025d = tVar;
        }

        @Override // e.b.d.u
        public <T> e.b.d.t<T> a(e.b.d.e eVar, e.b.d.x.a<T> aVar) {
            Class<? super T> a = aVar.a();
            if (a == this.f8023b || a == this.f8024c) {
                return this.f8025d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8023b.getName() + "+" + this.f8024c.getName() + ",adapter=" + this.f8025d + "]";
        }
    }

    public static <TT> e.b.d.u a(Class<TT> cls, e.b.d.t<TT> tVar) {
        return new x(cls, tVar);
    }

    public static <TT> e.b.d.u a(Class<TT> cls, Class<TT> cls2, e.b.d.t<? super TT> tVar) {
        return new y(cls, cls2, tVar);
    }

    public static <T1> e.b.d.u b(Class<T1> cls, e.b.d.t<T1> tVar) {
        return new a0(cls, tVar);
    }

    public static <TT> e.b.d.u b(Class<TT> cls, Class<? extends TT> cls2, e.b.d.t<? super TT> tVar) {
        return new z(cls, cls2, tVar);
    }
}
