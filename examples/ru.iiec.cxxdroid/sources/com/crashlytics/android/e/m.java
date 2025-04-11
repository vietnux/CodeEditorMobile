package com.crashlytics.android.e;

import f.a.a.a.c;
import f.a.a.a.l;
import f.a.a.a.n.f.a;
import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class m {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3008b;

    public m(String str, a aVar) {
        this.a = str;
        this.f3008b = aVar;
    }

    private File d() {
        return new File(this.f3008b.a(), this.a);
    }

    public boolean a() {
        try {
            return d().createNewFile();
        } catch (IOException e2) {
            l g2 = c.g();
            g2.c("CrashlyticsCore", "Error creating marker: " + this.a, e2);
            return false;
        }
    }

    public boolean b() {
        return d().exists();
    }

    public boolean c() {
        return d().delete();
    }
}
