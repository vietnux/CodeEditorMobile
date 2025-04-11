package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.z;
import c.h.h.b;
import c.h.l.x;

/* access modifiers changed from: package-private */
public class f {

    /* access modifiers changed from: package-private */
    public class a implements b.a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // c.h.h.b.a
        public void a() {
            if (this.a.i() != null) {
                View i2 = this.a.i();
                this.a.a((View) null);
                i2.clearAnimation();
            }
            this.a.a((Animator) null);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1285b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.g f1286c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.h.h.b f1287d;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f1285b.i() != null) {
                    b.this.f1285b.a((View) null);
                    b bVar = b.this;
                    bVar.f1286c.a(bVar.f1285b, bVar.f1287d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, z.g gVar, c.h.h.b bVar) {
            this.a = viewGroup;
            this.f1285b = fragment;
            this.f1286c = gVar;
            this.f1287d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.g f1291d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c.h.h.b f1292e;

        c(ViewGroup viewGroup, View view, Fragment fragment, z.g gVar, c.h.h.b bVar) {
            this.a = viewGroup;
            this.f1289b = view;
            this.f1290c = fragment;
            this.f1291d = gVar;
            this.f1292e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1289b);
            Animator j2 = this.f1290c.j();
            this.f1290c.a((Animator) null);
            if (j2 != null && this.a.indexOfChild(this.f1289b) < 0) {
                this.f1291d.a(this.f1290c, this.f1292e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {
        public final Animation a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1293b;

        d(Animator animator) {
            this.a = null;
            this.f1293b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.a = animation;
            this.f1293b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f1294b;

        /* renamed from: c  reason: collision with root package name */
        private final View f1295c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1296d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1297e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1298f = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1294b = viewGroup;
            this.f1295c = view;
            addAnimation(animation);
            this.f1294b.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1298f = true;
            if (this.f1296d) {
                return !this.f1297e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1296d = true;
                x.a(this.f1294b, this);
            }
            return true;
        }

        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1298f = true;
            if (this.f1296d) {
                return !this.f1297e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1296d = true;
                x.a(this.f1294b, this);
            }
            return true;
        }

        public void run() {
            if (this.f1296d || !this.f1298f) {
                this.f1294b.endViewTransition(this.f1295c);
                this.f1297e = true;
                return;
            }
            this.f1298f = false;
            this.f1294b.post(this);
        }
    }

    private static int a(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? c.m.a.fragment_open_enter : c.m.a.fragment_open_exit;
        }
        if (i2 == 4099) {
            return z ? c.m.a.fragment_fade_enter : c.m.a.fragment_fade_exit;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? c.m.a.fragment_close_enter : c.m.a.fragment_close_exit;
    }

    private static int a(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.A() : fragment.B() : z ? fragment.n() : fragment.q();
    }

    static d a(Context context, Fragment fragment, boolean z, boolean z2) {
        int w = fragment.w();
        int a2 = a(fragment, z, z2);
        boolean z3 = false;
        fragment.a(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.H;
        if (!(viewGroup == null || viewGroup.getTag(c.m.b.visible_removing_fragment_view_tag) == null)) {
            fragment.H.setTag(c.m.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation a3 = fragment.a(w, z, a2);
        if (a3 != null) {
            return new d(a3);
        }
        Animator b2 = fragment.b(w, z, a2);
        if (b2 != null) {
            return new d(b2);
        }
        if (a2 == 0 && w != 0) {
            a2 = a(w, z);
        }
        if (a2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }

    static void a(Fragment fragment, d dVar, z.g gVar) {
        View view = fragment.I;
        ViewGroup viewGroup = fragment.H;
        viewGroup.startViewTransition(view);
        c.h.h.b bVar = new c.h.h.b();
        bVar.a(new a(fragment));
        gVar.b(fragment, bVar);
        Animation animation = dVar.a;
        if (animation != null) {
            e eVar = new e(animation, viewGroup, view);
            fragment.a(fragment.I);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.I.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f1293b;
        fragment.a(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.I);
        animator.start();
    }
}
