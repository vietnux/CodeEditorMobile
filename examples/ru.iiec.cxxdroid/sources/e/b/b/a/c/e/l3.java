package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class l3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7409b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7410c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7411d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7412e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ c3 f7413f;

    l3(c3 c3Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f7413f = c3Var;
        this.f7409b = atomicReference;
        this.f7410c = str;
        this.f7411d = str2;
        this.f7412e = str3;
    }

    public final void run() {
        this.f7413f.a.w().a(this.f7409b, this.f7410c, this.f7411d, this.f7412e);
    }
}
