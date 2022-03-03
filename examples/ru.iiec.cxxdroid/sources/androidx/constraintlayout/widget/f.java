package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class f extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    e f951b;

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float u0;
        public boolean v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.u0 = 1.0f;
            this.v0 = false;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 1.0f;
            this.B0 = 1.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.u0 = 1.0f;
            this.v0 = false;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 1.0f;
            this.B0 = 1.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.ConstraintSet_android_alpha) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == k.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                        this.v0 = true;
                    }
                } else if (index == k.ConstraintSet_android_rotationX) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == k.ConstraintSet_android_rotationY) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == k.ConstraintSet_android_rotation) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == k.ConstraintSet_android_scaleX) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.ConstraintSet_android_scaleY) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == k.ConstraintSet_android_transformPivotX) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == k.ConstraintSet_android_transformPivotY) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == k.ConstraintSet_android_translationX) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == k.ConstraintSet_android_translationY) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == k.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public e getConstraintSet() {
        if (this.f951b == null) {
            this.f951b = new e();
        }
        this.f951b.a(this);
        return this.f951b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
