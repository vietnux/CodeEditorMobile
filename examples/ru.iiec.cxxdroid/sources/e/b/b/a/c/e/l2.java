package e.b.b.a.c.e;

import java.util.List;
import java.util.concurrent.Callable;

final class l2 implements Callable<List<r5>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7405b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7406c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7407d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f2 f7408e;

    l2(f2 f2Var, s sVar, String str, String str2) {
        this.f7408e = f2Var;
        this.f7405b = sVar;
        this.f7406c = str;
        this.f7407d = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<r5> call() {
        f2.a(this.f7408e).p();
        return f2.a(this.f7408e).l().a(this.f7405b.f7562b, this.f7406c, this.f7407d);
    }
}
