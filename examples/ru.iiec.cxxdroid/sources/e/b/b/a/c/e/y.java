package e.b.b.a.c.e;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.p;
import java.lang.reflect.InvocationTargetException;

public final class y extends y2 {

    /* renamed from: b  reason: collision with root package name */
    private a0 f7695b = z.a;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f7696c;

    y(d2 d2Var) {
        super(d2Var);
    }

    public static long x() {
        return p0.F.a().longValue();
    }

    public static long y() {
        return p0.f7491f.a().longValue();
    }

    public static boolean z() {
        return p0.f7487b.a().booleanValue();
    }

    public final int a(String str) {
        return b(str, p0.q);
    }

    public final long a(String str, q0<Long> q0Var) {
        if (str != null) {
            String a = this.f7695b.a(str, q0Var.b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return q0Var.a(Long.valueOf(Long.parseLong(a))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return q0Var.a().longValue();
    }

    /* access modifiers changed from: package-private */
    public final void a(a0 a0Var) {
        this.f7695b = a0Var;
    }

    public final int b(String str, q0<Integer> q0Var) {
        if (str != null) {
            String a = this.f7695b.a(str, q0Var.b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return q0Var.a(Integer.valueOf(Integer.parseInt(a))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return q0Var.a().intValue();
    }

    /* access modifiers changed from: package-private */
    public final Boolean b(String str) {
        com.google.android.gms.common.internal.y.b(str);
        try {
            if (getContext().getPackageManager() == null) {
                a().y().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = c.b(getContext()).a(getContext().getPackageName(), 128);
            if (a == null) {
                a().y().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                a().y().a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (PackageManager.NameNotFoundException e2) {
            a().y().a("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final double c(String str, q0<Double> q0Var) {
        if (str != null) {
            String a = this.f7695b.a(str, q0Var.b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return q0Var.a(Double.valueOf(Double.parseDouble(a))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return q0Var.a().doubleValue();
    }

    public final boolean c(String str) {
        return "1".equals(this.f7695b.a(str, "gaia_collection_enabled"));
    }

    public final boolean d(String str) {
        return "1".equals(this.f7695b.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean d(String str, q0<Boolean> q0Var) {
        Boolean a;
        if (str != null) {
            String a2 = this.f7695b.a(str, q0Var.b());
            if (!TextUtils.isEmpty(a2)) {
                a = q0Var.a(Boolean.valueOf(Boolean.parseBoolean(a2)));
                return a.booleanValue();
            }
        }
        a = q0Var.a();
        return a.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        return d(str, p0.O);
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        return d(str, p0.Q);
    }

    /* access modifiers changed from: package-private */
    public final boolean g(String str) {
        return d(str, p0.R);
    }

    /* access modifiers changed from: package-private */
    public final boolean h(String str) {
        return d(str, p0.S);
    }

    /* access modifiers changed from: package-private */
    public final boolean i(String str) {
        return d(str, p0.T);
    }

    /* access modifiers changed from: package-private */
    public final boolean j(String str) {
        return d(str, p0.V);
    }

    public final boolean s() {
        if (this.f7696c == null) {
            synchronized (this) {
                if (this.f7696c == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String a = p.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f7696c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f7696c == null) {
                        this.f7696c = Boolean.TRUE;
                        a().y().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7696c.booleanValue();
    }

    public final boolean t() {
        Boolean b2 = b("firebase_analytics_collection_deactivated");
        return b2 != null && b2.booleanValue();
    }

    public final String u() {
        String str;
        b1 b1Var;
        Object e2;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e3) {
            e2 = e3;
            b1Var = a().y();
            str = "Could not find SystemProperties class";
            b1Var.a(str, e2);
            return "";
        } catch (NoSuchMethodException e4) {
            e2 = e4;
            b1Var = a().y();
            str = "Could not find SystemProperties.get() method";
            b1Var.a(str, e2);
            return "";
        } catch (IllegalAccessException e5) {
            e2 = e5;
            b1Var = a().y();
            str = "Could not access SystemProperties.get()";
            b1Var.a(str, e2);
            return "";
        } catch (InvocationTargetException e6) {
            e2 = e6;
            b1Var = a().y();
            str = "SystemProperties.get() threw an exception";
            b1Var.a(str, e2);
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        return d(i().z(), p0.J);
    }

    /* access modifiers changed from: package-private */
    public final String w() {
        String z = i().z();
        q0<String> q0Var = p0.K;
        return z == null ? q0Var.a() : q0Var.a(this.f7695b.a(z, q0Var.b()));
    }
}
