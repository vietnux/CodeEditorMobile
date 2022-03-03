package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import c.h.l.b0;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class a {
    static final TimeInterpolator B = e.b.b.b.k.a.f7818b;
    static final int[] C = {16842919, 16842910};
    static final int[] D = {16843623, 16842908, 16842910};
    static final int[] E = {16842908, 16842910};
    static final int[] F = {16843623, 16842910};
    static final int[] G = {16842910};
    static final int[] H = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;
    int a = 0;

    /* renamed from: b  reason: collision with root package name */
    Animator f6377b;

    /* renamed from: c  reason: collision with root package name */
    e.b.b.b.k.h f6378c;

    /* renamed from: d  reason: collision with root package name */
    e.b.b.b.k.h f6379d;

    /* renamed from: e  reason: collision with root package name */
    private e.b.b.b.k.h f6380e;

    /* renamed from: f  reason: collision with root package name */
    private e.b.b.b.k.h f6381f;

    /* renamed from: g  reason: collision with root package name */
    private final k f6382g;

    /* renamed from: h  reason: collision with root package name */
    e.b.b.b.q.a f6383h;

    /* renamed from: i  reason: collision with root package name */
    private float f6384i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f6385j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f6386k;

    /* renamed from: l  reason: collision with root package name */
    com.google.android.material.internal.a f6387l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f6388m;
    float n;
    float o;
    float p;
    int q;
    float r = 1.0f;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<Animator.AnimatorListener> t;
    final n u;
    final e.b.b.b.q.b v;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    public class C0088a extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6389b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f6390c;

        C0088a(boolean z, g gVar) {
            this.f6389b = z;
            this.f6390c = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.a = 0;
            aVar.f6377b = null;
            if (!this.a) {
                aVar.u.a(this.f6389b ? 8 : 4, this.f6389b);
                g gVar = this.f6390c;
                if (gVar != null) {
                    gVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.u.a(0, this.f6389b);
            a aVar = a.this;
            aVar.a = 1;
            aVar.f6377b = animator;
            this.a = false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f6392b;

        b(boolean z, g gVar) {
            this.a = z;
            this.f6392b = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.a = 0;
            aVar.f6377b = null;
            g gVar = this.f6392b;
            if (gVar != null) {
                gVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.u.a(0, this.a);
            a aVar = a.this;
            aVar.a = 2;
            aVar.f6377b = animator;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        public boolean onPreDraw() {
            a.this.p();
            return true;
        }
    }

    private class d extends i {
        d(a aVar) {
            super(aVar, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public float a() {
            return 0.0f;
        }
    }

    private class e extends i {
        e() {
            super(a.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.o;
        }
    }

    private class f extends i {
        f() {
            super(a.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.p;
        }
    }

    /* access modifiers changed from: package-private */
    public interface g {
        void a();

        void b();
    }

    private class h extends i {
        h() {
            super(a.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public float a() {
            return a.this.n;
        }
    }

    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;

        /* renamed from: b  reason: collision with root package name */
        private float f6398b;

        /* renamed from: c  reason: collision with root package name */
        private float f6399c;

        private i() {
        }

        /* synthetic */ i(a aVar, C0088a aVar2) {
            this();
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            a.this.f6383h.b(this.f6399c);
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                this.f6398b = a.this.f6383h.b();
                this.f6399c = a();
                this.a = true;
            }
            e.b.b.b.q.a aVar = a.this.f6383h;
            float f2 = this.f6398b;
            aVar.b(f2 + ((this.f6399c - f2) * valueAnimator.getAnimatedFraction()));
        }
    }

    a(n nVar, e.b.b.b.q.b bVar) {
        this.u = nVar;
        this.v = bVar;
        this.f6382g = new k();
        this.f6382g.a(C, a((i) new f()));
        this.f6382g.a(D, a((i) new e()));
        this.f6382g.a(E, a((i) new e()));
        this.f6382g.a(F, a((i) new e()));
        this.f6382g.a(G, a((i) new h()));
        this.f6382g.a(H, a((i) new d(this)));
        this.f6384i = this.u.getRotation();
    }

    private AnimatorSet a(e.b.b.b.k.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, View.ALPHA, f2);
        hVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.u, View.SCALE_X, f3);
        hVar.a("scale").a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.u, View.SCALE_Y, f3);
        hVar.a("scale").a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.u, new e.b.b.b.k.f(), new e.b.b.b.k.g(), new Matrix(this.z));
        hVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e.b.b.b.k.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.u.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.x;
            RectF rectF2 = this.y;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private void t() {
        if (this.A == null) {
            this.A = new c();
        }
    }

    private e.b.b.b.k.h u() {
        if (this.f6381f == null) {
            this.f6381f = e.b.b.b.k.h.a(this.u.getContext(), e.b.b.b.a.design_fab_hide_motion_spec);
        }
        return this.f6381f;
    }

    private e.b.b.b.k.h v() {
        if (this.f6380e == null) {
            this.f6380e = e.b.b.b.k.h.a(this.u.getContext(), e.b.b.b.a.design_fab_show_motion_spec);
        }
        return this.f6380e;
    }

    private boolean w() {
        return b0.I(this.u) && !this.u.isInEditMode();
    }

    private void x() {
        int i2;
        n nVar;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f6384i % 90.0f != 0.0f) {
                i2 = 1;
                if (this.u.getLayerType() != 1) {
                    nVar = this.u;
                }
            } else if (this.u.getLayerType() != 0) {
                nVar = this.u;
                i2 = 0;
            }
            nVar.setLayerType(i2, null);
        }
        e.b.b.b.q.a aVar = this.f6383h;
        if (aVar != null) {
            aVar.a(-this.f6384i);
        }
        com.google.android.material.internal.a aVar2 = this.f6387l;
        if (aVar2 != null) {
            aVar2.b(-this.f6384i);
        }
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable a() {
        GradientDrawable l2 = l();
        l2.setShape(1);
        l2.setColor(-1);
        return l2;
    }

    /* access modifiers changed from: package-private */
    public com.google.android.material.internal.a a(int i2, ColorStateList colorStateList) {
        Context context = this.u.getContext();
        com.google.android.material.internal.a k2 = k();
        k2.a(c.h.d.a.a(context, e.b.b.b.c.design_fab_stroke_top_outer_color), c.h.d.a.a(context, e.b.b.b.c.design_fab_stroke_top_inner_color), c.h.d.a.a(context, e.b.b.b.c.design_fab_stroke_end_inner_color), c.h.d.a.a(context, e.b.b.b.c.design_fab_stroke_end_outer_color));
        k2.a((float) i2);
        k2.a(colorStateList);
        return k2;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.n != f2) {
            this.n = f2;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, float f4) {
        e.b.b.b.q.a aVar = this.f6383h;
        if (aVar != null) {
            aVar.a(f2, this.p + f2);
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.q != i2) {
            this.q = i2;
            r();
        }
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable = this.f6385j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        }
        com.google.android.material.internal.a aVar = this.f6387l;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable[] drawableArr;
        this.f6385j = androidx.core.graphics.drawable.a.i(a());
        androidx.core.graphics.drawable.a.a(this.f6385j, colorStateList);
        if (mode != null) {
            androidx.core.graphics.drawable.a.a(this.f6385j, mode);
        }
        this.f6386k = androidx.core.graphics.drawable.a.i(a());
        androidx.core.graphics.drawable.a.a(this.f6386k, e.b.b.b.p.a.a(colorStateList2));
        if (i2 > 0) {
            this.f6387l = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f6387l, this.f6385j, this.f6386k};
        } else {
            this.f6387l = null;
            drawableArr = new Drawable[]{this.f6385j, this.f6386k};
        }
        this.f6388m = new LayerDrawable(drawableArr);
        Context context = this.u.getContext();
        Drawable drawable = this.f6388m;
        float b2 = this.v.b();
        float f2 = this.n;
        this.f6383h = new e.b.b.b.q.a(context, drawable, b2, f2, f2 + this.p);
        this.f6383h.a(false);
        this.v.a(this.f6383h);
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        Drawable drawable = this.f6385j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        this.f6383h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void a(g gVar, boolean z2) {
        if (!h()) {
            Animator animator = this.f6377b;
            if (animator != null) {
                animator.cancel();
            }
            if (w()) {
                e.b.b.b.k.h hVar = this.f6379d;
                if (hVar == null) {
                    hVar = u();
                }
                AnimatorSet a2 = a(hVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new C0088a(z2, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.u.a(z2 ? 8 : 4, z2);
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(e.b.b.b.k.h hVar) {
        this.f6379d = hVar;
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.f6382g.a(iArr);
    }

    /* access modifiers changed from: package-private */
    public final Drawable b() {
        return this.f6388m;
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2) {
        if (this.o != f2) {
            this.o = f2;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f6386k;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, e.b.b.b.p.a.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    public void b(g gVar, boolean z2) {
        if (!i()) {
            Animator animator = this.f6377b;
            if (animator != null) {
                animator.cancel();
            }
            if (w()) {
                if (this.u.getVisibility() != 0) {
                    this.u.setAlpha(0.0f);
                    this.u.setScaleY(0.0f);
                    this.u.setScaleX(0.0f);
                    c(0.0f);
                }
                e.b.b.b.k.h hVar = this.f6378c;
                if (hVar == null) {
                    hVar = v();
                }
                AnimatorSet a2 = a(hVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new b(z2, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.u.a(0, z2);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            c(1.0f);
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(e.b.b.b.k.h hVar) {
        this.f6378c = hVar;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final void c(float f2) {
        this.r = f2;
        Matrix matrix = this.z;
        a(f2, matrix);
        this.u.setImageMatrix(matrix);
    }

    public void c(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final e.b.b.b.k.h d() {
        return this.f6379d;
    }

    /* access modifiers changed from: package-private */
    public final void d(float f2) {
        if (this.p != f2) {
            this.p = f2;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final e.b.b.b.k.h g() {
        return this.f6378c;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.u.getVisibility() == 0 ? this.a == 1 : this.a != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.u.getVisibility() != 0 ? this.a == 2 : this.a != 1;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f6382g.a();
    }

    /* access modifiers changed from: package-private */
    public com.google.android.material.internal.a k() {
        return new com.google.android.material.internal.a();
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable l() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (q()) {
            t();
            this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (this.A != null) {
            this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
            this.A = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        float rotation = this.u.getRotation();
        if (this.f6384i != rotation) {
            this.f6384i = rotation;
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        c(this.r);
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        Rect rect = this.w;
        a(rect);
        b(rect);
        this.v.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
