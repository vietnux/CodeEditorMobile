package e.b.b.a.c.b;

import com.google.android.gms.common.api.Status;

final class c1 extends z0 {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b1 f7031b;

    c1(b1 b1Var) {
        this.f7031b = b1Var;
    }

    @Override // e.b.b.a.c.b.g
    public final void a(Status status, e eVar) {
        if (eVar.t() == 6502 || eVar.t() == 6507) {
            this.f7031b.a(new d1(x0.b(eVar.t()), x0.c(eVar), eVar.n(), x0.b(eVar)));
        } else {
            this.f7031b.a(new d1(x0.b(eVar.t()), x0.c(eVar), x0.b(eVar)));
        }
    }
}
