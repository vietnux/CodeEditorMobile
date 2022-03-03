package e.b.b.a.e;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class y implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x f7816b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f7817c;

    y(x xVar, Callable callable) {
        this.f7816b = xVar;
        this.f7817c = callable;
    }

    public final void run() {
        try {
            this.f7816b.a(this.f7817c.call());
        } catch (Exception e2) {
            this.f7816b.a(e2);
        }
    }
}
