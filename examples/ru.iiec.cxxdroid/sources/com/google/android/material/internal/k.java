package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class k {
    private final ArrayList<b> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f6453b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f6454c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f6455d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            k kVar = k.this;
            if (kVar.f6454c == animator) {
                kVar.f6454c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        final int[] a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f6456b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.f6456b = valueAnimator;
        }
    }

    private void a(b bVar) {
        this.f6454c = bVar.f6456b;
        this.f6454c.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f6454c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6454c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f6454c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f6454c = null;
        }
    }

    public void a(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i2);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i2++;
        }
        b bVar2 = this.f6453b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f6453b = bVar;
            if (bVar != null) {
                a(bVar);
            }
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6455d);
        this.a.add(bVar);
    }
}
