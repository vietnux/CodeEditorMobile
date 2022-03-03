package g.u;

import g.r.c.l;
import g.r.d.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c<T> implements d<T> {
    private final d<T> a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8636b;

    /* renamed from: c  reason: collision with root package name */
    private final l<T, Boolean> f8637c;

    public static final class a implements Iterator<T>, g.r.d.r.a {

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<T> f8638b;

        /* renamed from: c  reason: collision with root package name */
        private int f8639c = -1;

        /* renamed from: d  reason: collision with root package name */
        private T f8640d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f8641e;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f8641e = cVar;
            this.f8638b = cVar.a.iterator();
        }

        private final void a() {
            int i2;
            while (true) {
                if (!this.f8638b.hasNext()) {
                    i2 = 0;
                    break;
                }
                T next = this.f8638b.next();
                if (((Boolean) this.f8641e.f8637c.a(next)).booleanValue() == this.f8641e.f8636b) {
                    this.f8640d = next;
                    i2 = 1;
                    break;
                }
            }
            this.f8639c = i2;
        }

        public boolean hasNext() {
            if (this.f8639c == -1) {
                a();
            }
            return this.f8639c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f8639c == -1) {
                a();
            }
            if (this.f8639c != 0) {
                T t = this.f8640d;
                this.f8640d = null;
                this.f8639c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: g.u.d<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: g.r.c.l<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d<? extends T> dVar, boolean z, l<? super T, Boolean> lVar) {
        i.c(dVar, "sequence");
        i.c(lVar, "predicate");
        this.a = dVar;
        this.f8636b = z;
        this.f8637c = lVar;
    }

    @Override // g.u.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
