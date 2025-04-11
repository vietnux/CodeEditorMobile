package iiec.androidterm.r;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* access modifiers changed from: package-private */
public abstract class a implements o {
    protected static final int[] s = {-16777216, -3342336, -16724736, -3289856, -16776978, -3342131, -16724531, -1710619, -8421505, -65536, -16711936, -256, -10724097, -65281, -16711681, -1, -16777216, -16777121, -16777081, -16777041, -16777001, -16776961, -16752896, -16752801, -16752761, -16752721, -16752681, -16752641, -16742656, -16742561, -16742521, -16742481, -16742441, -16742401, -16732416, -16732321, -16732281, -16732241, -16732201, -16732161, -16722176, -16722081, -16722041, -16722001, -16721961, -16721921, -16711936, -16711841, -16711801, -16711761, -16711721, -16711681, -10551296, -10551201, -10551161, -10551121, -10551081, -10551041, -10526976, -10526881, -10526841, -10526801, -10526761, -10526721, -10516736, -10516641, -10516601, -10516561, -10516521, -10516481, -10506496, -10506401, -10506361, -10506321, -10506281, -10506241, -10496256, -10496161, -10496121, -10496081, -10496041, -10496001, -10486016, -10485921, -10485881, -10485841, -10485801, -10485761, -7929856, -7929761, -7929721, -7929681, -7929641, -7929601, -7905536, -7905441, -7905401, -7905361, -7905321, -7905281, -7895296, -7895201, -7895161, -7895121, -7895081, -7895041, -7885056, -7884961, -7884921, -7884881, -7884841, -7884801, -7874816, -7874721, -7874681, -7874641, -7874601, -7874561, -7864576, -7864481, -7864441, -7864401, -7864361, -7864321, -5308416, -5308321, -5308281, -5308241, -5308201, -5308161, -5284096, -5284001, -5283961, -5283921, -5283881, -5283841, -5273856, -5273761, -5273721, -5273681, -5273641, -5273601, -5263616, -5263521, -5263481, -5263441, -5263401, -5263361, -5253376, -5253281, -5253241, -5253201, -5253161, -5253121, -5243136, -5243041, -5243001, -5242961, -5242921, -5242881, -2686976, -2686881, -2686841, -2686801, -2686761, -2686721, -2662656, -2662561, -2662521, -2662481, -2662441, -2662401, -2652416, -2652321, -2652281, -2652241, -2652201, -2652161, -2642176, -2642081, -2642041, -2642001, -2641961, -2641921, -2631936, -2631841, -2631801, -2631761, -2631721, -2631681, -2621696, -2621601, -2621561, -2621521, -2621481, -2621441, -65536, -65441, -65401, -65361, -65321, -65281, -41216, -41121, -41081, -41041, -41001, -40961, -30976, -30881, -30841, -30801, -30761, -30721, -20736, -20641, -20601, -20561, -20521, -20481, -10496, -10401, -10361, -10321, -10281, -10241, -256, -161, -121, -81, -41, -1, -16250872, -15592942, -14935012, -14277082, -13619152, -12961222, -12303292, -11645362, -10987432, -10329502, -9671572, -9013642, -8355712, -7697782, -7039852, -6381922, -5723992, -5066062, -4408132, -3750202, -3092272, -2434342, -1776412, -1118482};
    static final d t = new d(-3355444, -16777216);
    private static final Matrix.ScaleToFit u = Matrix.ScaleToFit.FILL;
    protected boolean a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f9344b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f9345c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f9346d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f9347e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f9348f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f9349g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f9350h;

    /* renamed from: i  reason: collision with root package name */
    private final Path f9351i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f9352j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f9353k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f9354l;

    /* renamed from: m  reason: collision with root package name */
    private Matrix f9355m;
    private float n;
    private float o;
    private Bitmap p;
    private Bitmap q;
    private int r = -1;

    public a(d dVar) {
        dVar = dVar == null ? t : dVar;
        a(dVar);
        this.f9345c = new Paint();
        this.f9345c.setColor(dVar.b());
        this.f9347e = new Paint();
        this.f9347e.setColor(-7303024);
        this.f9347e.setAntiAlias(true);
        this.f9348f = new Paint(this.f9347e);
        this.f9348f.setStrokeWidth(0.1f);
        this.f9348f.setStyle(Paint.Style.STROKE);
        this.f9346d = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f9346d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f9349g = new Path();
        this.f9349g.lineTo(0.5f, 0.33f);
        this.f9349g.lineTo(1.0f, 0.0f);
        this.f9350h = new Path();
        this.f9350h.moveTo(0.0f, 1.0f);
        this.f9350h.lineTo(0.5f, 0.66f);
        this.f9350h.lineTo(1.0f, 1.0f);
        this.f9351i = new Path();
        this.f9351i.moveTo(0.0f, 0.25f);
        this.f9351i.lineTo(1.0f, 0.5f);
        this.f9351i.lineTo(0.0f, 0.75f);
        this.f9352j = new Path();
        this.f9352j.moveTo(1.0f, 0.25f);
        this.f9352j.lineTo(0.0f, 0.5f);
        this.f9352j.lineTo(1.0f, 0.75f);
        this.f9353k = new RectF();
        this.f9353k.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.f9354l = new RectF();
        this.f9355m = new Matrix();
    }

    private void a(Canvas canvas, Path path, int i2, int i3) {
        Paint paint;
        int i4 = (i2 >> i3) & 3;
        if (i4 == 1) {
            paint = this.f9348f;
        } else if (i4 == 2) {
            paint = this.f9347e;
        } else {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(d dVar) {
        this.f9344b = d();
        this.f9344b[256] = dVar.d();
        this.f9344b[257] = dVar.a();
        this.f9344b[258] = dVar.c();
        this.f9344b[259] = dVar.b();
    }

    private static int[] d() {
        int[] iArr = s;
        int[] iArr2 = new int[260];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas, float f2, float f3, float f4, float f5, int i2) {
        if (i2 == 0) {
            canvas.drawRect(f2, f3 - f5, f2 + f4, f3, this.f9345c);
            return;
        }
        if (!(f4 == this.n && f5 == this.o)) {
            this.n = f4;
            this.o = f5;
            this.f9354l.set(0.0f, 0.0f, f4, f5);
            this.f9355m.setRectToRect(this.f9353k, this.f9354l, u);
            int i3 = (int) f4;
            int i4 = (int) f5;
            this.p = Bitmap.createBitmap(i3, i4, Bitmap.Config.ALPHA_8);
            this.q = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            this.r = -1;
        }
        if (i2 != this.r) {
            this.r = i2;
            this.q.eraseColor(-1);
            Canvas canvas2 = new Canvas(this.q);
            canvas2.concat(this.f9355m);
            a(canvas2, this.f9349g, i2, 0);
            a(canvas2, this.f9350h, i2, 2);
            a(canvas2, this.f9351i, i2, 4);
            a(canvas2, this.f9352j, i2, 6);
            this.p.eraseColor(0);
            new Canvas(this.p).drawBitmap(this.q, 0.0f, 0.0f, this.f9346d);
        }
        canvas.drawBitmap(this.p, f2, f3 - f5, this.f9345c);
    }

    @Override // iiec.androidterm.r.o
    public void a(boolean z) {
        this.a = z;
    }
}
