package c.e;

public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1959f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1960b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f1961c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f1962d;

    /* renamed from: e  reason: collision with root package name */
    private int f1963e;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.f1960b = false;
        if (i2 == 0) {
            this.f1961c = c.f1957b;
            this.f1962d = c.f1958c;
            return;
        }
        int c2 = c.c(i2);
        this.f1961c = new long[c2];
        this.f1962d = new Object[c2];
    }

    private void c() {
        int i2 = this.f1963e;
        long[] jArr = this.f1961c;
        Object[] objArr = this.f1962d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1959f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1960b = false;
        this.f1963e = i3;
    }

    public long a(int i2) {
        if (this.f1960b) {
            c();
        }
        return this.f1961c[i2];
    }

    public E a(long j2) {
        return b(j2, null);
    }

    public void a() {
        int i2 = this.f1963e;
        Object[] objArr = this.f1962d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1963e = 0;
        this.f1960b = false;
    }

    public void a(long j2, E e2) {
        int i2 = this.f1963e;
        if (i2 == 0 || j2 > this.f1961c[i2 - 1]) {
            if (this.f1960b && this.f1963e >= this.f1961c.length) {
                c();
            }
            int i3 = this.f1963e;
            if (i3 >= this.f1961c.length) {
                int c2 = c.c(i3 + 1);
                long[] jArr = new long[c2];
                Object[] objArr = new Object[c2];
                long[] jArr2 = this.f1961c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1962d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1961c = jArr;
                this.f1962d = objArr;
            }
            this.f1961c[i3] = j2;
            this.f1962d[i3] = e2;
            this.f1963e = i3 + 1;
            return;
        }
        c(j2, e2);
    }

    public int b() {
        if (this.f1960b) {
            c();
        }
        return this.f1963e;
    }

    public int b(long j2) {
        if (this.f1960b) {
            c();
        }
        return c.a(this.f1961c, this.f1963e, j2);
    }

    public E b(long j2, E e2) {
        int a = c.a(this.f1961c, this.f1963e, j2);
        if (a >= 0) {
            Object[] objArr = this.f1962d;
            if (objArr[a] != f1959f) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public void b(int i2) {
        Object[] objArr = this.f1962d;
        Object obj = objArr[i2];
        Object obj2 = f1959f;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1960b = true;
        }
    }

    public E c(int i2) {
        if (this.f1960b) {
            c();
        }
        return (E) this.f1962d[i2];
    }

    public void c(long j2) {
        Object[] objArr;
        Object obj;
        int a = c.a(this.f1961c, this.f1963e, j2);
        if (a >= 0 && (objArr = this.f1962d)[a] != (obj = f1959f)) {
            objArr[a] = obj;
            this.f1960b = true;
        }
    }

    public void c(long j2, E e2) {
        int a = c.a(this.f1961c, this.f1963e, j2);
        if (a >= 0) {
            this.f1962d[a] = e2;
            return;
        }
        int i2 = ~a;
        if (i2 < this.f1963e) {
            Object[] objArr = this.f1962d;
            if (objArr[i2] == f1959f) {
                this.f1961c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1960b && this.f1963e >= this.f1961c.length) {
            c();
            i2 = ~c.a(this.f1961c, this.f1963e, j2);
        }
        int i3 = this.f1963e;
        if (i3 >= this.f1961c.length) {
            int c2 = c.c(i3 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f1961c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1962d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1961c = jArr;
            this.f1962d = objArr2;
        }
        int i4 = this.f1963e;
        if (i4 - i2 != 0) {
            long[] jArr3 = this.f1961c;
            int i5 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i5, i4 - i2);
            Object[] objArr4 = this.f1962d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1963e - i2);
        }
        this.f1961c[i2] = j2;
        this.f1962d[i2] = e2;
        this.f1963e++;
    }

    @Override // java.lang.Object
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f1961c = (long[]) this.f1961c.clone();
            dVar.f1962d = (Object[]) this.f1962d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1963e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1963e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            E c2 = c(i2);
            if (c2 != this) {
                sb.append((Object) c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
