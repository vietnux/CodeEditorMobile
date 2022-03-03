package com.dmitrymalkovich.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ProgressFloatingActionButton extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final FloatingActionButtonBehavior f3050b = new FloatingActionButtonBehavior(this);

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f3051c;

    /* renamed from: d  reason: collision with root package name */
    private FloatingActionButton f3052d;

    public class FloatingActionButtonBehavior extends CoordinatorLayout.c<FrameLayout> {
        public FloatingActionButtonBehavior(ProgressFloatingActionButton progressFloatingActionButton) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, View view) {
            return view instanceof Snackbar.SnackbarLayout;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, View view) {
            float min = Math.min(0.0f, view.getTranslationY() - ((float) view.getHeight()));
            if (frameLayout.getBottom() <= view.getTop()) {
                return true;
            }
            frameLayout.setTranslationY(min);
            return true;
        }
    }

    public ProgressFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (getChildCount() == 0 || getChildCount() > 2) {
            throw new IllegalStateException("Specify only 2 views.");
        }
        if (getLayoutParams() instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) getLayoutParams()).a(this.f3050b);
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof ProgressBar) {
                this.f3051c = (ProgressBar) childAt;
            } else if (childAt instanceof FloatingActionButton) {
                this.f3052d = (FloatingActionButton) childAt;
            } else {
                throw new IllegalStateException("Specify FAB and Progress Baras view's children in your layout.");
            }
        }
        FloatingActionButton floatingActionButton = this.f3052d;
        if (floatingActionButton == null) {
            throw new IllegalStateException("Floating Action Button not specified");
        } else if (this.f3051c != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(a.progress_bar_size);
            this.f3051c.getLayoutParams().height = this.f3052d.getHeight() + dimensionPixelSize;
            this.f3051c.getLayoutParams().width = this.f3052d.getWidth() + dimensionPixelSize;
            ((FrameLayout.LayoutParams) floatingActionButton.getLayoutParams()).gravity = 17;
            ((FrameLayout.LayoutParams) this.f3051c.getLayoutParams()).gravity = 17;
        } else {
            throw new IllegalStateException("Progress Bar not specified");
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = this.f3052d;
        if (floatingActionButton != null && this.f3051c != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(a.progress_bar_size);
            this.f3051c.getLayoutParams().height = this.f3052d.getHeight() + dimensionPixelSize;
            this.f3051c.getLayoutParams().width = this.f3052d.getWidth() + dimensionPixelSize;
            ((FrameLayout.LayoutParams) floatingActionButton.getLayoutParams()).gravity = 17;
            ((FrameLayout.LayoutParams) this.f3051c.getLayoutParams()).gravity = 17;
        }
    }
}
