package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;
import c.h.l.b0;
import c.h.l.k0;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import e.b.b.b.i;

public class NavigationView extends j {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f6459j = {16842912};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f6460k = {-16842910};

    /* renamed from: e  reason: collision with root package name */
    private final f f6461e;

    /* renamed from: f  reason: collision with root package name */
    private final g f6462f;

    /* renamed from: g  reason: collision with root package name */
    b f6463g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6464h;

    /* renamed from: i  reason: collision with root package name */
    private MenuInflater f6465i;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(androidx.appcompat.view.menu.g gVar) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b bVar = NavigationView.this.f6463g;
            return bVar != null && bVar.a(menuItem);
        }
    }

    public interface b {
        boolean a(MenuItem menuItem);
    }

    public static class c extends c.j.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Bundle f6467d;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6467d = parcel.readBundle(classLoader);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f6467d);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.b.b.b.b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        boolean z;
        this.f6462f = new com.google.android.material.internal.g();
        this.f6461e = new f(context);
        w0 d2 = l.d(context, attributeSet, e.b.b.b.j.NavigationView, i2, i.Widget_Design_NavigationView, new int[0]);
        b0.a(this, d2.b(e.b.b.b.j.NavigationView_android_background));
        if (d2.g(e.b.b.b.j.NavigationView_elevation)) {
            b0.a(this, (float) d2.c(e.b.b.b.j.NavigationView_elevation, 0));
        }
        b0.a(this, d2.a(e.b.b.b.j.NavigationView_android_fitsSystemWindows, false));
        this.f6464h = d2.c(e.b.b.b.j.NavigationView_android_maxWidth, 0);
        ColorStateList a2 = d2.g(e.b.b.b.j.NavigationView_itemIconTint) ? d2.a(e.b.b.b.j.NavigationView_itemIconTint) : c(16842808);
        if (d2.g(e.b.b.b.j.NavigationView_itemTextAppearance)) {
            i3 = d2.g(e.b.b.b.j.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i3 = 0;
        }
        ColorStateList colorStateList = d2.g(e.b.b.b.j.NavigationView_itemTextColor) ? d2.a(e.b.b.b.j.NavigationView_itemTextColor) : null;
        if (!z && colorStateList == null) {
            colorStateList = c(16842806);
        }
        Drawable b2 = d2.b(e.b.b.b.j.NavigationView_itemBackground);
        if (d2.g(e.b.b.b.j.NavigationView_itemHorizontalPadding)) {
            this.f6462f.c(d2.c(e.b.b.b.j.NavigationView_itemHorizontalPadding, 0));
        }
        int c2 = d2.c(e.b.b.b.j.NavigationView_itemIconPadding, 0);
        this.f6461e.a(new a());
        this.f6462f.b(1);
        this.f6462f.a(context, this.f6461e);
        this.f6462f.a(a2);
        if (z) {
            this.f6462f.e(i3);
        }
        this.f6462f.b(colorStateList);
        this.f6462f.a(b2);
        this.f6462f.d(c2);
        this.f6461e.a(this.f6462f);
        addView((View) this.f6462f.a((ViewGroup) this));
        if (d2.g(e.b.b.b.j.NavigationView_menu)) {
            b(d2.g(e.b.b.b.j.NavigationView_menu, 0));
        }
        if (d2.g(e.b.b.b.j.NavigationView_headerLayout)) {
            a(d2.g(e.b.b.b.j.NavigationView_headerLayout, 0));
        }
        d2.b();
    }

    private ColorStateList c(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList b2 = c.a.k.a.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(c.a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = b2.getDefaultColor();
        return new ColorStateList(new int[][]{f6460k, f6459j, FrameLayout.EMPTY_STATE_SET}, new int[]{b2.getColorForState(f6460k, defaultColor), i3, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f6465i == null) {
            this.f6465i = new c.a.o.g(getContext());
        }
        return this.f6465i;
    }

    public View a(int i2) {
        return this.f6462f.a(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.j
    public void a(k0 k0Var) {
        this.f6462f.a(k0Var);
    }

    public void b(int i2) {
        this.f6462f.b(true);
        getMenuInflater().inflate(i2, this.f6461e);
        this.f6462f.b(false);
        this.f6462f.a(false);
    }

    public MenuItem getCheckedItem() {
        return this.f6462f.c();
    }

    public int getHeaderCount() {
        return this.f6462f.d();
    }

    public Drawable getItemBackground() {
        return this.f6462f.e();
    }

    public int getItemHorizontalPadding() {
        return this.f6462f.f();
    }

    public int getItemIconPadding() {
        return this.f6462f.g();
    }

    public ColorStateList getItemIconTintList() {
        return this.f6462f.i();
    }

    public ColorStateList getItemTextColor() {
        return this.f6462f.h();
    }

    public Menu getMenu() {
        return this.f6461e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = this.f6464h;
            }
            super.onMeasure(i2, i3);
        }
        i4 = Math.min(View.MeasureSpec.getSize(i2), this.f6464h);
        i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        this.f6461e.b(cVar.f6467d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f6467d = new Bundle();
        this.f6461e.d(cVar.f6467d);
        return cVar;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f6461e.findItem(i2);
        if (findItem != null) {
            this.f6462f.a((androidx.appcompat.view.menu.j) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f6461e.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f6462f.a((androidx.appcompat.view.menu.j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setItemBackground(Drawable drawable) {
        this.f6462f.a(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(c.h.d.a.c(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        this.f6462f.c(i2);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.f6462f.c(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(int i2) {
        this.f6462f.d(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.f6462f.d(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f6462f.a(colorStateList);
    }

    public void setItemTextAppearance(int i2) {
        this.f6462f.e(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f6462f.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(b bVar) {
        this.f6463g = bVar;
    }
}
