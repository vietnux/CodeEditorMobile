package e.b.b.b.k;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f7822b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f7823c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.f7822b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f7822b;
            float f3 = fArr[i2];
            float[] fArr2 = this.a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
        }
        this.f7823c.setValues(this.f7822b);
        return this.f7823c;
    }
}
