package f.a.a.a.n.g;

import android.content.res.Resources;
import f.a.a.a.i;
import f.a.a.a.k;
import f.a.a.a.l;
import f.a.a.a.n.b.s;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;

/* access modifiers changed from: package-private */
public abstract class a extends f.a.a.a.n.b.a implements f {
    public a(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    private d a(d dVar, d dVar2) {
        dVar.c("X-CRASHLYTICS-API-KEY", dVar2.a);
        dVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        return dVar;
    }

    private d b(d dVar, d dVar2) {
        dVar.e("app[identifier]", dVar2.f8544b);
        dVar.e("app[name]", dVar2.f8548f);
        dVar.e("app[display_version]", dVar2.f8545c);
        dVar.e("app[build_version]", dVar2.f8546d);
        dVar.a("app[source]", Integer.valueOf(dVar2.f8549g));
        dVar.e("app[minimum_sdk_version]", dVar2.f8550h);
        dVar.e("app[built_sdk_version]", dVar2.f8551i);
        if (!f.a.a.a.n.b.i.b(dVar2.f8547e)) {
            dVar.e("app[instance_identifier]", dVar2.f8547e);
        }
        if (dVar2.f8552j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.f8375e.j().getResources().openRawResource(dVar2.f8552j.f8568b);
                dVar.e("app[icon][hash]", dVar2.f8552j.a);
                dVar.a("app[icon][data]", "icon.png", "application/octet-stream", inputStream);
                dVar.a("app[icon][width]", Integer.valueOf(dVar2.f8552j.f8569c));
                dVar.a("app[icon][height]", Integer.valueOf(dVar2.f8552j.f8570d));
            } catch (Resources.NotFoundException e2) {
                l g2 = f.a.a.a.c.g();
                g2.c("Fabric", "Failed to find app icon with resource ID: " + dVar2.f8552j.f8568b, e2);
            } catch (Throwable th) {
                f.a.a.a.n.b.i.a((Closeable) inputStream, "Failed to close app icon InputStream.");
                throw th;
            }
            f.a.a.a.n.b.i.a((Closeable) inputStream, "Failed to close app icon InputStream.");
        }
        Collection<k> collection = dVar2.f8553k;
        if (collection != null) {
            for (k kVar : collection) {
                dVar.e(b(kVar), kVar.c());
                dVar.e(a(kVar), kVar.a());
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public String a(k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", kVar.b());
    }

    public boolean a(d dVar) {
        d a = a();
        a(a, dVar);
        b(a, dVar);
        l g2 = f.a.a.a.c.g();
        g2.e("Fabric", "Sending app info to " + b());
        if (dVar.f8552j != null) {
            l g3 = f.a.a.a.c.g();
            g3.e("Fabric", "App icon hash is " + dVar.f8552j.a);
            l g4 = f.a.a.a.c.g();
            g4.e("Fabric", "App icon size is " + dVar.f8552j.f8569c + "x" + dVar.f8552j.f8570d);
        }
        int g5 = a.g();
        String str = "POST".equals(a.k()) ? "Create" : "Update";
        l g6 = f.a.a.a.c.g();
        g6.e("Fabric", str + " app request ID: " + a.c("X-REQUEST-ID"));
        l g7 = f.a.a.a.c.g();
        g7.e("Fabric", "Result was " + g5);
        return s.a(g5) == 0;
    }

    /* access modifiers changed from: package-private */
    public String b(k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", kVar.b());
    }
}
