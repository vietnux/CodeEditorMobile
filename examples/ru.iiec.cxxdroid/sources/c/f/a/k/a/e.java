package c.f.a.k.a;

import java.text.DecimalFormat;

public abstract class e {
    protected a a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f2085b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f2086c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f2087d;

    /* renamed from: e  reason: collision with root package name */
    private String f2088e;

    public float a(float f2) {
        return (float) this.a.a((double) f2, 0);
    }

    public String toString() {
        String str = this.f2088e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f2087d; i2++) {
            str = str + "[" + this.f2085b[i2] + " , " + decimalFormat.format((double) this.f2086c[i2]) + "] ";
        }
        return str;
    }
}
