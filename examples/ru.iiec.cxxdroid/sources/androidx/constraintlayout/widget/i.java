package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.a.m.e;

public class i extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f952b;

    /* renamed from: c  reason: collision with root package name */
    private View f953c;

    /* renamed from: d  reason: collision with root package name */
    private int f954d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f953c != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f953c.getLayoutParams();
            bVar2.s0.t(0);
            if (bVar.s0.n() != e.b.FIXED) {
                bVar.s0.u(bVar2.s0.C());
            }
            if (bVar.s0.z() != e.b.FIXED) {
                bVar.s0.m(bVar2.s0.k());
            }
            bVar2.s0.t(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f952b == -1 && !isInEditMode()) {
            setVisibility(this.f954d);
        }
        this.f953c = constraintLayout.findViewById(this.f952b);
        View view = this.f953c;
        if (view != null) {
            ((ConstraintLayout.b) view.getLayoutParams()).g0 = true;
            this.f953c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f953c;
    }

    public int getEmptyVisibility() {
        return this.f954d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f952b != i2) {
            View view = this.f953c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f953c.getLayoutParams()).g0 = false;
                this.f953c = null;
            }
            this.f952b = i2;
            if (i2 != -1 && (findViewById = ((View) getParent()).findViewById(i2)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i2) {
        this.f954d = i2;
    }
}
