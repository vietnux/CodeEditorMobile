package e.b.b.a.c.e;

import java.util.List;
import java.util.concurrent.Callable;

final class m2 implements Callable<List<r5>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7429b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7430c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7431d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f2 f7432e;

    m2(f2 f2Var, String str, String str2, String str3) {
        this.f7432e = f2Var;
        this.f7429b = str;
        this.f7430c = str2;
        this.f7431d = str3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<r5> call() {
        f2.a(this.f7432e).p();
        return f2.a(this.f7432e).l().a(this.f7429b, this.f7430c, this.f7431d);
    }
}
