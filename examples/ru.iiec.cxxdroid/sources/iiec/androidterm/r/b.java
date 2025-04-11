package iiec.androidterm.r;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* access modifiers changed from: package-private */
public class b extends a {
    private Bitmap v;
    private int w;
    private int x;
    private float[] y;
    private Paint z;

    public b(Resources resources, d dVar) {
        super(dVar);
        this.v = BitmapFactory.decodeResource(resources, iiec.androidterm.r.t.b.a <= 3 ? i.atari_small : i.atari_small_nodpi);
        this.z = new Paint();
        this.z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private void a(int i2, int i3) {
        if (!(i2 == this.w && i3 == this.x && this.y != null)) {
            this.w = i2;
            this.x = i3;
            if (this.y == null) {
                this.y = new float[20];
                this.y[18] = 1.0f;
            }
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = (2 - i4) << 3;
                int i6 = (i2 >> i5) & 255;
                float[] fArr = this.y;
                fArr[i4 * 6] = ((float) (((i3 >> i5) & 255) - i6)) * 0.003921569f;
                fArr[(i4 * 5) + 4] = (float) i6;
            }
            this.z.setColorFilter(new ColorMatrixColorFilter(this.y));
        }
    }

    private void a(Canvas canvas, float f2, float f3, int i2, char[] cArr, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f9344b;
        a(iArr[i5], iArr[i6]);
        int i7 = ((int) f2) + (i2 * 4);
        int i8 = (int) f3;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.top = i8 - 8;
        rect2.bottom = i8;
        int[] iArr2 = this.f9344b;
        boolean z2 = iArr2[i6] != iArr2[257];
        for (int i9 = 0; i9 < i4; i9++) {
            char c2 = cArr[i9 + i3];
            if (c2 < 128 && (c2 != ' ' || z2)) {
                int i10 = (c2 & 31) * 4;
                int i11 = ((c2 >> 5) & 3) * 8;
                rect.set(i10, i11, i10 + 4, i11 + 8);
                rect2.left = i7;
                rect2.right = i7 + 4;
                canvas.drawBitmap(this.v, rect, rect2, this.z);
            }
            i7 += 4;
        }
    }

    @Override // iiec.androidterm.r.o
    public float a() {
        return 4.0f;
    }

    @Override // iiec.androidterm.r.o
    public void a(Canvas canvas, float f2, float f3, int i2, int i3, char[] cArr, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10, int i11) {
        int c2 = p.c(i6);
        int a = p.a(i6);
        int b2 = p.b(i6);
        boolean z3 = false;
        if (this.a ^ ((b2 & 18) != 0)) {
            a = c2;
            c2 = a;
        }
        if (((b2 & 1) != 0) && c2 < 8) {
            c2 += 8;
        }
        if (((b2 & 8) != 0) && a < 8) {
            a += 8;
        }
        int i12 = z2 ? 259 : a;
        if ((b2 & 32) != 0) {
            z3 = true;
        }
        a(canvas, f2, f3, i2, cArr, i4, i5, z3 ? i12 : c2, i12);
        if (i2 <= i7 && i7 < i2 + i5) {
            a(canvas, f2, f3, i7, cArr, i7 - i2, 1, 258, 259);
        }
    }

    @Override // iiec.androidterm.r.o
    public int b() {
        return 8;
    }

    @Override // iiec.androidterm.r.o
    public int c() {
        return 0;
    }
}
