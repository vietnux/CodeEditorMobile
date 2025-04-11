package c.d.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class c implements f {
    c() {
    }

    private g j(e eVar) {
        return (g) eVar.d();
    }

    @Override // c.d.f.f
    public float a(e eVar) {
        return j(eVar).b();
    }

    @Override // c.d.f.f
    public void a() {
    }

    @Override // c.d.f.f
    public void a(e eVar, float f2) {
        j(eVar).a(f2);
    }

    @Override // c.d.f.f
    public void a(e eVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        eVar.a(new g(colorStateList, f2));
        View a = eVar.a();
        a.setClipToOutline(true);
        a.setElevation(f3);
        c(eVar, f4);
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
        eVar.a().setElevation(f2);
    }

    @Override // c.d.f.f
    public float c(e eVar) {
        return eVar.a().getElevation();
    }

    @Override // c.d.f.f
    public void c(e eVar, float f2) {
        j(eVar).a(f2, eVar.c(), eVar.b());
        d(eVar);
    }

    @Override // c.d.f.f
    public void d(e eVar) {
        if (!eVar.c()) {
            eVar.a(0, 0, 0, 0);
            return;
        }
        float a = a(eVar);
        float e2 = e(eVar);
        int ceil = (int) Math.ceil((double) h.a(a, e2, eVar.b()));
        int ceil2 = (int) Math.ceil((double) h.b(a, e2, eVar.b()));
        eVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // c.d.f.f
    public float e(e eVar) {
        return j(eVar).c();
    }

    @Override // c.d.f.f
    public float f(e eVar) {
        return e(eVar) * 2.0f;
    }

    @Override // c.d.f.f
    public float g(e eVar) {
        return e(eVar) * 2.0f;
    }

    @Override // c.d.f.f
    public void h(e eVar) {
        c(eVar, a(eVar));
    }

    @Override // c.d.f.f
    public void i(e eVar) {
        c(eVar, a(eVar));
    }
}
