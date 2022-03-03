package e.b.b.b.k;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {
    private long a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f7824b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f7825c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f7826d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f7827e = 1;

    public i(long j2, long j3) {
        this.a = j2;
        this.f7824b = j3;
    }

    public i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = j2;
        this.f7824b = j3;
        this.f7825c = timeInterpolator;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.f7826d = valueAnimator.getRepeatCount();
        iVar.f7827e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.a : interpolator instanceof AccelerateInterpolator ? a.f7818b : interpolator instanceof DecelerateInterpolator ? a.f7819c : interpolator;
    }

    public long a() {
        return this.a;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.f7824b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f7825c;
        return timeInterpolator != null ? timeInterpolator : a.a;
    }

    public int d() {
        return this.f7826d;
    }

    public int e() {
        return this.f7827e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (a() == iVar.a() && b() == iVar.b() && d() == iVar.d() && e() == iVar.e()) {
            return c().getClass().equals(iVar.c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
