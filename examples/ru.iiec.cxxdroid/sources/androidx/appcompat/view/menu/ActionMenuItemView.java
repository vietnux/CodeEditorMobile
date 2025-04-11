package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.y;
import androidx.appcompat.widget.y0;
import c.a.j;

public class ActionMenuItemView extends y implements o.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    j f267g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f268h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f269i;

    /* renamed from: j  reason: collision with root package name */
    g.b f270j;

    /* renamed from: k  reason: collision with root package name */
    private g0 f271k;

    /* renamed from: l  reason: collision with root package name */
    b f272l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f273m;
    private boolean n;
    private int o;
    private int p;
    private int q;

    private class a extends g0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.g0
        public q a() {
            b bVar = ActionMenuItemView.this.f272l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.g0
        public boolean b() {
            q a;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f270j;
            return bVar != null && bVar.a(actionMenuItemView.f267g) && (a = a()) != null && a.f();
        }
    }

    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f273m = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i2, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f268h);
        if (this.f269i != null && (!this.f267g.n() || (!this.f273m && !this.n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f268h : null);
        CharSequence contentDescription = this.f267g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f267g.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f267g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f267g.getTitle();
            }
            y0.a(this, charSequence);
            return;
        }
        y0.a(this, tooltipText);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void a(j jVar, int i2) {
        this.f267g = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.a(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f271k == null) {
            this.f271k = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f267g.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f267g;
    }

    public void onClick(View view) {
        g.b bVar = this.f270j;
        if (bVar != null) {
            bVar.a(this.f267g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f273m = e();
        f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.y
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean d2 = d();
        if (d2 && (i4 = this.p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.o) : this.o;
        if (mode != 1073741824 && this.o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d2 && this.f269i != null) {
            super.setPadding((getMeasuredWidth() - this.f269i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var;
        if (!this.f267g.hasSubMenu() || (g0Var = this.f271k) == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.n != z) {
            this.n = z;
            j jVar = this.f267g;
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f269i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.q;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.q;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f270j = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.p = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f272l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f268h = charSequence;
        f();
    }
}
