package e.b.b.a.c.e;

import java.util.List;
import java.util.concurrent.Callable;

final class v2 implements Callable<List<r5>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7624b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f2 f7625c;

    v2(f2 f2Var, s sVar) {
        this.f7625c = f2Var;
        this.f7624b = sVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<r5> call() {
        f2.a(this.f7625c).p();
        return f2.a(this.f7625c).l().a(this.f7624b.f7562b);
    }
}
