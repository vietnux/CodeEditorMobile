package c.h.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class g0 {
    private WeakReference<View> a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f2402b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f2403c = null;

    /* renamed from: d  reason: collision with root package name */
    int f2404d = -1;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ h0 a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2405b;

        a(g0 g0Var, h0 h0Var, View view) {
            this.a = h0Var;
            this.f2405b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.f2405b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.f2405b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.f2405b);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ j0 a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2406b;

        b(g0 g0Var, j0 j0Var, View view) {
            this.a = j0Var;
            this.f2406b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.f2406b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements h0 {
        g0 a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2407b;

        c(g0 g0Var) {
            this.a = g0Var;
        }

        @Override // c.h.l.h0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            h0 h0Var = tag instanceof h0 ? (h0) tag : null;
            if (h0Var != null) {
                h0Var.a(view);
            }
        }

        @Override // c.h.l.h0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i2 = this.a.f2404d;
            h0 h0Var = null;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.a.f2404d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f2407b) {
                g0 g0Var = this.a;
                Runnable runnable = g0Var.f2403c;
                if (runnable != null) {
                    g0Var.f2403c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof h0) {
                    h0Var = (h0) tag;
                }
                if (h0Var != null) {
                    h0Var.b(view);
                }
                this.f2407b = true;
            }
        }

        @Override // c.h.l.h0
        public void c(View view) {
            this.f2407b = false;
            h0 h0Var = null;
            if (this.a.f2404d > -1) {
                view.setLayerType(2, null);
            }
            g0 g0Var = this.a;
            Runnable runnable = g0Var.f2402b;
            if (runnable != null) {
                g0Var.f2402b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof h0) {
                h0Var = (h0) tag;
            }
            if (h0Var != null) {
                h0Var.c(view);
            }
        }
    }

    g0(View view) {
        this.a = new WeakReference<>(view);
    }

    private void a(View view, h0 h0Var) {
        if (h0Var != null) {
            view.animate().setListener(new a(this, h0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public g0 a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public g0 a(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public g0 a(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public g0 a(h0 h0Var) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, h0Var);
                h0Var = new c(this);
            }
            a(view, h0Var);
        }
        return this;
    }

    public g0 a(j0 j0Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (j0Var != null) {
                bVar = new b(this, j0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void a() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public g0 b(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public g0 b(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
