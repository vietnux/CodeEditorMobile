package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int Q;
    private final e.b.b.b.r.b R;
    private final a S;
    private Animator T;
    private Animator U;
    private Animator V;
    private int W;
    private boolean a0;
    private boolean b0;
    AnimatorListenerAdapter c0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f6317d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f972d = 17;
            bottomAppBar.a((BottomAppBar) floatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void a(BottomAppBar bottomAppBar) {
            super.a((View) bottomAppBar);
            FloatingActionButton m2 = bottomAppBar.m();
            if (m2 != null) {
                m2.a(this.f6317d);
                m2.clearAnimation();
                m2.animate().translationY(((float) (-m2.getPaddingBottom())) + ((float) (m2.getMeasuredHeight() - this.f6317d.height()))).setInterpolator(e.b.b.b.k.a.f7818b).setDuration(175);
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            FloatingActionButton m2 = bottomAppBar.m();
            if (m2 != null) {
                a(m2, bottomAppBar);
                m2.b(this.f6317d);
                bottomAppBar.setFabDiameter(this.f6317d.height());
            }
            if (bottomAppBar.n()) {
                coordinatorLayout.c(bottomAppBar, i2);
                return super.a(coordinatorLayout, (View) bottomAppBar, i2);
            }
            BottomAppBar.c(bottomAppBar);
            throw null;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.b(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        /* access modifiers changed from: protected */
        public void b(BottomAppBar bottomAppBar) {
            super.b((View) bottomAppBar);
            FloatingActionButton m2 = bottomAppBar.m();
            if (m2 != null) {
                m2.clearAnimation();
                m2.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(e.b.b.b.k.a.f7819c).setDuration(225);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.U = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.V = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f6318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f6320d;

        c(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f6318b = actionMenuView;
            this.f6319c = i2;
            this.f6320d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                BottomAppBar.this.a((BottomAppBar) this.f6318b, (ActionMenuView) this.f6319c, (int) this.f6320d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends c.j.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f6322d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6323e;

        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6322d = parcel.readInt();
            this.f6323e = parcel.readInt() != 0;
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6322d);
            parcel.writeInt(this.f6323e ? 1 : 0);
        }
    }

    private float a(boolean z) {
        FloatingActionButton m2 = m();
        if (m2 == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m2.a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) m2.getMeasuredHeight();
        }
        float height2 = (float) (m2.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (m2.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) m2.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            paddingBottom = height3;
        }
        return f2 + paddingBottom;
    }

    private void a(int i2, List<Animator> list) {
        if (this.b0) {
            this.S.e();
            throw null;
        }
    }

    private void a(int i2, boolean z) {
        if (b0.I(this)) {
            Animator animator = this.V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!o()) {
                i2 = 0;
                z = false;
            }
            a(i2, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.V = animatorSet;
            this.V.addListener(new b());
            this.V.start();
        }
    }

    private void a(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if ((this.b0 || (z && o())) && (this.W == 1 || i2 == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new c(actionMenuView, i2, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(ActionMenuView actionMenuView, int i2, boolean z) {
        boolean z2 = b0.r(this) == 1;
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                i3 = Math.max(i3, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i2 != 1 || !z) ? 0.0f : (float) (i3 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(FloatingActionButton floatingActionButton) {
        b(floatingActionButton);
        floatingActionButton.a(this.c0);
        floatingActionButton.b(this.c0);
    }

    private int b(int i2) {
        int i3 = 1;
        boolean z = b0.r(this) == 1;
        if (i2 != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.Q;
        if (z) {
            i3 = -1;
        }
        return measuredWidth * i3;
    }

    private void b(int i2, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m(), "translationX", (float) b(i2));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void b(FloatingActionButton floatingActionButton) {
        floatingActionButton.c(this.c0);
        floatingActionButton.d(this.c0);
    }

    private void c(int i2) {
        if (this.W != i2 && b0.I(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            a(i2, arrayList);
            b(i2, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.U = animatorSet;
            this.U.addListener(new a());
            this.U.start();
        }
    }

    static /* synthetic */ void c(BottomAppBar bottomAppBar) {
        bottomAppBar.p();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) b(this.W);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationY() {
        return a(this.b0);
    }

    private void l() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.U;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private FloatingActionButton m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).c(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean n() {
        Animator animator;
        Animator animator2;
        Animator animator3 = this.T;
        return (animator3 != null && animator3.isRunning()) || ((animator = this.V) != null && animator.isRunning()) || ((animator2 = this.U) != null && animator2.isRunning());
    }

    private boolean o() {
        FloatingActionButton m2 = m();
        return m2 != null && m2.b();
    }

    private void p() {
        this.S.d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.R.a();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.S.a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.W;
    }

    public float getFabCradleMargin() {
        this.S.b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.S.c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.a0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        l();
        p();
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.W = dVar.f6322d;
        this.b0 = dVar.f6323e;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6322d = this.W;
        dVar.f6323e = this.b0;
        return dVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a(this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            this.S.a(f2);
            throw null;
        }
    }

    public void setFabAlignmentMode(int i2) {
        c(i2);
        a(i2, this.b0);
        this.W = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            this.S.b(f2);
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            this.S.c(f2);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(int i2) {
        this.S.d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.a0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
