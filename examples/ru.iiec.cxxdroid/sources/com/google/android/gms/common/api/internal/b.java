package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f  reason: collision with root package name */
    private static final b f3492f = new b();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f3493b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3494c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f3495d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f3496e = false;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static void a(Application application) {
        synchronized (f3492f) {
            if (!f3492f.f3496e) {
                application.registerActivityLifecycleCallbacks(f3492f);
                application.registerComponentCallbacks(f3492f);
                f3492f.f3496e = true;
            }
        }
    }

    public static b b() {
        return f3492f;
    }

    private final void b(boolean z) {
        synchronized (f3492f) {
            ArrayList<a> arrayList = this.f3495d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f3492f) {
            this.f3495d.add(aVar);
        }
    }

    public final boolean a() {
        return this.f3493b.get();
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f3494c.get()) {
            if (!n.d()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f3494c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f3493b.set(true);
            }
        }
        return a();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f3493b.compareAndSet(true, false);
        this.f3494c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f3493b.compareAndSet(true, false);
        this.f3494c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f3493b.compareAndSet(false, true)) {
            this.f3494c.set(true);
            b(true);
        }
    }
}
