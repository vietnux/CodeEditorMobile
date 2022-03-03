package e.b.b.b.l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import e.b.b.b.l.c;

public interface d extends c.a {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f7831b = new b();
        private final e a = new e();

        /* renamed from: a */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.a.a(e.b.b.b.n.a.a(eVar.a, eVar2.a, f2), e.b.b.b.n.a.a(eVar.f7832b, eVar2.f7832b, f2), e.b.b.b.n.a.a(eVar.f7833c, eVar2.f7833c, f2));
            return this.a;
        }
    }

    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: e.b.b.b.l.d$d  reason: collision with other inner class name */
    public static class C0105d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0105d("circularRevealScrimColor");

        private C0105d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f7832b;

        /* renamed from: c  reason: collision with root package name */
        public float f7833c;

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.f7832b = f3;
            this.f7833c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.a = f2;
            this.f7832b = f3;
            this.f7833c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
