package com.crashlytics.android.e;

import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.b.a;
import f.a.a.a.n.b.s;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.io.File;

class f0 extends a implements t {
    public f0(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }

    private d a(d dVar, o0 o0Var) {
        String name;
        String str;
        dVar.e("report_id", o0Var.b());
        File[] d2 = o0Var.d();
        for (File file : d2) {
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                name = file.getName();
                str = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str = "app_meta_file";
            } else if (file.getName().equals("device")) {
                name = file.getName();
                str = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str = "keys_file";
            }
            dVar.a(str, name, "application/octet-stream", file);
        }
        return dVar;
    }

    private d a(d dVar, String str) {
        dVar.c("User-Agent", "Crashlytics Android SDK/" + this.f8375e.p());
        dVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        dVar.c("X-CRASHLYTICS-API-KEY", str);
        return dVar;
    }

    @Override // com.crashlytics.android.e.t
    public boolean a(s sVar) {
        d a = a();
        a(a, sVar.a);
        a(a, sVar.f3033b);
        l g2 = f.a.a.a.c.g();
        g2.e("CrashlyticsCore", "Sending report to: " + b());
        int g3 = a.g();
        l g4 = f.a.a.a.c.g();
        g4.e("CrashlyticsCore", "Result was: " + g3);
        return s.a(g3) == 0;
    }
}
