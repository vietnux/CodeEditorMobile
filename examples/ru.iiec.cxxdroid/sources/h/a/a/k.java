package h.a.a;

public class k {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8678b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8679c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8680d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8681e;

    /* renamed from: f  reason: collision with root package name */
    private final d f8682f;

    k(h hVar, long j2) {
        this.f8682f = hVar.a;
        hVar.b(j2);
        this.a = hVar.a();
        this.f8678b = hVar.a();
        hVar.b();
        hVar.b();
        this.f8679c = hVar.b();
        this.f8680d = hVar.b();
        hVar.a();
        hVar.a();
        hVar.b();
        this.f8681e = hVar.b();
    }

    public String a() {
        if (this.a == 0) {
            return null;
        }
        return this.f8682f.b().a(this.a);
    }

    public String toString() {
        return "ElfSectionHeader[name=" + a() + ", type=0x" + Long.toHexString((long) this.f8678b) + "]";
    }
}
