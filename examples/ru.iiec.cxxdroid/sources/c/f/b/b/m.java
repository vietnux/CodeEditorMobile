package c.f.b.b;

import android.view.View;
import c.f.a.k.a.b;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* access modifiers changed from: package-private */
public class m implements Comparable<m> {
    static String[] r = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b  reason: collision with root package name */
    b f2257b;

    /* renamed from: c  reason: collision with root package name */
    int f2258c = 0;

    /* renamed from: d  reason: collision with root package name */
    float f2259d;

    /* renamed from: e  reason: collision with root package name */
    float f2260e;

    /* renamed from: f  reason: collision with root package name */
    float f2261f;

    /* renamed from: g  reason: collision with root package name */
    float f2262g;

    /* renamed from: h  reason: collision with root package name */
    float f2263h;

    /* renamed from: i  reason: collision with root package name */
    float f2264i;

    /* renamed from: j  reason: collision with root package name */
    float f2265j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    int f2266k;

    /* renamed from: l  reason: collision with root package name */
    int f2267l;

    /* renamed from: m  reason: collision with root package name */
    h f2268m;
    LinkedHashMap<String, androidx.constraintlayout.widget.b> n;
    int o;
    double[] p;
    double[] q;

    public m() {
        int i2 = e.a;
        this.f2266k = i2;
        this.f2267l = i2;
        this.f2268m = null;
        this.n = new LinkedHashMap<>();
        this.o = 0;
        this.p = new double[18];
        this.q = new double[18];
    }

    /* renamed from: a */
    public int compareTo(m mVar) {
        return Float.compare(this.f2260e, mVar.f2260e);
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2;
        float f3;
        float f4 = this.f2261f;
        float f5 = this.f2262g;
        float f6 = f4;
        float f7 = f5;
        float f8 = this.f2263h;
        float f9 = this.f2264i;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f14 = (float) dArr[i2];
            float f15 = (float) dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f6 = f14;
                f10 = f15;
            } else if (i3 == 2) {
                f7 = f14;
                f12 = f15;
            } else if (i3 == 3) {
                f8 = f14;
                f11 = f15;
            } else if (i3 == 4) {
                f9 = f14;
                f13 = f15;
            }
        }
        float f16 = 2.0f;
        float f17 = (f11 / 2.0f) + f10;
        float f18 = (f13 / 2.0f) + f12;
        h hVar = this.f2268m;
        if (hVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            hVar.a(d2, fArr3, fArr4);
            float f19 = fArr3[0];
            float f20 = fArr3[1];
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            double d3 = (double) f6;
            double d4 = (double) f7;
            float sin = (float) ((((double) f19) + (Math.sin(d4) * d3)) - ((double) (f8 / 2.0f)));
            float cos = (float) ((((double) f20) - (d3 * Math.cos(d4))) - ((double) (f9 / 2.0f)));
            double d5 = (double) f10;
            f2 = sin;
            double d6 = (double) f12;
            float sin2 = (float) (((double) f21) + (Math.sin(d4) * d5) + (Math.cos(d4) * d6));
            f3 = (float) ((((double) f22) - (d5 * Math.cos(d4))) + (Math.sin(d4) * d6));
            f7 = cos;
            f17 = sin2;
            f16 = 2.0f;
        } else {
            f3 = f18;
            f2 = f6;
        }
        fArr[0] = f2 + (f8 / f16) + 0.0f;
        fArr[1] = f7 + (f9 / f16) + 0.0f;
        fArr2[0] = f17;
        fArr2[1] = f3;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f3;
        float f4;
        float f5 = this.f2261f;
        float f6 = this.f2262g;
        float f7 = this.f2263h;
        float f8 = this.f2264i;
        if (iArr.length != 0 && this.p.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.p = new double[i2];
            this.q = new double[i2];
        }
        Arrays.fill(this.p, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.p[iArr[i3]] = dArr[i3];
            this.q[iArr[i3]] = dArr2[i3];
        }
        float f9 = Float.NaN;
        float f10 = f7;
        float f11 = f8;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = f6;
        float f17 = f5;
        int i4 = 0;
        while (true) {
            double[] dArr4 = this.p;
            if (i4 >= dArr4.length) {
                break;
            }
            double d2 = 0.0d;
            if (!Double.isNaN(dArr4[i4]) || !(dArr3 == null || dArr3[i4] == 0.0d)) {
                if (dArr3 != null) {
                    d2 = dArr3[i4];
                }
                if (!Double.isNaN(this.p[i4])) {
                    d2 = this.p[i4] + d2;
                }
                f4 = f9;
                float f18 = (float) d2;
                float f19 = (float) this.q[i4];
                if (i4 != 0) {
                    if (i4 == 1) {
                        f9 = f4;
                        f12 = f19;
                        f17 = f18;
                    } else if (i4 == 2) {
                        f9 = f4;
                        f13 = f19;
                        f16 = f18;
                    } else if (i4 == 3) {
                        f9 = f4;
                        f14 = f19;
                        f10 = f18;
                    } else if (i4 == 4) {
                        f9 = f4;
                        f15 = f19;
                        f11 = f18;
                    } else if (i4 == 5) {
                        f9 = f18;
                    }
                    i4++;
                }
            } else {
                f4 = f9;
            }
            f9 = f4;
            i4++;
        }
        h hVar = this.f2268m;
        if (hVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            hVar.a((double) f2, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d3 = (double) f17;
            double d4 = (double) f16;
            float sin = (float) ((((double) f20) + (Math.sin(d4) * d3)) - ((double) (f10 / 2.0f)));
            f3 = (float) ((((double) f21) - (Math.cos(d4) * d3)) - ((double) (f11 / 2.0f)));
            double d5 = (double) f12;
            double d6 = (double) f13;
            float sin2 = (float) (((double) f22) + (Math.sin(d4) * d5) + (Math.cos(d4) * d3 * d6));
            float cos = (float) ((((double) f23) - (d5 * Math.cos(d4))) + (d3 * Math.sin(d4) * d6));
            if (dArr2.length >= 2) {
                dArr2[0] = (double) sin2;
                dArr2[1] = (double) cos;
            }
            if (!Float.isNaN(f9)) {
                view.setRotation((float) (((double) f9) + Math.toDegrees(Math.atan2((double) cos, (double) sin2))));
            }
            f17 = sin;
        } else {
            if (!Float.isNaN(f9)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f9) + Math.toDegrees(Math.atan2((double) (f13 + (f15 / 2.0f)), (double) (f12 + (f14 / 2.0f))))));
            }
            f3 = f16;
        }
        if (view instanceof d) {
            ((d) view).a(f17, f3, f10 + f17, f11 + f3);
            return;
        }
        float f24 = f17 + 0.5f;
        int i5 = (int) f24;
        float f25 = f3 + 0.5f;
        int i6 = (int) f25;
        int i7 = (int) (f24 + f10);
        int i8 = (int) (f25 + f11);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if ((i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight()) ? false : true) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }
}
