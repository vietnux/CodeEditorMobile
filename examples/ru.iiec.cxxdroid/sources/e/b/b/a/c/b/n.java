package e.b.b.a.c.b;

import e.b.c.d.a;
import java.util.List;

public final class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final a f7055b;

    /* renamed from: c  reason: collision with root package name */
    private final List<byte[]> f7056c;

    public n(a aVar, List<byte[]> list) {
        this.f7055b = aVar;
        this.f7056c = list;
    }

    public final void run() {
        a aVar = this.f7055b;
        if (aVar != null) {
            aVar.a(this.f7056c);
        }
    }
}
