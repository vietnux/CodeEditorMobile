package g.s;

import g.r.d.g;

public final class d extends b implements a<Integer> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        new a(null);
        new d(1, 0);
    }

    public d(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // g.s.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (!(a() == dVar.a() && b() == dVar.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // g.s.b
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // g.s.b
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // g.s.b
    public String toString() {
        return a() + ".." + b();
    }
}
