package f.a.a.a.n.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class p {

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f8410m = Pattern.compile("[^\\p{Alnum}]");
    private static final String n = Pattern.quote("/");
    private final ReentrantLock a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final q f8411b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8412c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8413d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f8414e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8415f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8416g;

    /* renamed from: h  reason: collision with root package name */
    private final Collection<i> f8417h;

    /* renamed from: i  reason: collision with root package name */
    c f8418i;

    /* renamed from: j  reason: collision with root package name */
    b f8419j;

    /* renamed from: k  reason: collision with root package name */
    boolean f8420k;

    /* renamed from: l  reason: collision with root package name */
    o f8421l;

    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: b  reason: collision with root package name */
        public final int f8430b;

        private a(int i2) {
            this.f8430b = i2;
        }
    }

    public p(Context context, String str, String str2, Collection<i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f8414e = context;
            this.f8415f = str;
            this.f8416g = str2;
            this.f8417h = collection;
            this.f8411b = new q();
            this.f8418i = new c(context);
            this.f8421l = new o();
            this.f8412c = i.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.f8412c) {
                l g2 = c.g();
                g2.e("Fabric", "Device ID collection disabled for " + context.getPackageName());
            }
            this.f8413d = i.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f8413d) {
                l g3 = c.g();
                g3.e("Fabric", "User information collection disabled for " + context.getPackageName());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return f8410m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private void a(SharedPreferences sharedPreferences) {
        b c2 = c();
        if (c2 != null) {
            a(sharedPreferences, c2.a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private void a(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.Editor putString;
        this.a.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString("crashlytics.advertising.id", null);
                if (TextUtils.isEmpty(string)) {
                    putString = sharedPreferences.edit().putString("crashlytics.advertising.id", str);
                } else {
                    if (!string.equals(str)) {
                        putString = sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str);
                    }
                    this.a.unlock();
                }
                putString.commit();
                this.a.unlock();
            }
        } finally {
            this.a.unlock();
        }
    }

    private void a(Map<a, String> map, a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private String b(SharedPreferences sharedPreferences) {
        this.a.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                string = a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.a.unlock();
        }
    }

    private String b(String str) {
        return str.replaceAll(n, "");
    }

    private Boolean o() {
        b c2 = c();
        if (c2 != null) {
            return Boolean.valueOf(c2.f8376b);
        }
        return null;
    }

    public boolean a() {
        return this.f8413d;
    }

    public String b() {
        b c2;
        if (!n() || (c2 = c()) == null || c2.f8376b) {
            return null;
        }
        return c2.a;
    }

    /* access modifiers changed from: package-private */
    public synchronized b c() {
        if (!this.f8420k) {
            this.f8419j = this.f8418i.a();
            this.f8420k = true;
        }
        return this.f8419j;
    }

    public String d() {
        boolean equals = Boolean.TRUE.equals(o());
        if (n() && !equals) {
            String string = Settings.Secure.getString(this.f8414e.getContentResolver(), "android_id");
            if (!"9774d56d682e549c".equals(string)) {
                return a(string);
            }
        }
        return null;
    }

    public String e() {
        return this.f8415f;
    }

    public String f() {
        String str = this.f8416g;
        if (str != null) {
            return str;
        }
        SharedPreferences i2 = i.i(this.f8414e);
        a(i2);
        String string = i2.getString("crashlytics.installation.id", null);
        return string == null ? b(i2) : string;
    }

    public Map<a, String> g() {
        HashMap hashMap = new HashMap();
        for (i iVar : this.f8417h) {
            if (iVar instanceof m) {
                for (Map.Entry<a, String> entry : ((m) iVar).h().entrySet()) {
                    a(hashMap, entry.getKey(), entry.getValue());
                }
            }
        }
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            a(hashMap, a.ANDROID_ID, d());
        } else {
            a(hashMap, a.ANDROID_ADVERTISING_ID, b2);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String h() {
        return this.f8411b.a(this.f8414e);
    }

    public String i() {
        return String.format(Locale.US, "%s/%s", b(Build.MANUFACTURER), b(Build.MODEL));
    }

    public String j() {
        return b(Build.VERSION.INCREMENTAL);
    }

    public String k() {
        return b(Build.VERSION.RELEASE);
    }

    public String l() {
        return k() + "/" + j();
    }

    public Boolean m() {
        if (n()) {
            return o();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return this.f8412c && !this.f8421l.b(this.f8414e);
    }
}
