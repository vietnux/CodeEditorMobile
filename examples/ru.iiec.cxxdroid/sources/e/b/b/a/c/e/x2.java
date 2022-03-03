package e.b.b.a.c.e;

final class x2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7677b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7678c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7679d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f7680e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f2 f7681f;

    x2(f2 f2Var, String str, String str2, String str3, long j2) {
        this.f7681f = f2Var;
        this.f7677b = str;
        this.f7678c = str2;
        this.f7679d = str3;
        this.f7680e = j2;
    }

    public final void run() {
        String str = this.f7677b;
        if (str == null) {
            f2.a(this.f7681f).r().x().a(this.f7678c, (w3) null);
            return;
        }
        f2.a(this.f7681f).r().x().a(this.f7678c, new w3(this.f7679d, str, this.f7680e));
    }
}
