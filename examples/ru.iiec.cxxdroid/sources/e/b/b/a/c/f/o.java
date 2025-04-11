package e.b.b.a.c.f;

/* access modifiers changed from: package-private */
public final class o extends p {

    /* renamed from: d  reason: collision with root package name */
    final transient int f7754d;

    /* renamed from: e  reason: collision with root package name */
    final transient int f7755e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f7756f;

    o(p pVar, int i2, int i3) {
        this.f7756f = pVar;
        this.f7754d = i2;
        this.f7755e = i3;
    }

    @Override // e.b.b.a.c.f.p
    /* renamed from: a */
    public final p subList(int i2, int i3) {
        j.a(i2, i3, this.f7755e);
        p pVar = this.f7756f;
        int i4 = this.f7754d;
        return pVar.subList(i2 + i4, i3 + i4);
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final int b() {
        return this.f7756f.c() + this.f7754d + this.f7755e;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final int c() {
        return this.f7756f.c() + this.f7754d;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final Object[] d() {
        return this.f7756f.d();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        j.a(i2, this.f7755e, "index");
        return this.f7756f.get(i2 + this.f7754d);
    }

    public final int size() {
        return this.f7755e;
    }
}
