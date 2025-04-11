package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.j.b.b;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    c.j.b.b a;

    /* renamed from: b  reason: collision with root package name */
    b f6303b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6304c;

    /* renamed from: d  reason: collision with root package name */
    private float f6305d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6306e;

    /* renamed from: f  reason: collision with root package name */
    int f6307f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f6308g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f6309h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f6310i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final b.c f6311j = new a();

    class a extends b.c {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private int f6312b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = c.h.l.b0.r(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f6307f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f6308g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, float):boolean");
        }

        @Override // c.j.b.b.c
        public int a(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.a;
            r3 = r3.getWidth() + r5;
         */
        @Override // c.j.b.b.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = c.h.l.b0.r(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6307f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // c.j.b.b.c
        public void a(View view, float f2, float f3) {
            boolean z;
            int i2;
            b bVar;
            this.f6312b = -1;
            int width = view.getWidth();
            if (a(view, f2)) {
                int left = view.getLeft();
                int i3 = this.a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.d(i2, view.getTop())) {
                b0.a(view, new c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f6303b) != null) {
                bVar.a(view);
            }
        }

        @Override // c.j.b.b.c
        public void a(View view, int i2) {
            this.f6312b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // c.j.b.b.c
        public void a(View view, int i2, int i3, int i4, int i5) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6309h);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6310i);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f2), 1.0f));
            }
        }

        @Override // c.j.b.b.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // c.j.b.b.c
        public boolean b(View view, int i2) {
            return this.f6312b == -1 && SwipeDismissBehavior.this.a(view);
        }

        @Override // c.j.b.b.c
        public void c(int i2) {
            b bVar = SwipeDismissBehavior.this.f6303b;
            if (bVar != null) {
                bVar.a(i2);
            }
        }
    }

    public interface b {
        void a(int i2);

        void a(View view);
    }

    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f6314b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6315c;

        c(View view, boolean z) {
            this.f6314b = view;
            this.f6315c = z;
        }

        public void run() {
            b bVar;
            c.j.b.b bVar2 = SwipeDismissBehavior.this.a;
            if (bVar2 != null && bVar2.a(true)) {
                b0.a(this.f6314b, this);
            } else if (this.f6315c && (bVar = SwipeDismissBehavior.this.f6303b) != null) {
                bVar.a(this.f6314b);
            }
        }
    }

    static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void a(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.f6306e ? c.j.b.b.a(viewGroup, this.f6305d, this.f6311j) : c.j.b.b.a(viewGroup, this.f6311j);
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public void a(float f2) {
        this.f6310i = a(0.0f, f2, 1.0f);
    }

    public void a(int i2) {
        this.f6307f = i2;
    }

    public void a(b bVar) {
        this.f6303b = bVar;
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f6304c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6304c = coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f6304c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6304c = false;
        }
        if (!z) {
            return false;
        }
        a((ViewGroup) coordinatorLayout);
        return this.a.b(motionEvent);
    }

    public void b(float f2) {
        this.f6309h = a(0.0f, f2, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        c.j.b.b bVar = this.a;
        if (bVar == null) {
            return false;
        }
        bVar.a(motionEvent);
        return true;
    }
}
