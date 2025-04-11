package f.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import f.a.a.a.n.b.g;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.l;
import f.a.a.a.n.e.b;
import f.a.a.a.n.e.e;
import f.a.a.a.n.g.d;
import f.a.a.a.n.g.o;
import f.a.a.a.n.g.r;
import f.a.a.a.n.g.u;
import f.a.a.a.n.g.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class m extends i<Boolean> {

    /* renamed from: h  reason: collision with root package name */
    private final e f8364h = new b();

    /* renamed from: i  reason: collision with root package name */
    private PackageManager f8365i;

    /* renamed from: j  reason: collision with root package name */
    private String f8366j;

    /* renamed from: k  reason: collision with root package name */
    private PackageInfo f8367k;

    /* renamed from: l  reason: collision with root package name */
    private String f8368l;

    /* renamed from: m  reason: collision with root package name */
    private String f8369m;
    private String n;
    private String o;
    private String p;
    private final Future<Map<String, k>> q;
    private final Collection<i> r;

    public m(Future<Map<String, k>> future, Collection<i> collection) {
        this.q = future;
        this.r = collection;
    }

    private d a(o oVar, Collection<k> collection) {
        Context j2 = j();
        return new d(new g().d(j2), m().e(), this.f8369m, this.f8368l, i.a(i.n(j2)), this.o, l.a(this.n).h(), this.p, "0", oVar, collection);
    }

    private boolean a(f.a.a.a.n.g.e eVar, o oVar, Collection<k> collection) {
        return new z(this, t(), eVar.f8554b, this.f8364h).a(a(oVar, collection));
    }

    private boolean a(String str, f.a.a.a.n.g.e eVar, Collection<k> collection) {
        if ("new".equals(eVar.a)) {
            if (!b(str, eVar, collection)) {
                c.g().c("Fabric", "Failed to create app with Crashlytics service.", null);
                return false;
            }
        } else if (!"configured".equals(eVar.a)) {
            if (eVar.f8557e) {
                c.g().e("Fabric", "Server says an update is required - forcing a full App update.");
                c(str, eVar, collection);
            }
            return true;
        }
        return r.d().c();
    }

    private boolean b(String str, f.a.a.a.n.g.e eVar, Collection<k> collection) {
        return new f.a.a.a.n.g.i(this, t(), eVar.f8554b, this.f8364h).a(a(o.a(j(), str), collection));
    }

    private boolean c(String str, f.a.a.a.n.g.e eVar, Collection<k> collection) {
        return a(eVar, o.a(j(), str), collection);
    }

    private u u() {
        try {
            r d2 = r.d();
            d2.a(this, this.f8360f, this.f8364h, this.f8368l, this.f8369m, t());
            d2.b();
            return r.d().a();
        } catch (Exception e2) {
            c.g().c("Fabric", "Error dealing with settings", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, k> a(Map<String, k> map, Collection<i> collection) {
        for (i iVar : collection) {
            if (!map.containsKey(iVar.n())) {
                map.put(iVar.n(), new k(iVar.n(), iVar.p(), "binary"));
            }
        }
        return map;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public Boolean i() {
        boolean z;
        String c2 = i.c(j());
        u u = u();
        if (u != null) {
            try {
                Map<String, k> hashMap = this.q != null ? this.q.get() : new HashMap<>();
                a(hashMap, this.r);
                z = a(c2, u.a, hashMap.values());
            } catch (Exception e2) {
                c.g().c("Fabric", "Error performing auto configuration.", e2);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // f.a.a.a.i
    public String n() {
        return "io.fabric.sdk.android:fabric";
    }

    @Override // f.a.a.a.i
    public String p() {
        return "1.4.2.22";
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public boolean s() {
        try {
            this.n = m().h();
            this.f8365i = j().getPackageManager();
            this.f8366j = j().getPackageName();
            this.f8367k = this.f8365i.getPackageInfo(this.f8366j, 0);
            this.f8368l = Integer.toString(this.f8367k.versionCode);
            this.f8369m = this.f8367k.versionName == null ? "0.0" : this.f8367k.versionName;
            this.o = this.f8365i.getApplicationLabel(j().getApplicationInfo()).toString();
            this.p = Integer.toString(j().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            c.g().c("Fabric", "Failed init", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return i.b(j(), "com.crashlytics.ApiEndpoint");
    }
}
