package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class r00 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f5367b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f5368c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5369d = false;

    public r00(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5368c = new WeakReference<>(activityLifecycleCallbacks);
        this.f5367b = application;
    }

    private final void a(a10 a10) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f5368c.get();
            if (activityLifecycleCallbacks != null) {
                a10.a(activityLifecycleCallbacks);
            } else if (!this.f5369d) {
                this.f5367b.unregisterActivityLifecycleCallbacks(this);
                this.f5369d = true;
            }
        } catch (Exception e2) {
            qc.b("Error while dispatching lifecycle callback.", e2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new s00(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new z00(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new v00(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new u00(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new y00(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new t00(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new w00(this, activity));
    }
}
