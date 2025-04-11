package i.f0.f;

import i.c0;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {
    private final Set<c0> a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.a.contains(c0Var);
    }
}
