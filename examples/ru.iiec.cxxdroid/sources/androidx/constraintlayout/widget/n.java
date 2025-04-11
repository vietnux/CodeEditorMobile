package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import c.f.a.m.k;

public abstract class n extends c {

    /* renamed from: k  reason: collision with root package name */
    private boolean f955k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f956l;

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.ConstraintLayout_Layout_android_visibility) {
                    this.f955k = true;
                } else if (index == k.ConstraintLayout_Layout_android_elevation) {
                    this.f956l = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void a(k kVar, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void b(ConstraintLayout constraintLayout) {
        a(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.c
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f955k || this.f956l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i2 = 0; i2 < this.f866c; i2++) {
                    View a = constraintLayout.a(this.f865b[i2]);
                    if (a != null) {
                        if (this.f955k) {
                            a.setVisibility(visibility);
                        }
                        if (this.f956l && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            a.setTranslationZ(a.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        a();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        a();
    }
}
