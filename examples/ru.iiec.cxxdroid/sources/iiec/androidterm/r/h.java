package iiec.androidterm.r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* access modifiers changed from: package-private */
public class h extends a {
    private static final char[] A = {'X'};
    private Paint v = new Paint();
    private float w;
    private int x;
    private int y;
    private int z;

    public h(int i2, d dVar) {
        super(dVar);
        this.v.setTypeface(Typeface.MONOSPACE);
        this.v.setAntiAlias(true);
        this.v.setTextSize((float) i2);
        this.x = (int) Math.ceil((double) this.v.getFontSpacing());
        this.y = (int) Math.ceil((double) this.v.ascent());
        this.z = this.x + this.y;
        this.w = this.v.measureText(A, 0, 1);
    }

    @Override // iiec.androidterm.r.o
    public float a() {
        return this.w;
    }

    @Override // iiec.androidterm.r.o
    public void a(Canvas canvas, float f2, float f3, int i2, int i3, char[] cArr, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        float f4;
        int c2 = p.c(i6);
        int a = p.a(i6);
        int b2 = p.b(i6);
        if (this.a ^ ((b2 & 18) != 0)) {
            i12 = a;
        } else {
            i12 = c2;
            c2 = a;
        }
        if (z2) {
            c2 = 259;
        }
        if (((b2 & 8) != 0) && c2 < 8) {
            c2 += 8;
        }
        this.v.setColor(this.f9344b[c2]);
        float f5 = this.w;
        float f6 = f2 + (((float) i2) * f5);
        canvas.drawRect(f6, (f3 + ((float) this.y)) - ((float) this.z), f6 + (((float) i3) * f5), f3, this.v);
        boolean z3 = i2 <= i7 && i7 < i2 + i3;
        if (z3) {
            float f7 = this.w;
            f4 = f2 + (((float) i7) * f7);
            a(canvas, (float) ((int) f4), f3, ((float) i10) * f7, (float) this.x, i11);
        } else {
            f4 = 0.0f;
        }
        if (!((b2 & 32) != 0)) {
            boolean z4 = (b2 & 1) != 0;
            boolean z5 = (b2 & 4) != 0;
            if (z4) {
                this.v.setFakeBoldText(true);
            }
            if (z5) {
                this.v.setUnderlineText(true);
            }
            int i13 = (i12 >= 8 || !z4) ? this.f9344b[i12] : this.f9344b[i12 + 8];
            this.v.setColor(i13);
            float f8 = f3 - ((float) this.z);
            if (z3) {
                int i14 = i8 - i4;
                int i15 = i5 - (i14 + i9);
                if (i14 > 0) {
                    canvas.drawText(cArr, i4, i14, f6, f8, this.v);
                }
                this.v.setColor(this.f9344b[258]);
                canvas.drawText(cArr, i8, i9, f4, f8, this.v);
                if (i15 > 0) {
                    this.v.setColor(i13);
                    canvas.drawText(cArr, i8 + i9, i15, (((float) i10) * this.w) + f4, f8, this.v);
                }
            } else {
                canvas.drawText(cArr, i4, i5, f6, f8, this.v);
            }
            if (z4) {
                this.v.setFakeBoldText(false);
            }
            if (z5) {
                this.v.setUnderlineText(false);
            }
        }
    }

    @Override // iiec.androidterm.r.o
    public int b() {
        return this.x;
    }

    @Override // iiec.androidterm.r.o
    public int c() {
        return this.z;
    }
}
