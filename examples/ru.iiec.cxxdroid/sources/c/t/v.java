package c.t;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
public class v implements w {
    private final ViewGroupOverlay a;

    v(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // c.t.c0
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // c.t.w
    public void a(View view) {
        this.a.add(view);
    }

    @Override // c.t.c0
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // c.t.w
    public void b(View view) {
        this.a.remove(view);
    }
}
