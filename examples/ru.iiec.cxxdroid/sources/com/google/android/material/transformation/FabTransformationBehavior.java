package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.b.b.b.f;
import e.b.b.b.k.h;
import e.b.b.b.k.i;
import e.b.b.b.k.j;
import e.b.b.b.l.d;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f6556c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f6557d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f6558e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f6559f;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6561c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.f6560b = view;
            this.f6561c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.f6560b.setVisibility(4);
                this.f6561c.setAlpha(1.0f);
                this.f6561c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.f6560b.setVisibility(0);
                this.f6561c.setAlpha(0.0f);
                this.f6561c.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ e.b.b.b.l.d a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f6562b;

        c(FabTransformationBehavior fabTransformationBehavior, e.b.b.b.l.d dVar, Drawable drawable) {
            this.a = dVar;
            this.f6562b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.f6562b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ e.b.b.b.l.d a;

        d(FabTransformationBehavior fabTransformationBehavior, e.b.b.b.l.d dVar) {
            this.a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.a.getRevealInfo();
            revealInfo.f7833c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    /* access modifiers changed from: protected */
    public static class e {
        public h a;

        /* renamed from: b  reason: collision with root package name */
        public j f6563b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f6556c = new Rect();
        this.f6557d = new RectF();
        this.f6558e = new RectF();
        this.f6559f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6556c = new Rect();
        this.f6557d = new RectF();
        this.f6558e = new RectF();
        this.f6559f = new int[2];
    }

    private float a(View view, View view2, j jVar) {
        RectF rectF = this.f6557d;
        RectF rectF2 = this.f6558e;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(-c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float a(e eVar, i iVar, float f2, float f3) {
        long a2 = iVar.a();
        long b2 = iVar.b();
        i a3 = eVar.a.a("expansion");
        return e.b.b.b.k.a.a(f2, f3, iVar.c().getInterpolation(((float) (((a3.a() + a3.b()) + 17) - a2)) / ((float) b2)));
    }

    private ViewGroup a(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        return findViewById != null ? c(findViewById) : ((view instanceof b) || (view instanceof a)) ? c(((ViewGroup) view).getChildAt(0)) : c(view);
    }

    private void a(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j2 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j2);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                createCircularReveal.setStartDelay(j5);
                createCircularReveal.setDuration(j4 - j5);
                list.add(createCircularReveal);
            }
        }
    }

    private void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f6559f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof e.b.b.b.l.d) {
            e.b.b.b.l.d dVar = (e.b.b.b.l.d) view2;
            float a2 = a(view, view2, eVar.f6563b);
            float b2 = b(view, view2, eVar.f6563b);
            ((FloatingActionButton) view).a(this.f6556c);
            float width = ((float) this.f6556c.width()) / 2.0f;
            i a3 = eVar.a.a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.e(a2, b2, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f7833c;
                }
                animator = e.b.b.b.l.a.a(dVar, a2, b2, e.b.b.b.n.a.a(a2, b2, 0.0f, 0.0f, f2, f3));
                animator.addListener(new d(this, dVar));
                a(view2, a3.a(), (int) a2, (int) b2, width, list);
            } else {
                float f4 = dVar.getRevealInfo().f7833c;
                Animator a4 = e.b.b.b.l.a.a(dVar, a2, b2, width);
                int i2 = (int) a2;
                int i3 = (int) b2;
                a(view2, a3.a(), i2, i3, f4, list);
                a(view2, a3.a(), a3.b(), eVar.a.a(), i2, i3, width, list);
                animator = a4;
            }
            a3.a(animator);
            list.add(animator);
            list2.add(e.b.b.b.l.a.a(dVar));
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a2;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof e.b.b.b.l.d) || e.b.b.b.l.c.a != 0) && (a2 = a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        e.b.b.b.k.d.a.set(a2, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a2, e.b.b.b.k.d.a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a2, e.b.b.b.k.d.a, 0.0f);
                }
                eVar.a.a("contentFade").a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        String str;
        h hVar;
        i iVar;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int i2;
        float c2 = c(view, view2, eVar.f6563b);
        float d2 = d(view, view2, eVar.f6563b);
        if (c2 == 0.0f || d2 == 0.0f) {
            iVar = eVar.a.a("translationXLinear");
            hVar = eVar.a;
            str = "translationYLinear";
        } else if ((!z || d2 >= 0.0f) && (z || i2 <= 0)) {
            iVar = eVar.a.a("translationXCurveDownwards");
            hVar = eVar.a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.a.a("translationXCurveUpwards");
            hVar = eVar.a;
            str = "translationYCurveUpwards";
        }
        i a2 = hVar.a(str);
        if (z) {
            if (!z2) {
                view2.setTranslationX(-c2);
                view2.setTranslationY(-d2);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            a(view2, eVar, iVar, a2, -c2, -d2, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -c2);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d2);
        }
        iVar.a((Animator) objectAnimator2);
        a2.a((Animator) objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    private void a(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float a2 = a(eVar, iVar, f2, f4);
        float a3 = a(eVar, iVar2, f3, f5);
        Rect rect = this.f6556c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f6557d;
        rectF2.set(rect);
        RectF rectF3 = this.f6558e;
        a(view, rectF3);
        rectF3.offset(a2, a3);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float b(View view, View view2, j jVar) {
        RectF rectF = this.f6557d;
        RectF rectF2 = this.f6558e;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(0.0f, -d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private int b(View view) {
        ColorStateList i2 = b0.i(view);
        if (i2 != null) {
            return i2.getColorForState(view.getDrawableState(), i2.getDefaultColor());
        }
        return 0;
    }

    private void b(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof e.b.b.b.l.d) {
            e.b.b.b.l.d dVar = (e.b.b.b.l.d) view2;
            int b2 = b(view);
            int i2 = 16777215 & b2;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b2);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0105d.a, i2);
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0105d.a, b2);
            }
            objectAnimator.setEvaluator(e.b.b.b.k.c.a());
            eVar.a.a("color").a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    private float c(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f6557d;
        RectF rectF2 = this.f6558e;
        a(view, rectF);
        a(view2, rectF2);
        int i2 = jVar.a & 7;
        if (i2 == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i2 == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i2 != 5) {
            f2 = 0.0f;
            return f2 + jVar.f7828b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + jVar.f7828b;
    }

    private ViewGroup c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    private void c(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float m2 = b0.m(view2) - b0.m(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m2);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m2);
        }
        eVar.a.a("elevation").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private float d(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f6557d;
        RectF rectF2 = this.f6558e;
        a(view, rectF);
        a(view2, rectF2);
        int i2 = jVar.a & 112;
        if (i2 == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i2 == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i2 != 80) {
            f2 = 0.0f;
            return f2 + jVar.f7829c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + jVar.f7829c;
    }

    private void d(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof e.b.b.b.l.d) && (view instanceof ImageView)) {
            e.b.b.b.l.d dVar = (e.b.b.b.l.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, e.b.b.b.k.e.f7821b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, e.b.b.b.k.e.f7821b, 255);
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.a.a("iconFade").a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract e a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        if (fVar.f976h == 0) {
            fVar.f976h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        e a2 = a(view2.getContext(), z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            c(view, view2, z, z2, a2, arrayList, arrayList2);
        }
        RectF rectF = this.f6557d;
        a(view, view2, z, z2, a2, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        d(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, width, height, arrayList, arrayList2);
        b(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        e.b.b.b.k.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }
}
