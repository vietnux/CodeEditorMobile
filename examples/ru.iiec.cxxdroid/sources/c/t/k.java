package c.t;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class k implements TypeEvaluator<Rect> {
    private Rect a;

    k() {
    }

    /* renamed from: a */
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i2 = rect.left;
        int i3 = i2 + ((int) (((float) (rect2.left - i2)) * f2));
        int i4 = rect.top;
        int i5 = i4 + ((int) (((float) (rect2.top - i4)) * f2));
        int i6 = rect.right;
        int i7 = i6 + ((int) (((float) (rect2.right - i6)) * f2));
        int i8 = rect.bottom;
        int i9 = i8 + ((int) (((float) (rect2.bottom - i8)) * f2));
        Rect rect3 = this.a;
        if (rect3 == null) {
            return new Rect(i3, i5, i7, i9);
        }
        rect3.set(i3, i5, i7, i9);
        return this.a;
    }
}
