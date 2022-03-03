package c.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import c.h.l.b0;
import java.util.Map;

public class c extends m {
    private static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> O = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P = new C0063c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, "position");
    private static k U = new k();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f2539b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2540c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f2541d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.a = viewGroup;
            this.f2539b = bitmapDrawable;
            this.f2540c = view;
            this.f2541d = f2;
        }

        public void onAnimationEnd(Animator animator) {
            d0.b(this.a).b(this.f2539b);
            d0.a(this.f2540c, this.f2541d);
        }
    }

    static class b extends Property<Drawable, PointF> {
        private Rect a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* renamed from: c.t.c$c  reason: collision with other inner class name */
    static class C0063c extends Property<k, PointF> {
        C0063c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.b(pointF);
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            d0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            d0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            d0.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k a;
        private k mViewBounds = this.a;

        h(c cVar, k kVar) {
            this.a = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f2543c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2544d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2545e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f2546f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f2547g;

        i(c cVar, View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f2542b = view;
            this.f2543c = rect;
            this.f2544d = i2;
            this.f2545e = i3;
            this.f2546f = i4;
            this.f2547g = i5;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                b0.a(this.f2542b, this.f2543c);
                d0.a(this.f2542b, this.f2544d, this.f2545e, this.f2546f, this.f2547g);
            }
        }
    }

    class j extends n {
        boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2548b;

        j(c cVar, ViewGroup viewGroup) {
            this.f2548b = viewGroup;
        }

        @Override // c.t.n, c.t.m.f
        public void b(m mVar) {
            x.a(this.f2548b, false);
        }

        @Override // c.t.n, c.t.m.f
        public void c(m mVar) {
            x.a(this.f2548b, true);
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            if (!this.a) {
                x.a(this.f2548b, false);
            }
            mVar.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static class k {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private int f2549b;

        /* renamed from: c  reason: collision with root package name */
        private int f2550c;

        /* renamed from: d  reason: collision with root package name */
        private int f2551d;

        /* renamed from: e  reason: collision with root package name */
        private View f2552e;

        /* renamed from: f  reason: collision with root package name */
        private int f2553f;

        /* renamed from: g  reason: collision with root package name */
        private int f2554g;

        k(View view) {
            this.f2552e = view;
        }

        private void a() {
            d0.a(this.f2552e, this.a, this.f2549b, this.f2550c, this.f2551d);
            this.f2553f = 0;
            this.f2554g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f2550c = Math.round(pointF.x);
            this.f2551d = Math.round(pointF.y);
            this.f2554g++;
            if (this.f2553f == this.f2554g) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.f2549b = Math.round(pointF.y);
            this.f2553f++;
            if (this.f2553f == this.f2554g) {
                a();
            }
        }
    }

    private boolean a(View view, View view2) {
        if (!this.M) {
            return true;
        }
        s a2 = a(view, true);
        if (a2 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a2.f2616b) {
            return true;
        }
        return false;
    }

    private void d(s sVar) {
        View view = sVar.f2616b;
        if (b0.I(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.a.put("android:changeBounds:parent", sVar.f2616b.getParent());
            if (this.M) {
                sVar.f2616b.getLocationInWindow(this.K);
                sVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
                sVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
            }
            if (this.L) {
                sVar.a.put("android:changeBounds:clip", b0.k(view));
            }
        }
    }

    @Override // c.t.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        Animator animator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.a;
        Map<String, Object> map2 = sVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f2616b;
        if (a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Rect rect4 = (Rect) sVar.a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            if (!this.L) {
                view = view2;
                d0.a(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        path = f().a((float) i4, (float) i6, (float) i5, (float) i7);
                        property = T;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = f.a(kVar, P, f().a((float) i4, (float) i6, (float) i5, (float) i7));
                        ObjectAnimator a3 = f.a(kVar, Q, f().a((float) i8, (float) i10, (float) i9, (float) i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a2, a3);
                        animatorSet.addListener(new h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    path = f().a((float) i8, (float) i10, (float) i9, (float) i11);
                    property = R;
                } else {
                    path = f().a((float) i4, (float) i6, (float) i5, (float) i7);
                    property = S;
                }
                animator = f.a(view, property, path);
            } else {
                view = view2;
                d0.a(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : f.a(view, T, f().a((float) i4, (float) i6, (float) i5, (float) i7));
                if (rect4 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                if (!rect.equals(rect6)) {
                    b0.a(view, rect);
                    k kVar2 = U;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect6;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    objectAnimator.addListener(new i(this, view, rect5, i5, i7, i9, i11));
                } else {
                    objectAnimator = null;
                }
                animator = r.a(a4, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.a(viewGroup4, true);
                a(new j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c2 = d0.c(view2);
        d0.a(view2, 0.0f);
        d0.b(viewGroup).a(bitmapDrawable);
        g f2 = f();
        int[] iArr = this.K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, i.a(O, f2.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c2));
        return ofPropertyValuesHolder;
    }

    @Override // c.t.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // c.t.m
    public void c(s sVar) {
        d(sVar);
    }

    @Override // c.t.m
    public String[] q() {
        return N;
    }
}
