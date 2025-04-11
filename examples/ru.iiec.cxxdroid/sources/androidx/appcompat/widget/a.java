package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a.j;
import c.h.l.b0;
import c.h.l.g0;
import c.h.l.h0;

/* access modifiers changed from: package-private */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final C0010a f526b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f527c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuView f528d;

    /* renamed from: e  reason: collision with root package name */
    protected c f529e;

    /* renamed from: f  reason: collision with root package name */
    protected int f530f;

    /* renamed from: g  reason: collision with root package name */
    protected g0 f531g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f532h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f533i;

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0010a implements h0 {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        int f534b;

        protected C0010a() {
        }

        public C0010a a(g0 g0Var, int i2) {
            a.this.f531g = g0Var;
            this.f534b = i2;
            return this;
        }

        @Override // c.h.l.h0
        public void a(View view) {
            this.a = true;
        }

        @Override // c.h.l.h0
        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f531g = null;
                a.super.setVisibility(this.f534b);
            }
        }

        @Override // c.h.l.h0
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }
    }

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        this.f526b = new C0010a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(c.a.a.actionBarPopupTheme, typedValue, true) || (i3 = typedValue.resourceId) == 0) {
            this.f527c = context;
        } else {
            this.f527c = new ContextThemeWrapper(context, i3);
        }
    }

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public g0 a(int i2, long j2) {
        g0 g0Var = this.f531g;
        if (g0Var != null) {
            g0Var.a();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            g0 a = b0.a(this);
            a.a(1.0f);
            a.a(j2);
            C0010a aVar = this.f526b;
            aVar.a(a, i2);
            a.a(aVar);
            return a;
        }
        g0 a2 = b0.a(this);
        a2.a(0.0f);
        a2.a(j2);
        C0010a aVar2 = this.f526b;
        aVar2.a(a2, i2);
        a2.a(aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f531g != null ? this.f526b.f534b : getVisibility();
    }

    public int getContentHeight() {
        return this.f530f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.ActionBar, c.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f529e;
        if (cVar != null) {
            cVar.a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f533i = false;
        }
        if (!this.f533i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f533i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f533i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f532h = false;
        }
        if (!this.f532h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f532h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f532h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            g0 g0Var = this.f531g;
            if (g0Var != null) {
                g0Var.a();
            }
            super.setVisibility(i2);
        }
    }
}
