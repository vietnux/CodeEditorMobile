package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class a1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f7147b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7148c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f7149d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f7150e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f7151f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ z0 f7152g;

    a1(z0 z0Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f7152g = z0Var;
        this.f7147b = i2;
        this.f7148c = str;
        this.f7149d = obj;
        this.f7150e = obj2;
        this.f7151f = obj3;
    }

    public final void run() {
        char c2;
        z0 z0Var;
        k1 i2 = this.f7152g.a.i();
        if (!i2.s()) {
            this.f7152g.a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f7152g.f7714c == 0) {
            if (this.f7152g.r().s()) {
                z0Var = this.f7152g;
                c2 = 'C';
            } else {
                z0Var = this.f7152g;
                c2 = 'c';
            }
            z0Var.f7714c = c2;
        }
        if (this.f7152g.f7715d < 0) {
            this.f7152g.f7715d = 12451;
        }
        char charAt = "01VDIWEA?".charAt(this.f7147b);
        char c3 = this.f7152g.f7714c;
        long j2 = this.f7152g.f7715d;
        String a = z0.a(true, this.f7148c, this.f7149d, this.f7150e, this.f7151f);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c3);
        sb.append(j2);
        sb.append(":");
        sb.append(a);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f7148c.substring(0, 1024);
        }
        i2.f7374d.a(sb2, 1);
    }
}
