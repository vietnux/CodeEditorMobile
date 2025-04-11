package g.s;

import g.p.c;
import g.r.d.g;
import java.util.Iterator;

public class b implements Iterable<Integer>, g.r.d.r.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8628e = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final int f8629b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8630c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8631d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(int i2, int i3, int i4) {
            return new b(i2, i3, i4);
        }
    }

    public b(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f8629b = i2;
            this.f8630c = c.b(i2, i3, i4);
            this.f8631d = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int a() {
        return this.f8629b;
    }

    public final int b() {
        return this.f8630c;
    }

    public final int c() {
        return this.f8631d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (!(this.f8629b == bVar.f8629b && this.f8630c == bVar.f8630c && this.f8631d == bVar.f8631d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8629b * 31) + this.f8630c) * 31) + this.f8631d;
    }

    public boolean isEmpty() {
        if (this.f8631d > 0) {
            if (this.f8629b > this.f8630c) {
                return true;
            }
        } else if (this.f8629b < this.f8630c) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'g.o.v' to match base method */
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c(this.f8629b, this.f8630c, this.f8631d);
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f8631d > 0) {
            sb = new StringBuilder();
            sb.append(this.f8629b);
            sb.append("..");
            sb.append(this.f8630c);
            sb.append(" step ");
            i2 = this.f8631d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8629b);
            sb.append(" downTo ");
            sb.append(this.f8630c);
            sb.append(" step ");
            i2 = -this.f8631d;
        }
        sb.append(i2);
        return sb.toString();
    }
}
