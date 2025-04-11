package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.y0;
import androidx.core.widget.i;
import c.h.l.b0;
import c.h.l.c;
import c.h.l.l0.d;
import e.b.b.b.e;
import e.b.b.b.f;
import e.b.b.b.h;

public class NavigationMenuItemView extends e implements o.a {
    private static final int[] G = {16842912};
    private FrameLayout A;
    private j B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final c F;
    private final int w;
    private boolean x;
    boolean y;
    private final CheckedTextView z;

    class a extends c {
        a() {
        }

        @Override // c.h.l.c
        public void a(View view, d dVar) {
            super.a(view, dVar);
            dVar.b(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.F = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, (ViewGroup) this, true);
        this.w = context.getResources().getDimensionPixelSize(e.b.b.b.d.design_navigation_icon_size);
        this.z = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.z.setDuplicateParentStateEnabled(true);
        b0.a(this.z, this.F);
    }

    private void e() {
        int i2;
        h0.a aVar;
        if (g()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                aVar = (h0.a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.z.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 != null) {
                aVar = (h0.a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) aVar).width = i2;
        this.A.setLayoutParams(aVar);
    }

    private StateListDrawable f() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(c.a.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean g() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void a(j jVar, int i2) {
        this.B = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            b0.a(this, f());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        y0.a(this, jVar.getTooltipText());
        e();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a() {
        return false;
    }

    public void d() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.z.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        j jVar = this.B;
        if (jVar != null && jVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.y != z2) {
            this.y = z2;
            this.F.a(this.z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.z.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
                androidx.core.graphics.drawable.a.a(drawable, this.C);
            }
            int i2 = this.w;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.x) {
            if (this.E == null) {
                this.E = c.h.d.d.f.b(getResources(), e.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.E;
                if (drawable2 != null) {
                    int i3 = this.w;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        i.a(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.z.setCompoundDrawablePadding(i2);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = this.C != null;
        j jVar = this.B;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.x = z2;
    }

    public void setTextAppearance(int i2) {
        i.d(this.z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
