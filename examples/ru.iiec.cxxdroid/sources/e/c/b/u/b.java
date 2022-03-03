package e.c.b.u;

import e.c.b.k;
import g.r.d.i;
import java.util.concurrent.atomic.AtomicLong;

public final class b<Identifiable extends k> extends a<Identifiable> {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f8168b = new AtomicLong(-2);

    @Override // e.c.b.j
    public long a(Identifiable identifiable) {
        i.d(identifiable, "identifiable");
        return this.f8168b.decrementAndGet();
    }
}
