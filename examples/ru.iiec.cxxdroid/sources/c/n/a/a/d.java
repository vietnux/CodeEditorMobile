package c.n.a.a;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {
    private final float[] a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2515b = (1.0f / ((float) (this.a.length - 1)));

    protected d(float[] fArr) {
        this.a = fArr;
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f2515b;
        float f4 = (f2 - (((float) min) * f3)) / f3;
        float[] fArr2 = this.a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
