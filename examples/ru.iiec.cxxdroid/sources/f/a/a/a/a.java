package f.a.a.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class a {
    private final Application a;

    /* renamed from: b  reason: collision with root package name */
    private C0122a f8328b;

    /* access modifiers changed from: private */
    /* renamed from: f.a.a.a.a$a  reason: collision with other inner class name */
    public static class C0122a {
        private final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private final Application f8329b;

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.a.a.a$a$a  reason: collision with other inner class name */
        public class C0123a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f8330b;

            C0123a(C0122a aVar, b bVar) {
                this.f8330b = bVar;
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.f8330b.a(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                this.f8330b.a(activity);
            }

            public void onActivityPaused(Activity activity) {
                this.f8330b.b(activity);
            }

            public void onActivityResumed(Activity activity) {
                this.f8330b.c(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.f8330b.b(activity, bundle);
            }

            public void onActivityStarted(Activity activity) {
                this.f8330b.d(activity);
            }

            public void onActivityStopped(Activity activity) {
                this.f8330b.e(activity);
            }
        }

        C0122a(Application application) {
            this.f8329b = application;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @TargetApi(14)
        private void a() {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.a) {
                this.f8329b.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @TargetApi(14)
        private boolean a(b bVar) {
            if (this.f8329b == null) {
                return false;
            }
            C0123a aVar = new C0123a(this, bVar);
            this.f8329b.registerActivityLifecycleCallbacks(aVar);
            this.a.add(aVar);
            return true;
        }
    }

    public static abstract class b {
        public void a(Activity activity) {
        }

        public void a(Activity activity, Bundle bundle) {
        }

        public void b(Activity activity) {
        }

        public void b(Activity activity, Bundle bundle) {
        }

        public void c(Activity activity) {
        }

        public abstract void d(Activity activity);

        public void e(Activity activity) {
        }
    }

    public a(Context context) {
        this.a = (Application) context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.f8328b = new C0122a(this.a);
        }
    }

    public void a() {
        C0122a aVar = this.f8328b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean a(b bVar) {
        C0122a aVar = this.f8328b;
        return aVar != null && aVar.a(bVar);
    }
}
