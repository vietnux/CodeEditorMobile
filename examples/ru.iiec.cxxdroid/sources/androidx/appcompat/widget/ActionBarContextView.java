package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.a.f;
import c.a.g;
import c.a.j;
import c.a.o.b;
import c.h.l.b0;

public class ActionBarContextView extends a {

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f425j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f426k;

    /* renamed from: l  reason: collision with root package name */
    private View f427l;

    /* renamed from: m  reason: collision with root package name */
    private View f428m;
    private View n;
    private LinearLayout o;
    private TextView p;
    private TextView q;
    private int r;
    private int s;
    private boolean t;
    private int u;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f429b;

        a(ActionBarContextView actionBarContextView, b bVar) {
            this.f429b = bVar;
        }

        public void onClick(View view) {
            this.f429b.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0 a2 = w0.a(context, attributeSet, j.ActionMode, i2, 0);
        b0.a(this, a2.b(j.ActionMode_background));
        this.r = a2.g(j.ActionMode_titleTextStyle, 0);
        this.s = a2.g(j.ActionMode_subtitleTextStyle, 0);
        this.f530f = a2.f(j.ActionMode_height, 0);
        this.u = a2.g(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        a2.b();
    }

    private void e() {
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            this.o = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = (TextView) this.o.findViewById(f.action_bar_title);
            this.q = (TextView) this.o.findViewById(f.action_bar_subtitle);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.f425j);
        this.q.setText(this.f426k);
        boolean z = !TextUtils.isEmpty(this.f425j);
        boolean z2 = !TextUtils.isEmpty(this.f426k);
        int i2 = 0;
        this.q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    public void a() {
        if (this.f427l == null) {
            c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.a.o.b r4) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.a(c.a.o.b):void");
    }

    public boolean b() {
        return this.t;
    }

    public void c() {
        removeAllViews();
        this.n = null;
        this.f528d = null;
        this.f529e = null;
        View view = this.f428m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean d() {
        c cVar = this.f529e;
        if (cVar != null) {
            return cVar.j();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f426k;
    }

    public CharSequence getTitle() {
        return this.f425j;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f529e;
        if (cVar != null) {
            cVar.f();
            this.f529e.g();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f425j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        boolean a2 = c1.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f427l;
        if (view == null || view.getVisibility() == 8) {
            i6 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f427l.getLayoutParams();
            int i7 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a3 = a.a(paddingRight, i7, a2);
            i6 = a.a(a3 + a(this.f427l, a3, paddingTop, paddingTop2, a2), i8, a2);
        }
        LinearLayout linearLayout = this.o;
        if (!(linearLayout == null || this.n != null || linearLayout.getVisibility() == 8)) {
            i6 += a(this.o, i6, paddingTop, paddingTop2, a2);
        }
        View view2 = this.n;
        if (view2 != null) {
            a(view2, i6, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f528d;
        if (actionMenuView != null) {
            a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f530f;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.f427l;
            if (view != null) {
                int a2 = a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f427l.getLayoutParams();
                paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f528d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a(this.f528d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.o;
            if (linearLayout != null && this.n == null) {
                if (this.t) {
                    this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.o.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.o.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i8 = layoutParams.width;
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                int i9 = layoutParams.height;
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f530f <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f530f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (!(view == null || (linearLayout = this.o) == null)) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f426k = charSequence;
        e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f425j = charSequence;
        e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
