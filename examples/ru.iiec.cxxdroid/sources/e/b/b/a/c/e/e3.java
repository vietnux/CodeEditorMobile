package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class e3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7227b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7228c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f7229d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f7230e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ c3 f7231f;

    e3(c3 c3Var, String str, String str2, Object obj, long j2) {
        this.f7231f = c3Var;
        this.f7227b = str;
        this.f7228c = str2;
        this.f7229d = obj;
        this.f7230e = j2;
    }

    public final void run() {
        this.f7231f.a((c3) this.f7227b, this.f7228c, (String) this.f7229d, (Object) this.f7230e);
    }
}
