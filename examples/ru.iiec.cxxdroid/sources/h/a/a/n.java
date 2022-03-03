package h.a.a;

public final class n {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8692b;

    /* renamed from: c  reason: collision with root package name */
    public final short f8693c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8694d;

    /* renamed from: e  reason: collision with root package name */
    private final d f8695e;

    n(h hVar, long j2, int i2) {
        this.f8695e = hVar.a;
        hVar.b(j2);
        if (hVar.a.a == 1) {
            this.a = hVar.a();
            hVar.a();
            this.f8692b = (long) hVar.a();
            this.f8693c = hVar.e();
            hVar.e();
            hVar.d();
        } else {
            this.a = hVar.a();
            this.f8693c = hVar.e();
            hVar.e();
            hVar.d();
            hVar.c();
            this.f8692b = hVar.c();
        }
        this.f8694d = i2;
        int b2 = b();
        if (b2 != 0 && b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4 && b2 != 13) {
        }
    }

    public String a() {
        m a2;
        if (this.a == 0) {
            return null;
        }
        int i2 = this.f8694d;
        if (i2 == 2) {
            a2 = this.f8695e.c();
        } else if (i2 != 11) {
            return null;
        } else {
            a2 = this.f8695e.a();
        }
        return a2.a(this.a);
    }

    public int b() {
        return this.f8693c & 15;
    }

    public String toString() {
        int b2 = b();
        String num = b2 != 0 ? b2 != 1 ? b2 != 2 ? b2 != 3 ? b2 != 4 ? b2 != 13 ? b2 != 15 ? Integer.toString(b2) : "hiproc" : "loproc" : "file" : "section" : "function" : "object" : "unspecified";
        return "ElfSymbol[name=" + a() + ", type=" + num + ", size=" + this.f8692b + "]";
    }
}
