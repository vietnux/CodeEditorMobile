package c.d.f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c.d.f.h;

class b extends d {

    class a implements h.a {
        a(b bVar) {
        }

        @Override // c.d.f.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    b() {
    }

    @Override // c.d.f.f, c.d.f.d
    public void a() {
        h.r = new a(this);
    }
}
