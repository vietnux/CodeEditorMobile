package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class dy implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler n = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f4138b;

    /* renamed from: c  reason: collision with root package name */
    private Application f4139c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager f4140d;

    /* renamed from: e  reason: collision with root package name */
    private final KeyguardManager f4141e;

    /* renamed from: f  reason: collision with root package name */
    private final tx f4142f;

    /* renamed from: g  reason: collision with root package name */
    private BroadcastReceiver f4143g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f4144h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<View> f4145i;

    /* renamed from: j  reason: collision with root package name */
    private hx f4146j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4147k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f4148l = -1;

    /* renamed from: m  reason: collision with root package name */
    private long f4149m = -3;

    public dy(tx txVar, View view) {
        this.f4142f = txVar;
        this.f4138b = txVar.a;
        this.f4140d = (PowerManager) this.f4138b.getSystemService("power");
        this.f4141e = (KeyguardManager) this.f4138b.getSystemService("keyguard");
        Context context = this.f4138b;
        if (context instanceof Application) {
            this.f4139c = (Application) context;
            this.f4146j = new hx((Application) context, this);
        }
        a(view);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.f4145i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = this.f4145i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f4148l = i2;
            }
        }
    }

    private final void b() {
        n.post(new ey(this));
    }

    private final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4144h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f4143g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f4143g = new fy(this);
            this.f4138b.registerReceiver(this.f4143g, intentFilter);
        }
        Application application = this.f4139c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f4146j);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dy.c():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f4144h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f4144h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f4144h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002e }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x002f
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002e }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.content.BroadcastReceiver r4 = r3.f4143g
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r3.f4138b     // Catch:{ Exception -> 0x0038 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f4143g = r0
        L_0x003a:
            android.app.Application r4 = r3.f4139c
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.hx r0 = r3.f4146j     // Catch:{ Exception -> 0x0043 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dy.c(android.view.View):void");
    }

    public final long a() {
        if (this.f4149m == -2 && this.f4145i.get() == null) {
            this.f4149m = -3;
        }
        return this.f4149m;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        long j2;
        WeakReference<View> weakReference = this.f4145i;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            c(view2);
        }
        this.f4145i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.f4149m = j2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        c();
    }

    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        c();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        c();
        b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        c();
    }

    public final void onActivityStopped(Activity activity) {
        c();
    }

    public final void onGlobalLayout() {
        c();
    }

    public final void onScrollChanged() {
        c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4148l = -1;
        b(view);
        c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f4148l = -1;
        c();
        b();
        c(view);
    }
}
