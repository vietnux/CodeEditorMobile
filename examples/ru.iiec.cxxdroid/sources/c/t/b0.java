package c.t;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
public class b0 implements c0 {
    private final ViewOverlay a;

    b0(View view) {
        this.a = view.getOverlay();
    }

    @Override // c.t.c0
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // c.t.c0
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
