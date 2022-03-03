package e.b.b.a.c.e;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class a5 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ z4 f7161e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a5(z4 z4Var, a3 a3Var) {
        super(a3Var);
        this.f7161e = z4Var;
    }

    @Override // e.b.b.a.c.e.f0
    public final void b() {
        z4 z4Var = this.f7161e;
        z4Var.d();
        z4Var.a().F().a("Session started, time", Long.valueOf(z4Var.b().b()));
        z4Var.q().u.a(false);
        z4Var.h().c("auto", "_s", new Bundle());
        z4Var.q().v.a(z4Var.b().a());
    }
}
