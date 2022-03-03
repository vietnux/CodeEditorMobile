package e.b.b.a.c.e;

import android.app.Activity;
import android.os.Bundle;
import c.e.a;
import com.google.android.gms.common.internal.y;
import java.util.Map;

public final class x3 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    protected w3 f7682c;

    /* renamed from: d  reason: collision with root package name */
    private volatile w3 f7683d;

    /* renamed from: e  reason: collision with root package name */
    private w3 f7684e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, w3> f7685f = new a();

    /* renamed from: g  reason: collision with root package name */
    private String f7686g;

    public x3(d2 d2Var) {
        super(d2Var);
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void a(Activity activity, w3 w3Var, boolean z) {
        w3 w3Var2 = this.f7683d == null ? this.f7684e : this.f7683d;
        if (w3Var.f7655b == null) {
            w3Var = new w3(w3Var.a, a(activity.getClass().getCanonicalName()), w3Var.f7656c);
        }
        this.f7684e = this.f7683d;
        b().b();
        this.f7683d = w3Var;
        c().a(new y3(this, z, w3Var2, w3Var));
    }

    /* access modifiers changed from: private */
    public final void a(w3 w3Var) {
        g().a(b().b());
        if (p().a(w3Var.f7657d)) {
            w3Var.f7657d = false;
        }
    }

    public static void a(w3 w3Var, Bundle bundle, boolean z) {
        if (bundle != null && w3Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = w3Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", w3Var.f7655b);
            bundle.putLong("_si", w3Var.f7656c);
        } else if (bundle != null && w3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    private final w3 d(Activity activity) {
        y.a(activity);
        w3 w3Var = this.f7685f.get(activity);
        if (w3Var != null) {
            return w3Var;
        }
        w3 w3Var2 = new w3(null, a(activity.getClass().getCanonicalName()), o().y());
        this.f7685f.put(activity, w3Var2);
        return w3Var2;
    }

    public final void a(Activity activity) {
        this.f7685f.remove(activity);
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) != null) {
            this.f7685f.put(activity, new w3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void a(Activity activity, String str, String str2) {
        c();
        if (!z1.A()) {
            a().B().a("setCurrentScreen must be called from the main thread");
        } else if (this.f7683d == null) {
            a().B().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f7685f.get(activity) == null) {
            a().B().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f7683d.f7655b.equals(str2);
            boolean d2 = s5.d(this.f7683d.a, str);
            if (equals && d2) {
                a().C().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                a().B().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                a().F().a("Setting current screen to name, class", str == null ? "null" : str, str2);
                w3 w3Var = new w3(str, str2, o().y());
                this.f7685f.put(activity, w3Var);
                a(activity, w3Var, true);
            } else {
                a().B().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void a(String str, w3 w3Var) {
        d();
        synchronized (this) {
            if (this.f7686g == null || this.f7686g.equals(str) || w3Var != null) {
                this.f7686g = str;
            }
        }
    }

    public final void b(Activity activity) {
        w3 d2 = d(activity);
        this.f7684e = this.f7683d;
        b().b();
        this.f7683d = null;
        c().a(new z3(this, d2));
    }

    public final void b(Activity activity, Bundle bundle) {
        w3 w3Var;
        if (bundle != null && (w3Var = this.f7685f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", w3Var.f7656c);
            bundle2.putString("name", w3Var.a);
            bundle2.putString("referrer_name", w3Var.f7655b);
            bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
        }
    }

    public final void c(Activity activity) {
        a(activity, d(activity), false);
        n g2 = g();
        g2.c().a(new q(g2, g2.b().b()));
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final w3 y() {
        t();
        d();
        return this.f7682c;
    }

    public final w3 z() {
        return this.f7683d;
    }
}
