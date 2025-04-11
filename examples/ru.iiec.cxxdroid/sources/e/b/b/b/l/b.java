package e.b.b.b.l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import e.b.b.b.l.d;

public class b extends FrameLayout implements d {

    /* renamed from: b  reason: collision with root package name */
    private final c f7830b;

    @Override // e.b.b.b.l.d
    public void a() {
        this.f7830b.b();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void b() {
        this.f7830b.a();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f7830b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f7830b.c();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public int getCircularRevealScrimColor() {
        this.f7830b.d();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public d.e getRevealInfo() {
        this.f7830b.e();
        throw null;
    }

    public boolean isOpaque() {
        c cVar = this.f7830b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f7830b.a(drawable);
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setCircularRevealScrimColor(int i2) {
        this.f7830b.a(i2);
        throw null;
    }

    @Override // e.b.b.b.l.d
    public void setRevealInfo(d.e eVar) {
        this.f7830b.a(eVar);
        throw null;
    }
}
