package c.e;

public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1992f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1993b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f1994c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f1995d;

    /* renamed from: e  reason: collision with root package name */
    private int f1996e;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.f1993b = false;
        if (i2 == 0) {
            this.f1994c = c.a;
            this.f1995d = c.f1958c;
            return;
        }
        int b2 = c.b(i2);
        this.f1994c = new int[b2];
        this.f1995d = new Object[b2];
    }

    private void c() {
        int i2 = this.f1996e;
        int[] iArr = this.f1994c;
        Object[] objArr = this.f1995d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1992f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1993b = false;
        this.f1996e = i3;
    }

    public E a(int i2) {
        return b(i2, null);
    }

    public void a() {
        int i2 = this.f1996e;
        Object[] objArr = this.f1995d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1996e = 0;
        this.f1993b = false;
    }

    public void a(int i2, E e2) {
        int i3 = this.f1996e;
        if (i3 == 0 || i2 > this.f1994c[i3 - 1]) {
            if (this.f1993b && this.f1996e >= this.f1994c.length) {
                c();
            }
            int i4 = this.f1996e;
            if (i4 >= this.f1994c.length) {
                int b2 = c.b(i4 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.f1994c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1995d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1994c = iArr;
                this.f1995d = objArr;
            }
            this.f1994c[i4] = i2;
            this.f1995d[i4] = e2;
            this.f1996e = i4 + 1;
            return;
        }
        c(i2, e2);
    }

    public int b() {
        if (this.f1993b) {
            c();
        }
        return this.f1996e;
    }

    public int b(int i2) {
        if (this.f1993b) {
            c();
        }
        return this.f1994c[i2];
    }

    public E b(int i2, E e2) {
        int a = c.a(this.f1994c, this.f1996e, i2);
        if (a >= 0) {
            Object[] objArr = this.f1995d;
            if (objArr[a] != f1992f) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public E c(int i2) {
        if (this.f1993b) {
            c();
        }
        return (E) this.f1995d[i2];
    }

    public void c(int i2, E e2) {
        int a = c.a(this.f1994c, this.f1996e, i2);
        if (a >= 0) {
            this.f1995d[a] = e2;
            return;
        }
        int i3 = ~a;
        if (i3 < this.f1996e) {
            Object[] objArr = this.f1995d;
            if (objArr[i3] == f1992f) {
                this.f1994c[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f1993b && this.f1996e >= this.f1994c.length) {
            c();
            i3 = ~c.a(this.f1994c, this.f1996e, i2);
        }
        int i4 = this.f1996e;
        if (i4 >= this.f1994c.length) {
            int b2 = c.b(i4 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f1994c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1995d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1994c = iArr;
            this.f1995d = objArr2;
        }
        int i5 = this.f1996e;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f1994c;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            Object[] objArr4 = this.f1995d;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f1996e - i3);
        }
        this.f1994c[i3] = i2;
        this.f1995d[i3] = e2;
        this.f1996e++;
    }

    @Override // java.lang.Object
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1994c = (int[]) this.f1994c.clone();
            hVar.f1995d = (Object[]) this.f1995d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1996e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1996e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
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
