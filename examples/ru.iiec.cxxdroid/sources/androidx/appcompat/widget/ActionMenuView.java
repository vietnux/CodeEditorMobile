package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.h0;

public class ActionMenuView extends h0 implements g.b, o {
    private int A;
    e B;
    private g q;
    private Context r;
    private int s;
    private boolean t;
    private c u;
    private n.a v;
    g.a w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
        boolean b();

        boolean c();
    }

    /* access modifiers changed from: private */
    public static class b implements n.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(g gVar) {
            return false;
        }
    }

    public static class c extends h0.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f444b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f445c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f446d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f447e;

        /* renamed from: f  reason: collision with root package name */
        boolean f448f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }
    }

    /* access modifiers changed from: private */
    public class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.r = context;
        this.s = 0;
    }

    static int a(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.d();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.a || !z3) {
            z2 = false;
        }
        cVar.f446d = z2;
        cVar.f444b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 615
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.c(int, int):void");
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(g gVar) {
        this.q = gVar;
    }

    public void a(n.a aVar, g.a aVar2) {
        this.v = aVar;
        this.w = aVar2;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.q.a(jVar, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public void d() {
        c cVar = this.u;
        if (cVar != null) {
            cVar.d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public c e() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.a = true;
        return generateDefaultLayoutParams;
    }

    public boolean f() {
        c cVar = this.u;
        return cVar != null && cVar.f();
    }

    public boolean g() {
        c cVar = this.u;
        return cVar != null && cVar.h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0, androidx.appcompat.widget.h0
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.h0, androidx.appcompat.widget.h0, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0, androidx.appcompat.widget.h0, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            this.q = new g(context);
            this.q.a(new d());
            this.u = new c(context);
            this.u.c(true);
            c cVar = this.u;
            n.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.a(aVar);
            this.q.a(this.u, this.r);
            this.u.a(this);
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.e();
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean h() {
        c cVar = this.u;
        return cVar != null && cVar.i();
    }

    public boolean i() {
        return this.t;
    }

    public g j() {
        return this.q;
    }

    public boolean k() {
        c cVar = this.u;
        return cVar != null && cVar.j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.u;
        if (cVar != null) {
            cVar.a(false);
            if (this.u.i()) {
                this.u.f();
                this.u.j();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (!this.x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i4 - i2;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = c1.a(this);
        int i12 = paddingRight;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        i9 = i8 + measuredWidth;
                    } else {
                        i9 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i8 = i9 - measuredWidth;
                    }
                    int i16 = i10 - (measuredHeight / 2);
                    childAt.layout(i8, i16, i9, measuredHeight + i16);
                    i12 -= measuredWidth;
                    i13 = 1;
                } else {
                    i12 -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    d(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i11 / 2) - (measuredWidth2 / 2);
            int i18 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        if (i19 > 0) {
            i6 = i12 / i19;
            i7 = 0;
        } else {
            i7 = 0;
            i6 = 0;
        }
        int max = Math.max(i7, i6);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            while (i7 < childCount) {
                View childAt3 = getChildAt(i7);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i20 = width - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
                i7++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i7 < childCount) {
            View childAt4 = getChildAt(i7);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = i22 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
            i7++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0
    public void onMeasure(int i2, int i3) {
        g gVar;
        boolean z2 = this.x;
        this.x = View.MeasureSpec.getMode(i2) == 1073741824;
        if (z2 != this.x) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.x || (gVar = this.q) == null || size == this.y)) {
            this.y = size;
            gVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        c(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.u.b(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.u.a(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.t = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.s != i2) {
            this.s = i2;
            if (i2 == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.u = cVar;
        this.u.a(this);
    }
}
