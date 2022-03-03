package g.u;

import g.r.c.l;
import g.r.d.i;
import java.util.Iterator;

public final class k<T, R> implements d<R> {
    private final d<T> a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, R> f8642b;

    public static final class a implements Iterator<R>, g.r.d.r.a {

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<T> f8643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f8644c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(k kVar) {
            this.f8644c = kVar;
            this.f8643b = kVar.a.iterator();
        }

        public boolean hasNext() {
            return this.f8643b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f8644c.f8642b.a(this.f8643b.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: g.u.d<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: g.r.c.l<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        i.c(dVar, "sequence");
        i.c(lVar, "transformer");
        this.a = dVar;
        this.f8642b = lVar;
    }

    @Override // g.u.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
