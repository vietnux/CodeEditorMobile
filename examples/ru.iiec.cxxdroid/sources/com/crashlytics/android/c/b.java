package com.crashlytics.android.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.n.b.j;
import f.a.a.a.n.b.o;
import f.a.a.a.n.g.r;
import f.a.a.a.n.g.u;
import java.io.File;

public class b extends i<Boolean> {

    /* renamed from: h  reason: collision with root package name */
    y f2810h;

    public void a(j.a aVar) {
        y yVar = this.f2810h;
        if (yVar != null) {
            yVar.a(aVar.b(), aVar.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public Boolean i() {
        try {
            u a = r.d().a();
            if (a == null) {
                c.g().c("Answers", "Failed to retrieve settings");
                return false;
            } else if (a.f8587d.f8566c) {
                c.g().e("Answers", "Analytics collection enabled");
                this.f2810h.a(a.f8588e, t());
                return true;
            } else {
                c.g().e("Answers", "Analytics collection disabled");
                this.f2810h.b();
                return false;
            }
        } catch (Exception e2) {
            c.g().c("Answers", "Error dealing with settings", e2);
            return false;
        }
    }

    @Override // f.a.a.a.i
    public String n() {
        return "com.crashlytics.sdk.android:answers";
    }

    @Override // f.a.a.a.i
    public String p() {
        return "1.4.1.19";
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    @SuppressLint({"NewApi"})
    public boolean s() {
        try {
            Context j2 = j();
            PackageManager packageManager = j2.getPackageManager();
            String packageName = j2.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            this.f2810h = y.a(this, j2, m(), Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName, Build.VERSION.SDK_INT >= 9 ? packageInfo.firstInstallTime : new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified());
            this.f2810h.c();
            new o().b(j2);
            return true;
        } catch (Exception e2) {
            c.g().c("Answers", "Error retrieving app properties", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return f.a.a.a.n.b.i.b(j(), "com.crashlytics.ApiEndpoint");
    }
}
