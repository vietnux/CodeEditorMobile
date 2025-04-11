package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.l0.c;
import c.h.l.u;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: j  reason: collision with root package name */
    static final Handler f6468j = new Handler(Looper.getMainLooper(), new c());

    /* renamed from: k  reason: collision with root package name */
    private static final boolean f6469k;

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f6470l = {e.b.b.b.b.snackbarStyle};
    private final ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6471b;

    /* renamed from: c  reason: collision with root package name */
    protected final p f6472c;

    /* renamed from: d  reason: collision with root package name */
    private final a f6473d;

    /* renamed from: e  reason: collision with root package name */
    private int f6474e;

    /* renamed from: f  reason: collision with root package name */
    private List<l<B>> f6475f;

    /* renamed from: g  reason: collision with root package name */
    private Behavior f6476g;

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f6477h;

    /* renamed from: i  reason: collision with root package name */
    final b.AbstractC0091b f6478i = new f();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        private final m f6479k = new m(this);

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6479k.a(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean a(View view) {
            return this.f6479k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f6479k.a(coordinatorLayout, view, motionEvent);
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        a(int i2) {
            this.a = i2;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.c(this.a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f6473d.b(0, 180);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        private int a = 0;

        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f6469k) {
                b0.e(BaseTransientBottomBar.this.f6472c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.f6472c.setTranslationY((float) intValue);
            }
            this.a = intValue;
        }
    }

    static class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).l();
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).b(message.arg1);
                return true;
            }
        }
    }

    class d implements u {
        d(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), k0Var.g());
            return k0Var;
        }
    }

    class e extends c.h.l.c {
        e() {
        }

        @Override // c.h.l.c
        public void a(View view, c.h.l.l0.d dVar) {
            super.a(view, dVar);
            dVar.a(1048576);
            dVar.d(true);
        }

        @Override // c.h.l.c
        public boolean a(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.a(view, i2, bundle);
            }
            BaseTransientBottomBar.this.b();
            return true;
        }
    }

    class f implements b.AbstractC0091b {
        f() {
        }

        @Override // com.google.android.material.snackbar.b.AbstractC0091b
        public void a(int i2) {
            Handler handler = BaseTransientBottomBar.f6468j;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.AbstractC0091b
        public void e() {
            Handler handler = BaseTransientBottomBar.f6468j;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements SwipeDismissBehavior.b {
        g() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
        public void a(int i2) {
            if (i2 == 0) {
                b.a().e(BaseTransientBottomBar.this.f6478i);
            } else if (i2 == 1 || i2 == 2) {
                b.a().d(BaseTransientBottomBar.this.f6478i);
            }
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
        public void a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.a(0);
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements n {

        class a implements Runnable {
            a() {
            }

            public void run() {
                BaseTransientBottomBar.this.c(3);
            }
        }

        h() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.n
        public void onViewAttachedToWindow(View view) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.n
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.h()) {
                BaseTransientBottomBar.f6468j.post(new a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements o {
        i() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.o
        public void a(View view, int i2, int i3, int i4, int i5) {
            BaseTransientBottomBar.this.f6472c.setOnLayoutChangeListener(null);
            if (BaseTransientBottomBar.this.j()) {
                BaseTransientBottomBar.this.a();
            } else {
                BaseTransientBottomBar.this.i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class j extends AnimatorListenerAdapter {
        j() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.i();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f6473d.a(70, 180);
        }
    }

    /* access modifiers changed from: package-private */
    public class k implements ValueAnimator.AnimatorUpdateListener {
        private int a = this.f6484b;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6484b;

        k(int i2) {
            this.f6484b = i2;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f6469k) {
                b0.e(BaseTransientBottomBar.this.f6472c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.f6472c.setTranslationY((float) intValue);
            }
            this.a = intValue;
        }
    }

    public static abstract class l<B> {
        public void a(B b2) {
        }

        public void a(B b2, int i2) {
        }
    }

    public static class m {
        private b.AbstractC0091b a;

        public m(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.b(0.1f);
            swipeDismissBehavior.a(0.6f);
            swipeDismissBehavior.a(0);
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.a().e(this.a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.a().d(this.a);
            }
        }

        public void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.f6478i;
        }

        public boolean a(View view) {
            return view instanceof p;
        }
    }

    /* access modifiers changed from: protected */
    public interface n {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* access modifiers changed from: protected */
    public interface o {
        void a(View view, int i2, int i3, int i4, int i5);
    }

    /* access modifiers changed from: protected */
    public static class p extends FrameLayout {

        /* renamed from: b  reason: collision with root package name */
        private final AccessibilityManager f6486b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a f6487c;

        /* renamed from: d  reason: collision with root package name */
        private o f6488d;

        /* renamed from: e  reason: collision with root package name */
        private n f6489e;

        class a implements c.a {
            a() {
            }

            @Override // c.h.l.l0.c.a
            public void onTouchExplorationStateChanged(boolean z) {
                p.this.setClickableOrFocusableBasedOnAccessibility(z);
            }
        }

        protected p(Context context) {
            this(context, null);
        }

        protected p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.b.j.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(e.b.b.b.j.SnackbarLayout_elevation)) {
                b0.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(e.b.b.b.j.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.f6486b = (AccessibilityManager) context.getSystemService("accessibility");
            this.f6487c = new a();
            c.h.l.l0.c.a(this.f6486b, this.f6487c);
            setClickableOrFocusableBasedOnAccessibility(this.f6486b.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            n nVar = this.f6489e;
            if (nVar != null) {
                nVar.onViewAttachedToWindow(this);
            }
            b0.N(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            n nVar = this.f6489e;
            if (nVar != null) {
                nVar.onViewDetachedFromWindow(this);
            }
            c.h.l.l0.c.b(this.f6486b, this.f6487c);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            o oVar = this.f6488d;
            if (oVar != null) {
                oVar.a(this, i2, i3, i4, i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(n nVar) {
            this.f6489e = nVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(o oVar) {
            this.f6488d = oVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f6469k = i2 >= 16 && i2 <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.a = viewGroup;
            this.f6473d = aVar;
            this.f6471b = viewGroup.getContext();
            com.google.android.material.internal.l.a(this.f6471b);
            this.f6472c = (p) LayoutInflater.from(this.f6471b).inflate(f(), this.a, false);
            this.f6472c.addView(view);
            b0.g(this.f6472c, 1);
            b0.h(this.f6472c, 1);
            b0.a((View) this.f6472c, true);
            b0.a(this.f6472c, new d(this));
            b0.a(this.f6472c, new e());
            this.f6477h = (AccessibilityManager) this.f6471b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private void e(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, n());
        valueAnimator.setInterpolator(e.b.b.b.k.a.a);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new a(i2));
        valueAnimator.addUpdateListener(new b());
        valueAnimator.start();
    }

    private int n() {
        int height = this.f6472c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f6472c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int n2 = n();
        if (f6469k) {
            b0.e(this.f6472c, n2);
        } else {
            this.f6472c.setTranslationY((float) n2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(n2, 0);
        valueAnimator.setInterpolator(e.b.b.b.k.a.a);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new j());
        valueAnimator.addUpdateListener(new k(n2));
        valueAnimator.start();
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        b.a().a(this.f6478i, i2);
    }

    public void b() {
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (!j() || this.f6472c.getVisibility() != 0) {
            c(i2);
        } else {
            e(i2);
        }
    }

    public Context c() {
        return this.f6471b;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        b.a().b(this.f6478i);
        List<l<B>> list = this.f6475f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6475f.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.f6472c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6472c);
        }
    }

    public int d() {
        return this.f6474e;
    }

    public B d(int i2) {
        this.f6474e = i2;
        return this;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int f() {
        return g() ? e.b.b.b.h.mtrl_layout_snackbar : e.b.b.b.h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        TypedArray obtainStyledAttributes = this.f6471b.obtainStyledAttributes(f6470l);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public boolean h() {
        return b.a().a(this.f6478i);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        b.a().c(this.f6478i);
        List<l<B>> list = this.f6475f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6475f.get(size).a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f6477h.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void k() {
        b.a().a(d(), this.f6478i);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        if (this.f6472c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f6472c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f6476g;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = e();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).a((Behavior) this);
                }
                swipeDismissBehavior.a(new g());
                fVar.a(swipeDismissBehavior);
                fVar.f975g = 80;
            }
            this.a.addView(this.f6472c);
        }
        this.f6472c.setOnAttachStateChangeListener(new h());
        if (!b0.I(this.f6472c)) {
            this.f6472c.setOnLayoutChangeListener(new i());
        } else if (j()) {
            a();
        } else {
            i();
        }
    }
}
