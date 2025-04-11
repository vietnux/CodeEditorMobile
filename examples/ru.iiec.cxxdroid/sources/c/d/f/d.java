package c.d.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c.d.f.h;

/* access modifiers changed from: package-private */
public class d implements f {
    final RectF a = new RectF();

    class a implements h.a {
        a() {
        }

        @Override // c.d.f.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float width = (rectF.width() - f3) - 1.0f;
            float height = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                d.this.a.set(f5, f5, f4, f4);
                int save = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f6 = rectF.top;
                canvas.drawRect((rectF.left + f4) - 1.0f, f6, (rectF.right - f4) + 1.0f, f6 + f4, paint);
                float f7 = rectF.bottom;
                canvas.drawRect((rectF.left + f4) - 1.0f, f7 - f4, (rectF.right - f4) + 1.0f, f7, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    d() {
    }

    private h a(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new h(context.getResources(), colorStateList, f2, f3, f4);
    }

    private h j(e eVar) {
        return (h) eVar.d();
    }

    @Override // c.d.f.f
    public float a(e eVar) {
        return j(eVar).c();
    }

    @Override // c.d.f.f
    public void a() {
        h.r = new a();
    }

    @Override // c.d.f.f
    public void a(e eVar, float f2) {
        j(eVar).a(f2);
        d(eVar);
    }

    @Override // c.d.f.f
    public void a(e eVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        h a2 = a(context, colorStateList, f2, f3, f4);
        a2.a(eVar.b());
        eVar.a(a2);
        d(eVar);
    }

    @Override // c.d.f.f
    public void a(e eVar, ColorStateList colorStateList) {
        j(eVar).a(colorStateList);
    }

    @Override // c.d.f.f
    public ColorStateList b(e eVar) {
        return j(eVar).a();
    }

    @Override // c.d.f.f
    public void b(e eVar, float f2) {
        j(eVar).c(f2);
    }

    @Override // c.d.f.f
    public float c(e eVar) {
        return j(eVar).f();
    }

    @Override // c.d.f.f
    public void c(e eVar, float f2) {
        j(eVar).b(f2);
        d(eVar);
    }

    @Override // c.d.f.f
    public void d(e eVar) {
        Rect rect = new Rect();
        j(eVar).a(rect);
        eVar.a((int) Math.ceil((double) g(eVar)), (int) Math.ceil((double) f(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // c.d.f.f
    public float e(e eVar) {
        return j(eVar).b();
    }

    @Override // c.d.f.f
    public float f(e eVar) {
        return j(eVar).d();
    }

    @Override // c.d.f.f
    public float g(e eVar) {
        return j(eVar).e();
    }

    @Override // c.d.f.f
    public void h(e eVar) {
    }

    @Override // c.d.f.f
    public void i(e eVar) {
        j(eVar).a(eVar.b());
        d(eVar);
    }
}
