package c.a.l.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.a.a;
import c.a.i;
import c.a.j;

public class d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f1813m = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    private float f1814b;

    /* renamed from: c  reason: collision with root package name */
    private float f1815c;

    /* renamed from: d  reason: collision with root package name */
    private float f1816d;

    /* renamed from: e  reason: collision with root package name */
    private float f1817e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1818f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f1819g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final int f1820h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1821i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f1822j;

    /* renamed from: k  reason: collision with root package name */
    private float f1823k;

    /* renamed from: l  reason: collision with root package name */
    private int f1824l = 2;

    public d(Context context) {
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.MITER);
        this.a.setStrokeCap(Paint.Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        a(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        a(obtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        b((float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f1820h = obtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f1815c = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f1814b = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f1816d = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void a(float f2) {
        if (this.a.getStrokeWidth() != f2) {
            this.a.setStrokeWidth(f2);
            this.f1823k = (float) (((double) (f2 / 2.0f)) * Math.cos((double) f1813m));
            invalidateSelf();
        }
    }

    public void a(int i2) {
        if (i2 != this.a.getColor()) {
            this.a.setColor(i2);
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.f1818f != z) {
            this.f1818f = z;
            invalidateSelf();
        }
    }

    public void b(float f2) {
        if (f2 != this.f1817e) {
            this.f1817e = f2;
            invalidateSelf();
        }
    }

    public void b(boolean z) {
        if (this.f1821i != z) {
            this.f1821i = z;
            invalidateSelf();
        }
    }

    public void c(float f2) {
        if (this.f1822j != f2) {
            this.f1822j = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = this.f1824l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? androidx.core.graphics.drawable.a.e(this) == 0 : androidx.core.graphics.drawable.a.e(this) == 1))) {
            z = true;
        }
        float f2 = this.f1814b;
        float a2 = a(this.f1815c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.f1822j);
        float a3 = a(this.f1815c, this.f1816d, this.f1822j);
        float round = (float) Math.round(a(0.0f, this.f1823k, this.f1822j));
        float a4 = a(0.0f, f1813m, this.f1822j);
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f1822j);
        double d2 = (double) a2;
        double d3 = (double) a4;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.f1819g.rewind();
        float a6 = a(this.f1817e + this.a.getStrokeWidth(), -this.f1823k, this.f1822j);
        float f3 = (-a3) / 2.0f;
        this.f1819g.moveTo(f3 + round, 0.0f);
        this.f1819g.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.f1819g.moveTo(f3, a6);
        this.f1819g.rLineTo(round2, round3);
        this.f1819g.moveTo(f3, -a6);
        this.f1819g.rLineTo(round2, -round3);
        this.f1819g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.f1817e;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f1818f) {
            canvas.rotate(a5 * ((float) (this.f1821i ^ z ? -1 : 1)));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1819g, this.a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f1820h;
    }

    public int getIntrinsicWidth() {
        return this.f1820h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.a.getAlpha()) {
            this.a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
