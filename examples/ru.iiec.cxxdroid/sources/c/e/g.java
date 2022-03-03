package c.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static Object[] f1985e;

    /* renamed from: f  reason: collision with root package name */
    static int f1986f;

    /* renamed from: g  reason: collision with root package name */
    static Object[] f1987g;

    /* renamed from: h  reason: collision with root package name */
    static int f1988h;

    /* renamed from: b  reason: collision with root package name */
    int[] f1989b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f1990c;

    /* renamed from: d  reason: collision with root package name */
    int f1991d;

    public g() {
        this.f1989b = c.a;
        this.f1990c = c.f1958c;
        this.f1991d = 0;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f1989b = c.a;
            this.f1990c = c.f1958c;
        } else {
            e(i2);
        }
        this.f1991d = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            a((g) gVar);
        }
    }

    private static int a(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f1988h < 10) {
                    objArr[0] = f1987g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1987g = objArr;
                    f1988h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f1986f < 10) {
                    objArr[0] = f1985e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1985e = objArr;
                    f1986f++;
                }
            }
        }
    }

    private void e(int i2) {
        if (i2 == 8) {
            synchronized (g.class) {
                if (f1987g != null) {
                    Object[] objArr = f1987g;
                    this.f1990c = objArr;
                    f1987g = (Object[]) objArr[0];
                    this.f1989b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1988h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (g.class) {
                if (f1985e != null) {
                    Object[] objArr2 = f1985e;
                    this.f1990c = objArr2;
                    f1985e = (Object[]) objArr2[0];
                    this.f1989b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1986f--;
                    return;
                }
            }
        }
        this.f1989b = new int[i2];
        this.f1990c = new Object[(i2 << 1)];
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int i2 = this.f1991d;
        if (i2 == 0) {
            return -1;
        }
        int a = a(this.f1989b, i2, 0);
        if (a < 0 || this.f1990c[a << 1] == null) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1989b[i3] == 0) {
            if (this.f1990c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1989b[i4] == 0) {
            if (this.f1990c[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int a(Object obj, int i2) {
        int i3 = this.f1991d;
        if (i3 == 0) {
            return -1;
        }
        int a = a(this.f1989b, i3, i2);
        if (a < 0 || obj.equals(this.f1990c[a << 1])) {
            return a;
        }
        int i4 = a + 1;
        while (i4 < i3 && this.f1989b[i4] == i2) {
            if (obj.equals(this.f1990c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = a - 1;
        while (i5 >= 0 && this.f1989b[i5] == i2) {
            if (obj.equals(this.f1990c[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public V a(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1990c;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public void a(int i2) {
        int i3 = this.f1991d;
        int[] iArr = this.f1989b;
        if (iArr.length < i2) {
            Object[] objArr = this.f1990c;
            e(i2);
            if (this.f1991d > 0) {
                System.arraycopy(iArr, 0, this.f1989b, 0, i3);
                System.arraycopy(objArr, 0, this.f1990c, 0, i3 << 1);
            }
            a(iArr, objArr, i3);
        }
        if (this.f1991d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: c.e.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(g<? extends K, ? extends V> gVar) {
        int i2 = gVar.f1991d;
        a(this.f1991d + i2);
        if (this.f1991d != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(gVar.b(i3), gVar.d(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(gVar.f1989b, 0, this.f1989b, 0, i2);
            System.arraycopy(gVar.f1990c, 0, this.f1990c, 0, i2 << 1);
            this.f1991d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public int b(Object obj) {
        int i2 = this.f1991d * 2;
        Object[] objArr = this.f1990c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public K b(int i2) {
        return (K) this.f1990c[i2 << 1];
    }

    public V c(int i2) {
        int i3;
        Object[] objArr = this.f1990c;
        int i4 = i2 << 1;
        V v = (V) objArr[i4 + 1];
        int i5 = this.f1991d;
        if (i5 <= 1) {
            a(this.f1989b, objArr, i5);
            this.f1989b = c.a;
            this.f1990c = c.f1958c;
            i3 = 0;
        } else {
            i3 = i5 - 1;
            int[] iArr = this.f1989b;
            int i6 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i2 < i3) {
                    int[] iArr2 = this.f1989b;
                    int i7 = i2 + 1;
                    int i8 = i3 - i2;
                    System.arraycopy(iArr2, i7, iArr2, i2, i8);
                    Object[] objArr2 = this.f1990c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i4, i8 << 1);
                }
                Object[] objArr3 = this.f1990c;
                int i9 = i3 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i5 > 8) {
                    i6 = i5 + (i5 >> 1);
                }
                int[] iArr3 = this.f1989b;
                Object[] objArr4 = this.f1990c;
                e(i6);
                if (i5 == this.f1991d) {
                    if (i2 > 0) {
                        System.arraycopy(iArr3, 0, this.f1989b, 0, i2);
                        System.arraycopy(objArr4, 0, this.f1990c, 0, i4);
                    }
                    if (i2 < i3) {
                        int i10 = i2 + 1;
                        int i11 = i3 - i2;
                        System.arraycopy(iArr3, i10, this.f1989b, i2, i11);
                        System.arraycopy(objArr4, i10 << 1, this.f1990c, i4, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i5 == this.f1991d) {
            this.f1991d = i3;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i2 = this.f1991d;
        if (i2 > 0) {
            int[] iArr = this.f1989b;
            Object[] objArr = this.f1990c;
            this.f1989b = c.a;
            this.f1990c = c.f1958c;
            this.f1991d = 0;
            a(iArr, objArr, i2);
        }
        if (this.f1991d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i2) {
        return (V) this.f1990c[(i2 << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1991d; i2++) {
                try {
                    K b2 = b(i2);
                    V d2 = d(i2);
                    Object obj2 = gVar.get(b2);
                    if (d2 == null) {
                        if (obj2 != null || !gVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1991d; i3++) {
                try {
                    K b3 = b(i3);
                    V d3 = d(i3);
                    Object obj3 = map.get(b3);
                    if (d3 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!d3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a = a(obj);
        return a >= 0 ? (V) this.f1990c[(a << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f1989b;
        Object[] objArr = this.f1990c;
        int i2 = this.f1991d;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < i2) {
            Object obj = objArr[i5];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i5 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f1991d <= 0;
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f1991d;
        if (k2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = a(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f1990c;
            V v2 = (V) objArr[i5];
            objArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        if (i4 >= this.f1989b.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            int[] iArr = this.f1989b;
            Object[] objArr2 = this.f1990c;
            e(i7);
            if (i4 == this.f1991d) {
                int[] iArr2 = this.f1989b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1990c, 0, objArr2.length);
                }
                a(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f1989b;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f1990c;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f1991d - i6) << 1);
        }
        int i9 = this.f1991d;
        if (i4 == i9) {
            int[] iArr4 = this.f1989b;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f1990c;
                int i10 = i6 << 1;
                objArr4[i10] = k2;
                objArr4[i10 + 1] = v;
                this.f1991d = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return c(a);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        V d2 = d(a);
        if (obj2 != d2 && (obj2 == null || !obj2.equals(d2))) {
            return false;
        }
        c(a);
        return true;
    }

    public V replace(K k2, V v) {
        int a = a((Object) k2);
        if (a >= 0) {
            return a(a, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int a = a((Object) k2);
        if (a < 0) {
            return false;
        }
        V d2 = d(a);
        if (d2 != v && (v == null || !v.equals(d2))) {
            return false;
        }
        a(a, v2);
        return true;
    }

    public int size() {
        return this.f1991d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1991d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1991d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K b2 = b(i2);
            if (b2 != this) {
                sb.append((Object) b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d2 = d(i2);
            if (d2 != this) {
                sb.append((Object) d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
