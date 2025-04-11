package c.f.b.a;

import android.view.View;
import c.f.a.k.a.c;
import c.f.a.k.a.f;

public abstract class d extends f {

    public static class a extends d {
        @Override // c.f.b.a.d
        public boolean a(View view, float f2, long j2, c cVar) {
            return this.f2095h;
        }

        public boolean a(View view, c cVar, float f2, long j2, double d2, double d3) {
            view.setRotation(a(f2, j2, view, cVar) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
            return this.f2095h;
        }
    }

    public float a(float f2, long j2, View view, c cVar) {
        this.a.a((double) f2, this.f2094g);
        float[] fArr = this.f2094g;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.f2095h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f2097j)) {
            cVar.a(view, this.f2093f, 0);
            throw null;
        } else {
            this.f2097j = (float) ((((double) this.f2097j) + ((((double) (j2 - this.f2096i)) * 1.0E-9d) * ((double) f3))) % 1.0d);
            cVar.a(view, this.f2093f, 0, this.f2097j);
            throw null;
        }
    }

    public abstract boolean a(View view, float f2, long j2, c cVar);
}
