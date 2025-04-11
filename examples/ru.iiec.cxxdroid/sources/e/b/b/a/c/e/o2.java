package e.b.b.a.c.e;

import java.util.List;
import java.util.concurrent.Callable;

final class o2 implements Callable<List<w>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7476b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7477c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7478d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f2 f7479e;

    o2(f2 f2Var, String str, String str2, String str3) {
        this.f7479e = f2Var;
        this.f7476b = str;
        this.f7477c = str2;
        this.f7478d = str3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<w> call() {
        f2.a(this.f7479e).p();
        return f2.a(this.f7479e).l().b(this.f7476b, this.f7477c, this.f7478d);
    }
}
