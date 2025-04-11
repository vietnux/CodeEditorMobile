package e.b.b.a.c.e;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class m5 implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7443b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7444c;

    m5(j5 j5Var, s sVar) {
        this.f7444c = j5Var;
        this.f7443b = sVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        r b2 = this.f7444c.j().i(this.f7443b.f7562b) ? this.f7444c.e(this.f7443b) : this.f7444c.l().b(this.f7443b.f7562b);
        if (b2 != null) {
            return b2.a();
        }
        this.f7444c.a().B().a("App info was null when attempting to get app instance id");
        return null;
    }
}
