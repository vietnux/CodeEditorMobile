package f.a.a.a.n.e;

import f.a.a.a.l;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class b implements e {
    private final l a;

    /* renamed from: b  reason: collision with root package name */
    private g f8503b;

    /* renamed from: c  reason: collision with root package name */
    private SSLSocketFactory f8504c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8505d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                f.a.a.a.n.e.c[] r0 = f.a.a.a.n.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f.a.a.a.n.e.b.a.a = r0
                int[] r0 = f.a.a.a.n.e.b.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                f.a.a.a.n.e.c r1 = f.a.a.a.n.e.c.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f.a.a.a.n.e.b.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                f.a.a.a.n.e.c r1 = f.a.a.a.n.e.c.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f.a.a.a.n.e.b.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                f.a.a.a.n.e.c r1 = f.a.a.a.n.e.c.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f.a.a.a.n.e.b.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                f.a.a.a.n.e.c r1 = f.a.a.a.n.e.c.DELETE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.e.b.a.<clinit>():void");
        }
    }

    public b() {
        this(new f.a.a.a.b());
    }

    public b(l lVar) {
        this.a = lVar;
    }

    private synchronized SSLSocketFactory a() {
        if (this.f8504c == null && !this.f8505d) {
            this.f8504c = b();
        }
        return this.f8504c;
    }

    private boolean a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    private synchronized SSLSocketFactory b() {
        SSLSocketFactory a2;
        this.f8505d = true;
        try {
            a2 = f.a(this.f8503b);
            this.a.e("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e2) {
            this.a.c("Fabric", "Exception while validating pinned certs", e2);
            return null;
        }
        return a2;
    }

    private synchronized void c() {
        this.f8505d = false;
        this.f8504c = null;
    }

    @Override // f.a.a.a.n.e.e
    public d a(c cVar, String str, Map<String, String> map) {
        d dVar;
        SSLSocketFactory a2;
        int i2 = a.a[cVar.ordinal()];
        if (i2 == 1) {
            dVar = d.a((CharSequence) str, (Map<?, ?>) map, true);
        } else if (i2 == 2) {
            dVar = d.b((CharSequence) str, (Map<?, ?>) map, true);
        } else if (i2 == 3) {
            dVar = d.f((CharSequence) str);
        } else if (i2 == 4) {
            dVar = d.b((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (!(!a(str) || this.f8503b == null || (a2 = a()) == null)) {
            ((HttpsURLConnection) dVar.j()).setSSLSocketFactory(a2);
        }
        return dVar;
    }

    @Override // f.a.a.a.n.e.e
    public void a(g gVar) {
        if (this.f8503b != gVar) {
            this.f8503b = gVar;
            c();
        }
    }
}
