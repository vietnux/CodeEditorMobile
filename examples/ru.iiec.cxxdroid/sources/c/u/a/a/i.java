package c.u.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import c.h.e.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f2648k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private h f2649c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f2650d;

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f2651e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2652f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2653g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f2654h;

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f2655i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f2656j;

    /* access modifiers changed from: private */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2678b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = c.h.e.c.a(string2);
            }
            this.f2679c = c.h.d.d.g.b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (c.h.d.d.g.a(xmlPullParser, "pathData")) {
                TypedArray a = c.h.d.d.g.a(resources, theme, attributeSet, a.f2628d);
                a(a, xmlPullParser);
                a.recycle();
            }
        }

        @Override // c.u.a.a.i.f
        public boolean b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f2657e;

        /* renamed from: f  reason: collision with root package name */
        c.h.d.d.b f2658f;

        /* renamed from: g  reason: collision with root package name */
        float f2659g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        c.h.d.d.b f2660h;

        /* renamed from: i  reason: collision with root package name */
        float f2661i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f2662j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f2663k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f2664l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f2665m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        c(c cVar) {
            super(cVar);
            this.f2657e = cVar.f2657e;
            this.f2658f = cVar.f2658f;
            this.f2659g = cVar.f2659g;
            this.f2661i = cVar.f2661i;
            this.f2660h = cVar.f2660h;
            this.f2679c = cVar.f2679c;
            this.f2662j = cVar.f2662j;
            this.f2663k = cVar.f2663k;
            this.f2664l = cVar.f2664l;
            this.f2665m = cVar.f2665m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap a(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join a(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2657e = null;
            if (c.h.d.d.g.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2678b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = c.h.e.c.a(string2);
                }
                this.f2660h = c.h.d.d.g.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2662j = c.h.d.d.g.a(typedArray, xmlPullParser, "fillAlpha", 12, this.f2662j);
                this.n = a(c.h.d.d.g.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(c.h.d.d.g.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = c.h.d.d.g.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f2658f = c.h.d.d.g.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2661i = c.h.d.d.g.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2661i);
                this.f2659g = c.h.d.d.g.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f2659g);
                this.f2664l = c.h.d.d.g.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2664l);
                this.f2665m = c.h.d.d.g.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2665m);
                this.f2663k = c.h.d.d.g.a(typedArray, xmlPullParser, "trimPathStart", 5, this.f2663k);
                this.f2679c = c.h.d.d.g.b(typedArray, xmlPullParser, "fillType", 13, this.f2679c);
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = c.h.d.d.g.a(resources, theme, attributeSet, a.f2627c);
            a(a, xmlPullParser, theme);
            a.recycle();
        }

        @Override // c.u.a.a.i.e
        public boolean a() {
            return this.f2660h.d() || this.f2658f.d();
        }

        @Override // c.u.a.a.i.e
        public boolean a(int[] iArr) {
            return this.f2658f.a(iArr) | this.f2660h.a(iArr);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f2662j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f2660h.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f2661i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f2658f.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f2659g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f2664l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f2665m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f2663k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.f2662j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.f2660h.a(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.f2661i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f2658f.a(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.f2659g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.f2664l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.f2665m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.f2663k = f2;
        }
    }

    /* access modifiers changed from: private */
    public static class d extends e {
        final Matrix a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f2666b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        float f2667c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private float f2668d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private float f2669e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f2670f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private float f2671g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        private float f2672h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        private float f2673i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f2674j = new Matrix();

        /* renamed from: k  reason: collision with root package name */
        int f2675k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f2676l;

        /* renamed from: m  reason: collision with root package name */
        private String f2677m = null;

        public d() {
            super();
        }

        public d(d dVar, c.e.a<String, Object> aVar) {
            super();
            f fVar;
            this.f2667c = dVar.f2667c;
            this.f2668d = dVar.f2668d;
            this.f2669e = dVar.f2669e;
            this.f2670f = dVar.f2670f;
            this.f2671g = dVar.f2671g;
            this.f2672h = dVar.f2672h;
            this.f2673i = dVar.f2673i;
            this.f2676l = dVar.f2676l;
            this.f2677m = dVar.f2677m;
            this.f2675k = dVar.f2675k;
            String str = this.f2677m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2674j.set(dVar.f2674j);
            ArrayList<e> arrayList = dVar.f2666b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f2666b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f2666b.add(fVar);
                    String str2 = fVar.f2678b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2676l = null;
            this.f2667c = c.h.d.d.g.a(typedArray, xmlPullParser, "rotation", 5, this.f2667c);
            this.f2668d = typedArray.getFloat(1, this.f2668d);
            this.f2669e = typedArray.getFloat(2, this.f2669e);
            this.f2670f = c.h.d.d.g.a(typedArray, xmlPullParser, "scaleX", 3, this.f2670f);
            this.f2671g = c.h.d.d.g.a(typedArray, xmlPullParser, "scaleY", 4, this.f2671g);
            this.f2672h = c.h.d.d.g.a(typedArray, xmlPullParser, "translateX", 6, this.f2672h);
            this.f2673i = c.h.d.d.g.a(typedArray, xmlPullParser, "translateY", 7, this.f2673i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2677m = string;
            }
            b();
        }

        private void b() {
            this.f2674j.reset();
            this.f2674j.postTranslate(-this.f2668d, -this.f2669e);
            this.f2674j.postScale(this.f2670f, this.f2671g);
            this.f2674j.postRotate(this.f2667c, 0.0f, 0.0f);
            this.f2674j.postTranslate(this.f2672h + this.f2668d, this.f2673i + this.f2669e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = c.h.d.d.g.a(resources, theme, attributeSet, a.f2626b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // c.u.a.a.i.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f2666b.size(); i2++) {
                if (this.f2666b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // c.u.a.a.i.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f2666b.size(); i2++) {
                z |= this.f2666b.get(i2).a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f2677m;
        }

        public Matrix getLocalMatrix() {
            return this.f2674j;
        }

        public float getPivotX() {
            return this.f2668d;
        }

        public float getPivotY() {
            return this.f2669e;
        }

        public float getRotation() {
            return this.f2667c;
        }

        public float getScaleX() {
            return this.f2670f;
        }

        public float getScaleY() {
            return this.f2671g;
        }

        public float getTranslateX() {
            return this.f2672h;
        }

        public float getTranslateY() {
            return this.f2673i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2668d) {
                this.f2668d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2669e) {
                this.f2669e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2667c) {
                this.f2667c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2670f) {
                this.f2670f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2671g) {
                this.f2671g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2672h) {
                this.f2672h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2673i) {
                this.f2673i = f2;
                b();
            }
        }
    }

    /* access modifiers changed from: private */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class f extends e {
        protected c.b[] a = null;

        /* renamed from: b  reason: collision with root package name */
        String f2678b;

        /* renamed from: c  reason: collision with root package name */
        int f2679c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f2680d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.f2678b = fVar.f2678b;
            this.f2680d = fVar.f2680d;
            this.a = c.h.e.c.a(fVar.a);
        }

        public void a(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.a(bVarArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f2678b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!c.h.e.c.a(this.a, bVarArr)) {
                this.a = c.h.e.c.a(bVarArr);
            } else {
                c.h.e.c.b(this.a, bVarArr);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class g {
        private static final Matrix q = new Matrix();
        private final Path a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f2681b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f2682c;

        /* renamed from: d  reason: collision with root package name */
        Paint f2683d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2684e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f2685f;

        /* renamed from: g  reason: collision with root package name */
        private int f2686g;

        /* renamed from: h  reason: collision with root package name */
        final d f2687h;

        /* renamed from: i  reason: collision with root package name */
        float f2688i;

        /* renamed from: j  reason: collision with root package name */
        float f2689j;

        /* renamed from: k  reason: collision with root package name */
        float f2690k;

        /* renamed from: l  reason: collision with root package name */
        float f2691l;

        /* renamed from: m  reason: collision with root package name */
        int f2692m;
        String n;
        Boolean o;
        final c.e.a<String, Object> p;

        public g() {
            this.f2682c = new Matrix();
            this.f2688i = 0.0f;
            this.f2689j = 0.0f;
            this.f2690k = 0.0f;
            this.f2691l = 0.0f;
            this.f2692m = 255;
            this.n = null;
            this.o = null;
            this.p = new c.e.a<>();
            this.f2687h = new d();
            this.a = new Path();
            this.f2681b = new Path();
        }

        public g(g gVar) {
            this.f2682c = new Matrix();
            this.f2688i = 0.0f;
            this.f2689j = 0.0f;
            this.f2690k = 0.0f;
            this.f2691l = 0.0f;
            this.f2692m = 255;
            this.n = null;
            this.o = null;
            this.p = new c.e.a<>();
            this.f2687h = new d(gVar.f2687h, this.p);
            this.a = new Path(gVar.a);
            this.f2681b = new Path(gVar.f2681b);
            this.f2688i = gVar.f2688i;
            this.f2689j = gVar.f2689j;
            this.f2690k = gVar.f2690k;
            this.f2691l = gVar.f2691l;
            this.f2686g = gVar.f2686g;
            this.f2692m = gVar.f2692m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        private void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f2674j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f2666b.size(); i4++) {
                e eVar = dVar.f2666b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    a(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void a(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.f2690k;
            float f3 = ((float) i3) / this.f2691l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.f2682c.set(matrix);
            this.f2682c.postScale(f2, f3);
            float a2 = a(matrix);
            if (a2 != 0.0f) {
                fVar.a(this.a);
                Path path = this.a;
                this.f2681b.reset();
                if (fVar.b()) {
                    this.f2681b.setFillType(fVar.f2679c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f2681b.addPath(path, this.f2682c);
                    canvas.clipPath(this.f2681b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.f2663k == 0.0f && cVar.f2664l == 1.0f)) {
                    float f4 = cVar.f2663k;
                    float f5 = cVar.f2665m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.f2664l + f5) % 1.0f;
                    if (this.f2685f == null) {
                        this.f2685f = new PathMeasure();
                    }
                    this.f2685f.setPath(this.a, false);
                    float length = this.f2685f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f2685f.getSegment(f8, length, path, true);
                        this.f2685f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f2685f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f2681b.addPath(path, this.f2682c);
                if (cVar.f2660h.e()) {
                    c.h.d.d.b bVar = cVar.f2660h;
                    if (this.f2684e == null) {
                        this.f2684e = new Paint(1);
                        this.f2684e.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f2684e;
                    if (bVar.c()) {
                        Shader b2 = bVar.b();
                        b2.setLocalMatrix(this.f2682c);
                        paint.setShader(b2);
                        paint.setAlpha(Math.round(cVar.f2662j * 255.0f));
                    } else {
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(i.a(bVar.a(), cVar.f2662j));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f2681b.setFillType(cVar.f2679c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f2681b, paint);
                }
                if (cVar.f2658f.e()) {
                    c.h.d.d.b bVar2 = cVar.f2658f;
                    if (this.f2683d == null) {
                        this.f2683d = new Paint(1);
                        this.f2683d.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f2683d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint2.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint2.setStrokeCap(cap);
                    }
                    paint2.setStrokeMiter(cVar.p);
                    if (bVar2.c()) {
                        Shader b3 = bVar2.b();
                        b3.setLocalMatrix(this.f2682c);
                        paint2.setShader(b3);
                        paint2.setAlpha(Math.round(cVar.f2661i * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(i.a(bVar2.a(), cVar.f2661i));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(cVar.f2659g * min * a2);
                    canvas.drawPath(this.f2681b, paint2);
                }
            }
        }

        public void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.f2687h, q, canvas, i2, i3, colorFilter);
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f2687h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.f2687h.a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2692m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f2692m = i2;
        }
    }

    /* access modifiers changed from: private */
    public static class h extends Drawable.ConstantState {
        int a;

        /* renamed from: b  reason: collision with root package name */
        g f2693b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f2694c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f2695d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2696e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f2697f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f2698g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f2699h;

        /* renamed from: i  reason: collision with root package name */
        int f2700i;

        /* renamed from: j  reason: collision with root package name */
        boolean f2701j;

        /* renamed from: k  reason: collision with root package name */
        boolean f2702k;

        /* renamed from: l  reason: collision with root package name */
        Paint f2703l;

        public h() {
            this.f2694c = null;
            this.f2695d = i.f2648k;
            this.f2693b = new g();
        }

        public h(h hVar) {
            this.f2694c = null;
            this.f2695d = i.f2648k;
            if (hVar != null) {
                this.a = hVar.a;
                this.f2693b = new g(hVar.f2693b);
                Paint paint = hVar.f2693b.f2684e;
                if (paint != null) {
                    this.f2693b.f2684e = new Paint(paint);
                }
                Paint paint2 = hVar.f2693b.f2683d;
                if (paint2 != null) {
                    this.f2693b.f2683d = new Paint(paint2);
                }
                this.f2694c = hVar.f2694c;
                this.f2695d = hVar.f2695d;
                this.f2696e = hVar.f2696e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (!b() && colorFilter == null) {
                return null;
            }
            if (this.f2703l == null) {
                this.f2703l = new Paint();
                this.f2703l.setFilterBitmap(true);
            }
            this.f2703l.setAlpha(this.f2693b.getRootAlpha());
            this.f2703l.setColorFilter(colorFilter);
            return this.f2703l;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2697f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.f2702k && this.f2698g == this.f2694c && this.f2699h == this.f2695d && this.f2701j == this.f2696e && this.f2700i == this.f2693b.getRootAlpha();
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f2697f.getWidth() && i3 == this.f2697f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.f2693b.a(iArr);
            this.f2702k |= a2;
            return a2;
        }

        public void b(int i2, int i3) {
            if (this.f2697f == null || !a(i2, i3)) {
                this.f2697f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f2702k = true;
            }
        }

        public boolean b() {
            return this.f2693b.getRootAlpha() < 255;
        }

        public void c(int i2, int i3) {
            this.f2697f.eraseColor(0);
            this.f2693b.a(new Canvas(this.f2697f), i2, i3, (ColorFilter) null);
        }

        public boolean c() {
            return this.f2693b.a();
        }

        public void d() {
            this.f2698g = this.f2694c;
            this.f2699h = this.f2695d;
            this.f2700i = this.f2693b.getRootAlpha();
            this.f2701j = this.f2696e;
            this.f2702k = false;
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.u.a.a.i$i  reason: collision with other inner class name */
    public static class C0066i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public C0066i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f2647b = (VectorDrawable) this.a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f2647b = (VectorDrawable) this.a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f2647b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.f2653g = true;
        this.f2654h = new float[9];
        this.f2655i = new Matrix();
        this.f2656j = new Rect();
        this.f2649c = new h();
    }

    i(h hVar) {
        this.f2653g = true;
        this.f2654h = new float[9];
        this.f2655i = new Matrix();
        this.f2656j = new Rect();
        this.f2649c = hVar;
        this.f2650d = a(this.f2650d, hVar.f2694c, hVar.f2695d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    private static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c.u.a.a.i a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            c.u.a.a.i r0 = new c.u.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = c.h.d.d.f.b(r6, r7, r8)
            r0.f2647b = r6
            c.u.a.a.i$i r6 = new c.u.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f2647b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            c.u.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.a.a.i.a(android.content.res.Resources, int, android.content.res.Resources$Theme):c.u.a.a.i");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: c.u.a.a.i$c */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        h hVar = this.f2649c;
        g gVar = hVar.f2693b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f2687h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2666b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2666b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2666b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = hVar.a;
                    i3 = dVar2.f2675k;
                    hVar.a = i3 | i2;
                }
                i2 = hVar.a;
                i3 = bVar.f2680d;
                hVar.a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f2649c;
        g gVar = hVar.f2693b;
        hVar.f2695d = a(c.h.d.d.g.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a2 = c.h.d.d.g.a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a2 != null) {
            hVar.f2694c = a2;
        }
        hVar.f2696e = c.h.d.d.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f2696e);
        gVar.f2690k = c.h.d.d.g.a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f2690k);
        gVar.f2691l = c.h.d.d.g.a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f2691l);
        if (gVar.f2690k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (gVar.f2691l > 0.0f) {
            gVar.f2688i = typedArray.getDimension(3, gVar.f2688i);
            gVar.f2689j = typedArray.getDimension(2, gVar.f2689j);
            if (gVar.f2688i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (gVar.f2689j > 0.0f) {
                gVar.setAlpha(c.h.d.d.g.a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    public Object a(String str) {
        return this.f2649c.f2693b.p.get(str);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f2653g = z;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2647b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2656j);
        if (this.f2656j.width() > 0 && this.f2656j.height() > 0) {
            ColorFilter colorFilter = this.f2651e;
            if (colorFilter == null) {
                colorFilter = this.f2650d;
            }
            canvas.getMatrix(this.f2655i);
            this.f2655i.getValues(this.f2654h);
            float abs = Math.abs(this.f2654h[0]);
            float abs2 = Math.abs(this.f2654h[4]);
            float abs3 = Math.abs(this.f2654h[1]);
            float abs4 = Math.abs(this.f2654h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f2656j.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f2656j.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f2656j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (a()) {
                    canvas.translate((float) this.f2656j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f2656j.offsetTo(0, 0);
                this.f2649c.b(min, min2);
                if (!this.f2653g) {
                    this.f2649c.c(min, min2);
                } else if (!this.f2649c.a()) {
                    this.f2649c.c(min, min2);
                    this.f2649c.d();
                }
                this.f2649c.a(canvas, colorFilter, this.f2656j);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2649c.f2693b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2649c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2651e;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2647b;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C0066i(drawable.getConstantState());
        }
        this.f2649c.a = getChangingConfigurations();
        return this.f2649c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2649c.f2693b.f2689j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2649c.f2693b.f2688i;
    }

    public int getOpacity() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2649c;
        hVar.f2693b = new g();
        TypedArray a2 = c.h.d.d.g.a(resources, theme, attributeSet, a.a);
        a(a2, xmlPullParser, theme);
        a2.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f2702k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.f2650d = a(this.f2650d, hVar.f2694c, hVar.f2695d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f2649c.f2696e;
    }

    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2649c) != null && (hVar.c() || ((colorStateList = this.f2649c.f2694c) != null && colorStateList.isStateful())));
    }

    public Drawable mutate() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2652f && super.mutate() == this) {
            this.f2649c = new h(this.f2649c);
            this.f2652f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f2649c;
        ColorStateList colorStateList = hVar.f2694c;
        if (!(colorStateList == null || (mode = hVar.f2695d) == null)) {
            this.f2650d = a(this.f2650d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.c() || !hVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2649c.f2693b.getRootAlpha() != i2) {
            this.f2649c.f2693b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f2649c.f2696e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2651e = colorFilter;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f2649c;
        if (hVar.f2694c != colorStateList) {
            hVar.f2694c = colorStateList;
            this.f2650d = a(this.f2650d, colorStateList, hVar.f2695d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        h hVar = this.f2649c;
        if (hVar.f2695d != mode) {
            hVar.f2695d = mode;
            this.f2650d = a(this.f2650d, hVar.f2694c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
