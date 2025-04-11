package com.crashlytics.android.c;

import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.b.a;
import f.a.a.a.n.b.s;
import f.a.a.a.n.d.f;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.io.File;
import java.util.List;

/* access modifiers changed from: package-private */
public class x extends a implements f {

    /* renamed from: g  reason: collision with root package name */
    private final String f2872g;

    public x(i iVar, String str, String str2, e eVar, String str3) {
        super(iVar, str, str2, eVar, c.POST);
        this.f2872g = str3;
    }

    @Override // f.a.a.a.n.d.f
    public boolean a(List<File> list) {
        d a = a();
        a.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        a.c("X-CRASHLYTICS-API-KEY", this.f2872g);
        int i2 = 0;
        for (File file : list) {
            a.a("session_analytics_file_" + i2, file.getName(), "application/vnd.crashlytics.android.events", file);
            i2++;
        }
        l g2 = f.a.a.a.c.g();
        g2.e("Answers", "Sending " + list.size() + " analytics files to " + b());
        int g3 = a.g();
        l g4 = f.a.a.a.c.g();
        g4.e("Answers", "Response code for analytics file send is " + g3);
        return s.a(g3) == 0;
    }
}
