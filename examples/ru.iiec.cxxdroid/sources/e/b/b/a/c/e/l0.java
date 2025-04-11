package e.b.b.a.c.e;

import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class l0 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f7403b = this.f7404c.f7372b.keySet().iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ k0 f7404c;

    l0(k0 k0Var) {
        this.f7404c = k0Var;
    }

    public final boolean hasNext() {
        return this.f7403b.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f7403b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
