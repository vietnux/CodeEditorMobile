package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.p implements f, RecyclerView.a0.a {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    i u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public static class a {
        i a;

        /* renamed from: b  reason: collision with root package name */
        int f1488b;

        /* renamed from: c  reason: collision with root package name */
        int f1489c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1490d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1491e;

        a() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1489c = this.f1490d ? this.a.b() : this.a.f();
        }

        public void a(View view, int i2) {
            this.f1489c = this.f1490d ? this.a.a(view) + this.a.h() : this.a.d(view);
            this.f1488b = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.a();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1488b = -1;
            this.f1489c = Integer.MIN_VALUE;
            this.f1490d = false;
            this.f1491e = false;
        }

        public void b(View view, int i2) {
            int h2 = this.a.h();
            if (h2 >= 0) {
                a(view, i2);
                return;
            }
            this.f1488b = i2;
            if (this.f1490d) {
                int b2 = (this.a.b() - h2) - this.a.a(view);
                this.f1489c = this.a.b() - b2;
                if (b2 > 0) {
                    int b3 = this.f1489c - this.a.b(view);
                    int f2 = this.a.f();
                    int min = b3 - (f2 + Math.min(this.a.d(view) - f2, 0));
                    if (min < 0) {
                        this.f1489c += Math.min(b2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d2 = this.a.d(view);
            int f3 = d2 - this.a.f();
            this.f1489c = d2;
            if (f3 > 0) {
                int b4 = (this.a.b() - Math.min(0, (this.a.b() - h2) - this.a.a(view))) - (d2 + this.a.b(view));
                if (b4 < 0) {
                    this.f1489c -= Math.min(f3, -b4);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1488b + ", mCoordinate=" + this.f1489c + ", mLayoutFromEnd=" + this.f1490d + ", mValid=" + this.f1491e + '}';
        }
    }

    /* access modifiers changed from: protected */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1492b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1493c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1494d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = 0;
            this.f1492b = false;
            this.f1493c = false;
            this.f1494d = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        int f1495b;

        /* renamed from: c  reason: collision with root package name */
        int f1496c;

        /* renamed from: d  reason: collision with root package name */
        int f1497d;

        /* renamed from: e  reason: collision with root package name */
        int f1498e;

        /* renamed from: f  reason: collision with root package name */
        int f1499f;

        /* renamed from: g  reason: collision with root package name */
        int f1500g;

        /* renamed from: h  reason: collision with root package name */
        int f1501h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f1502i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f1503j;

        /* renamed from: k  reason: collision with root package name */
        int f1504k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.e0> f1505l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f1506m;

        c() {
        }

        private View b() {
            int size = this.f1505l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f1505l.get(i2).a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f1497d == qVar.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public View a(RecyclerView.w wVar) {
            if (this.f1505l != null) {
                return b();
            }
            View d2 = wVar.d(this.f1497d);
            this.f1497d += this.f1498e;
            return d2;
        }

        public void a() {
            a((View) null);
        }

        public void a(View view) {
            View b2 = b(view);
            this.f1497d = b2 == null ? -1 : ((RecyclerView.q) b2.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean a(RecyclerView.b0 b0Var) {
            int i2 = this.f1497d;
            return i2 >= 0 && i2 < b0Var.a();
        }

        public View b(View view) {
            int a2;
            int size = this.f1505l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f1505l.get(i3).a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a2 = (qVar.a() - this.f1497d) * this.f1498e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f1507b;

        /* renamed from: c  reason: collision with root package name */
        int f1508c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1509d;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f1507b = parcel.readInt();
            this.f1508c = parcel.readInt();
            this.f1509d = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1507b = dVar.f1507b;
            this.f1508c = dVar.f1508c;
            this.f1509d = dVar.f1509d;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f1507b >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1507b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1507b);
            parcel.writeInt(this.f1508c);
            parcel.writeInt(this.f1509d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        i(i2);
        a(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d a2 = RecyclerView.p.a(context, attributeSet, i2, i3);
        i(a2.a);
        a(a2.f1580c);
        b(a2.f1581d);
    }

    private View L() {
        return e(0, e());
    }

    private View M() {
        return e(e() - 1, -1);
    }

    private View N() {
        return this.x ? L() : M();
    }

    private View O() {
        return this.x ? M() : L();
    }

    private View P() {
        return c(this.x ? 0 : e() - 1);
    }

    private View Q() {
        return c(this.x ? e() - 1 : 0);
    }

    private void R() {
        this.x = (this.s == 1 || !I()) ? this.w : !this.w;
    }

    private int a(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z2) {
        int b2;
        int b3 = this.u.b() - i2;
        if (b3 <= 0) {
            return 0;
        }
        int i3 = -c(-b3, wVar, b0Var);
        int i4 = i2 + i3;
        if (!z2 || (b2 = this.u.b() - i4) <= 0) {
            return i3;
        }
        this.u.a(b2);
        return b2 + i3;
    }

    private void a(int i2, int i3, boolean z2, RecyclerView.b0 b0Var) {
        int i4;
        this.t.f1506m = K();
        this.t.f1499f = i2;
        int[] iArr = this.H;
        boolean z3 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        a(b0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i2 == 1) {
            z3 = true;
        }
        this.t.f1501h = z3 ? max2 : max;
        c cVar = this.t;
        if (!z3) {
            max = max2;
        }
        cVar.f1502i = max;
        int i5 = -1;
        if (z3) {
            this.t.f1501h += this.u.c();
            View P = P();
            c cVar2 = this.t;
            if (!this.x) {
                i5 = 1;
            }
            cVar2.f1498e = i5;
            c cVar3 = this.t;
            int l2 = l(P);
            c cVar4 = this.t;
            cVar3.f1497d = l2 + cVar4.f1498e;
            cVar4.f1495b = this.u.a(P);
            i4 = this.u.a(P) - this.u.b();
        } else {
            View Q = Q();
            this.t.f1501h += this.u.f();
            c cVar5 = this.t;
            if (this.x) {
                i5 = 1;
            }
            cVar5.f1498e = i5;
            c cVar6 = this.t;
            int l3 = l(Q);
            c cVar7 = this.t;
            cVar6.f1497d = l3 + cVar7.f1498e;
            cVar7.f1495b = this.u.d(Q);
            i4 = (-this.u.d(Q)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.f1496c = i3;
        if (z2) {
            cVar8.f1496c -= i4;
        }
        this.t.f1500g = i4;
    }

    private void a(a aVar) {
        f(aVar.f1488b, aVar.f1489c);
    }

    private void a(RecyclerView.w wVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    a(i4, wVar);
                }
                return;
            }
            while (i2 > i3) {
                a(i2, wVar);
                i2--;
            }
        }
    }

    private void a(RecyclerView.w wVar, c cVar) {
        if (cVar.a && !cVar.f1506m) {
            int i2 = cVar.f1500g;
            int i3 = cVar.f1502i;
            if (cVar.f1499f == -1) {
                b(wVar, i2, i3);
            } else {
                c(wVar, i2, i3);
            }
        }
    }

    private boolean a(RecyclerView.b0 b0Var, a aVar) {
        int i2;
        boolean z2 = false;
        if (!b0Var.d() && (i2 = this.A) != -1) {
            if (i2 < 0 || i2 >= b0Var.a()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f1488b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    aVar.f1490d = this.D.f1509d;
                    aVar.f1489c = aVar.f1490d ? this.u.b() - this.D.f1508c : this.u.f() + this.D.f1508c;
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View b2 = b(this.A);
                    if (b2 == null) {
                        if (e() > 0) {
                            if ((this.A < l(c(0))) == this.x) {
                                z2 = true;
                            }
                            aVar.f1490d = z2;
                        }
                        aVar.a();
                    } else if (this.u.b(b2) > this.u.g()) {
                        aVar.a();
                        return true;
                    } else if (this.u.d(b2) - this.u.f() < 0) {
                        aVar.f1489c = this.u.f();
                        aVar.f1490d = false;
                        return true;
                    } else if (this.u.b() - this.u.a(b2) < 0) {
                        aVar.f1489c = this.u.b();
                        aVar.f1490d = true;
                        return true;
                    } else {
                        aVar.f1489c = aVar.f1490d ? this.u.a(b2) + this.u.h() : this.u.d(b2);
                    }
                    return true;
                } else {
                    boolean z3 = this.x;
                    aVar.f1490d = z3;
                    aVar.f1489c = z3 ? this.u.b() - this.B : this.u.f() + this.B;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View a2;
        boolean z2 = false;
        if (e() == 0) {
            return false;
        }
        View g2 = g();
        if (g2 == null || !aVar.a(g2, b0Var)) {
            boolean z3 = this.v;
            boolean z4 = this.y;
            if (z3 != z4 || (a2 = a(wVar, b0Var, aVar.f1490d, z4)) == null) {
                return false;
            }
            aVar.a(a2, l(a2));
            if (!b0Var.d() && C()) {
                int d2 = this.u.d(a2);
                int a3 = this.u.a(a2);
                int f2 = this.u.f();
                int b2 = this.u.b();
                boolean z5 = a3 <= f2 && d2 < f2;
                if (d2 >= b2 && a3 > b2) {
                    z2 = true;
                }
                if (z5 || z2) {
                    if (aVar.f1490d) {
                        f2 = b2;
                    }
                    aVar.f1489c = f2;
                }
            }
            return true;
        }
        aVar.b(g2, l(g2));
        return true;
    }

    private int b(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z2) {
        int f2;
        int f3 = i2 - this.u.f();
        if (f3 <= 0) {
            return 0;
        }
        int i3 = -c(f3, wVar, b0Var);
        int i4 = i2 + i3;
        if (!z2 || (f2 = i4 - this.u.f()) <= 0) {
            return i3;
        }
        this.u.a(-f2);
        return i3 - f2;
    }

    private void b(a aVar) {
        g(aVar.f1488b, aVar.f1489c);
    }

    private void b(RecyclerView.w wVar, int i2, int i3) {
        int e2 = e();
        if (i2 >= 0) {
            int a2 = (this.u.a() - i2) + i3;
            if (this.x) {
                for (int i4 = 0; i4 < e2; i4++) {
                    View c2 = c(i4);
                    if (this.u.d(c2) < a2 || this.u.f(c2) < a2) {
                        a(wVar, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = e2 - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View c3 = c(i6);
                if (this.u.d(c3) < a2 || this.u.f(c3) < a2) {
                    a(wVar, i5, i6);
                    return;
                }
            }
        }
    }

    private void b(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, int i3) {
        if (b0Var.e() && e() != 0 && !b0Var.d() && C()) {
            List<RecyclerView.e0> f2 = wVar.f();
            int size = f2.size();
            int l2 = l(c(0));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                RecyclerView.e0 e0Var = f2.get(i6);
                if (!e0Var.s()) {
                    char c2 = 1;
                    if ((e0Var.k() < l2) != this.x) {
                        c2 = 65535;
                    }
                    int b2 = this.u.b(e0Var.a);
                    if (c2 == 65535) {
                        i4 += b2;
                    } else {
                        i5 += b2;
                    }
                }
            }
            this.t.f1505l = f2;
            if (i4 > 0) {
                g(l(Q()), i2);
                c cVar = this.t;
                cVar.f1501h = i4;
                cVar.f1496c = 0;
                cVar.a();
                a(wVar, this.t, b0Var, false);
            }
            if (i5 > 0) {
                f(l(P()), i3);
                c cVar2 = this.t;
                cVar2.f1501h = i5;
                cVar2.f1496c = 0;
                cVar2.a();
                a(wVar, this.t, b0Var, false);
            }
            this.t.f1505l = null;
        }
    }

    private void b(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (!a(b0Var, aVar) && !a(wVar, b0Var, aVar)) {
            aVar.a();
            aVar.f1488b = this.y ? b0Var.a() - 1 : 0;
        }
    }

    private void c(RecyclerView.w wVar, int i2, int i3) {
        if (i2 >= 0) {
            int i4 = i2 - i3;
            int e2 = e();
            if (this.x) {
                int i5 = e2 - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View c2 = c(i6);
                    if (this.u.a(c2) > i4 || this.u.e(c2) > i4) {
                        a(wVar, i5, i6);
                        return;
                    }
                }
                return;
            }
            for (int i7 = 0; i7 < e2; i7++) {
                View c3 = c(i7);
                if (this.u.a(c3) > i4 || this.u.e(c3) > i4) {
                    a(wVar, 0, i7);
                    return;
                }
            }
        }
    }

    private void f(int i2, int i3) {
        this.t.f1496c = this.u.b() - i3;
        this.t.f1498e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f1497d = i2;
        cVar.f1499f = 1;
        cVar.f1495b = i3;
        cVar.f1500g = Integer.MIN_VALUE;
    }

    private void g(int i2, int i3) {
        this.t.f1496c = i3 - this.u.f();
        c cVar = this.t;
        cVar.f1497d = i2;
        cVar.f1498e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f1499f = -1;
        cVar2.f1495b = i3;
        cVar2.f1500g = Integer.MIN_VALUE;
    }

    private int i(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        E();
        return k.a(b0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    private int j(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        E();
        return k.a(b0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z, this.x);
    }

    private int k(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        E();
        return k.b(b0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean A() {
        return (i() == 1073741824 || r() == 1073741824 || !s()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        return this.D == null && this.v == this.y;
    }

    /* access modifiers changed from: package-private */
    public c D() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (this.t == null) {
            this.t = D();
        }
    }

    public int F() {
        View a2 = a(0, e(), false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int G() {
        View a2 = a(e() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int H() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return j() == 1;
    }

    public boolean J() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return 0;
        }
        return c(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a(RecyclerView.b0 b0Var) {
        return i(b0Var);
    }

    /* access modifiers changed from: package-private */
    public int a(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z2) {
        int i2 = cVar.f1496c;
        int i3 = cVar.f1500g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f1500g = i3 + i2;
            }
            a(wVar, cVar);
        }
        int i4 = cVar.f1496c + cVar.f1501h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f1506m && i4 <= 0) || !cVar.a(b0Var)) {
                break;
            }
            bVar.a();
            a(wVar, b0Var, cVar, bVar);
            if (!bVar.f1492b) {
                cVar.f1495b += bVar.a * cVar.f1499f;
                if (!bVar.f1493c || cVar.f1505l != null || !b0Var.d()) {
                    int i5 = cVar.f1496c;
                    int i6 = bVar.a;
                    cVar.f1496c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f1500g;
                if (i7 != Integer.MIN_VALUE) {
                    cVar.f1500g = i7 + bVar.a;
                    int i8 = cVar.f1496c;
                    if (i8 < 0) {
                        cVar.f1500g += i8;
                    }
                    a(wVar, cVar);
                }
                if (z2 && bVar.f1494d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f1496c;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2, int i3, boolean z2, boolean z3) {
        E();
        int i4 = 320;
        int i5 = z2 ? 24579 : 320;
        if (!z3) {
            i4 = 0;
        }
        return (this.s == 0 ? this.f1570e : this.f1571f).a(i2, i3, i5, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View a(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int h2;
        R();
        if (e() == 0 || (h2 = h(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        E();
        a(h2, (int) (((float) this.u.g()) * 0.33333334f), false, b0Var);
        c cVar = this.t;
        cVar.f1500g = Integer.MIN_VALUE;
        cVar.a = false;
        a(wVar, cVar, b0Var, true);
        View O = h2 == -1 ? O() : N();
        View Q = h2 == -1 ? Q() : P();
        if (!Q.hasFocusable()) {
            return O;
        }
        if (O == null) {
            return null;
        }
        return Q;
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z2, boolean z3) {
        int i2;
        int i3;
        E();
        int e2 = e();
        int i4 = -1;
        if (z3) {
            i3 = e() - 1;
            i2 = -1;
        } else {
            i4 = e2;
            i3 = 0;
            i2 = 1;
        }
        int a2 = b0Var.a();
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i4) {
            View c2 = c(i3);
            int l2 = l(c2);
            int d2 = this.u.d(c2);
            int a3 = this.u.a(c2);
            if (l2 >= 0 && l2 < a2) {
                if (!((RecyclerView.q) c2.getLayoutParams()).c()) {
                    boolean z4 = a3 <= f2 && d2 < f2;
                    boolean z5 = d2 >= b2 && a3 > b2;
                    if (!z4 && !z5) {
                        return c2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = c2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = c2;
                    }
                    view2 = c2;
                } else if (view3 == null) {
                    view3 = c2;
                }
            }
            i3 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* access modifiers changed from: package-private */
    public View a(boolean z2, boolean z3) {
        int e2;
        int i2;
        if (this.x) {
            e2 = 0;
            i2 = e();
        } else {
            e2 = e() - 1;
            i2 = -1;
        }
        return a(e2, i2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i2 = i3;
        }
        if (e() != 0 && i2 != 0) {
            E();
            a(i2 > 0 ? 1 : -1, Math.abs(i2), true, b0Var);
            a(b0Var, this.t, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(int i2, RecyclerView.p.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.D;
        int i4 = -1;
        if (dVar == null || !dVar.a()) {
            R();
            z2 = this.x;
            i3 = this.A;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z2 = dVar2.f1509d;
            i3 = dVar2.f1507b;
        }
        if (!z2) {
            i4 = 1;
        }
        int i5 = i3;
        for (int i6 = 0; i6 < this.G && i5 >= 0 && i5 < i2; i6++) {
            cVar.a(i5, 0);
            i5 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            if (this.A != -1) {
                this.D.b();
            }
            y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            accessibilityEvent.setFromIndex(F());
            accessibilityEvent.setToIndex(G());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i2 = cVar.f1497d;
        if (i2 >= 0 && i2 < b0Var.a()) {
            cVar2.a(i2, Math.max(0, cVar.f1500g));
        }
    }

    /* access modifiers changed from: protected */
    public void a(RecyclerView.b0 b0Var, int[] iArr) {
        int i2;
        int h2 = h(b0Var);
        if (this.t.f1499f == -1) {
            i2 = 0;
        } else {
            i2 = h2;
            h2 = 0;
        }
        iArr[0] = h2;
        iArr[1] = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i2) {
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View a2 = cVar.a(wVar);
        if (a2 == null) {
            bVar.f1492b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) a2.getLayoutParams();
        if (cVar.f1505l == null) {
            if (this.x == (cVar.f1499f == -1)) {
                b(a2);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.x == (cVar.f1499f == -1)) {
                a(a2);
            } else {
                a(a2, 0);
            }
        }
        a(a2, 0, 0);
        bVar.a = this.u.b(a2);
        if (this.s == 1) {
            if (I()) {
                i6 = q() - o();
                i5 = i6 - this.u.c(a2);
            } else {
                i5 = n();
                i6 = this.u.c(a2) + i5;
            }
            int i7 = cVar.f1499f;
            int i8 = cVar.f1495b;
            if (i7 == -1) {
                i2 = i8;
                i3 = i6;
                i4 = i8 - bVar.a;
            } else {
                i4 = i8;
                i3 = i6;
                i2 = bVar.a + i8;
            }
        } else {
            int p = p();
            int c2 = this.u.c(a2) + p;
            int i9 = cVar.f1499f;
            int i10 = cVar.f1495b;
            if (i9 == -1) {
                i3 = i10;
                i4 = p;
                i2 = c2;
                i5 = i10 - bVar.a;
            } else {
                i4 = p;
                i3 = bVar.a + i10;
                i2 = c2;
                i5 = i10;
            }
        }
        a(a2, i5, i4, i3, i2);
        if (qVar.c() || qVar.b()) {
            bVar.f1493c = true;
        }
        bVar.f1494d = a2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(String str) {
        if (this.D == null) {
            super.a(str);
        }
    }

    public void a(boolean z2) {
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int b(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return 0;
        }
        return c(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int b(RecyclerView.b0 b0Var) {
        return j(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View b(int i2) {
        int e2 = e();
        if (e2 == 0) {
            return null;
        }
        int l2 = i2 - l(c(0));
        if (l2 >= 0 && l2 < e2) {
            View c2 = c(l2);
            if (l(c2) == i2) {
                return c2;
            }
        }
        return super.b(i2);
    }

    /* access modifiers changed from: package-private */
    public View b(boolean z2, boolean z3) {
        int i2;
        int e2;
        if (this.x) {
            i2 = e() - 1;
            e2 = -1;
        } else {
            i2 = 0;
            e2 = e();
        }
        return a(i2, e2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.b(recyclerView, wVar);
        if (this.C) {
            b(wVar);
            wVar.a();
        }
    }

    public void b(boolean z2) {
        a((String) null);
        if (this.y != z2) {
            this.y = z2;
            y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean b() {
        return this.s == 1;
    }

    /* access modifiers changed from: package-private */
    public int c(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (e() == 0 || i2 == 0) {
            return 0;
        }
        E();
        this.t.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        a(i3, abs, true, b0Var);
        c cVar = this.t;
        int a2 = cVar.f1500g + a(wVar, cVar, b0Var, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i2 = i3 * a2;
        }
        this.u.a(-i2);
        this.t.f1504k = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int c(RecyclerView.b0 b0Var) {
        return k(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q c() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int d(RecyclerView.b0 b0Var) {
        return i(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int e(RecyclerView.b0 b0Var) {
        return j(b0Var);
    }

    /* access modifiers changed from: package-private */
    public View e(int i2, int i3) {
        int i4;
        int i5;
        E();
        if ((i3 > i2 ? 1 : i3 < i2 ? (char) 65535 : 0) == 0) {
            return c(i2);
        }
        if (this.u.d(c(i2)) < this.u.f()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        return (this.s == 0 ? this.f1570e : this.f1571f).a(i2, i3, i5, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View b2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.a() == 0) {
            b(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f1507b;
        }
        E();
        this.t.a = false;
        R();
        View g2 = g();
        if (!this.E.f1491e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.f1490d = this.x ^ this.y;
            b(wVar, b0Var, aVar);
            this.E.f1491e = true;
        } else if (g2 != null && (this.u.d(g2) >= this.u.b() || this.u.a(g2) <= this.u.f())) {
            this.E.b(g2, l(g2));
        }
        c cVar = this.t;
        cVar.f1499f = cVar.f1504k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        a(b0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.f();
        int max2 = Math.max(0, this.H[1]) + this.u.c();
        if (!(!b0Var.d() || (i7 = this.A) == -1 || this.B == Integer.MIN_VALUE || (b2 = b(i7)) == null)) {
            if (this.x) {
                i8 = this.u.b() - this.u.a(b2);
                i9 = this.B;
            } else {
                i9 = this.u.d(b2) - this.u.f();
                i8 = this.B;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        if (!this.E.f1490d ? !this.x : this.x) {
            i10 = 1;
        }
        a(wVar, b0Var, this.E, i10);
        a(wVar);
        this.t.f1506m = K();
        this.t.f1503j = b0Var.d();
        this.t.f1502i = 0;
        a aVar2 = this.E;
        if (aVar2.f1490d) {
            b(aVar2);
            c cVar2 = this.t;
            cVar2.f1501h = max;
            a(wVar, cVar2, b0Var, false);
            c cVar3 = this.t;
            i3 = cVar3.f1495b;
            int i12 = cVar3.f1497d;
            int i13 = cVar3.f1496c;
            if (i13 > 0) {
                max2 += i13;
            }
            a(this.E);
            c cVar4 = this.t;
            cVar4.f1501h = max2;
            cVar4.f1497d += cVar4.f1498e;
            a(wVar, cVar4, b0Var, false);
            c cVar5 = this.t;
            i2 = cVar5.f1495b;
            int i14 = cVar5.f1496c;
            if (i14 > 0) {
                g(i12, i3);
                c cVar6 = this.t;
                cVar6.f1501h = i14;
                a(wVar, cVar6, b0Var, false);
                i3 = this.t.f1495b;
            }
        } else {
            a(aVar2);
            c cVar7 = this.t;
            cVar7.f1501h = max2;
            a(wVar, cVar7, b0Var, false);
            c cVar8 = this.t;
            i2 = cVar8.f1495b;
            int i15 = cVar8.f1497d;
            int i16 = cVar8.f1496c;
            if (i16 > 0) {
                max += i16;
            }
            b(this.E);
            c cVar9 = this.t;
            cVar9.f1501h = max;
            cVar9.f1497d += cVar9.f1498e;
            a(wVar, cVar9, b0Var, false);
            c cVar10 = this.t;
            i3 = cVar10.f1495b;
            int i17 = cVar10.f1496c;
            if (i17 > 0) {
                f(i15, i2);
                c cVar11 = this.t;
                cVar11.f1501h = i17;
                a(wVar, cVar11, b0Var, false);
                i2 = this.t.f1495b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int a2 = a(i2, wVar, b0Var, true);
                i5 = i3 + a2;
                i4 = i2 + a2;
                i6 = b(i5, wVar, b0Var, false);
            } else {
                int b3 = b(i3, wVar, b0Var, true);
                i5 = i3 + b3;
                i4 = i2 + b3;
                i6 = a(i4, wVar, b0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        b(wVar, b0Var, i3, i2);
        if (!b0Var.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int f(RecyclerView.b0 b0Var) {
        return k(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(RecyclerView.b0 b0Var) {
        super.g(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.b();
    }

    /* access modifiers changed from: package-private */
    public int h(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && I()) ? -1 : 1 : (this.s != 1 && I()) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int h(RecyclerView.b0 b0Var) {
        if (b0Var.c()) {
            return this.u.g();
        }
        return 0;
    }

    public void i(int i2) {
        if (i2 == 0 || i2 == 1) {
            a((String) null);
            if (i2 != this.s || this.u == null) {
                this.u = i.a(this, i2);
                this.E.a = this.u;
                this.s = i2;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable x() {
        d dVar = this.D;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (e() > 0) {
            E();
            boolean z2 = this.v ^ this.x;
            dVar2.f1509d = z2;
            if (z2) {
                View P = P();
                dVar2.f1508c = this.u.b() - this.u.a(P);
                dVar2.f1507b = l(P);
            } else {
                View Q = Q();
                dVar2.f1507b = l(Q);
                dVar2.f1508c = this.u.d(Q) - this.u.f();
            }
        } else {
            dVar2.b();
        }
        return dVar2;
    }
}
