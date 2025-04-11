package c.t;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
public class h<T> extends Property<T, Float> {
    private final Property<T, PointF> a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f2575b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2576c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f2577d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f2578e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f2579f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.a = property;
        this.f2575b = new PathMeasure(path, false);
        this.f2576c = this.f2575b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f2) {
        this.f2579f = f2.floatValue();
        this.f2575b.getPosTan(this.f2576c * f2.floatValue(), this.f2577d, null);
        PointF pointF = this.f2578e;
        float[] fArr = this.f2577d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(t, pointF);
    }

    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f2579f);
    }
}
