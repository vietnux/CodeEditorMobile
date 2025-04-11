package e.b.b.a.c.e;

import java.util.List;
import java.util.concurrent.Callable;

final class n2 implements Callable<List<w>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7456b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7457c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7458d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f2 f7459e;

    n2(f2 f2Var, s sVar, String str, String str2) {
        this.f7459e = f2Var;
        this.f7456b = sVar;
        this.f7457c = str;
        this.f7458d = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<w> call() {
        f2.a(this.f7459e).p();
        return f2.a(this.f7459e).l().b(this.f7456b.f7562b, this.f7457c, this.f7458d);
    }
}
