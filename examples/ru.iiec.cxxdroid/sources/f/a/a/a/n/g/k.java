package f.a.a.a.n.g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.f.c;
import f.a.a.a.n.f.d;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class k implements t {
    private final x a;

    /* renamed from: b  reason: collision with root package name */
    private final w f8559b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.a.a.n.b.k f8560c;

    /* renamed from: d  reason: collision with root package name */
    private final h f8561d;

    /* renamed from: e  reason: collision with root package name */
    private final y f8562e;

    /* renamed from: f  reason: collision with root package name */
    private final i f8563f;

    /* renamed from: g  reason: collision with root package name */
    private final c f8564g = new d(this.f8563f);

    public k(i iVar, x xVar, f.a.a.a.n.b.k kVar, w wVar, h hVar, y yVar) {
        this.f8563f = iVar;
        this.a = xVar;
        this.f8560c = kVar;
        this.f8559b = wVar;
        this.f8561d = hVar;
        this.f8562e = yVar;
    }

    private void a(JSONObject jSONObject, String str) {
        l g2 = f.a.a.a.c.g();
        g2.e("Fabric", str + jSONObject.toString());
    }

    private u b(s sVar) {
        Exception e2;
        l g2;
        String str;
        u uVar = null;
        try {
            if (s.SKIP_CACHE_LOOKUP.equals(sVar)) {
                return null;
            }
            JSONObject a2 = this.f8561d.a();
            if (a2 != null) {
                u a3 = this.f8559b.a(this.f8560c, a2);
                if (a3 != null) {
                    a(a2, "Loaded cached settings: ");
                    long a4 = this.f8560c.a();
                    if (!s.IGNORE_CACHE_EXPIRATION.equals(sVar)) {
                        if (a3.a(a4)) {
                            g2 = f.a.a.a.c.g();
                            str = "Cached settings have expired.";
                        }
                    }
                    try {
                        f.a.a.a.c.g().e("Fabric", "Returning cached settings.");
                        return a3;
                    } catch (Exception e3) {
                        e2 = e3;
                        uVar = a3;
                        f.a.a.a.c.g().c("Fabric", "Failed to get cached settings", e2);
                        return uVar;
                    }
                } else {
                    f.a.a.a.c.g().c("Fabric", "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                g2 = f.a.a.a.c.g();
                str = "No cached settings data found.";
            }
            g2.e("Fabric", str);
            return null;
        } catch (Exception e4) {
            e2 = e4;
            f.a.a.a.c.g().c("Fabric", "Failed to get cached settings", e2);
            return uVar;
        }
    }

    @Override // f.a.a.a.n.g.t
    public u a() {
        return a(s.USE_CACHE);
    }

    @Override // f.a.a.a.n.g.t
    public u a(s sVar) {
        JSONObject a2;
        u uVar = null;
        try {
            if (!f.a.a.a.c.i() && !b()) {
                uVar = b(sVar);
            }
            if (uVar == null && (a2 = this.f8562e.a(this.a)) != null) {
                uVar = this.f8559b.a(this.f8560c, a2);
                this.f8561d.a(uVar.f8590g, a2);
                a(a2, "Loaded settings: ");
                a(c());
            }
            return uVar == null ? b(s.IGNORE_CACHE_EXPIRATION) : uVar;
        } catch (Exception e2) {
            f.a.a.a.c.g().c("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean a(String str) {
        SharedPreferences.Editor a2 = this.f8564g.a();
        a2.putString("existing_instance_identifier", str);
        return this.f8564g.a(a2);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return !d().equals(c());
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return f.a.a.a.n.b.i.a(f.a.a.a.n.b.i.n(this.f8563f.j()));
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f8564g.get().getString("existing_instance_identifier", "");
    }
}
