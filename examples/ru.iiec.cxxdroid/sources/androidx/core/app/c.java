package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* access modifiers changed from: package-private */
public final class c {
    protected static final Class<?> a = a();

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f998b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f999c = c();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f1000d = b(a);

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f1001e = a(a);

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f1002f = c(a);

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f1003g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f1004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1005c;

        a(d dVar, Object obj) {
            this.f1004b = dVar;
            this.f1005c = obj;
        }

        public void run() {
            this.f1004b.f1010b = this.f1005c;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f1006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f1007c;

        b(Application application, d dVar) {
            this.f1006b = application;
            this.f1007c = dVar;
        }

        public void run() {
            this.f1006b.unregisterActivityLifecycleCallbacks(this.f1007c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    public class RunnableC0016c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1009c;

        RunnableC0016c(Object obj, Object obj2) {
            this.f1008b = obj;
            this.f1009c = obj2;
        }

        public void run() {
            try {
                if (c.f1000d != null) {
                    c.f1000d.invoke(this.f1008b, this.f1009c, false, "AppCompat recreation");
                    return;
                }
                c.f1001e.invoke(this.f1008b, this.f1009c, false);
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b  reason: collision with root package name */
        Object f1010b;

        /* renamed from: c  reason: collision with root package name */
        private Activity f1011c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1012d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1013e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1014f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1015g = false;

        d(Activity activity) {
            this.f1011c = activity;
            this.f1012d = this.f1011c.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1011c == activity) {
                this.f1011c = null;
                this.f1014f = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1014f && !this.f1015g && !this.f1013e && c.a(this.f1010b, this.f1012d, activity)) {
                this.f1015g = true;
                this.f1010b = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1011c == activity) {
                this.f1013e = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (d() && f1002f == null) {
            return false;
        } else {
            if (f1001e == null && f1000d == null) {
                return false;
            }
            try {
                Object obj2 = f999c.get(activity);
                if (obj2 == null || (obj = f998b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f1003g.post(new a(dVar, obj2));
                try {
                    if (d()) {
                        f1002f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                    } else {
                        activity.recreate();
                    }
                    return true;
                } finally {
                    f1003g.post(new b(application, dVar));
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = f999c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i2) {
                    f1003g.postAtFrontOfQueue(new RunnableC0016c(f998b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }
}
