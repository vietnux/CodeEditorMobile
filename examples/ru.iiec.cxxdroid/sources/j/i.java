package j;

import java.util.concurrent.TimeUnit;

public class i extends t {

    /* renamed from: e  reason: collision with root package name */
    private t f9483e;

    public i(t tVar) {
        if (tVar != null) {
            this.f9483e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final i a(t tVar) {
        if (tVar != null) {
            this.f9483e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // j.t
    public t a() {
        return this.f9483e.a();
    }

    @Override // j.t
    public t a(long j2) {
        return this.f9483e.a(j2);
    }

    @Override // j.t
    public t a(long j2, TimeUnit timeUnit) {
        return this.f9483e.a(j2, timeUnit);
    }

    @Override // j.t
    public t b() {
        return this.f9483e.b();
    }

    @Override // j.t
    public long c() {
        return this.f9483e.c();
    }

    @Override // j.t
    public boolean d() {
        return this.f9483e.d();
    }

    @Override // j.t
    public void e() {
        this.f9483e.e();
    }

    public final t g() {
        return this.f9483e;
    }
}
