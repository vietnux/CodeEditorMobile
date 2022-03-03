package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class n9 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ld<?> f5065b;

    /* renamed from: c  reason: collision with root package name */
    private CopyOnWriteArraySet<r9> f5066c = new CopyOnWriteArraySet<>();

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f5067d;

    /* renamed from: e  reason: collision with root package name */
    SharedPreferences.Editor f5068e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5069f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5070g = true;

    /* renamed from: h  reason: collision with root package name */
    private String f5071h;

    /* renamed from: i  reason: collision with root package name */
    private String f5072i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5073j = false;

    /* renamed from: k  reason: collision with root package name */
    private String f5074k = "";

    /* renamed from: l  reason: collision with root package name */
    private long f5075l = 0;

    /* renamed from: m  reason: collision with root package name */
    private long f5076m = 0;
    private long n = 0;
    private int o = -1;
    private int p = 0;
    private Set<String> q = Collections.emptySet();
    private JSONObject r = new JSONObject();
    private boolean s = true;
    private boolean t = true;

    /* access modifiers changed from: private */
    public final void a(Bundle bundle) {
        new p9(this, bundle).a();
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    public static boolean n() {
        return n.j() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    private final void o() {
        ld<?> ldVar = this.f5065b;
        if (ldVar != null && !ldVar.isDone()) {
            try {
                this.f5065b.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                qc.c("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException | ExecutionException | TimeoutException e3) {
                qc.b("Fail to initialize AdSharedPreferenceManager.", e3);
            }
        }
    }

    /* access modifiers changed from: private */
    public final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.a) {
            bundle.putBoolean("use_https", this.f5070g);
            bundle.putBoolean("content_url_opted_out", this.s);
            bundle.putBoolean("content_vertical_opted_out", this.t);
            bundle.putBoolean("auto_collect_location", this.f5073j);
            bundle.putInt("version_code", this.p);
            bundle.putStringArray("never_pool_slots", (String[]) this.q.toArray(new String[this.q.size()]));
            bundle.putString("app_settings_json", this.f5074k);
            bundle.putLong("app_settings_last_update_ms", this.f5075l);
            bundle.putLong("app_last_background_time_ms", this.f5076m);
            bundle.putInt("request_in_session_count", this.o);
            bundle.putLong("first_ad_req_time_ms", this.n);
            bundle.putString("native_advanced_settings", this.r.toString());
            if (this.f5071h != null) {
                bundle.putString("content_url_hashes", this.f5071h);
            }
            if (this.f5072i != null) {
                bundle.putString("content_vertical_hashes", this.f5072i);
            }
        }
        return bundle;
    }

    public final void a(int i2) {
        o();
        synchronized (this.a) {
            if (this.p != i2) {
                this.p = i2;
                if (this.f5068e != null) {
                    this.f5068e.putInt("version_code", i2);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i2);
                a(bundle);
            }
        }
    }

    public final void a(long j2) {
        o();
        synchronized (this.a) {
            if (this.f5076m != j2) {
                this.f5076m = j2;
                if (this.f5068e != null) {
                    this.f5068e.putLong("app_last_background_time_ms", j2);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j2);
                a(bundle);
            }
        }
    }

    public final void a(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f5065b = (ld) new o9(this, context).a();
    }

    public final void a(r9 r9Var) {
        synchronized (this.a) {
            if (this.f5065b != null && this.f5065b.isDone()) {
                r9Var.a(p());
            }
            this.f5066c.add(r9Var);
        }
    }

    public final void a(String str) {
        o();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.f5071h)) {
                    this.f5071h = str;
                    if (this.f5068e != null) {
                        this.f5068e.putString("content_url_hashes", str);
                        this.f5068e.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        o();
        synchronized (this.a) {
            JSONArray optJSONArray = this.r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", x0.m().a());
                optJSONArray.put(length, jSONObject);
                this.r.put(str, optJSONArray);
            } catch (JSONException e2) {
                qc.c("Could not update native advanced settings", e2);
            }
            if (this.f5068e != null) {
                this.f5068e.putString("native_advanced_settings", this.r.toString());
                this.f5068e.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.r.toString());
            a(bundle);
        }
    }

    public final void a(boolean z) {
        o();
        synchronized (this.a) {
            if (this.f5070g != z) {
                this.f5070g = z;
                if (this.f5068e != null) {
                    this.f5068e.putBoolean("use_https", z);
                    this.f5068e.apply();
                }
                if (!this.f5069f) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("use_https", z);
                    a(bundle);
                }
            }
        }
    }

    public final boolean a() {
        boolean z;
        o();
        synchronized (this.a) {
            if (!this.f5070g) {
                if (!this.f5069f) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final void b(int i2) {
        o();
        synchronized (this.a) {
            if (this.o != i2) {
                this.o = i2;
                if (this.f5068e != null) {
                    this.f5068e.putInt("request_in_session_count", i2);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i2);
                a(bundle);
            }
        }
    }

    public final void b(long j2) {
        o();
        synchronized (this.a) {
            if (this.n != j2) {
                this.n = j2;
                if (this.f5068e != null) {
                    this.f5068e.putLong("first_ad_req_time_ms", j2);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j2);
                a(bundle);
            }
        }
    }

    public final void b(String str) {
        o();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.f5072i)) {
                    this.f5072i = str;
                    if (this.f5068e != null) {
                        this.f5068e.putString("content_vertical_hashes", str);
                        this.f5068e.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    public final void b(boolean z) {
        o();
        synchronized (this.a) {
            if (this.s != z) {
                this.s = z;
                if (this.f5068e != null) {
                    this.f5068e.putBoolean("content_url_opted_out", z);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.s);
                bundle.putBoolean("content_vertical_opted_out", this.t);
                a(bundle);
            }
        }
    }

    public final boolean b() {
        boolean z;
        o();
        synchronized (this.a) {
            z = this.s;
        }
        return z;
    }

    public final String c() {
        String str;
        o();
        synchronized (this.a) {
            str = this.f5071h;
        }
        return str;
    }

    public final void c(String str) {
        o();
        synchronized (this.a) {
            if (!this.q.contains(str)) {
                this.q.add(str);
                if (this.f5068e != null) {
                    this.f5068e.putStringSet("never_pool_slots", this.q);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.q.toArray(new String[this.q.size()]));
                a(bundle);
            }
        }
    }

    public final void c(boolean z) {
        o();
        synchronized (this.a) {
            if (this.t != z) {
                this.t = z;
                if (this.f5068e != null) {
                    this.f5068e.putBoolean("content_vertical_opted_out", z);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.s);
                bundle.putBoolean("content_vertical_opted_out", this.t);
                a(bundle);
            }
        }
    }

    public final void d(String str) {
        o();
        synchronized (this.a) {
            if (this.q.contains(str)) {
                this.q.remove(str);
                if (this.f5068e != null) {
                    this.f5068e.putStringSet("never_pool_slots", this.q);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.q.toArray(new String[this.q.size()]));
                a(bundle);
            }
        }
    }

    public final void d(boolean z) {
        o();
        synchronized (this.a) {
            if (this.f5073j != z) {
                this.f5073j = z;
                if (this.f5068e != null) {
                    this.f5068e.putBoolean("auto_collect_location", z);
                    this.f5068e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                a(bundle);
            }
        }
    }

    public final boolean d() {
        boolean z;
        o();
        synchronized (this.a) {
            z = this.t;
        }
        return z;
    }

    public final String e() {
        String str;
        o();
        synchronized (this.a) {
            str = this.f5072i;
        }
        return str;
    }

    public final boolean e(String str) {
        boolean contains;
        o();
        synchronized (this.a) {
            contains = this.q.contains(str);
        }
        return contains;
    }

    public final void f(String str) {
        o();
        synchronized (this.a) {
            long a2 = x0.m().a();
            this.f5075l = a2;
            if (str != null) {
                if (!str.equals(this.f5074k)) {
                    this.f5074k = str;
                    if (this.f5068e != null) {
                        this.f5068e.putString("app_settings_json", str);
                        this.f5068e.putLong("app_settings_last_update_ms", a2);
                        this.f5068e.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("app_settings_json", str);
                    bundle.putLong("app_settings_last_update_ms", a2);
                    a(bundle);
                }
            }
        }
    }

    public final boolean f() {
        boolean z;
        o();
        synchronized (this.a) {
            z = this.f5073j;
        }
        return z;
    }

    public final int g() {
        int i2;
        o();
        synchronized (this.a) {
            i2 = this.p;
        }
        return i2;
    }

    public final u8 h() {
        u8 u8Var;
        o();
        synchronized (this.a) {
            u8Var = new u8(this.f5074k, this.f5075l);
        }
        return u8Var;
    }

    public final long i() {
        long j2;
        o();
        synchronized (this.a) {
            j2 = this.f5076m;
        }
        return j2;
    }

    public final int j() {
        int i2;
        o();
        synchronized (this.a) {
            i2 = this.o;
        }
        return i2;
    }

    public final long k() {
        long j2;
        o();
        synchronized (this.a) {
            j2 = this.n;
        }
        return j2;
    }

    public final JSONObject l() {
        JSONObject jSONObject;
        o();
        synchronized (this.a) {
            jSONObject = this.r;
        }
        return jSONObject;
    }

    public final void m() {
        o();
        synchronized (this.a) {
            this.r = new JSONObject();
            if (this.f5068e != null) {
                this.f5068e.remove("native_advanced_settings");
                this.f5068e.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            a(bundle);
        }
    }
}
