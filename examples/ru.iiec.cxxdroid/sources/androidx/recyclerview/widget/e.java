package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    static final ThreadLocal<e> f1692f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    static Comparator<c> f1693g = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f1694b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    long f1695c;

    /* renamed from: d  reason: collision with root package name */
    long f1696d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<c> f1697e = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f1703d == null) != (cVar2.f1703d == null)) {
                return cVar.f1703d == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = cVar2.f1701b - cVar.f1701b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f1702c - cVar2.f1702c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.p.c {
        int a;

        /* renamed from: b  reason: collision with root package name */
        int f1698b;

        /* renamed from: c  reason: collision with root package name */
        int[] f1699c;

        /* renamed from: d  reason: collision with root package name */
        int f1700d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f1699c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1700d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.f1700d * 2;
                int[] iArr = this.f1699c;
                if (iArr == null) {
                    this.f1699c = new int[4];
                    Arrays.fill(this.f1699c, -1);
                } else if (i4 >= iArr.length) {
                    this.f1699c = new int[(i4 * 2)];
                    System.arraycopy(iArr, 0, this.f1699c, 0, iArr.length);
                }
                int[] iArr2 = this.f1699c;
                iArr2[i4] = i2;
                iArr2[i4 + 1] = i3;
                this.f1700d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, boolean z) {
            this.f1700d = 0;
            int[] iArr = this.f1699c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.n;
            if (recyclerView.f1521m != null && pVar != null && pVar.v()) {
                if (z) {
                    if (!recyclerView.f1513e.c()) {
                        pVar.a(recyclerView.f1521m.b(), this);
                    }
                } else if (!recyclerView.j()) {
                    pVar.a(this.a, this.f1698b, recyclerView.j0, this);
                }
                int i2 = this.f1700d;
                if (i2 > pVar.f1578m) {
                    pVar.f1578m = i2;
                    pVar.n = z;
                    recyclerView.f1511c.j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2) {
            if (this.f1699c != null) {
                int i3 = this.f1700d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f1699c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            this.a = i2;
            this.f1698b = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f1701b;

        /* renamed from: c  reason: collision with root package name */
        public int f1702c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1703d;

        /* renamed from: e  reason: collision with root package name */
        public int f1704e;

        c() {
        }

        public void a() {
            this.a = false;
            this.f1701b = 0;
            this.f1702c = 0;
            this.f1703d = null;
            this.f1704e = 0;
        }
    }

    e() {
    }

    private RecyclerView.e0 a(RecyclerView recyclerView, int i2, long j2) {
        if (a(recyclerView, i2)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f1511c;
        try {
            recyclerView.q();
            RecyclerView.e0 a2 = wVar.a(i2, false, j2);
            if (a2 != null) {
                if (!a2.p() || a2.q()) {
                    wVar.a(a2, false);
                } else {
                    wVar.b(a2.a);
                }
            }
            return a2;
        } finally {
            recyclerView.a(false);
        }
    }

    private void a() {
        c cVar;
        int size = this.f1694b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f1694b.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.i0.a(recyclerView, false);
                i2 += recyclerView.i0.f1700d;
            }
        }
        this.f1697e.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f1694b.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.i0;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.f1698b);
                int i6 = i4;
                for (int i7 = 0; i7 < bVar.f1700d * 2; i7 += 2) {
                    if (i6 >= this.f1697e.size()) {
                        cVar = new c();
                        this.f1697e.add(cVar);
                    } else {
                        cVar = this.f1697e.get(i6);
                    }
                    int i8 = bVar.f1699c[i7 + 1];
                    cVar.a = i8 <= abs;
                    cVar.f1701b = abs;
                    cVar.f1702c = i8;
                    cVar.f1703d = recyclerView2;
                    cVar.f1704e = bVar.f1699c[i7];
                    i6++;
                }
                i4 = i6;
            }
        }
        Collections.sort(this.f1697e, f1693g);
    }

    private void a(RecyclerView recyclerView, long j2) {
        if (recyclerView != null) {
            if (recyclerView.F && recyclerView.f1514f.b() != 0) {
                recyclerView.t();
            }
            b bVar = recyclerView.i0;
            bVar.a(recyclerView, true);
            if (bVar.f1700d != 0) {
                try {
                    c.h.h.c.a("RV Nested Prefetch");
                    recyclerView.j0.a(recyclerView.f1521m);
                    for (int i2 = 0; i2 < bVar.f1700d * 2; i2 += 2) {
                        a(recyclerView, bVar.f1699c[i2], j2);
                    }
                } finally {
                    c.h.h.c.a();
                }
            }
        }
    }

    private void a(c cVar, long j2) {
        RecyclerView.e0 a2 = a(cVar.f1703d, cVar.f1704e, cVar.a ? Long.MAX_VALUE : j2);
        if (a2 != null && a2.f1543b != null && a2.p() && !a2.q()) {
            a(a2.f1543b.get(), j2);
        }
    }

    static boolean a(RecyclerView recyclerView, int i2) {
        int b2 = recyclerView.f1514f.b();
        for (int i3 = 0; i3 < b2; i3++) {
            RecyclerView.e0 m2 = RecyclerView.m(recyclerView.f1514f.d(i3));
            if (m2.f1544c == i2 && !m2.q()) {
                return true;
            }
        }
        return false;
    }

    private void b(long j2) {
        for (int i2 = 0; i2 < this.f1697e.size(); i2++) {
            c cVar = this.f1697e.get(i2);
            if (cVar.f1703d != null) {
                a(cVar, j2);
                cVar.a();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        a();
        b(j2);
    }

    public void a(RecyclerView recyclerView) {
        this.f1694b.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f1695c == 0) {
            this.f1695c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.i0.b(i2, i3);
    }

    public void b(RecyclerView recyclerView) {
        this.f1694b.remove(recyclerView);
    }

    public void run() {
        try {
            c.h.h.c.a("RV Prefetch");
            if (!this.f1694b.isEmpty()) {
                int size = this.f1694b.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f1694b.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    a(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1696d);
                    this.f1695c = 0;
                    c.h.h.c.a();
                }
            }
        } finally {
            this.f1695c = 0;
            c.h.h.c.a();
        }
    }
}
