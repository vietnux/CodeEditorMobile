package e.b.b.b.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import e.b.b.b.l.d;

public final class a {

    /* renamed from: e.b.b.b.l.a$a  reason: collision with other inner class name */
    static class C0104a extends AnimatorListenerAdapter {
        final /* synthetic */ d a;

        C0104a(d dVar) {
            this.a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }

        public void onAnimationStart(Animator animator) {
            this.a.b();
        }
    }

    public static Animator.AnimatorListener a(d dVar) {
        return new C0104a(dVar);
    }

    public static Animator a(d dVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.c.a, d.b.f7831b, new d.e(f2, f3, f4));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f2, (int) f3, revealInfo.f7833c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
