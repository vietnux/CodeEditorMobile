package c.f.a.k.a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public abstract class f {
    protected a a;

    /* renamed from: b  reason: collision with root package name */
    protected int f2089b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f2090c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f2091d = ((float[][]) Array.newInstance(float.class, 10, 3));

    /* renamed from: e  reason: collision with root package name */
    protected int f2092e;

    /* renamed from: f  reason: collision with root package name */
    protected String f2093f;

    /* renamed from: g  reason: collision with root package name */
    protected float[] f2094g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f2095h = false;

    /* renamed from: i  reason: collision with root package name */
    protected long f2096i;

    /* renamed from: j  reason: collision with root package name */
    protected float f2097j = Float.NaN;

    public String toString() {
        String str = this.f2093f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f2092e; i2++) {
            str = str + "[" + this.f2090c[i2] + " , " + decimalFormat.format(this.f2091d[i2]) + "] ";
        }
        return str;
    }
}
