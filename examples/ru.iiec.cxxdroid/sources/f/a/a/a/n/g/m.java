package f.a.a.a.n.g;

import android.text.TextUtils;
import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.b.a;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class m extends a implements y {
    public m(i iVar, String str, String str2, e eVar) {
        this(iVar, str, str2, eVar, c.GET);
    }

    m(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    private d a(d dVar, x xVar) {
        String str;
        String str2;
        a(dVar, "X-CRASHLYTICS-API-KEY", xVar.a);
        a(dVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a(dVar, "X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        a(dVar, "Accept", "application/json");
        a(dVar, "X-CRASHLYTICS-DEVICE-MODEL", xVar.f8591b);
        a(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", xVar.f8592c);
        a(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", xVar.f8593d);
        a(dVar, "X-CRASHLYTICS-INSTALLATION-ID", xVar.f8595f);
        if (TextUtils.isEmpty(xVar.f8594e)) {
            str = xVar.f8596g;
            str2 = "X-CRASHLYTICS-ANDROID-ID";
        } else {
            str = xVar.f8594e;
            str2 = "X-CRASHLYTICS-ADVERTISING-TOKEN";
        }
        a(dVar, str2, str);
        return dVar;
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            l g2 = f.a.a.a.c.g();
            g2.a("Fabric", "Failed to parse settings JSON from " + b(), e2);
            l g3 = f.a.a.a.c.g();
            g3.e("Fabric", "Settings response " + str);
            return null;
        }
    }

    private void a(d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.c(str, str2);
        }
    }

    private Map<String, String> b(x xVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", xVar.f8599j);
        hashMap.put("display_version", xVar.f8598i);
        hashMap.put("source", Integer.toString(xVar.f8600k));
        String str = xVar.f8601l;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = xVar.f8597h;
        if (!f.a.a.a.n.b.i.b(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(d dVar) {
        int g2 = dVar.g();
        l g3 = f.a.a.a.c.g();
        g3.e("Fabric", "Settings result was: " + g2);
        if (a(g2)) {
            return a(dVar.a());
        }
        l g4 = f.a.a.a.c.g();
        g4.c("Fabric", "Failed to retrieve settings from " + b());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    @Override // f.a.a.a.n.g.y
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a(f.a.a.a.n.g.x r9) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.g.m.a(f.a.a.a.n.g.x):org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }
}
