package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class b {
    final AbstractC0024b a;

    /* renamed from: b  reason: collision with root package name */
    final a f1637b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f1638c = new ArrayList();

    /* access modifiers changed from: package-private */
    public static class a {
        long a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f1639b;

        a() {
        }

        private void b() {
            if (this.f1639b == null) {
                this.f1639b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = 0;
            a aVar = this.f1639b;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.f1639b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i2);
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, boolean z) {
            if (i2 >= 64) {
                b();
                this.f1639b.a(i2 - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j2 = (1 << i2) - 1;
            long j3 = this.a;
            this.a = ((j3 & (~j2)) << 1) | (j3 & j2);
            if (z) {
                e(i2);
            } else {
                a(i2);
            }
            if (z2 || this.f1639b != null) {
                b();
                this.f1639b.a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public int b(int i2) {
            a aVar = this.f1639b;
            return aVar == null ? i2 >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.a & ((1 << i2) - 1)) : aVar.b(i2 - 64) + Long.bitCount(this.a);
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            b();
            return this.f1639b.c(i2 - 64);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i2) {
            if (i2 >= 64) {
                b();
                return this.f1639b.d(i2 - 64);
            }
            long j2 = 1 << i2;
            boolean z = (this.a & j2) != 0;
            this.a &= ~j2;
            long j3 = j2 - 1;
            long j4 = this.a;
            this.a = Long.rotateRight(j4 & (~j3), 1) | (j4 & j3);
            a aVar = this.f1639b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f1639b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            if (i2 >= 64) {
                b();
                this.f1639b.e(i2 - 64);
                return;
            }
            this.a |= 1 << i2;
        }

        public String toString() {
            if (this.f1639b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.f1639b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface AbstractC0024b {
        int a();

        View a(int i2);

        void a(View view);

        void a(View view, int i2);

        void a(View view, int i2, ViewGroup.LayoutParams layoutParams);

        RecyclerView.e0 b(View view);

        void b();

        void b(int i2);

        void c(int i2);

        void c(View view);

        int d(View view);
    }

    b(AbstractC0024b bVar) {
        this.a = bVar;
    }

    private int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int a2 = this.a.a();
        int i3 = i2;
        while (i3 < a2) {
            int b2 = i2 - (i3 - this.f1637b.b(i3));
            if (b2 == 0) {
                while (this.f1637b.c(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    private void g(View view) {
        this.f1638c.add(view);
        this.a.a(view);
    }

    private boolean h(View view) {
        if (!this.f1638c.remove(view)) {
            return false;
        }
        this.a.c(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a.a() - this.f1638c.size();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int f2 = f(i2);
        this.f1637b.d(f2);
        this.a.b(f2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        int d2 = this.a.d(view);
        if (d2 >= 0) {
            this.f1637b.e(d2);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i2 < 0 ? this.a.a() : f(i2);
        this.f1637b.a(a2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, boolean z) {
        int a2 = i2 < 0 ? this.a.a() : f(i2);
        this.f1637b.a(a2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.a.a();
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        int d2 = this.a.d(view);
        if (d2 != -1 && !this.f1637b.c(d2)) {
            return d2 - this.f1637b.b(d2);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public View b(int i2) {
        int size = this.f1638c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1638c.get(i3);
            RecyclerView.e0 b2 = this.a.b(view);
            if (!(b2.k() != i2 || b2.q() || b2.s())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View c(int i2) {
        return this.a.a(f(i2));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1637b.a();
        for (int size = this.f1638c.size() - 1; size >= 0; size--) {
            this.a.c(this.f1638c.get(size));
            this.f1638c.remove(size);
        }
        this.a.b();
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.f1638c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public View d(int i2) {
        return this.a.a(i2);
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        int d2 = this.a.d(view);
        if (d2 >= 0) {
            if (this.f1637b.d(d2)) {
                h(view);
            }
            this.a.c(d2);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i2) {
        int f2 = f(i2);
        View a2 = this.a.a(f2);
        if (a2 != null) {
            if (this.f1637b.d(f2)) {
                h(a2);
            }
            this.a.c(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        int d2 = this.a.d(view);
        if (d2 == -1) {
            h(view);
            return true;
        } else if (!this.f1637b.c(d2)) {
            return false;
        } else {
            this.f1637b.d(d2);
            h(view);
            this.a.c(d2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        int d2 = this.a.d(view);
        if (d2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1637b.c(d2)) {
            this.f1637b.a(d2);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1637b.toString() + ", hidden list:" + this.f1638c.size();
    }
}
