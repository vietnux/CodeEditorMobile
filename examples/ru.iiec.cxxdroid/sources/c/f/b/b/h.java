package c.f.b.b;

import android.view.View;
import android.view.animation.Interpolator;
import c.f.a.k.a.a;
import c.f.b.a.b;
import c.f.b.a.c;
import c.f.b.a.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class h {
    private m a;

    /* renamed from: b  reason: collision with root package name */
    private m f2220b;

    /* renamed from: c  reason: collision with root package name */
    private g f2221c;

    /* renamed from: d  reason: collision with root package name */
    private g f2222d;

    /* renamed from: e  reason: collision with root package name */
    private a[] f2223e;

    /* renamed from: f  reason: collision with root package name */
    private a f2224f;

    /* renamed from: g  reason: collision with root package name */
    float f2225g;

    /* renamed from: h  reason: collision with root package name */
    float f2226h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f2227i;

    /* renamed from: j  reason: collision with root package name */
    private double[] f2228j;

    /* renamed from: k  reason: collision with root package name */
    private double[] f2229k;

    /* renamed from: l  reason: collision with root package name */
    private String[] f2230l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f2231m;
    private ArrayList<m> n;
    private HashMap<String, d> o;
    private HashMap<String, c> p;
    private HashMap<String, b> q;
    private f[] r;
    private int s;
    private View t;
    private int u;
    private float v;
    private Interpolator w;
    private boolean x;

    private float a(float f2, float[] fArr) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (((double) this.f2226h) != 1.0d) {
            if (f2 < this.f2225g) {
                f2 = 0.0f;
            }
            float f5 = this.f2225g;
            if (f2 > f5 && ((double) f2) < 1.0d) {
                f2 = Math.min((f2 - f5) * this.f2226h, 1.0f);
            }
        }
        c.f.a.k.a.b bVar = this.a.f2257b;
        float f6 = Float.NaN;
        Iterator<m> it = this.n.iterator();
        while (it.hasNext()) {
            m next = it.next();
            c.f.a.k.a.b bVar2 = next.f2257b;
            if (bVar2 != null) {
                float f7 = next.f2259d;
                if (f7 < f2) {
                    bVar = bVar2;
                    f3 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f2259d;
                }
            }
        }
        if (bVar != null) {
            if (!Float.isNaN(f6)) {
                f4 = f6;
            }
            float f8 = f4 - f3;
            double d2 = (double) ((f2 - f3) / f8);
            f2 = (((float) bVar.a(d2)) * f8) + f3;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d2);
            }
        }
        return f2;
    }

    public void a(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f2223e[0].a(d2, dArr);
        this.f2223e[0].b(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.a.a(d2, this.f2227i, dArr, fArr, dArr2, fArr2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, float f2, long j2, c.f.a.k.a.c cVar) {
        boolean z;
        d.a aVar;
        char c2;
        double d2;
        float a2 = a(f2, null);
        int i2 = this.u;
        if (i2 != e.a) {
            float f3 = 1.0f / ((float) i2);
            float floor = ((float) Math.floor((double) (a2 / f3))) * f3;
            float f4 = (a2 % f3) / f3;
            if (!Float.isNaN(this.v)) {
                f4 = (f4 + this.v) % 1.0f;
            }
            Interpolator interpolator = this.w;
            a2 = ((interpolator != null ? interpolator.getInterpolation(f4) : ((double) f4) > 0.5d ? 1.0f : 0.0f) * f3) + floor;
        }
        HashMap<String, c> hashMap = this.p;
        if (hashMap != null) {
            for (c cVar2 : hashMap.values()) {
                cVar2.a(view, a2);
            }
        }
        HashMap<String, d> hashMap2 = this.o;
        if (hashMap2 != null) {
            aVar = null;
            boolean z2 = false;
            for (d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar = (d.a) dVar;
                } else {
                    z2 |= dVar.a(view, a2, j2, cVar);
                }
            }
            z = z2;
        } else {
            aVar = null;
            z = false;
        }
        a[] aVarArr = this.f2223e;
        if (aVarArr != null) {
            double d3 = (double) a2;
            aVarArr[0].a(d3, this.f2228j);
            this.f2223e[0].b(d3, this.f2229k);
            a aVar2 = this.f2224f;
            if (aVar2 != null) {
                double[] dArr = this.f2228j;
                if (dArr.length > 0) {
                    aVar2.a(d3, dArr);
                    this.f2224f.b(d3, this.f2229k);
                }
            }
            if (!this.x) {
                d2 = d3;
                this.a.a(a2, view, this.f2227i, this.f2228j, this.f2229k, (double[]) null);
            } else {
                d2 = d3;
            }
            if (this.s != e.a) {
                if (this.t == null) {
                    this.t = ((View) view.getParent()).findViewById(this.s);
                }
                View view2 = this.t;
                if (view2 != null) {
                    float top = ((float) (view2.getTop() + this.t.getBottom())) / 2.0f;
                    float left = ((float) (this.t.getLeft() + this.t.getRight())) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - ((float) view.getLeft()));
                        view.setPivotY(top - ((float) view.getTop()));
                    }
                }
            }
            HashMap<String, c> hashMap3 = this.p;
            if (hashMap3 != null) {
                for (c cVar3 : hashMap3.values()) {
                    if (cVar3 instanceof c.a) {
                        double[] dArr2 = this.f2229k;
                        if (dArr2.length > 1) {
                            ((c.a) cVar3).a(view, a2, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f2229k;
                c2 = 1;
                z |= aVar.a(view, cVar, a2, j2, dArr3[0], dArr3[1]);
            } else {
                c2 = 1;
            }
            int i3 = 1;
            while (true) {
                a[] aVarArr2 = this.f2223e;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i3].a(d2, this.f2231m);
                this.a.n.get(this.f2230l[i3 - 1]).a(view, this.f2231m);
                i3++;
            }
            g gVar = this.f2221c;
            if (gVar.f2218b == 0) {
                if (a2 > 0.0f) {
                    if (a2 >= 1.0f) {
                        gVar = this.f2222d;
                    } else if (this.f2222d.f2219c != gVar.f2219c) {
                        view.setVisibility(0);
                    }
                }
                view.setVisibility(gVar.f2219c);
            }
            if (this.r != null) {
                int i4 = 0;
                while (true) {
                    f[] fVarArr = this.r;
                    if (i4 >= fVarArr.length) {
                        break;
                    }
                    fVarArr[i4].a(a2, view);
                    i4++;
                }
            }
        } else {
            c2 = 1;
            m mVar = this.a;
            float f5 = mVar.f2261f;
            m mVar2 = this.f2220b;
            float f6 = f5 + ((mVar2.f2261f - f5) * a2);
            float f7 = mVar.f2262g;
            float f8 = f7 + ((mVar2.f2262g - f7) * a2);
            float f9 = mVar.f2263h;
            float f10 = mVar2.f2263h;
            float f11 = mVar.f2264i;
            float f12 = mVar2.f2264i;
            float f13 = f6 + 0.5f;
            int i5 = (int) f13;
            float f14 = f8 + 0.5f;
            int i6 = (int) f14;
            int i7 = (int) (f13 + ((f10 - f9) * a2) + f9);
            int i8 = (int) (f14 + ((f12 - f11) * a2) + f11);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (!(f10 == f9 && f12 == f11)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, b> hashMap4 = this.q;
        if (hashMap4 != null) {
            for (b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f2229k;
                    ((b.a) bVar).a(view, a2, dArr4[0], dArr4[c2]);
                } else {
                    bVar.a(view, a2);
                }
            }
        }
        return z;
    }

    public String toString() {
        return " start: x: " + this.a.f2261f + " y: " + this.a.f2262g + " end: x: " + this.f2220b.f2261f + " y: " + this.f2220b.f2262g;
    }
}
