package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class l extends RecyclerView.m {

    /* renamed from: g  reason: collision with root package name */
    boolean f1719g = true;

    public final void a(RecyclerView.e0 e0Var, boolean z) {
        c(e0Var, z);
        b(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var) {
        return !this.f1719g || e0Var.q();
    }

    public abstract boolean a(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5);

    public abstract boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.f1566b;
        if (e0Var2.A()) {
            int i6 = cVar.a;
            i2 = cVar.f1566b;
            i3 = i6;
        } else {
            i3 = cVar2.a;
            i2 = cVar2.f1566b;
        }
        return a(e0Var, e0Var2, i4, i5, i3, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        return (cVar == null || (cVar.a == cVar2.a && cVar.f1566b == cVar2.f1566b)) ? f(e0Var) : a(e0Var, cVar.a, cVar.f1566b, cVar2.a, cVar2.f1566b);
    }

    public final void b(RecyclerView.e0 e0Var, boolean z) {
        d(e0Var, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar.f1566b;
        View view = e0Var.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1566b;
        if (e0Var.s() || (i2 == left && i3 == top)) {
            return g(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(e0Var, i2, i3, left, top);
    }

    public void c(RecyclerView.e0 e0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        if (cVar.a != cVar2.a || cVar.f1566b != cVar2.f1566b) {
            return a(e0Var, cVar.a, cVar.f1566b, cVar2.a, cVar2.f1566b);
        }
        j(e0Var);
        return false;
    }

    public void d(RecyclerView.e0 e0Var, boolean z) {
    }

    public abstract boolean f(RecyclerView.e0 e0Var);

    public abstract boolean g(RecyclerView.e0 e0Var);

    public final void h(RecyclerView.e0 e0Var) {
        n(e0Var);
        b(e0Var);
    }

    public final void i(RecyclerView.e0 e0Var) {
        o(e0Var);
    }

    public final void j(RecyclerView.e0 e0Var) {
        p(e0Var);
        b(e0Var);
    }

    public final void k(RecyclerView.e0 e0Var) {
        q(e0Var);
    }

    public final void l(RecyclerView.e0 e0Var) {
        r(e0Var);
        b(e0Var);
    }

    public final void m(RecyclerView.e0 e0Var) {
        s(e0Var);
    }

    public void n(RecyclerView.e0 e0Var) {
    }

    public void o(RecyclerView.e0 e0Var) {
    }

    public void p(RecyclerView.e0 e0Var) {
    }

    public void q(RecyclerView.e0 e0Var) {
    }

    public void r(RecyclerView.e0 e0Var) {
    }

    public void s(RecyclerView.e0 e0Var) {
    }
}
