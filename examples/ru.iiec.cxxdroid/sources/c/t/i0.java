package c.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c.t.a;
import c.t.m;

public abstract class i0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ w a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2580b;

        a(i0 i0Var, w wVar, View view) {
            this.a = wVar;
            this.f2580b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.f2580b);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter implements m.f, a.AbstractC0062a {
        private final View a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2581b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f2582c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2583d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2584e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2585f = false;

        b(View view, int i2, boolean z) {
            this.a = view;
            this.f2581b = i2;
            this.f2582c = (ViewGroup) view.getParent();
            this.f2583d = z;
            a(true);
        }

        private void a() {
            if (!this.f2585f) {
                d0.a(this.a, this.f2581b);
                ViewGroup viewGroup = this.f2582c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (this.f2583d && this.f2584e != z && (viewGroup = this.f2582c) != null) {
                this.f2584e = z;
                x.a(viewGroup, z);
            }
        }

        @Override // c.t.m.f
        public void a(m mVar) {
        }

        @Override // c.t.m.f
        public void b(m mVar) {
            a(false);
        }

        @Override // c.t.m.f
        public void c(m mVar) {
            a(true);
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            a();
            mVar.b(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2585f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // c.t.a.AbstractC0062a
        public void onAnimationPause(Animator animator) {
            if (!this.f2585f) {
                d0.a(this.a, this.f2581b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        @Override // c.t.a.AbstractC0062a
        public void onAnimationResume(Animator animator) {
            if (!this.f2585f) {
                d0.a(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        boolean a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2586b;

        /* renamed from: c  reason: collision with root package name */
        int f2587c;

        /* renamed from: d  reason: collision with root package name */
        int f2588d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f2589e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f2590f;

        c() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f2589e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f2587c == 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c.t.i0.c b(c.t.s r8, c.t.s r9) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.i0.b(c.t.s, c.t.s):c.t.i0$c");
    }

    private void d(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.f2616b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.f2616b.getParent());
        int[] iArr = new int[2];
        sVar.f2616b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    public abstract Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator a(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f2616b.getParent();
            if (b(a(view, false), b(view, false)).a) {
                return null;
            }
        }
        return a(viewGroup, sVar2.f2616b, sVar, sVar2);
    }

    @Override // c.t.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        c b2 = b(sVar, sVar2);
        if (!b2.a) {
            return null;
        }
        if (b2.f2589e == null && b2.f2590f == null) {
            return null;
        }
        return b2.f2586b ? a(viewGroup, sVar, b2.f2587c, sVar2, b2.f2588d) : b(viewGroup, sVar, b2.f2587c, sVar2, b2.f2588d);
    }

    public void a(int i2) {
        if ((i2 & -4) == 0) {
            this.K = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // c.t.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // c.t.m
    public boolean a(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c b2 = b(sVar, sVar2);
        if (b2.a) {
            return b2.f2587c == 0 || b2.f2588d == 0;
        }
        return false;
    }

    public abstract Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator b(android.view.ViewGroup r7, c.t.s r8, int r9, c.t.s r10, int r11) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.i0.b(android.view.ViewGroup, c.t.s, int, c.t.s, int):android.animation.Animator");
    }

    @Override // c.t.m
    public void c(s sVar) {
        d(sVar);
    }

    @Override // c.t.m
    public String[] q() {
        return L;
    }
}
