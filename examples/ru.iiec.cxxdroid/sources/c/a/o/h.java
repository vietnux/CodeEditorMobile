package c.a.o;

import android.view.View;
import android.view.animation.Interpolator;
import c.h.l.g0;
import c.h.l.h0;
import c.h.l.i0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    final ArrayList<g0> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f1861b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f1862c;

    /* renamed from: d  reason: collision with root package name */
    h0 f1863d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1864e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f1865f = new a();

    class a extends i0 {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1866b = 0;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1866b = 0;
            this.a = false;
            h.this.b();
        }

        @Override // c.h.l.h0
        public void b(View view) {
            int i2 = this.f1866b + 1;
            this.f1866b = i2;
            if (i2 == h.this.a.size()) {
                h0 h0Var = h.this.f1863d;
                if (h0Var != null) {
                    h0Var.b(null);
                }
                a();
            }
        }

        @Override // c.h.l.h0, c.h.l.i0
        public void c(View view) {
            if (!this.a) {
                this.a = true;
                h0 h0Var = h.this.f1863d;
                if (h0Var != null) {
                    h0Var.c(null);
                }
            }
        }
    }

    public h a(long j2) {
        if (!this.f1864e) {
            this.f1861b = j2;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.f1864e) {
            this.f1862c = interpolator;
        }
        return this;
    }

    public h a(g0 g0Var) {
        if (!this.f1864e) {
            this.a.add(g0Var);
        }
        return this;
    }

    public h a(g0 g0Var, g0 g0Var2) {
        this.a.add(g0Var);
        g0Var2.b(g0Var.b());
        this.a.add(g0Var2);
        return this;
    }

    public h a(h0 h0Var) {
        if (!this.f1864e) {
            this.f1863d = h0Var;
        }
        return this;
    }

    public void a() {
        if (this.f1864e) {
            Iterator<g0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f1864e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1864e = false;
    }

    public void c() {
        if (!this.f1864e) {
            Iterator<g0> it = this.a.iterator();
            while (it.hasNext()) {
                g0 next = it.next();
                long j2 = this.f1861b;
                if (j2 >= 0) {
                    next.a(j2);
                }
                Interpolator interpolator = this.f1862c;
                if (interpolator != null) {
                    next.a(interpolator);
                }
                if (this.f1863d != null) {
                    next.a(this.f1865f);
                }
                next.c();
            }
            this.f1864e = true;
        }
    }
}
