package e.b.b.a.c.e;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import c.h.d.c;

public abstract class w6<T> {

    /* renamed from: f */
    private static final Object f7667f = new Object();

    /* renamed from: g */
    private static Context f7668g;

    /* renamed from: h */
    private static volatile Boolean f7669h;
    private final g7 a;

    /* renamed from: b */
    final String f7670b;

    /* renamed from: c */
    private final String f7671c;

    /* renamed from: d */
    private final T f7672d;

    /* renamed from: e */
    private volatile t6 f7673e;

    private w6(g7 g7Var, String str, T t) {
        this.f7673e = null;
        if (g7Var.a != null) {
            this.a = g7Var;
            String valueOf = String.valueOf(g7Var.f7287b);
            String valueOf2 = String.valueOf(str);
            this.f7671c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(g7Var.f7288c);
            String valueOf4 = String.valueOf(str);
            this.f7670b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f7672d = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ w6(g7 g7Var, String str, Object obj, a7 a7Var) {
        this(g7Var, str, obj);
    }

    public static w6<Double> a(g7 g7Var, String str, double d2) {
        return new d7(g7Var, str, Double.valueOf(d2));
    }

    public static w6<Integer> a(g7 g7Var, String str, int i2) {
        return new b7(g7Var, str, Integer.valueOf(i2));
    }

    public static w6<Long> a(g7 g7Var, String str, long j2) {
        return new a7(g7Var, str, Long.valueOf(j2));
    }

    public static w6<String> a(g7 g7Var, String str, String str2) {
        return new e7(g7Var, str, str2);
    }

    public static w6<Boolean> a(g7 g7Var, String str, boolean z) {
        return new c7(g7Var, str, Boolean.valueOf(z));
    }

    private static <V> V a(f7<V> f7Var) {
        long clearCallingIdentity;
        try {
            return f7Var.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = f7Var.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static void a(Context context) {
        synchronized (f7667f) {
            if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (f7668g != context) {
                f7669h = null;
            }
            f7668g = context;
        }
    }

    static boolean a(String str, boolean z) {
        try {
            if (e()) {
                return ((Boolean) a(new z6(str, false))).booleanValue();
            }
            return false;
        } catch (SecurityException e2) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", e2);
            return false;
        }
    }

    private final T c() {
        if (a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f7670b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
            return null;
        } else if (this.a.a == null) {
            return null;
        } else {
            if (this.f7673e == null) {
                this.f7673e = t6.a(f7668g.getContentResolver(), this.a.a);
            }
            String str = (String) a(new x6(this, this.f7673e));
            if (str != null) {
                return a(str);
            }
            return null;
        }
    }

    private final T d() {
        if (!e()) {
            return null;
        }
        try {
            String str = (String) a(new y6(this));
            if (str != null) {
                return a(str);
            }
            return null;
        } catch (SecurityException e2) {
            String valueOf = String.valueOf(this.f7670b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Unable to read GServices for flag: ".concat(valueOf) : new String("Unable to read GServices for flag: "), e2);
            return null;
        }
    }

    private static boolean e() {
        if (f7669h == null) {
            Context context = f7668g;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (c.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f7669h = Boolean.valueOf(z);
        }
        return f7669h.booleanValue();
    }

    public final T a() {
        if (f7668g != null) {
            T c2 = c();
            if (c2 != null) {
                return c2;
            }
            T d2 = d();
            return d2 != null ? d2 : this.f7672d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    public abstract T a(String str);

    public final /* synthetic */ String b() {
        return r6.a(f7668g.getContentResolver(), this.f7671c, (String) null);
    }
}
