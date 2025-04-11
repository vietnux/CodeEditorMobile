package e.b.b.a.c.e;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class k1 extends z2 {
    static final Pair<String, Long> y = new Pair<>("", 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f7373c;

    /* renamed from: d  reason: collision with root package name */
    public o1 f7374d;

    /* renamed from: e  reason: collision with root package name */
    public final n1 f7375e = new n1(this, "last_upload", 0);

    /* renamed from: f  reason: collision with root package name */
    public final n1 f7376f = new n1(this, "last_upload_attempt", 0);

    /* renamed from: g  reason: collision with root package name */
    public final n1 f7377g = new n1(this, "backoff", 0);

    /* renamed from: h  reason: collision with root package name */
    public final n1 f7378h = new n1(this, "last_delete_stale", 0);

    /* renamed from: i  reason: collision with root package name */
    public final n1 f7379i = new n1(this, "midnight_offset", 0);

    /* renamed from: j  reason: collision with root package name */
    public final n1 f7380j = new n1(this, "first_open_time", 0);

    /* renamed from: k  reason: collision with root package name */
    public final n1 f7381k = new n1(this, "app_install_time", 0);

    /* renamed from: l  reason: collision with root package name */
    public final p1 f7382l = new p1(this, "app_instance_id", null);

    /* renamed from: m  reason: collision with root package name */
    private String f7383m;
    private boolean n;
    private long o;
    private String p;
    private long q;
    private final Object r = new Object();
    public final n1 s = new n1(this, "time_before_start", 10000);
    public final n1 t = new n1(this, "session_timeout", 1800000);
    public final m1 u = new m1(this, "start_new_session", true);
    public final n1 v = new n1(this, "last_pause_time", 0);
    public final n1 w = new n1(this, "time_active", 0);
    public boolean x;

    k1(d2 d2Var) {
        super(d2Var);
    }

    /* access modifiers changed from: private */
    public final SharedPreferences F() {
        d();
        t();
        return this.f7373c;
    }

    /* access modifiers changed from: package-private */
    public final Boolean A() {
        d();
        if (!F().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(F().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void B() {
        d();
        a().F().a("Clearing collection preferences.");
        boolean contains = F().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = c(true);
        }
        SharedPreferences.Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            a(z);
        }
    }

    /* access modifiers changed from: protected */
    public final String C() {
        d();
        String string = F().getString("previous_os_version", null);
        j().t();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final boolean D() {
        d();
        return F().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return this.f7373c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        d();
        long b2 = b().b();
        String str2 = this.f7383m;
        if (str2 != null && b2 < this.o) {
            return new Pair<>(str2, Boolean.valueOf(this.n));
        }
        this.o = b2 + r().a(str, p0.f7489d);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            if (advertisingIdInfo != null) {
                this.f7383m = advertisingIdInfo.getId();
                this.n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f7383m == null) {
                this.f7383m = "";
            }
        } catch (Exception e2) {
            a().E().a("Unable to get advertising id", e2);
            this.f7383m = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f7383m, Boolean.valueOf(this.n));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        d();
        a().F().a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        d();
        String str2 = (String) a(str).first;
        MessageDigest g2 = s5.g("MD5");
        if (g2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, g2.digest(str2.getBytes())));
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        d();
        a().F().a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        d();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean c(boolean z) {
        d();
        return F().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        synchronized (this.r) {
            this.p = str;
            this.q = b().b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(boolean z) {
        d();
        a().F().a("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final void v() {
        this.f7373c = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.x = this.f7373c.getBoolean("has_been_opened", false);
        if (!this.x) {
            SharedPreferences.Editor edit = this.f7373c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f7374d = new o1(this, "health_monitor", Math.max(0L, p0.f7490e.a().longValue()));
    }

    /* access modifiers changed from: package-private */
    public final String y() {
        d();
        return F().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        synchronized (this.r) {
            if (Math.abs(b().b() - this.q) >= 1000) {
                return null;
            }
            return this.p;
        }
    }
}
