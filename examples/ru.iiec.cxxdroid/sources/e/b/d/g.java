package e.b.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends j implements Iterable<j> {

    /* renamed from: b  reason: collision with root package name */
    private final List<j> f7909b = new ArrayList();

    public void a(j jVar) {
        if (jVar == null) {
            jVar = l.a;
        }
        this.f7909b.add(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f7909b.equals(this.f7909b));
    }

    public int hashCode() {
        return this.f7909b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f7909b.iterator();
    }
}
