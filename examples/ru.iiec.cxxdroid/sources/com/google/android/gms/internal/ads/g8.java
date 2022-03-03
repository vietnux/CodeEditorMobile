package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@k2
public final class g8 {
    private final AtomicReference<ThreadPoolExecutor> a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f4402b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private String f4403c = null;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f4404d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f4405e = new AtomicInteger(-1);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Object> f4406f = new AtomicReference<>(null);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<Object> f4407g = new AtomicReference<>(null);

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentMap<String, Method> f4408h = new ConcurrentHashMap(9);

    private static Bundle a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            qc.b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object a(String str, Context context) {
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.f4406f, true)) {
            return null;
        }
        try {
            return h(context, str).invoke(this.f4406f.get(), new Object[0]);
        } catch (Exception e2) {
            a(e2, str, true);
            return null;
        }
    }

    private final void a(Context context, String str, Bundle bundle) {
        if (d(context) && a(context, "com.google.android.gms.measurement.AppMeasurement", this.f4406f, true)) {
            Method l2 = l(context);
            try {
                l2.invoke(this.f4406f.get(), "am", str, bundle);
            } catch (Exception e2) {
                a(e2, "logEventInternal", true);
            }
        }
    }

    private final void a(Exception exc, String str, boolean z) {
        if (!this.f4404d.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            qc.d(sb.toString());
            if (z) {
                qc.d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f4404d.set(true);
            }
        }
    }

    private final boolean a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e2) {
                a(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void b(Context context, String str, String str2) {
        if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.f4406f, true)) {
            Method g2 = g(context, str2);
            try {
                g2.invoke(this.f4406f.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                l9.e(sb.toString());
            } catch (Exception e2) {
                a(e2, str2, false);
            }
        }
    }

    private final Method g(Context context, String str) {
        Method method = this.f4408h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.f4408h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method h(Context context, String str) {
        Method method = this.f4408h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f4408h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method i(Context context, String str) {
        Method method = this.f4408h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.f4408h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method l(Context context) {
        Method method = this.f4408h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.f4408h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, "logEventInternal", true);
            return null;
        }
    }

    public final String a(Context context) {
        if (!d(context)) {
            return null;
        }
        long longValue = ((Long) a50.g().a(k80.t0)).longValue();
        if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        }
        if (this.a.get() == null) {
            this.a.compareAndSet(null, new ThreadPoolExecutor(((Integer) a50.g().a(k80.u0)).intValue(), ((Integer) a50.g().a(k80.u0)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new j8(this)));
        }
        Future submit = this.a.get().submit(new h8(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            submit.cancel(true);
            if (e2 instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    public final void a(Context context, String str) {
        if (d(context)) {
            b(context, str, "beginAdUnitExposure");
        }
    }

    public final void a(Context context, String str, String str2) {
        if (d(context)) {
            a(context, str, a(context, str2, "_ac".equals(str)));
        }
    }

    public final void a(Context context, String str, String str2, String str3, int i2) {
        if (d(context)) {
            Bundle a2 = a(context, str, false);
            a2.putString("_ai", str2);
            a2.putString("type", str3);
            a2.putInt("value", i2);
            a(context, "_ar", a2);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            l9.e(sb.toString());
        }
    }

    public final String b(Context context) {
        Object a2;
        if (d(context) && (a2 = a("generateEventId", context)) != null) {
            return a2.toString();
        }
        return null;
    }

    public final void b(Context context, String str) {
        if (d(context)) {
            b(context, str, "endAdUnitExposure");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c(Context context) {
        return (String) a("getAppInstanceId", context);
    }

    public final void c(Context context, String str) {
        if (d(context) && (context instanceof Activity) && a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f4407g, false)) {
            Method i2 = i(context, "setCurrentScreen");
            try {
                i2.invoke(this.f4407g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e2) {
                a(e2, "setCurrentScreen", false);
            }
        }
    }

    public final void d(Context context, String str) {
        a(context, "_ac", str);
    }

    public final boolean d(Context context) {
        if (((Boolean) a50.g().a(k80.j0)).booleanValue() && !this.f4404d.get()) {
            if (this.f4405e.get() == -1) {
                a50.b();
                if (!fc.c(context)) {
                    a50.b();
                    if (fc.f(context)) {
                        qc.d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f4405e.set(0);
                    }
                }
                this.f4405e.set(1);
            }
            if (this.f4405e.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void e(Context context, String str) {
        a(context, "_ai", str);
    }

    public final boolean e(Context context) {
        return ((Boolean) a50.g().a(k80.k0)).booleanValue() && d(context);
    }

    public final void f(Context context, String str) {
        a(context, "_aq", str);
    }

    public final boolean f(Context context) {
        return ((Boolean) a50.g().a(k80.l0)).booleanValue() && d(context);
    }

    public final boolean g(Context context) {
        return ((Boolean) a50.g().a(k80.m0)).booleanValue() && d(context);
    }

    public final boolean h(Context context) {
        return ((Boolean) a50.g().a(k80.n0)).booleanValue() && d(context);
    }

    public final boolean i(Context context) {
        return ((Boolean) a50.g().a(k80.q0)).booleanValue() && d(context);
    }

    public final String j(Context context) {
        if (!d(context) || !a(context, "com.google.android.gms.measurement.AppMeasurement", this.f4406f, true)) {
            return "";
        }
        try {
            String str = (String) h(context, "getCurrentScreenName").invoke(this.f4406f.get(), new Object[0]);
            if (str == null) {
                str = (String) h(context, "getCurrentScreenClass").invoke(this.f4406f.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e2) {
            a(e2, "getCurrentScreenName", false);
            return "";
        }
    }

    public final String k(Context context) {
        if (!d(context)) {
            return null;
        }
        synchronized (this.f4402b) {
            if (this.f4403c != null) {
                return this.f4403c;
            }
            this.f4403c = (String) a("getGmpAppId", context);
            return this.f4403c;
        }
    }
}
