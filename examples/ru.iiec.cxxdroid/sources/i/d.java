package i;

import java.util.concurrent.TimeUnit;

public final class d {
    public static final d n;
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8777c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8778d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8779e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8780f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8781g;

    /* renamed from: h  reason: collision with root package name */
    private final int f8782h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8783i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f8784j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f8785k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f8786l;

    /* renamed from: m  reason: collision with root package name */
    String f8787m;

    public static final class a {
        boolean a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8788b;

        /* renamed from: c  reason: collision with root package name */
        int f8789c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f8790d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f8791e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f8792f;

        /* renamed from: g  reason: collision with root package name */
        boolean f8793g;

        /* renamed from: h  reason: collision with root package name */
        boolean f8794h;

        public a a(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds((long) i2);
                this.f8790d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i2);
        }

        public d a() {
            return new d(this);
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c() {
            this.f8788b = true;
            return this;
        }

        public a d() {
            this.f8792f = true;
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.b();
        aVar.a();
        a aVar2 = new a();
        aVar2.d();
        aVar2.a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        n = aVar2.a();
    }

    d(a aVar) {
        this.a = aVar.a;
        this.f8776b = aVar.f8788b;
        this.f8777c = aVar.f8789c;
        this.f8778d = -1;
        this.f8779e = false;
        this.f8780f = false;
        this.f8781g = false;
        this.f8782h = aVar.f8790d;
        this.f8783i = aVar.f8791e;
        this.f8784j = aVar.f8792f;
        this.f8785k = aVar.f8793g;
        this.f8786l = aVar.f8794h;
    }

    private d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.f8776b = z2;
        this.f8777c = i2;
        this.f8778d = i3;
        this.f8779e = z3;
        this.f8780f = z4;
        this.f8781g = z5;
        this.f8782h = i4;
        this.f8783i = i5;
        this.f8784j = z6;
        this.f8785k = z7;
        this.f8786l = z8;
        this.f8787m = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.d a(i.r r22) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.a(i.r):i.d");
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.f8776b) {
            sb.append("no-store, ");
        }
        if (this.f8777c != -1) {
            sb.append("max-age=");
            sb.append(this.f8777c);
            sb.append(", ");
        }
        if (this.f8778d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f8778d);
            sb.append(", ");
        }
        if (this.f8779e) {
            sb.append("private, ");
        }
        if (this.f8780f) {
            sb.append("public, ");
        }
        if (this.f8781g) {
            sb.append("must-revalidate, ");
        }
        if (this.f8782h != -1) {
            sb.append("max-stale=");
            sb.append(this.f8782h);
            sb.append(", ");
        }
        if (this.f8783i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f8783i);
            sb.append(", ");
        }
        if (this.f8784j) {
            sb.append("only-if-cached, ");
        }
        if (this.f8785k) {
            sb.append("no-transform, ");
        }
        if (this.f8786l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean a() {
        return this.f8786l;
    }

    public boolean b() {
        return this.f8779e;
    }

    public boolean c() {
        return this.f8780f;
    }

    public int d() {
        return this.f8777c;
    }

    public int e() {
        return this.f8782h;
    }

    public int f() {
        return this.f8783i;
    }

    public boolean g() {
        return this.f8781g;
    }

    public boolean h() {
        return this.a;
    }

    public boolean i() {
        return this.f8776b;
    }

    public boolean j() {
        return this.f8784j;
    }

    public String toString() {
        String str = this.f8787m;
        if (str != null) {
            return str;
        }
        String k2 = k();
        this.f8787m = k2;
        return k2;
    }
}
