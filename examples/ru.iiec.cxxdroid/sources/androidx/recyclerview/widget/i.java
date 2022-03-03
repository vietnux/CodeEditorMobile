package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class i {
    protected final RecyclerView.p a;

    /* renamed from: b  reason: collision with root package name */
    private int f1713b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1714c;

    /* access modifiers changed from: package-private */
    public class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int a() {
            return this.a.q();
        }

        @Override // androidx.recyclerview.widget.i
        public int a(View view) {
            return this.a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public void a(int i2) {
            this.a.d(i2);
        }

        @Override // androidx.recyclerview.widget.i
        public int b() {
            return this.a.q() - this.a.o();
        }

        @Override // androidx.recyclerview.widget.i
        public int b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.h(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int c() {
            return this.a.o();
        }

        @Override // androidx.recyclerview.widget.i
        public int c(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.g(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int d() {
            return this.a.r();
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e() {
            return this.a.i();
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            this.a.a(view, true, this.f1714c);
            return this.f1714c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int f() {
            return this.a.n();
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            this.a.a(view, true, this.f1714c);
            return this.f1714c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public int g() {
            return (this.a.q() - this.a.n()) - this.a.o();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int a() {
            return this.a.h();
        }

        @Override // androidx.recyclerview.widget.i
        public int a(View view) {
            return this.a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public void a(int i2) {
            this.a.e(i2);
        }

        @Override // androidx.recyclerview.widget.i
        public int b() {
            return this.a.h() - this.a.m();
        }

        @Override // androidx.recyclerview.widget.i
        public int b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.g(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int c() {
            return this.a.m();
        }

        @Override // androidx.recyclerview.widget.i
        public int c(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.h(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int d() {
            return this.a.i();
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e() {
            return this.a.r();
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            this.a.a(view, true, this.f1714c);
            return this.f1714c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int f() {
            return this.a.p();
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            this.a.a(view, true, this.f1714c);
            return this.f1714c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public int g() {
            return (this.a.h() - this.a.p()) - this.a.m();
        }
    }

    private i(RecyclerView.p pVar) {
        this.f1713b = Integer.MIN_VALUE;
        this.f1714c = new Rect();
        this.a = pVar;
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i a(RecyclerView.p pVar, int i2) {
        if (i2 == 0) {
            return a(pVar);
        }
        if (i2 == 1) {
            return b(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i b(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i2);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f1713b) {
            return 0;
        }
        return g() - this.f1713b;
    }

    public void i() {
        this.f1713b = g();
    }
}
