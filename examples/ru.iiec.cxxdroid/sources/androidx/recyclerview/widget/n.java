package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import c.e.d;
import c.e.g;
import c.h.k.e;
import c.h.k.f;

/* access modifiers changed from: package-private */
public class n {
    final g<RecyclerView.e0, a> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final d<RecyclerView.e0> f1725b = new d<>();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static e<a> f1726d = new f(20);
        int a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f1727b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f1728c;

        private a() {
        }

        static void a() {
            do {
            } while (f1726d.a() != null);
        }

        static void a(a aVar) {
            aVar.a = 0;
            aVar.f1727b = null;
            aVar.f1728c = null;
            f1726d.a(aVar);
        }

        static a b() {
            a a2 = f1726d.a();
            return a2 == null ? new a() : a2;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void a(RecyclerView.e0 e0Var);

        void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    n() {
    }

    private RecyclerView.m.c a(RecyclerView.e0 e0Var, int i2) {
        a d2;
        RecyclerView.m.c cVar;
        int a2 = this.a.a(e0Var);
        if (a2 >= 0 && (d2 = this.a.d(a2)) != null) {
            int i3 = d2.a;
            if ((i3 & i2) != 0) {
                d2.a = (~i2) & i3;
                if (i2 == 4) {
                    cVar = d2.f1727b;
                } else if (i2 == 8) {
                    cVar = d2.f1728c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d2.a & 12) == 0) {
                    this.a.c(a2);
                    a.a(d2);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.e0 a(long j2) {
        return this.f1725b.a(j2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.clear();
        this.f1725b.a();
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, RecyclerView.e0 e0Var) {
        this.f1725b.c(j2, e0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(e0Var, aVar);
        }
        aVar.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(e0Var, aVar);
        }
        aVar.a |= 2;
        aVar.f1727b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.m.c cVar;
        RecyclerView.m.c cVar2;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.e0 b2 = this.a.b(size);
            a c2 = this.a.c(size);
            int i2 = c2.a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = c2.f1727b;
                    if (cVar != null) {
                        cVar2 = c2.f1728c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.c(b2, c2.f1727b, c2.f1728c);
                        } else if ((i2 & 4) != 0) {
                            cVar = c2.f1727b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        a.a(c2);
                    }
                    bVar.a(b2, c2.f1727b, c2.f1728c);
                    a.a(c2);
                }
                bVar.b(b2, cVar, cVar2);
                a.a(c2);
            }
            bVar.a(b2);
            a.a(c2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(e0Var, aVar);
        }
        aVar.f1728c = cVar;
        aVar.a |= 8;
    }

    /* access modifiers changed from: package-private */
    public boolean b(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(e0Var, aVar);
        }
        aVar.f1727b = cVar;
        aVar.a |= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean c(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.e0 e0Var) {
        g(e0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.c e(RecyclerView.e0 e0Var) {
        return a(e0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.c f(RecyclerView.e0 e0Var) {
        return a(e0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void g(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(RecyclerView.e0 e0Var) {
        int b2 = this.f1725b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (e0Var == this.f1725b.c(b2)) {
                this.f1725b.b(b2);
                break;
            } else {
                b2--;
            }
        }
        a remove = this.a.remove(e0Var);
        if (remove != null) {
            a.a(remove);
        }
    }
}
