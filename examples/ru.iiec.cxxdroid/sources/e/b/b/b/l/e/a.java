package e.b.b.b.l.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import e.b.b.b.l.c;
import e.b.b.b.l.d;

public class a extends c.d.f.a implements d {

    /* renamed from: k  reason: collision with root package name */
    private final c f7834k;

    @Override // e.b.b.b.l.d
    public void a() {
        this.f7834k.b();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void b() {
        this.f7834k.a();
        throw null;
    }

    public void draw(Canvas canvas) {
        c cVar = this.f7834k;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f7834k.c();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public int getCircularRevealScrimColor() {
        this.f7834k.d();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public d.e getRevealInfo() {
        this.f7834k.e();
        throw null;
    }

    public boolean isOpaque() {
        c cVar = this.f7834k;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f7834k.a(drawable);
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setCircularRevealScrimColor(int i2) {
        this.f7834k.a(i2);
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setRevealInfo(d.e eVar) {
        this.f7834k.a(eVar);
        throw null;
    }
}
