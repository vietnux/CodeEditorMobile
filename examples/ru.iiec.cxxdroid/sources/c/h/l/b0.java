package c.h.l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import c.h.l.c;
import c.h.l.k0;
import c.h.l.l0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class b0 {
    private static Field a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2372b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2373c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2374d;

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, String> f2375e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, g0> f2376f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Field f2377g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f2378h = false;

    /* renamed from: i  reason: collision with root package name */
    private static ThreadLocal<Rect> f2379i;

    /* renamed from: j  reason: collision with root package name */
    private static final w f2380j = a.f2371b;

    /* access modifiers changed from: package-private */
    public class a extends f<Boolean> {
        a(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.b0.f
        public Boolean a(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* access modifiers changed from: package-private */
        public void a(View view, Boolean bool) {
            q.b(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends f<CharSequence> {
        b(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.b0.f
        public CharSequence a(View view) {
            return q.a(view);
        }

        /* access modifiers changed from: package-private */
        public void a(View view, CharSequence charSequence) {
            q.a(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.b0.f
        public CharSequence a(View view) {
            return s.a(view);
        }

        /* access modifiers changed from: package-private */
        public void a(View view, CharSequence charSequence) {
            s.a(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.b0.f
        public Boolean a(View view) {
            return Boolean.valueOf(q.b(view));
        }

        /* access modifiers changed from: package-private */
        public void a(View view, Boolean bool) {
            q.a(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f2381b = new WeakHashMap<>();

        e() {
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                b0.c(view, z2 ? 16 : 32);
                this.f2381b.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2381b.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class f<T> {
        private final int a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2382b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2383c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2384d;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.f2382b = cls;
            this.f2384d = i3;
            this.f2383c = i4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f2383c;
        }

        /* access modifiers changed from: package-private */
        public abstract T a(View view);

        /* access modifiers changed from: package-private */
        public abstract void a(View view, T t);

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(T t, T t2);

        /* access modifiers changed from: package-private */
        public T b(View view) {
            if (b()) {
                return a(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.f2382b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b(View view, T t) {
            if (b()) {
                a(view, (Object) t);
            } else if (a() && a((Object) b(view), (Object) t)) {
                b0.b(view);
                view.setTag(this.a, t);
                b0.c(view, this.f2384d);
            }
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* access modifiers changed from: package-private */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static void a(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }

        static void a(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        static void a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void a(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        static void a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static boolean a(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static void j(View view) {
            view.postInvalidateOnAnimation();
        }

        static void k(View view) {
            view.requestFitSystemWindows();
        }
    }

    /* access modifiers changed from: package-private */
    public static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display a(View view) {
            return view.getDisplay();
        }

        static void a(View view, int i2) {
            view.setLabelFor(i2);
        }

        static void a(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }

        static void a(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static int b(View view) {
            return view.getLabelFor();
        }

        static void b(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        static int c(View view) {
            return view.getLayoutDirection();
        }

        static int d(View view) {
            return view.getPaddingEnd();
        }

        static int e(View view) {
            return view.getPaddingStart();
        }

        static boolean f(View view) {
            return view.isPaddingRelative();
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static void a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        static boolean b(View view) {
            return view.isInLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static void a(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        static void a(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        static void a(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }
    }

    /* access modifiers changed from: package-private */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static void a(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* access modifiers changed from: private */
    public static class m {

        /* access modifiers changed from: package-private */
        public class a implements View.OnApplyWindowInsetsListener {
            k0 a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f2385b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u f2386c;

            a(View view, u uVar) {
                this.f2385b = view;
                this.f2386c = uVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                k0 a2 = k0.a(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    m.a(windowInsets, this.f2385b);
                    if (a2.equals(this.a)) {
                        return this.f2386c.a(view, a2).m();
                    }
                }
                this.a = a2;
                k0 a3 = this.f2386c.a(view, a2);
                if (Build.VERSION.SDK_INT >= 30) {
                    return a3.m();
                }
                b0.N(view);
                return a3.m();
            }
        }

        static ColorStateList a(View view) {
            return view.getBackgroundTintList();
        }

        static k0 a(View view, k0 k0Var, Rect rect) {
            WindowInsets m2 = k0Var.m();
            if (m2 != null) {
                return k0.a(view.computeSystemWindowInsets(m2, rect), view);
            }
            rect.setEmpty();
            return k0Var;
        }

        static void a(View view, float f2) {
            view.setElevation(f2);
        }

        static void a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void a(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void a(View view, u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(c.h.b.tag_on_apply_window_listener, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(c.h.b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        static void a(View view, String str) {
            view.setTransitionName(str);
        }

        static void a(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(c.h.b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static boolean a(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        static boolean a(View view, float f2, float f3, boolean z) {
            return view.dispatchNestedFling(f2, f3, z);
        }

        static boolean a(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        static boolean a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        static boolean a(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        static PorterDuff.Mode b(View view) {
            return view.getBackgroundTintMode();
        }

        static void b(View view, float f2) {
            view.setTranslationZ(f2);
        }

        static float c(View view) {
            return view.getElevation();
        }

        static void c(View view, float f2) {
            view.setZ(f2);
        }

        public static k0 d(View view) {
            return k0.a.a(view);
        }

        static String e(View view) {
            return view.getTransitionName();
        }

        static float f(View view) {
            return view.getTranslationZ();
        }

        static float g(View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean i(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean j(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void k(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static k0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            k0 a = k0.a(rootWindowInsets);
            a.a(a);
            a.a(view.getRootView());
            return a;
        }

        static void a(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        static void a(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }
    }

    /* access modifiers changed from: package-private */
    public static class o {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static void a(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        static boolean a(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }
    }

    static class p {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static View a(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        static void a(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }

        static void a(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        static void a(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static void a(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static int b(View view) {
            return view.getNextClusterForwardId();
        }

        static void b(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        static void b(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static boolean c(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean d(View view) {
            return view.isFocusedByDefault();
        }

        static boolean e(View view) {
            return view.isImportantForAutofill();
        }

        static boolean f(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static boolean g(View view) {
            return view.restoreDefaultFocus();
        }
    }

    /* access modifiers changed from: package-private */
    public static class q {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static <T> T a(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        static void a(View view, t tVar) {
            c.e.g gVar = (c.e.g) view.getTag(c.h.b.tag_unhandled_key_listeners);
            if (gVar == null) {
                gVar = new c.e.g();
                view.setTag(c.h.b.tag_unhandled_key_listeners, gVar);
            }
            Objects.requireNonNull(tVar);
            b bVar = new b(tVar);
            gVar.put(tVar, bVar);
            view.addOnUnhandledKeyEventListener(bVar);
        }

        static void a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void a(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void b(View view, t tVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            c.e.g gVar = (c.e.g) view.getTag(c.h.b.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(tVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static void b(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    /* access modifiers changed from: private */
    public static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        static void a(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }
    }

    /* access modifiers changed from: private */
    public static class s {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void a(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface t {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class u {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2387d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2388b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f2389c = null;

        u() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f2388b == null) {
                this.f2388b = new SparseArray<>();
            }
            return this.f2388b;
        }

        static u a(View view) {
            u uVar = (u) view.getTag(c.h.b.tag_unhandled_key_event_manager);
            if (uVar != null) {
                return uVar;
            }
            u uVar2 = new u();
            view.setTag(c.h.b.tag_unhandled_key_event_manager, uVar2);
            return uVar2;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f2387d.isEmpty()) {
                synchronized (f2387d) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = f2387d.size() - 1; size >= 0; size--) {
                        View view = f2387d.get(size).get();
                        if (view == null) {
                            f2387d.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(c.h.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((t) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2389c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2389c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> a2 = a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a2.valueAt(indexOfKey);
                a2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && b0.H(view)) {
                c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(b2));
                }
            }
            return b2 != null;
        }
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {c.h.b.accessibility_custom_action_0, c.h.b.accessibility_custom_action_1, c.h.b.accessibility_custom_action_2, c.h.b.accessibility_custom_action_3, c.h.b.accessibility_custom_action_4, c.h.b.accessibility_custom_action_5, c.h.b.accessibility_custom_action_6, c.h.b.accessibility_custom_action_7, c.h.b.accessibility_custom_action_8, c.h.b.accessibility_custom_action_9, c.h.b.accessibility_custom_action_10, c.h.b.accessibility_custom_action_11, c.h.b.accessibility_custom_action_12, c.h.b.accessibility_custom_action_13, c.h.b.accessibility_custom_action_14, c.h.b.accessibility_custom_action_15, c.h.b.accessibility_custom_action_16, c.h.b.accessibility_custom_action_17, c.h.b.accessibility_custom_action_18, c.h.b.accessibility_custom_action_19, c.h.b.accessibility_custom_action_20, c.h.b.accessibility_custom_action_21, c.h.b.accessibility_custom_action_22, c.h.b.accessibility_custom_action_23, c.h.b.accessibility_custom_action_24, c.h.b.accessibility_custom_action_25, c.h.b.accessibility_custom_action_26, c.h.b.accessibility_custom_action_27, c.h.b.accessibility_custom_action_28, c.h.b.accessibility_custom_action_29, c.h.b.accessibility_custom_action_30, c.h.b.accessibility_custom_action_31};
        new e();
    }

    public static String A(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.e(view);
        }
        WeakHashMap<View, String> weakHashMap = f2375e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static float C(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        return 0.0f;
    }

    public static boolean D(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean G(View view) {
        Boolean b2 = a().b(view);
        return b2 != null && b2.booleanValue();
    }

    public static boolean H(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.b(view) : view.getWindowToken() != null;
    }

    public static boolean I(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.c(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.j(view);
        }
        if (view instanceof o) {
            return ((o) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.f(view);
        }
        return false;
    }

    public static boolean L(View view) {
        Boolean b2 = d().b(view);
        return b2 != null && b2.booleanValue();
    }

    public static void M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.j(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void N(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            l.a(view);
        } else if (i2 >= 16) {
            h.k(view);
        }
    }

    private static void O(View view) {
        if (p(view) == 0) {
            h(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (p((View) parent) == 4) {
                h(view, 2);
                return;
            }
        }
    }

    public static void P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.k(view);
        } else if (view instanceof o) {
            ((o) view).stopNestedScroll();
        }
    }

    private static void Q(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    private static f<Boolean> a() {
        return new d(c.h.b.tag_accessibility_heading, Boolean.class, 28);
    }

    public static e a(View view, e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        v vVar = (v) view.getTag(c.h.b.tag_on_receive_content_listener);
        if (vVar == null) {
            return n(view).a(eVar);
        }
        e a2 = vVar.a(view, eVar);
        if (a2 == null) {
            return null;
        }
        return n(view).a(a2);
    }

    static /* synthetic */ e a(e eVar) {
        return eVar;
    }

    public static g0 a(View view) {
        if (f2376f == null) {
            f2376f = new WeakHashMap<>();
        }
        g0 g0Var = f2376f.get(view);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(view);
        f2376f.put(view, g0Var2);
        return g0Var2;
    }

    public static k0 a(View view, k0 k0Var) {
        WindowInsets m2;
        if (Build.VERSION.SDK_INT >= 21 && (m2 = k0Var.m()) != null) {
            WindowInsets a2 = l.a(view, m2);
            if (!a2.equals(m2)) {
                return k0.a(a2, view);
            }
        }
        return k0Var;
    }

    public static k0 a(View view, k0 k0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.a(view, k0Var, rect) : k0Var;
    }

    private static void a(int i2, View view) {
        List<d.a> h2 = h(view);
        for (int i3 = 0; i3 < h2.size(); i3++) {
            if (h2.get(i3).a() == i2) {
                h2.remove(i3);
                return;
            }
        }
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.a(view, f2);
        }
    }

    private static void a(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            Q(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Q((View) parent);
            }
        }
    }

    public static void a(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.a(view, i2, i3);
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            i.a(view, i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static void a(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.a(view, colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (m.a(view) == null && m.b(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.a(view, background);
                }
            }
        } else if (view instanceof a0) {
            ((a0) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.a(view, mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (m.a(view) == null && m.b(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.a(view, background);
                }
            }
        } else if (view instanceof a0) {
            ((a0) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.a(view, rect);
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.a(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View view, c cVar) {
        if (cVar == null && (d(view) instanceof c.a)) {
            cVar = new c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.a());
    }

    private static void a(View view, d.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            b(view);
            a(aVar.a(), view);
            h(view).add(aVar);
            c(view, 0);
        }
    }

    public static void a(View view, d.a aVar, CharSequence charSequence, c.h.l.l0.g gVar) {
        if (gVar == null && charSequence == null) {
            f(view, aVar.a());
        } else {
            a(view, aVar.a(charSequence, gVar));
        }
    }

    public static void a(View view, u uVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.a(view, uVar);
        }
    }

    public static void a(View view, y yVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.a(view, (PointerIcon) (yVar != null ? yVar.a() : null));
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            e().b(view, charSequence);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.a(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void a(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.a(view, runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.a(view, str);
            return;
        }
        if (f2375e == null) {
            f2375e = new WeakHashMap<>();
        }
        f2375e.put(view, str);
    }

    @Deprecated
    public static void a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.a(view).a(view, keyEvent);
    }

    private static Rect b() {
        if (f2379i == null) {
            f2379i = new ThreadLocal<>();
        }
        Rect rect = f2379i.get();
        if (rect == null) {
            rect = new Rect();
            f2379i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static k0 b(View view, k0 k0Var) {
        WindowInsets m2;
        if (Build.VERSION.SDK_INT >= 21 && (m2 = k0Var.m()) != null) {
            WindowInsets b2 = l.b(view, m2);
            if (!b2.equals(m2)) {
                return k0.a(b2, view);
            }
        }
        return k0Var;
    }

    static void b(View view) {
        c c2 = c(view);
        if (c2 == null) {
            c2 = new c();
        }
        a(view, c2);
    }

    private static void b(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            Q(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Q((View) parent);
            }
        }
    }

    public static void b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.a(view, z);
        }
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.a(view).a(keyEvent);
    }

    private static f<CharSequence> c() {
        return new b(c.h.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static c c(View view) {
        View.AccessibilityDelegate d2 = d(view);
        if (d2 == null) {
            return null;
        }
        return d2 instanceof c.a ? ((c.a) d2).a : new c(d2);
    }

    static void c(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (f(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                k.a(obtain, i2);
                if (z) {
                    obtain.getText().add(g(view));
                    O(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.a(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(g(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.a(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    private static View.AccessibilityDelegate d(View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : e(view);
    }

    private static f<Boolean> d() {
        return new a(c.h.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void d(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            a(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            a(view, i2);
        }
    }

    private static View.AccessibilityDelegate e(View view) {
        if (f2378h) {
            return null;
        }
        if (f2377g == null) {
            try {
                f2377g = View.class.getDeclaredField("mAccessibilityDelegate");
                f2377g.setAccessible(true);
            } catch (Throwable unused) {
                f2378h = true;
                return null;
            }
        }
        try {
            Object obj = f2377g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2378h = true;
            return null;
        }
    }

    private static f<CharSequence> e() {
        return new c(c.h.b.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void e(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            b(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            b(view, i2);
        }
    }

    public static int f(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    public static void f(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a(i2, view);
            c(view, 0);
        }
    }

    public static CharSequence g(View view) {
        return c().b(view);
    }

    public static void g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            k.a(view, i2);
        }
    }

    private static List<d.a> h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(c.h.b.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(c.h.b.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void h(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        h.a(view, i2);
    }

    public static ColorStateList i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.a(view);
        }
        if (view instanceof a0) {
            return ((a0) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void i(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.a(view, i2);
        }
    }

    public static PorterDuff.Mode j(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.b(view);
        }
        if (view instanceof a0) {
            return ((a0) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void j(View view, int i2) {
        if (view instanceof m) {
            ((m) view).a(i2);
        } else if (i2 == 0) {
            P(view);
        }
    }

    public static Rect k(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static Display l(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.a(view);
        }
        if (H(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static float m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.c(view);
        }
        return 0.0f;
    }

    private static w n(View view) {
        return view instanceof w ? (w) view : f2380j;
    }

    public static boolean o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.b(view);
        }
        return false;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.a(view);
        }
        return 0;
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.c(view);
        }
        return 0;
    }

    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f2374d) {
            try {
                f2373c = View.class.getDeclaredField("mMinHeight");
                f2373c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2374d = true;
        }
        Field field = f2373c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f2372b) {
            try {
                a = View.class.getDeclaredField("mMinWidth");
                a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2372b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String[] u(View view) {
        return (String[]) view.getTag(c.h.b.tag_on_receive_content_mime_types);
    }

    public static int v(View view) {
        return Build.VERSION.SDK_INT >= 17 ? i.d(view) : view.getPaddingRight();
    }

    public static int w(View view) {
        return Build.VERSION.SDK_INT >= 17 ? i.e(view) : view.getPaddingLeft();
    }

    public static ViewParent x(View view) {
        return Build.VERSION.SDK_INT >= 16 ? h.f(view) : view.getParent();
    }

    public static k0 y(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return n.a(view);
        }
        if (i2 >= 21) {
            return m.d(view);
        }
        return null;
    }

    public static CharSequence z(View view) {
        return e().b(view);
    }
}
