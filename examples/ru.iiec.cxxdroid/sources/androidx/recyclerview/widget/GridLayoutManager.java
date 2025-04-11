package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.h.l.l0.d;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int a(int i2) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int d(int i2, int i3) {
            return i2 % i3;
        }
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f1483e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1484f = 0;

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int e() {
            return this.f1483e;
        }

        public int f() {
            return this.f1484f;
        }
    }

    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f1485b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f1486c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1487d = false;

        static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        public abstract int a(int i2);

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3) {
            if (!this.f1487d) {
                return c(i2, i3);
            }
            int i4 = this.f1485b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int c2 = c(i2, i3);
            this.f1485b.put(i2, c2);
            return c2;
        }

        public void a() {
            this.f1485b.clear();
        }

        /* access modifiers changed from: package-private */
        public int b(int i2, int i3) {
            if (!this.f1486c) {
                return d(i2, i3);
            }
            int i4 = this.a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int d2 = d(i2, i3);
            this.a.put(i2, d2);
            return d2;
        }

        public void b() {
            this.a.clear();
        }

        public int c(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int a2;
            if (!this.f1487d || (a2 = a(this.f1485b, i2)) == -1) {
                i6 = 0;
                i5 = 0;
                i4 = 0;
            } else {
                i5 = this.f1485b.get(a2);
                i4 = a2 + 1;
                i6 = a(a2) + b(a2, i3);
                if (i6 == i3) {
                    i5++;
                    i6 = 0;
                }
            }
            int a3 = a(i2);
            while (i4 < i2) {
                int a4 = a(i4);
                i6 += a4;
                if (i6 == i3) {
                    i5++;
                    i6 = 0;
                } else if (i6 > i3) {
                    i5++;
                    i6 = a4;
                }
                i4++;
            }
            return i6 + a3 > i3 ? i5 + 1 : i5;
        }

        public abstract int d(int i2, int i3);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        j(RecyclerView.p.a(context, attributeSet, i2, i3).f1579b);
    }

    private void L() {
        int e2 = e();
        for (int i2 = 0; i2 < e2; i2++) {
            b bVar = (b) c(i2).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void M() {
        this.M.clear();
        this.N.clear();
    }

    private void N() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private void O() {
        int i2;
        int i3;
        if (H() == 1) {
            i3 = q() - o();
            i2 = n();
        } else {
            i3 = h() - m();
            i2 = p();
        }
        k(i3 - i2);
    }

    private int a(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.d()) {
            return this.O.a(i2, this.J);
        }
        int a2 = wVar.a(i2);
        if (a2 != -1) {
            return this.O.a(a2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private void a(float f2, int i2) {
        k(Math.max(Math.round(f2 * ((float) this.J)), i2));
    }

    private void a(View view, int i2, int i3, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? b(view, i2, i3, qVar) : a(view, i2, i3, qVar)) {
            view.measure(i2, i3);
        }
    }

    private void a(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1582b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int f2 = f(bVar.f1483e, bVar.f1484f);
        if (this.s == 1) {
            i3 = RecyclerView.p.a(f2, i2, i6, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i4 = RecyclerView.p.a(this.u.g(), i(), i5, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int a2 = RecyclerView.p.a(f2, i2, i5, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int a3 = RecyclerView.p.a(this.u.g(), r(), i6, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i4 = a2;
            i3 = a3;
        }
        a(view, i3, i4, z);
    }

    private void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i2 - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.L[i4];
            b bVar = (b) view.getLayoutParams();
            bVar.f1484f = c(wVar, b0Var, l(view));
            bVar.f1483e = i5;
            i5 += bVar.f1484f;
            i4 += i3;
        }
    }

    static int[] a(int[] iArr, int i2, int i3) {
        int i4;
        if (!(iArr != null && iArr.length == i2 + 1 && iArr[iArr.length - 1] == i3)) {
            iArr = new int[(i2 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private int b(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.d()) {
            return this.O.b(i2, this.J);
        }
        int i3 = this.N.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = wVar.a(i2);
        if (a2 != -1) {
            return this.O.b(a2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private void b(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
        boolean z = i2 == 1;
        int b2 = b(wVar, b0Var, aVar.f1488b);
        if (z) {
            while (b2 > 0) {
                int i3 = aVar.f1488b;
                if (i3 > 0) {
                    aVar.f1488b = i3 - 1;
                    b2 = b(wVar, b0Var, aVar.f1488b);
                } else {
                    return;
                }
            }
            return;
        }
        int a2 = b0Var.a() - 1;
        int i4 = aVar.f1488b;
        while (i4 < a2) {
            int i5 = i4 + 1;
            int b3 = b(wVar, b0Var, i5);
            if (b3 <= b2) {
                break;
            }
            i4 = i5;
            b2 = b3;
        }
        aVar.f1488b = i4;
    }

    private int c(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.d()) {
            return this.O.a(i2);
        }
        int i3 = this.M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = wVar.a(i2);
        if (a2 != -1) {
            return this.O.a(a2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private int i(RecyclerView.b0 b0Var) {
        if (!(e() == 0 || b0Var.a() == 0)) {
            E();
            boolean J2 = J();
            View b2 = b(!J2, true);
            View a2 = a(!J2, true);
            if (!(b2 == null || a2 == null)) {
                int a3 = this.O.a(l(b2), this.J);
                int a4 = this.O.a(l(a2), this.J);
                int min = Math.min(a3, a4);
                int max = this.x ? Math.max(0, ((this.O.a(b0Var.a() - 1, this.J) + 1) - Math.max(a3, a4)) - 1) : Math.max(0, min);
                if (!J2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.u.a(a2) - this.u.d(b2))) / ((float) ((this.O.a(l(a2), this.J) - this.O.a(l(b2), this.J)) + 1)))) + ((float) (this.u.f() - this.u.d(b2))));
            }
        }
        return 0;
    }

    private int j(RecyclerView.b0 b0Var) {
        if (!(e() == 0 || b0Var.a() == 0)) {
            E();
            View b2 = b(!J(), true);
            View a2 = a(!J(), true);
            if (!(b2 == null || a2 == null)) {
                if (!J()) {
                    return this.O.a(b0Var.a() - 1, this.J) + 1;
                }
                int a3 = this.u.a(a2) - this.u.d(b2);
                int a4 = this.O.a(l(b2), this.J);
                return (int) ((((float) a3) / ((float) ((this.O.a(l(a2), this.J) - a4) + 1))) * ((float) (this.O.a(b0Var.a() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void k(int i2) {
        this.K = a(this.K, this.J, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public boolean C() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int a(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        O();
        N();
        return super.a(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (b0Var.a() < 1) {
            return 0;
        }
        return a(wVar, b0Var, b0Var.a() - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View a(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
        int i2;
        int e2 = e();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i2 = e() - 1;
            i4 = -1;
        } else {
            i3 = e2;
            i2 = 0;
        }
        int a2 = b0Var.a();
        E();
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View c2 = c(i2);
            int l2 = l(c2);
            if (l2 >= 0 && l2 < a2 && b(wVar, b0Var, l2) == 0) {
                if (((RecyclerView.q) c2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = c2;
                    }
                } else if (this.u.d(c2) < b2 && this.u.a(c2) >= f2) {
                    return c2;
                } else {
                    if (view == null) {
                        view = c2;
                    }
                }
            }
            i2 += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.K == null) {
            super.a(rect, i2, i3);
        }
        int n = n() + o();
        int p = p() + m();
        if (this.s == 1) {
            i5 = RecyclerView.p.a(i3, rect.height() + p, k());
            int[] iArr = this.K;
            i4 = RecyclerView.p.a(i2, iArr[iArr.length - 1] + n, l());
        } else {
            i4 = RecyclerView.p.a(i2, rect.width() + n, l());
            int[] iArr2 = this.K;
            i5 = RecyclerView.p.a(i3, iArr2[iArr2.length - 1] + p, k());
        }
        c(i4, i5);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i2 = this.J;
        for (int i3 = 0; i3 < this.J && cVar.a(b0Var) && i2 > 0; i3++) {
            int i4 = cVar.f1497d;
            cVar2.a(i4, Math.max(0, cVar.f1500g));
            i2 -= this.O.a(i4);
            cVar.f1497d += cVar.f1498e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, d dVar) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int a2 = a(wVar, b0Var, bVar.a());
        if (this.s == 0) {
            i5 = bVar.e();
            i4 = bVar.f();
            i2 = 1;
            z2 = false;
            z = false;
            i3 = a2;
        } else {
            i4 = 1;
            i3 = bVar.e();
            i2 = bVar.f();
            z2 = false;
            z = false;
            i5 = a2;
        }
        dVar.b(d.c.a(i5, i4, i3, i2, z2, z));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
        super.a(wVar, b0Var, aVar, i2);
        O();
        if (b0Var.a() > 0 && !b0Var.d()) {
            b(wVar, b0Var, aVar, i2);
        }
        N();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.recyclerview.widget.RecyclerView.w r19, androidx.recyclerview.widget.RecyclerView.b0 r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
        /*
        // Method dump skipped, instructions count: 568
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int b(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        O();
        N();
        return super.b(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int b(RecyclerView.b0 b0Var) {
        return this.Q ? i(b0Var) : super.b(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int b(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (b0Var.a() < 1) {
            return 0;
        }
        return a(wVar, b0Var, b0Var.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, int i2, int i3) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void b(boolean z) {
        if (!z) {
            super.b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int c(RecyclerView.b0 b0Var) {
        return this.Q ? j(b0Var) : super.c(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.q c() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(RecyclerView recyclerView) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int e(RecyclerView.b0 b0Var) {
        return this.Q ? i(b0Var) : super.e(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public void e(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            L();
        }
        super.e(wVar, b0Var);
        M();
    }

    /* access modifiers changed from: package-private */
    public int f(int i2, int i3) {
        if (this.s != 1 || !I()) {
            int[] iArr = this.K;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.K;
        int i4 = this.J;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public int f(RecyclerView.b0 b0Var) {
        return this.Q ? j(b0Var) : super.f(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p, androidx.recyclerview.widget.LinearLayoutManager
    public void g(RecyclerView.b0 b0Var) {
        super.g(b0Var);
        this.I = false;
    }

    public void j(int i2) {
        if (i2 != this.J) {
            this.I = true;
            if (i2 >= 1) {
                this.J = i2;
                this.O.b();
                y();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }
}
