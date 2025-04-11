package e.b.b.a.c.e;

import java.util.concurrent.Callable;

final class s2 implements Callable<byte[]> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n0 f7574b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7575c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7576d;

    s2(f2 f2Var, n0 n0Var, String str) {
        this.f7576d = f2Var;
        this.f7574b = n0Var;
        this.f7575c = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        f2.a(this.f7576d).p();
        f2.a(this.f7576d).a(this.f7574b, this.f7575c);
        throw null;
    }
}
