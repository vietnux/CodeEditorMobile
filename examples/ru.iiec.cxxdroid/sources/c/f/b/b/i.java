package c.f.b.b;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.k;

public class i extends c implements j {

    /* renamed from: k  reason: collision with root package name */
    private boolean f2232k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2233l;

    /* renamed from: m  reason: collision with root package name */
    private float f2234m;
    protected View[] n;

    public void a(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.MotionHelper_onShow) {
                    this.f2232k = obtainStyledAttributes.getBoolean(index, this.f2232k);
                } else if (index == k.MotionHelper_onHide) {
                    this.f2233l = obtainStyledAttributes.getBoolean(index, this.f2233l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void a(View view, float f2) {
    }

    @Override // c.f.b.b.l.f
    public void a(l lVar, int i2) {
    }

    @Override // c.f.b.b.l.f
    public void a(l lVar, int i2, int i3) {
    }

    @Override // c.f.b.b.l.f
    public void a(l lVar, int i2, int i3, float f2) {
    }

    public void b(Canvas canvas) {
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return this.f2233l;
    }

    public boolean e() {
        return this.f2232k;
    }

    public float getProgress() {
        return this.f2234m;
    }

    public void setProgress(float f2) {
        this.f2234m = f2;
        int i2 = 0;
        if (this.f866c > 0) {
            this.n = c((ConstraintLayout) getParent());
            while (i2 < this.f866c) {
                a(this.n[i2], f2);
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof i)) {
                a(childAt, f2);
            }
            i2++;
        }
    }
}
