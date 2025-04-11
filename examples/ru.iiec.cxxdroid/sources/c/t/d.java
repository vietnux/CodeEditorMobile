package c.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import c.h.l.b0;

public class d extends i0 {

    /* access modifiers changed from: package-private */
    public class a extends n {
        final /* synthetic */ View a;

        a(d dVar, View view) {
            this.a = view;
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            d0.a(this.a, 1.0f);
            d0.a(this.a);
            mVar.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter {
        private final View a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f2555b = false;

        b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            d0.a(this.a, 1.0f);
            if (this.f2555b) {
                this.a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (b0.E(this.a) && this.a.getLayerType() == 0) {
                this.f2555b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public d(int i2) {
        a(i2);
    }

    private static float a(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    private Animator a(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        d0.a(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, d0.f2558d, f3);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // c.t.i0
    public Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float a2 = a(sVar, 0.0f);
        if (a2 != 1.0f) {
            f2 = a2;
        }
        return a(view, f2, 1.0f);
    }

    @Override // c.t.i0
    public Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        d0.e(view);
        return a(view, a(sVar, 1.0f), 0.0f);
    }

    @Override // c.t.i0, c.t.m
    public void c(s sVar) {
        super.c(sVar);
        sVar.a.put("android:fade:transitionAlpha", Float.valueOf(d0.c(sVar.f2616b)));
    }
}
