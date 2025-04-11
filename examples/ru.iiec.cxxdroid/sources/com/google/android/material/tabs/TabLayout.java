package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.y0;
import androidx.viewpager.widget.ViewPager;
import c.h.l.b0;
import c.h.l.y;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final c.h.k.e<g> P = new c.h.k.g(16);
    int A;
    boolean B;
    boolean C;
    boolean D;
    private c E;
    private final ArrayList<c> F;
    private c G;
    private ValueAnimator H;
    ViewPager I;
    private androidx.viewpager.widget.a J;
    private DataSetObserver K;
    private h L;
    private b M;
    private boolean N;
    private final c.h.k.e<i> O;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<g> f6503b;

    /* renamed from: c  reason: collision with root package name */
    private g f6504c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f6505d;

    /* renamed from: e  reason: collision with root package name */
    private final f f6506e;

    /* renamed from: f  reason: collision with root package name */
    int f6507f;

    /* renamed from: g  reason: collision with root package name */
    int f6508g;

    /* renamed from: h  reason: collision with root package name */
    int f6509h;

    /* renamed from: i  reason: collision with root package name */
    int f6510i;

    /* renamed from: j  reason: collision with root package name */
    int f6511j;

    /* renamed from: k  reason: collision with root package name */
    ColorStateList f6512k;

    /* renamed from: l  reason: collision with root package name */
    ColorStateList f6513l;

    /* renamed from: m  reason: collision with root package name */
    ColorStateList f6514m;
    Drawable n;
    PorterDuff.Mode o;
    float p;
    float q;
    final int r;
    int s;
    private final int t;
    private final int u;
    private final int v;
    private int w;
    int x;
    int y;
    int z;

    /* access modifiers changed from: package-private */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* access modifiers changed from: private */
    public class b implements ViewPager.i {
        private boolean a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.I == viewPager) {
                tabLayout.a(aVar2, this.a);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.a = z;
        }
    }

    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    /* access modifiers changed from: private */
    public class e extends DataSetObserver {
        e() {
        }

        public void onChanged() {
            TabLayout.this.d();
        }

        public void onInvalidated() {
            TabLayout.this.d();
        }
    }

    /* access modifiers changed from: private */
    public class f extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private int f6516b;

        /* renamed from: c  reason: collision with root package name */
        private final Paint f6517c;

        /* renamed from: d  reason: collision with root package name */
        private final GradientDrawable f6518d;

        /* renamed from: e  reason: collision with root package name */
        int f6519e = -1;

        /* renamed from: f  reason: collision with root package name */
        float f6520f;

        /* renamed from: g  reason: collision with root package name */
        private int f6521g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f6522h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f6523i = -1;

        /* renamed from: j  reason: collision with root package name */
        private ValueAnimator f6524j;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ int a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f6526b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f6527c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f6528d;

            a(int i2, int i3, int i4, int i5) {
                this.a = i2;
                this.f6526b = i3;
                this.f6527c = i4;
                this.f6528d = i5;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f.this.b(e.b.b.b.k.a.a(this.a, this.f6526b, animatedFraction), e.b.b.b.k.a.a(this.f6527c, this.f6528d, animatedFraction));
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends AnimatorListenerAdapter {
            final /* synthetic */ int a;

            b(int i2) {
                this.a = i2;
            }

            public void onAnimationEnd(Animator animator) {
                f fVar = f.this;
                fVar.f6519e = this.a;
                fVar.f6520f = 0.0f;
            }
        }

        f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f6517c = new Paint();
            this.f6518d = new GradientDrawable();
        }

        private void a(i iVar, RectF rectF) {
            int d2 = iVar.d();
            if (d2 < TabLayout.this.a(24)) {
                d2 = TabLayout.this.a(24);
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i2 = d2 / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }

        private void b() {
            int i2;
            int i3;
            View childAt = getChildAt(this.f6519e);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.C && (childAt instanceof i)) {
                    a((i) childAt, tabLayout.f6505d);
                    i3 = (int) TabLayout.this.f6505d.left;
                    i2 = (int) TabLayout.this.f6505d.right;
                }
                if (this.f6520f > 0.0f && this.f6519e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f6519e + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.C && (childAt2 instanceof i)) {
                        a((i) childAt2, tabLayout2.f6505d);
                        left = (int) TabLayout.this.f6505d.left;
                        right = (int) TabLayout.this.f6505d.right;
                    }
                    float f2 = this.f6520f;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            b(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if (this.f6517c.getColor() != i2) {
                this.f6517c.setColor(i2);
                b0.M(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.f6524j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f6524j.cancel();
            }
            this.f6519e = i2;
            this.f6520f = f2;
            b();
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            ValueAnimator valueAnimator = this.f6524j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f6524j.cancel();
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.C && (childAt instanceof i)) {
                a((i) childAt, tabLayout.f6505d);
                left = (int) TabLayout.this.f6505d.left;
                right = (int) TabLayout.this.f6505d.right;
            }
            int i4 = this.f6522h;
            int i5 = this.f6523i;
            if (i4 != left || i5 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f6524j = valueAnimator2;
                valueAnimator2.setInterpolator(e.b.b.b.k.a.a);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new a(i4, left, i5, right));
                valueAnimator2.addListener(new b(i2));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            if (this.f6516b != i2) {
                this.f6516b = i2;
                b0.M(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            if (i2 != this.f6522h || i3 != this.f6523i) {
                this.f6522h = i2;
                this.f6523i = i3;
                b0.M(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(android.graphics.Canvas r6) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f6524j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                b();
                return;
            }
            this.f6524j.cancel();
            a(this.f6519e, Math.round((1.0f - this.f6524j.getAnimatedFraction()) * ((float) this.f6524j.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.A == 1 && tabLayout.x == 1) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.a(16) * 2)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.x = 0;
                            tabLayout2.a(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f6521g != i2) {
                requestLayout();
                this.f6521g = i2;
            }
        }
    }

    public static class g {
        private Drawable a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f6531b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f6532c;

        /* renamed from: d  reason: collision with root package name */
        private int f6533d = -1;

        /* renamed from: e  reason: collision with root package name */
        private View f6534e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f6535f;

        /* renamed from: g  reason: collision with root package name */
        public i f6536g;

        public View a() {
            return this.f6534e;
        }

        public g a(int i2) {
            a(LayoutInflater.from(this.f6536g.getContext()).inflate(i2, (ViewGroup) this.f6536g, false));
            return this;
        }

        public g a(Drawable drawable) {
            this.a = drawable;
            h();
            return this;
        }

        public g a(View view) {
            this.f6534e = view;
            h();
            return this;
        }

        public g a(CharSequence charSequence) {
            this.f6532c = charSequence;
            h();
            return this;
        }

        public Drawable b() {
            return this.a;
        }

        public g b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f6532c) && !TextUtils.isEmpty(charSequence)) {
                this.f6536g.setContentDescription(charSequence);
            }
            this.f6531b = charSequence;
            h();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            this.f6533d = i2;
        }

        public int c() {
            return this.f6533d;
        }

        public CharSequence d() {
            return this.f6531b;
        }

        public boolean e() {
            TabLayout tabLayout = this.f6535f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f6533d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f6535f = null;
            this.f6536g = null;
            this.a = null;
            this.f6531b = null;
            this.f6532c = null;
            this.f6533d = -1;
            this.f6534e = null;
        }

        public void g() {
            TabLayout tabLayout = this.f6535f;
            if (tabLayout != null) {
                tabLayout.c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void h() {
            i iVar = this.f6536g;
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    public static class h implements ViewPager.j {
        private final WeakReference<TabLayout> a;

        /* renamed from: b  reason: collision with root package name */
        private int f6537b;

        /* renamed from: c  reason: collision with root package name */
        private int f6538c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f6538c = 0;
            this.f6537b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i2) {
            this.f6537b = this.f6538c;
            this.f6538c = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i2, float f2, int i3) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f6538c != 2 || this.f6537b == 1;
                if (!(this.f6538c == 2 && this.f6537b == 0)) {
                    z = true;
                }
                tabLayout.a(i2, f2, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.getTabCount()) {
                int i3 = this.f6538c;
                tabLayout.b(tabLayout.b(i2), i3 == 0 || (i3 == 2 && this.f6537b == 0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class i extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private g f6539b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f6540c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f6541d;

        /* renamed from: e  reason: collision with root package name */
        private View f6542e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f6543f;

        /* renamed from: g  reason: collision with root package name */
        private ImageView f6544g;

        /* renamed from: h  reason: collision with root package name */
        private Drawable f6545h;

        /* renamed from: i  reason: collision with root package name */
        private int f6546i = 2;

        public i(Context context) {
            super(context);
            a(context);
            b0.a(this, TabLayout.this.f6507f, TabLayout.this.f6508g, TabLayout.this.f6509h, TabLayout.this.f6510i);
            setGravity(17);
            setOrientation(!TabLayout.this.B ? 1 : 0);
            setClickable(true);
            b0.a(this, y.a(getContext(), 1002));
        }

        private float a(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(android.content.Context r7) {
            /*
            // Method dump skipped, instructions count: 131
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.a(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(Canvas canvas) {
            Drawable drawable = this.f6545h;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f6545h.draw(canvas);
            }
        }

        private void a(TextView textView, ImageView imageView) {
            g gVar = this.f6539b;
            Drawable mutate = (gVar == null || gVar.b() == null) ? null : androidx.core.graphics.drawable.a.i(this.f6539b.b()).mutate();
            g gVar2 = this.f6539b;
            CharSequence d2 = gVar2 != null ? gVar2.d() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (textView != null) {
                if (z) {
                    textView.setText(d2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int a = (!z || imageView.getVisibility() != 0) ? 0 : TabLayout.this.a(8);
                if (TabLayout.this.B) {
                    if (a != c.h.l.j.a(marginLayoutParams)) {
                        c.h.l.j.a(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    c.h.l.j.a(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            g gVar3 = this.f6539b;
            CharSequence charSequence = gVar3 != null ? gVar3.f6532c : null;
            if (z) {
                charSequence = null;
            }
            y0.a(this, charSequence);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int d() {
            View[] viewArr = {this.f6540c, this.f6541d, this.f6542e};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (View view : viewArr) {
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a((g) null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar) {
            if (gVar != this.f6539b) {
                this.f6539b = gVar;
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            ImageView imageView;
            TextView textView;
            g gVar = this.f6539b;
            Drawable drawable = null;
            View a = gVar != null ? gVar.a() : null;
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a);
                    }
                    addView(a);
                }
                this.f6542e = a;
                TextView textView2 = this.f6540c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView2 = this.f6541d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f6541d.setImageDrawable(null);
                }
                this.f6543f = (TextView) a.findViewById(16908308);
                TextView textView3 = this.f6543f;
                if (textView3 != null) {
                    this.f6546i = androidx.core.widget.i.c(textView3);
                }
                this.f6544g = (ImageView) a.findViewById(16908294);
            } else {
                View view = this.f6542e;
                if (view != null) {
                    removeView(view);
                    this.f6542e = null;
                }
                this.f6543f = null;
                this.f6544g = null;
            }
            boolean z = false;
            if (this.f6542e == null) {
                if (this.f6541d == null) {
                    ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(e.b.b.b.h.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView3, 0);
                    this.f6541d = imageView3;
                }
                if (!(gVar == null || gVar.b() == null)) {
                    drawable = androidx.core.graphics.drawable.a.i(gVar.b()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.a(drawable, TabLayout.this.f6513l);
                    PorterDuff.Mode mode = TabLayout.this.o;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.a(drawable, mode);
                    }
                }
                if (this.f6540c == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(e.b.b.b.h.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView4);
                    this.f6540c = textView4;
                    this.f6546i = androidx.core.widget.i.c(this.f6540c);
                }
                androidx.core.widget.i.d(this.f6540c, TabLayout.this.f6511j);
                ColorStateList colorStateList = TabLayout.this.f6512k;
                if (colorStateList != null) {
                    this.f6540c.setTextColor(colorStateList);
                }
                textView = this.f6540c;
                imageView = this.f6541d;
            } else {
                if (!(this.f6543f == null && this.f6544g == null)) {
                    textView = this.f6543f;
                    imageView = this.f6544g;
                }
                if (gVar != null && !TextUtils.isEmpty(gVar.f6532c)) {
                    setContentDescription(gVar.f6532c);
                }
                if (gVar != null && gVar.e()) {
                    z = true;
                }
                setSelected(z);
            }
            a(textView, imageView);
            setContentDescription(gVar.f6532c);
            z = true;
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            ImageView imageView;
            TextView textView;
            setOrientation(!TabLayout.this.B ? 1 : 0);
            if (this.f6543f == null && this.f6544g == null) {
                textView = this.f6540c;
                imageView = this.f6541d;
            } else {
                textView = this.f6543f;
                imageView = this.f6544g;
            }
            a(textView, imageView);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f6545h;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f6545h.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.d.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.d.class.getName());
        }

        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.s, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f6540c != null) {
                float f2 = TabLayout.this.p;
                int i4 = this.f6546i;
                ImageView imageView = this.f6541d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f6540c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.q;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f6540c.getTextSize();
                int lineCount = this.f6540c.getLineCount();
                int c2 = androidx.core.widget.i.c(this.f6540c);
                int i5 = (f2 > textSize ? 1 : (f2 == textSize ? 0 : -1));
                if (i5 != 0 || (c2 >= 0 && i4 != c2)) {
                    if (TabLayout.this.A == 1 && i5 > 0 && lineCount == 1 && ((layout = this.f6540c.getLayout()) == null || a(layout, 0, f2) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f6540c.setTextSize(0, f2);
                        this.f6540c.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f6539b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f6539b.g();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f6540c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f6541d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f6542e;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    public static class j implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
            this.a.setCurrentItem(gVar.c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.b.b.b.b.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6503b = new ArrayList<>();
        this.f6505d = new RectF();
        this.s = Integer.MAX_VALUE;
        this.F = new ArrayList<>();
        this.O = new c.h.k.f(12);
        setHorizontalScrollBarEnabled(false);
        this.f6506e = new f(context);
        super.addView(this.f6506e, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray c2 = l.c(context, attributeSet, e.b.b.b.j.TabLayout, i2, e.b.b.b.i.Widget_Design_TabLayout, e.b.b.b.j.TabLayout_tabTextAppearance);
        this.f6506e.b(c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabIndicatorHeight, -1));
        this.f6506e.a(c2.getColor(e.b.b.b.j.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(e.b.b.b.o.a.b(context, c2, e.b.b.b.j.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(c2.getInt(e.b.b.b.j.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(c2.getBoolean(e.b.b.b.j.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabPadding, 0);
        this.f6510i = dimensionPixelSize;
        this.f6509h = dimensionPixelSize;
        this.f6508g = dimensionPixelSize;
        this.f6507f = dimensionPixelSize;
        this.f6507f = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabPaddingStart, this.f6507f);
        this.f6508g = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabPaddingTop, this.f6508g);
        this.f6509h = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabPaddingEnd, this.f6509h);
        this.f6510i = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabPaddingBottom, this.f6510i);
        this.f6511j = c2.getResourceId(e.b.b.b.j.TabLayout_tabTextAppearance, e.b.b.b.i.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f6511j, c.a.j.TextAppearance);
        try {
            this.p = (float) obtainStyledAttributes.getDimensionPixelSize(c.a.j.TextAppearance_android_textSize, 0);
            this.f6512k = e.b.b.b.o.a.a(context, obtainStyledAttributes, c.a.j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (c2.hasValue(e.b.b.b.j.TabLayout_tabTextColor)) {
                this.f6512k = e.b.b.b.o.a.a(context, c2, e.b.b.b.j.TabLayout_tabTextColor);
            }
            if (c2.hasValue(e.b.b.b.j.TabLayout_tabSelectedTextColor)) {
                this.f6512k = a(this.f6512k.getDefaultColor(), c2.getColor(e.b.b.b.j.TabLayout_tabSelectedTextColor, 0));
            }
            this.f6513l = e.b.b.b.o.a.a(context, c2, e.b.b.b.j.TabLayout_tabIconTint);
            this.o = m.a(c2.getInt(e.b.b.b.j.TabLayout_tabIconTintMode, -1), null);
            this.f6514m = e.b.b.b.o.a.a(context, c2, e.b.b.b.j.TabLayout_tabRippleColor);
            this.y = c2.getInt(e.b.b.b.j.TabLayout_tabIndicatorAnimationDuration, 300);
            this.t = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabMinWidth, -1);
            this.u = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabMaxWidth, -1);
            this.r = c2.getResourceId(e.b.b.b.j.TabLayout_tabBackground, 0);
            this.w = c2.getDimensionPixelSize(e.b.b.b.j.TabLayout_tabContentStart, 0);
            this.A = c2.getInt(e.b.b.b.j.TabLayout_tabMode, 1);
            this.x = c2.getInt(e.b.b.b.j.TabLayout_tabGravity, 0);
            this.B = c2.getBoolean(e.b.b.b.j.TabLayout_tabInlineLabel, false);
            this.D = c2.getBoolean(e.b.b.b.j.TabLayout_tabUnboundedRipple, false);
            c2.recycle();
            Resources resources = getResources();
            this.q = (float) resources.getDimensionPixelSize(e.b.b.b.d.design_tab_text_size_2line);
            this.v = resources.getDimensionPixelSize(e.b.b.b.d.design_tab_scrollable_min_width);
            f();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int a(int i2, float f2) {
        int i3 = 0;
        if (this.A != 0) {
            return 0;
        }
        View childAt = this.f6506e.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f6506e.getChildCount() ? this.f6506e.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f2);
        return b0.r(this) == 0 ? left + i5 : left - i5;
    }

    private static ColorStateList a(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void a(View view) {
        if (view instanceof a) {
            a((a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        float f2;
        if (this.A == 1 && this.x == 0) {
            layoutParams.width = 0;
            f2 = 1.0f;
        } else {
            layoutParams.width = -2;
            f2 = 0.0f;
        }
        layoutParams.weight = f2;
    }

    private void a(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.I;
        if (viewPager2 != null) {
            h hVar = this.L;
            if (hVar != null) {
                viewPager2.b(hVar);
            }
            b bVar = this.M;
            if (bVar != null) {
                this.I.b(bVar);
            }
        }
        c cVar = this.G;
        if (cVar != null) {
            b(cVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.I = viewPager;
            if (this.L == null) {
                this.L = new h(this);
            }
            this.L.a();
            viewPager.a(this.L);
            this.G = new j(viewPager);
            a(this.G);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z2);
            }
            if (this.M == null) {
                this.M = new b();
            }
            this.M.a(z2);
            viewPager.a(this.M);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.I = null;
            a((androidx.viewpager.widget.a) null, false);
        }
        this.N = z3;
    }

    private void a(g gVar, int i2) {
        gVar.b(i2);
        this.f6503b.add(i2, gVar);
        int size = this.f6503b.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.f6503b.get(i2).b(i2);
            } else {
                return;
            }
        }
    }

    private void a(a aVar) {
        g c2 = c();
        CharSequence charSequence = aVar.f6548b;
        if (charSequence != null) {
            c2.b(charSequence);
        }
        Drawable drawable = aVar.f6549c;
        if (drawable != null) {
            c2.a(drawable);
        }
        int i2 = aVar.f6550d;
        if (i2 != 0) {
            c2.a(i2);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            c2.a(aVar.getContentDescription());
        }
        a(c2);
    }

    private void c(int i2) {
        if (i2 != -1) {
            if (getWindowToken() == null || !b0.I(this) || this.f6506e.a()) {
                a(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i2, 0.0f);
            if (scrollX != a2) {
                h();
                this.H.setIntValues(scrollX, a2);
                this.H.start();
            }
            this.f6506e.a(i2, this.y);
        }
    }

    private void d(int i2) {
        i iVar = (i) this.f6506e.getChildAt(i2);
        this.f6506e.removeViewAt(i2);
        if (iVar != null) {
            iVar.a();
            this.O.a(iVar);
        }
        requestLayout();
    }

    private void d(g gVar) {
        this.f6506e.addView(gVar.f6536g, gVar.c(), g());
    }

    private i e(g gVar) {
        c.h.k.e<i> eVar = this.O;
        i a2 = eVar != null ? eVar.a() : null;
        if (a2 == null) {
            a2 = new i(getContext());
        }
        a2.a(gVar);
        a2.setFocusable(true);
        a2.setMinimumWidth(getTabMinWidth());
        a2.setContentDescription(TextUtils.isEmpty(gVar.f6532c) ? gVar.f6531b : gVar.f6532c);
        return a2;
    }

    private void f() {
        b0.a(this.f6506e, this.A == 0 ? Math.max(0, this.w - this.f6507f) : 0, 0, 0, 0);
        int i2 = this.A;
        if (i2 == 0) {
            this.f6506e.setGravity(8388611);
        } else if (i2 == 1) {
            this.f6506e.setGravity(1);
        }
        a(true);
    }

    private void f(g gVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).a(gVar);
        }
    }

    private LinearLayout.LayoutParams g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void g(g gVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).c(gVar);
        }
    }

    private int getDefaultHeight() {
        int size = this.f6503b.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.f6503b.get(i2);
                if (gVar != null && gVar.b() != null && !TextUtils.isEmpty(gVar.d())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if (this.A == 0) {
            return this.v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f6506e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h() {
        if (this.H == null) {
            this.H = new ValueAnimator();
            this.H.setInterpolator(e.b.b.b.k.a.a);
            this.H.setDuration((long) this.y);
            this.H.addUpdateListener(new a());
        }
    }

    private void h(g gVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).b(gVar);
        }
    }

    private void i() {
        int size = this.f6503b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6503b.get(i2).h();
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f6506e.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f6506e.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public void a() {
        this.F.clear();
    }

    public void a(int i2, float f2, boolean z2) {
        a(i2, f2, z2, true);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f6506e.getChildCount()) {
            if (z3) {
                this.f6506e.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.H.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    public void a(ViewPager viewPager, boolean z2) {
        a(viewPager, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void a(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.J;
        if (!(aVar2 == null || (dataSetObserver = this.K) == null)) {
            aVar2.c(dataSetObserver);
        }
        this.J = aVar;
        if (z2 && aVar != null) {
            if (this.K == null) {
                this.K = new e();
            }
            aVar.a(this.K);
        }
        d();
    }

    public void a(c cVar) {
        if (!this.F.contains(cVar)) {
            this.F.add(cVar);
        }
    }

    public void a(g gVar) {
        a(gVar, this.f6503b.isEmpty());
    }

    public void a(g gVar, int i2, boolean z2) {
        if (gVar.f6535f == this) {
            a(gVar, i2);
            d(gVar);
            if (z2) {
                gVar.g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void a(g gVar, boolean z2) {
        a(gVar, this.f6503b.size(), z2);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        for (int i2 = 0; i2 < this.f6506e.getChildCount(); i2++) {
            View childAt = this.f6506e.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    /* access modifiers changed from: protected */
    public g b() {
        g a2 = P.a();
        return a2 == null ? new g() : a2;
    }

    public g b(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f6503b.get(i2);
    }

    public void b(c cVar) {
        this.F.remove(cVar);
    }

    /* access modifiers changed from: package-private */
    public void b(g gVar, boolean z2) {
        g gVar2 = this.f6504c;
        if (gVar2 != gVar) {
            int c2 = gVar != null ? gVar.c() : -1;
            if (z2) {
                if ((gVar2 == null || gVar2.c() == -1) && c2 != -1) {
                    a(c2, 0.0f, true);
                } else {
                    c(c2);
                }
                if (c2 != -1) {
                    setSelectedTabView(c2);
                }
            }
            this.f6504c = gVar;
            if (gVar2 != null) {
                h(gVar2);
            }
            if (gVar != null) {
                g(gVar);
            }
        } else if (gVar2 != null) {
            f(gVar);
            c(gVar.c());
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(g gVar) {
        return P.a(gVar);
    }

    public g c() {
        g b2 = b();
        b2.f6535f = this;
        b2.f6536g = e(b2);
        return b2;
    }

    /* access modifiers changed from: package-private */
    public void c(g gVar) {
        b(gVar, true);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int currentItem;
        e();
        androidx.viewpager.widget.a aVar = this.J;
        if (aVar != null) {
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                g c2 = c();
                c2.b(this.J.a(i2));
                a(c2, false);
            }
            ViewPager viewPager = this.I;
            if (viewPager != null && a2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                c(b(currentItem));
            }
        }
    }

    public void e() {
        for (int childCount = this.f6506e.getChildCount() - 1; childCount >= 0; childCount--) {
            d(childCount);
        }
        Iterator<g> it = this.f6503b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f();
            b(next);
        }
        this.f6504c = null;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f6504c;
        if (gVar != null) {
            return gVar.c();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f6503b.size();
    }

    public int getTabGravity() {
        return this.x;
    }

    public ColorStateList getTabIconTint() {
        return this.f6513l;
    }

    public int getTabIndicatorGravity() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.s;
    }

    public int getTabMode() {
        return this.A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f6514m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.n;
    }

    public ColorStateList getTabTextColors() {
        return this.f6512k;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            setupWithViewPager(null);
            this.N = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f6506e.getChildCount(); i2++) {
            View childAt = this.f6506e.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).a((i) canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int a2 = a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(a2, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.u;
            if (i4 <= 0) {
                i4 = size - a(56);
            }
            this.s = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            boolean z2 = false;
            View childAt = getChildAt(0);
            int i5 = this.A;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z2 = true;
            }
            if (z2) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public void setInlineLabel(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            for (int i2 = 0; i2 < this.f6506e.getChildCount(); i2++) {
                View childAt = this.f6506e.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).c();
                }
            }
            f();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.E;
        if (cVar2 != null) {
            b(cVar2);
        }
        this.E = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.H.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i2) {
        setSelectedTabIndicator(i2 != 0 ? c.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            b0.M(this.f6506e);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f6506e.a(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            b0.M(this.f6506e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f6506e.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.x != i2) {
            this.x = i2;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f6513l != colorStateList) {
            this.f6513l = colorStateList;
            i();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(c.a.k.a.a.b(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.C = z2;
        b0.M(this.f6506e);
    }

    public void setTabMode(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f6514m != colorStateList) {
            this.f6514m = colorStateList;
            for (int i2 = 0; i2 < this.f6506e.getChildCount(); i2++) {
                View childAt = this.f6506e.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).a((i) getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(c.a.k.a.a.b(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f6512k != colorStateList) {
            this.f6512k = colorStateList;
            i();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        a(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            for (int i2 = 0; i2 < this.f6506e.getChildCount(); i2++) {
                View childAt = this.f6506e.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).a((i) getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
