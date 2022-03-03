package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.x0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@k2
@TargetApi(14)
public final class m00 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long q = ((Long) a50.g().a(k80.m1)).longValue();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4921b;

    /* renamed from: c  reason: collision with root package name */
    private Application f4922c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager f4923d;

    /* renamed from: e  reason: collision with root package name */
    private final PowerManager f4924e;

    /* renamed from: f  reason: collision with root package name */
    private final KeyguardManager f4925f;

    /* renamed from: g  reason: collision with root package name */
    private BroadcastReceiver f4926g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f4927h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<View> f4928i;

    /* renamed from: j  reason: collision with root package name */
    private r00 f4929j;

    /* renamed from: k  reason: collision with root package name */
    private ub f4930k = new ub(q);

    /* renamed from: l  reason: collision with root package name */
    private boolean f4931l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f4932m = -1;
    private final HashSet<q00> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public m00(Context context, View view) {
        this.f4921b = context.getApplicationContext();
        this.f4923d = (WindowManager) context.getSystemService("window");
        this.f4924e = (PowerManager) this.f4921b.getSystemService("power");
        this.f4925f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f4921b;
        if (context2 instanceof Application) {
            this.f4922c = (Application) context2;
            this.f4929j = new r00((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        this.p = new Rect();
        this.p.right = this.f4923d.getDefaultDisplay().getWidth();
        this.p.bottom = this.f4923d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f4928i;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.f4928i = new WeakReference<>(view);
        if (view != null) {
            if (x0.h().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.n.size() != 0 && (weakReference = this.f4928i) != null) {
            View view = weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e2) {
                    qc.b("Failure getting view location.", e2);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i3 = this.f4932m;
            if (i3 != -1) {
                windowVisibility = i3;
            }
            boolean z5 = !z4 && x0.f().a(view, this.f4924e, this.f4925f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f4930k.a() && z5 == this.f4931l) {
                return;
            }
            if (z5 || this.f4931l || i2 != 1) {
                p00 p00 = new p00(x0.m().b(), this.f4924e.isScreenOn(), view != null ? x0.h().a(view) : false, view != null ? view.getWindowVisibility() : 8, a(this.p), a(rect), a(rect2), z2, a(rect3), z, a(rect4), this.o.density, z5);
                Iterator<q00> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().a(p00);
                }
                this.f4931l = z5;
            }
        }
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.f4928i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = this.f4928i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f4932m = i2;
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4927h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f4926g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f4926g = new o00(this);
            x0.F().a(this.f4921b, this.f4926g, intentFilter);
        }
        Application application = this.f4922c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f4929j);
            } catch (Exception e2) {
                qc.b("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b() {
        x0.f();
        u9.f5718h.post(new n00(this));
    }

    private final void b(View view) {
        try {
            if (this.f4927h != null) {
                ViewTreeObserver viewTreeObserver = this.f4927h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f4927h = null;
            }
        } catch (Exception e2) {
            qc.b("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            qc.b("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.f4926g != null) {
            try {
                x0.F().a(this.f4921b, this.f4926g);
            } catch (IllegalStateException e4) {
                qc.b("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                x0.j().a(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f4926g = null;
        }
        Application application = this.f4922c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f4929j);
            } catch (Exception e6) {
                qc.b("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void a() {
        a(4);
    }

    public final void a(q00 q00) {
        this.n.add(q00);
        a(3);
    }

    public final void b(q00 q00) {
        this.n.remove(q00);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        b();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        b();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        b();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        b();
    }

    public final void onGlobalLayout() {
        a(2);
        b();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4932m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f4932m = -1;
        a(3);
        b();
        b(view);
    }
}
