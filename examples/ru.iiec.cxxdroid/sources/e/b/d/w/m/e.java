package e.b.d.w.m;

import e.b.d.g;
import e.b.d.l;
import e.b.d.m;
import e.b.d.o;
import e.b.d.y.b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public final class e extends e.b.d.y.a {
    private static final Object v = new Object();
    private Object[] r;
    private int s;
    private String[] t;
    private int[] u;

    static class a extends Reader {
        a() {
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    private Object E() {
        return this.r[this.s - 1];
    }

    private Object F() {
        Object[] objArr = this.r;
        int i2 = this.s - 1;
        this.s = i2;
        Object obj = objArr[i2];
        objArr[this.s] = null;
        return obj;
    }

    private void a(b bVar) {
        if (B() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + B() + t());
        }
    }

    private void a(Object obj) {
        int i2 = this.s;
        Object[] objArr = this.r;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[(i2 * 2)];
            int[] iArr = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.u, 0, iArr, 0, this.s);
            System.arraycopy(this.t, 0, strArr, 0, this.s);
            this.r = objArr2;
            this.u = iArr;
            this.t = strArr;
        }
        Object[] objArr3 = this.r;
        int i3 = this.s;
        this.s = i3 + 1;
        objArr3[i3] = obj;
    }

    @Override // e.b.d.y.a
    private String t() {
        return " at path " + q();
    }

    @Override // e.b.d.y.a
    public String A() {
        b B = B();
        if (B == b.STRING || B == b.NUMBER) {
            String n = ((o) F()).n();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + b.STRING + " but was " + B + t());
    }

    @Override // e.b.d.y.a
    public b B() {
        if (this.s == 0) {
            return b.END_DOCUMENT;
        }
        Object E = E();
        if (E instanceof Iterator) {
            boolean z = this.r[this.s - 2] instanceof m;
            Iterator it = (Iterator) E;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            a(it.next());
            return B();
        } else if (E instanceof m) {
            return b.BEGIN_OBJECT;
        } else {
            if (E instanceof g) {
                return b.BEGIN_ARRAY;
            }
            if (E instanceof o) {
                o oVar = (o) E;
                if (oVar.u()) {
                    return b.STRING;
                }
                if (oVar.o()) {
                    return b.BOOLEAN;
                }
                if (oVar.t()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (E instanceof l) {
                return b.NULL;
            } else {
                if (E == v) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // e.b.d.y.a
    public void C() {
        if (B() == b.NAME) {
            y();
            this.t[this.s - 2] = "null";
        } else {
            F();
            int i2 = this.s;
            if (i2 > 0) {
                this.t[i2 - 1] = "null";
            }
        }
        int i3 = this.s;
        if (i3 > 0) {
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public void D() {
        a(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E()).next();
        a(entry.getValue());
        a(new o((String) entry.getKey()));
    }

    @Override // e.b.d.y.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r = new Object[]{v};
        this.s = 1;
    }

    @Override // e.b.d.y.a
    public void l() {
        a(b.BEGIN_ARRAY);
        a(((g) E()).iterator());
        this.u[this.s - 1] = 0;
    }

    @Override // e.b.d.y.a
    public void m() {
        a(b.BEGIN_OBJECT);
        a(((m) E()).h().iterator());
    }

    @Override // e.b.d.y.a
    public void o() {
        a(b.END_ARRAY);
        F();
        F();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.b.d.y.a
    public void p() {
        a(b.END_OBJECT);
        F();
        F();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.b.d.y.a
    public String q() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.s) {
            Object[] objArr = this.r;
            if (objArr[i2] instanceof g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof m) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.t;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // e.b.d.y.a
    public boolean r() {
        b B = B();
        return (B == b.END_OBJECT || B == b.END_ARRAY) ? false : true;
    }

    @Override // e.b.d.y.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // e.b.d.y.a
    public boolean u() {
        a(b.BOOLEAN);
        boolean h2 = ((o) F()).h();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return h2;
    }

    @Override // e.b.d.y.a
    public double v() {
        b B = B();
        if (B == b.NUMBER || B == b.STRING) {
            double j2 = ((o) E()).j();
            if (s() || (!Double.isNaN(j2) && !Double.isInfinite(j2))) {
                F();
                int i2 = this.s;
                if (i2 > 0) {
                    int[] iArr = this.u;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return j2;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j2);
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + B + t());
    }

    @Override // e.b.d.y.a
    public int w() {
        b B = B();
        if (B == b.NUMBER || B == b.STRING) {
            int k2 = ((o) E()).k();
            F();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return k2;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + B + t());
    }

    @Override // e.b.d.y.a
    public long x() {
        b B = B();
        if (B == b.NUMBER || B == b.STRING) {
            long l2 = ((o) E()).l();
            F();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return l2;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + B + t());
    }

    @Override // e.b.d.y.a
    public String y() {
        a(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E()).next();
        String str = (String) entry.getKey();
        this.t[this.s - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // e.b.d.y.a
    public void z() {
        a(b.NULL);
        F();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }
}
