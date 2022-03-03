package c.h.l;

import android.view.View;
import android.view.ViewTreeObserver;

public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f2459b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f2460c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f2461d;

    private x(View view, Runnable runnable) {
        this.f2459b = view;
        this.f2460c = view.getViewTreeObserver();
        this.f2461d = runnable;
    }

    public static x a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            x xVar = new x(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(xVar);
            view.addOnAttachStateChangeListener(xVar);
            return xVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void a() {
        (this.f2460c.isAlive() ? this.f2460c : this.f2459b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2459b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.f2461d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2460c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
