package com.crashlytics.android.e;

import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.b.a;
import f.a.a.a.n.b.s;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.io.File;
import java.util.Map;

class v extends a implements t {
    public v(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }

    private d a(d dVar, o0 o0Var) {
        dVar.e("report[identifier]", o0Var.b());
        if (o0Var.d().length == 1) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Adding single file " + o0Var.e() + " to report " + o0Var.b());
            dVar.a("report[file]", o0Var.e(), "application/octet-stream", o0Var.f());
            return dVar;
        }
        File[] d2 = o0Var.d();
        int i2 = 0;
        for (File file : d2) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Adding file " + file.getName() + " to report " + o0Var.b());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i2);
            sb.append("]");
            dVar.a(sb.toString(), file.getName(), "application/octet-stream", file);
            i2++;
        }
        return dVar;
    }

    private d a(d dVar, s sVar) {
        dVar.c("X-CRASHLYTICS-API-KEY", sVar.a);
        dVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        for (Map.Entry<String, String> entry : sVar.f3033b.c().entrySet()) {
            dVar.a(entry);
        }
        return dVar;
    }

    @Override // com.crashlytics.android.e.t
    public boolean a(s sVar) {
        d a = a();
        a(a, sVar);
        a(a, sVar.f3033b);
        l g2 = f.a.a.a.c.g();
        g2.e("CrashlyticsCore", "Sending report to: " + b());
        int g3 = a.g();
        l g4 = f.a.a.a.c.g();
        g4.e("CrashlyticsCore", "Create report request ID: " + a.c("X-REQUEST-ID"));
        l g5 = f.a.a.a.c.g();
        g5.e("CrashlyticsCore", "Result was: " + g3);
        return s.a(g3) == 0;
    }
}
