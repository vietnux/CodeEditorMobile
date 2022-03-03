package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import c.h.k.e;
import c.h.k.f;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class a implements h.a {
    private e<b> a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f1627b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f1628c;

    /* renamed from: d  reason: collision with root package name */
    final AbstractC0023a f1629d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f1630e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f1631f;

    /* renamed from: g  reason: collision with root package name */
    final h f1632g;

    /* renamed from: h  reason: collision with root package name */
    private int f1633h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0023a {
        RecyclerView.e0 a(int i2);

        void a(int i2, int i3);

        void a(int i2, int i3, Object obj);

        void a(b bVar);

        void b(int i2, int i3);

        void b(b bVar);

        void c(int i2, int i3);

        void d(int i2, int i3);
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        int a;

        /* renamed from: b  reason: collision with root package name */
        int f1634b;

        /* renamed from: c  reason: collision with root package name */
        Object f1635c;

        /* renamed from: d  reason: collision with root package name */
        int f1636d;

        b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.f1634b = i3;
            this.f1636d = i4;
            this.f1635c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i2 = this.a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f1636d - this.f1634b) == 1 && this.f1636d == bVar.f1634b && this.f1634b == bVar.f1636d) {
                return true;
            }
            if (this.f1636d != bVar.f1636d || this.f1634b != bVar.f1634b) {
                return false;
            }
            Object obj2 = this.f1635c;
            Object obj3 = bVar.f1635c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f1634b) * 31) + this.f1636d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1634b + "c:" + this.f1636d + ",p:" + this.f1635c + "]";
        }
    }

    a(AbstractC0023a aVar) {
        this(aVar, false);
    }

    a(AbstractC0023a aVar, boolean z) {
        this.a = new f(30);
        this.f1627b = new ArrayList<>();
        this.f1628c = new ArrayList<>();
        this.f1633h = 0;
        this.f1629d = aVar;
        this.f1631f = z;
        this.f1632g = new h(this);
    }

    private void b(b bVar) {
        g(bVar);
    }

    private void c(b bVar) {
        g(bVar);
    }

    private int d(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        for (int size = this.f1628c.size() - 1; size >= 0; size--) {
            b bVar = this.f1628c.get(size);
            int i8 = bVar.a;
            if (i8 == 8) {
                int i9 = bVar.f1634b;
                int i10 = bVar.f1636d;
                if (i9 >= i10) {
                    i10 = i9;
                    i9 = i10;
                }
                if (i2 < i9 || i2 > i10) {
                    int i11 = bVar.f1634b;
                    if (i2 < i11) {
                        if (i3 == 1) {
                            bVar.f1634b = i11 + 1;
                            i5 = bVar.f1636d + 1;
                        } else if (i3 == 2) {
                            bVar.f1634b = i11 - 1;
                            i5 = bVar.f1636d - 1;
                        }
                        bVar.f1636d = i5;
                    }
                } else {
                    int i12 = bVar.f1634b;
                    if (i9 == i12) {
                        if (i3 == 1) {
                            i7 = bVar.f1636d + 1;
                        } else {
                            if (i3 == 2) {
                                i7 = bVar.f1636d - 1;
                            }
                            i2++;
                        }
                        bVar.f1636d = i7;
                        i2++;
                    } else {
                        if (i3 == 1) {
                            i6 = i12 + 1;
                        } else {
                            if (i3 == 2) {
                                i6 = i12 - 1;
                            }
                            i2--;
                        }
                        bVar.f1634b = i6;
                        i2--;
                    }
                }
            } else {
                int i13 = bVar.f1634b;
                if (i13 > i2) {
                    if (i3 == 1) {
                        i4 = i13 + 1;
                    } else if (i3 == 2) {
                        i4 = i13 - 1;
                    }
                    bVar.f1634b = i4;
                } else if (i8 == 1) {
                    i2 -= bVar.f1636d;
                } else if (i8 == 2) {
                    i2 += bVar.f1636d;
                }
            }
        }
        for (int size2 = this.f1628c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1628c.get(size2);
            if (bVar2.a == 8) {
                int i14 = bVar2.f1636d;
                if (i14 != bVar2.f1634b && i14 >= 0) {
                }
            } else if (bVar2.f1636d > 0) {
            }
            this.f1628c.remove(size2);
            a(bVar2);
        }
        return i2;
    }

    private void d(b bVar) {
        char c2;
        boolean z;
        int i2 = bVar.f1634b;
        int i3 = bVar.f1636d + i2;
        int i4 = 0;
        char c3 = 65535;
        int i5 = i2;
        while (i5 < i3) {
            if (this.f1629d.a(i5) != null || d(i5)) {
                if (c3 == 0) {
                    f(a(2, i2, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    g(a(2, i2, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i5 -= i4;
                i3 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i5++;
            c3 = c2;
        }
        if (i4 != bVar.f1636d) {
            a(bVar);
            bVar = a(2, i2, i4, null);
        }
        if (c3 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private boolean d(int i2) {
        int size = this.f1628c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1628c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (a(bVar.f1636d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f1634b;
                int i6 = bVar.f1636d + i5;
                while (i5 < i6) {
                    if (a(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void e(b bVar) {
        int i2 = bVar.f1634b;
        int i3 = bVar.f1636d + i2;
        int i4 = i2;
        int i5 = 0;
        char c2 = 65535;
        while (i2 < i3) {
            if (this.f1629d.a(i2) != null || d(i2)) {
                if (c2 == 0) {
                    f(a(4, i4, i5, bVar.f1635c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    g(a(4, i4, i5, bVar.f1635c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f1636d) {
            Object obj = bVar.f1635c;
            a(bVar);
            bVar = a(4, i4, i5, obj);
        }
        if (c2 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private void f(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d2 = d(bVar.f1634b, i3);
        int i4 = bVar.f1634b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i6 = d2;
        int i7 = i4;
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f1636d; i9++) {
            int d3 = d(bVar.f1634b + (i2 * i9), bVar.a);
            int i10 = bVar.a;
            if (i10 == 2 ? d3 == i6 : i10 == 4 && d3 == i6 + 1) {
                i8++;
            } else {
                b a2 = a(bVar.a, i6, i8, bVar.f1635c);
                a(a2, i7);
                a(a2);
                if (bVar.a == 4) {
                    i7 += i8;
                }
                i6 = d3;
                i8 = 1;
            }
        }
        Object obj = bVar.f1635c;
        a(bVar);
        if (i8 > 0) {
            b a3 = a(bVar.a, i6, i8, obj);
            a(a3, i7);
            a(a3);
        }
    }

    private void g(b bVar) {
        this.f1628c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            this.f1629d.c(bVar.f1634b, bVar.f1636d);
        } else if (i2 == 2) {
            this.f1629d.b(bVar.f1634b, bVar.f1636d);
        } else if (i2 == 4) {
            this.f1629d.a(bVar.f1634b, bVar.f1636d, bVar.f1635c);
        } else if (i2 == 8) {
            this.f1629d.a(bVar.f1634b, bVar.f1636d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public int a(int i2) {
        int size = this.f1627b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1627b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f1634b;
                    if (i5 <= i2) {
                        int i6 = bVar.f1636d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f1634b;
                    if (i7 == i2) {
                        i2 = bVar.f1636d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f1636d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f1634b <= i2) {
                i2 += bVar.f1636d;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, int i3) {
        int size = this.f1628c.size();
        while (i3 < size) {
            b bVar = this.f1628c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f1634b;
                if (i5 == i2) {
                    i2 = bVar.f1636d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f1636d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f1634b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f1636d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f1636d;
                }
            }
            i3++;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i2, int i3, int i4, Object obj) {
        b a2 = this.a.a();
        if (a2 == null) {
            return new b(i2, i3, i4, obj);
        }
        a2.a = i2;
        a2.f1634b = i3;
        a2.f1636d = i4;
        a2.f1635c = obj;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int size = this.f1628c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1629d.a(this.f1628c.get(i2));
        }
        a(this.f1628c);
        this.f1633h = 0;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (!this.f1631f) {
            bVar.f1635c = null;
            this.a.a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, int i2) {
        this.f1629d.b(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            this.f1629d.d(i2, bVar.f1636d);
        } else if (i3 == 4) {
            this.f1629d.a(i2, bVar.f1636d, bVar.f1635c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f1627b.add(a(4, i2, i3, obj));
        this.f1633h |= 4;
        return this.f1627b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public int b(int i2) {
        return a(i2, 0);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a();
        int size = this.f1627b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1627b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                this.f1629d.a(bVar);
                this.f1629d.c(bVar.f1634b, bVar.f1636d);
            } else if (i3 == 2) {
                this.f1629d.a(bVar);
                this.f1629d.d(bVar.f1634b, bVar.f1636d);
            } else if (i3 == 4) {
                this.f1629d.a(bVar);
                this.f1629d.a(bVar.f1634b, bVar.f1636d, bVar.f1635c);
            } else if (i3 == 8) {
                this.f1629d.a(bVar);
                this.f1629d.a(bVar.f1634b, bVar.f1636d);
            }
            Runnable runnable = this.f1630e;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f1627b);
        this.f1633h = 0;
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1627b.add(a(1, i2, i3, null));
        this.f1633h |= 1;
        return this.f1627b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f1627b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        return (i2 & this.f1633h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1627b.add(a(2, i2, i3, null));
        this.f1633h |= 2;
        return this.f1627b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return !this.f1628c.isEmpty() && !this.f1627b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f1632g.a(this.f1627b);
        int size = this.f1627b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1627b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                b(bVar);
            } else if (i3 == 2) {
                d(bVar);
            } else if (i3 == 4) {
                e(bVar);
            } else if (i3 == 8) {
                c(bVar);
            }
            Runnable runnable = this.f1630e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1627b.clear();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a(this.f1627b);
        a(this.f1628c);
        this.f1633h = 0;
    }
}
