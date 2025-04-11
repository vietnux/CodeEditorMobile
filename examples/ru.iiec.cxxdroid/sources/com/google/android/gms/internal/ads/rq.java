package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public final class rq implements jt {
    private final oq a;

    /* renamed from: b  reason: collision with root package name */
    private int f5456b;

    /* renamed from: c  reason: collision with root package name */
    private int f5457c;

    /* renamed from: d  reason: collision with root package name */
    private int f5458d = 0;

    private rq(oq oqVar) {
        or.a((Object) oqVar, "input");
        this.a = oqVar;
        this.a.f5188c = this;
    }

    public static rq a(oq oqVar) {
        rq rqVar = oqVar.f5188c;
        return rqVar != null ? rqVar : new rq(oqVar);
    }

    private final void a(int i2) {
        if ((this.f5456b & 7) != i2) {
            throw sr.g();
        }
    }

    private final void a(List<String> list, boolean z) {
        int d2;
        int d3;
        if ((this.f5456b & 7) != 2) {
            throw sr.g();
        } else if (!(list instanceof cs) || z) {
            do {
                list.add(z ? m() : i());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.f5456b);
            this.f5458d = d2;
        } else {
            cs csVar = (cs) list;
            do {
                csVar.a(p());
                if (!this.a.s()) {
                    d3 = this.a.d();
                } else {
                    return;
                }
            } while (d3 == this.f5456b);
            this.f5458d = d3;
        }
    }

    private static void b(int i2) {
        if ((i2 & 7) != 0) {
            throw sr.h();
        }
    }

    private final <T> T c(kt<T> ktVar, zq zqVar) {
        int m2 = this.a.m();
        oq oqVar = this.a;
        if (oqVar.a < oqVar.f5187b) {
            int c2 = oqVar.c(m2);
            T a2 = ktVar.a();
            this.a.a++;
            ktVar.a(a2, this, zqVar);
            ktVar.c(a2);
            this.a.a(0);
            oq oqVar2 = this.a;
            oqVar2.a--;
            oqVar2.d(c2);
            return a2;
        }
        throw new sr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void c(int i2) {
        if ((i2 & 3) != 0) {
            throw sr.h();
        }
    }

    private final <T> T d(kt<T> ktVar, zq zqVar) {
        int i2 = this.f5457c;
        this.f5457c = ((this.f5456b >>> 3) << 3) | 4;
        try {
            T a2 = ktVar.a();
            ktVar.a(a2, this, zqVar);
            ktVar.c(a2);
            if (this.f5456b == this.f5457c) {
                return a2;
            }
            throw sr.h();
        } finally {
            this.f5457c = i2;
        }
    }

    private final void d(int i2) {
        if (this.a.t() != i2) {
            throw sr.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final long a() {
        a(0);
        return this.a.e();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final <T> T a(kt<T> ktVar, zq zqVar) {
        a(3);
        return (T) d(ktVar, zqVar);
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void a(List<fq> list) {
        int d2;
        if ((this.f5456b & 7) == 2) {
            do {
                list.add(p());
                if (!this.a.s()) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == this.f5456b);
            this.f5458d = d2;
            return;
        }
        throw sr.g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.jt
    public final <T> void a(List<T> list, kt<T> ktVar, zq zqVar) {
        int d2;
        int i2 = this.f5456b;
        if ((i2 & 7) == 2) {
            do {
                list.add(c(ktVar, zqVar));
                if (!this.a.s() && this.f5458d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i2);
            this.f5458d = d2;
            return;
        }
        throw sr.g();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int b() {
        a(5);
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final <T> T b(kt<T> ktVar, zq zqVar) {
        a(2);
        return (T) c(ktVar, zqVar);
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void b(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    nrVar.d(this.a.g());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    nrVar.d(this.a.g());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.g()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.jt
    public final <T> void b(List<T> list, kt<T> ktVar, zq zqVar) {
        int d2;
        int i2 = this.f5456b;
        if ((i2 & 7) == 3) {
            do {
                list.add(d(ktVar, zqVar));
                if (!this.a.s() && this.f5458d == 0) {
                    d2 = this.a.d();
                } else {
                    return;
                }
            } while (d2 == i2);
            this.f5458d = d2;
            return;
        }
        throw sr.g();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int c() {
        return this.f5456b;
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void c(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    nrVar.d(this.a.q());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    nrVar.d(this.a.q());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int d() {
        a(0);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void d(List<Double> list) {
        int d2;
        int d3;
        if (list instanceof vq) {
            vq vqVar = (vq) list;
            int i2 = this.f5456b & 7;
            if (i2 == 1) {
                do {
                    vqVar.a(this.a.a());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t = this.a.t() + m2;
                do {
                    vqVar.a(this.a.a());
                } while (this.a.t() < t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(this.a.a()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int m3 = this.a.m();
                b(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.t() < t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void e(List<String> list) {
        a(list, true);
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final boolean e() {
        int i2;
        if (this.a.s() || (i2 = this.f5456b) == this.f5457c) {
            return false;
        }
        return this.a.b(i2);
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int f() {
        a(0);
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void f(List<Boolean> list) {
        int d2;
        int d3;
        if (list instanceof dq) {
            dq dqVar = (dq) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    dqVar.a(this.a.j());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    dqVar.a(this.a.j());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.j()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Boolean.valueOf(this.a.j()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final long g() {
        a(0);
        return this.a.f();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void g(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    nrVar.d(this.a.n());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    nrVar.d(this.a.n());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void h(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    hsVar.a(this.a.f());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    hsVar.a(this.a.f());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.f()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.f()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final boolean h() {
        a(0);
        return this.a.j();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final String i() {
        a(2);
        return this.a.c();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void i(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    hsVar.a(this.a.r());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    hsVar.a(this.a.r());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int j() {
        a(0);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void j(List<String> list) {
        a(list, false);
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final long k() {
        a(0);
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void k(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t = this.a.t() + m2;
                do {
                    nrVar.d(this.a.i());
                } while (this.a.t() < t);
            } else if (i2 == 5) {
                do {
                    nrVar.d(this.a.i());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 2) {
                int m3 = this.a.m();
                c(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Integer.valueOf(this.a.i()));
                } while (this.a.t() < t2);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.i()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int l() {
        a(0);
        return this.a.g();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void l(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t = this.a.t() + m2;
                do {
                    nrVar.d(this.a.o());
                } while (this.a.t() < t);
            } else if (i2 == 5) {
                do {
                    nrVar.d(this.a.o());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 2) {
                int m3 = this.a.m();
                c(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.t() < t2);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final String m() {
        a(2);
        return this.a.k();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void m(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    hsVar.a(this.a.e());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    hsVar.a(this.a.e());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.e()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int n() {
        a(5);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void n(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 0) {
                do {
                    nrVar.d(this.a.m());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int t = this.a.t() + this.a.m();
                do {
                    nrVar.d(this.a.m());
                } while (this.a.t() < t);
                d(t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.m()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int t2 = this.a.t() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.t() < t2);
                d(t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final long o() {
        a(1);
        return this.a.h();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void o(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            int i2 = this.f5456b & 7;
            if (i2 == 1) {
                do {
                    hsVar.a(this.a.h());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t = this.a.t() + m2;
                do {
                    hsVar.a(this.a.h());
                } while (this.a.t() < t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.h()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int m3 = this.a.m();
                b(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Long.valueOf(this.a.h()));
                } while (this.a.t() < t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final fq p() {
        a(2);
        return this.a.l();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void p(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            int i2 = this.f5456b & 7;
            if (i2 == 1) {
                do {
                    hsVar.a(this.a.p());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int t = this.a.t() + m2;
                do {
                    hsVar.a(this.a.p());
                } while (this.a.t() < t);
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else if (i3 == 2) {
                int m3 = this.a.m();
                b(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.t() < t2);
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final long q() {
        a(1);
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final void q(List<Float> list) {
        int d2;
        int d3;
        if (list instanceof kr) {
            kr krVar = (kr) list;
            int i2 = this.f5456b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int t = this.a.t() + m2;
                do {
                    krVar.a(this.a.b());
                } while (this.a.t() < t);
            } else if (i2 == 5) {
                do {
                    krVar.a(this.a.b());
                    if (!this.a.s()) {
                        d3 = this.a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5456b);
                this.f5458d = d3;
            } else {
                throw sr.g();
            }
        } else {
            int i3 = this.f5456b & 7;
            if (i3 == 2) {
                int m3 = this.a.m();
                c(m3);
                int t2 = this.a.t() + m3;
                do {
                    list.add(Float.valueOf(this.a.b()));
                } while (this.a.t() < t2);
            } else if (i3 == 5) {
                do {
                    list.add(Float.valueOf(this.a.b()));
                    if (!this.a.s()) {
                        d2 = this.a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5456b);
                this.f5458d = d2;
            } else {
                throw sr.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final int r() {
        int i2 = this.f5458d;
        if (i2 != 0) {
            this.f5456b = i2;
            this.f5458d = 0;
        } else {
            this.f5456b = this.a.d();
        }
        int i3 = this.f5456b;
        if (i3 == 0 || i3 == this.f5457c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final double readDouble() {
        a(1);
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.ads.jt
    public final float readFloat() {
        a(5);
        return this.a.b();
    }
}
