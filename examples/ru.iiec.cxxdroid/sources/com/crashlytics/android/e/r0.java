package com.crashlytics.android.e;

import com.crashlytics.android.e.o0;
import f.a.a.a.c;
import f.a.a.a.l;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class r0 implements o0 {
    private final File a;

    /* renamed from: b  reason: collision with root package name */
    private final File[] f3031b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f3032c;

    public r0(File file) {
        this(file, Collections.emptyMap());
    }

    public r0(File file, Map<String, String> map) {
        this.a = file;
        this.f3031b = new File[]{file};
        this.f3032c = new HashMap(map);
        if (this.a.length() == 0) {
            this.f3032c.putAll(p0.f3016g);
        }
    }

    @Override // com.crashlytics.android.e.o0
    public o0.a a() {
        return o0.a.JAVA;
    }

    @Override // com.crashlytics.android.e.o0
    public String b() {
        String e2 = e();
        return e2.substring(0, e2.lastIndexOf(46));
    }

    @Override // com.crashlytics.android.e.o0
    public Map<String, String> c() {
        return Collections.unmodifiableMap(this.f3032c);
    }

    @Override // com.crashlytics.android.e.o0
    public File[] d() {
        return this.f3031b;
    }

    @Override // com.crashlytics.android.e.o0
    public String e() {
        return f().getName();
    }

    @Override // com.crashlytics.android.e.o0
    public File f() {
        return this.a;
    }

    @Override // com.crashlytics.android.e.o0
    public void remove() {
        l g2 = c.g();
        g2.e("CrashlyticsCore", "Removing report at " + this.a.getPath());
        this.a.delete();
    }
}
