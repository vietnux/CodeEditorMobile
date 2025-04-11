package com.crashlytics.android.e;

import com.crashlytics.android.e.o0;
import f.a.a.a.c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class z implements o0 {
    private final File[] a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f3048b = new HashMap(p0.f3016g);

    /* renamed from: c  reason: collision with root package name */
    private final String f3049c;

    public z(String str, File[] fileArr) {
        this.a = fileArr;
        this.f3049c = str;
    }

    @Override // com.crashlytics.android.e.o0
    public o0.a a() {
        return o0.a.JAVA;
    }

    @Override // com.crashlytics.android.e.o0
    public String b() {
        return this.f3049c;
    }

    @Override // com.crashlytics.android.e.o0
    public Map<String, String> c() {
        return Collections.unmodifiableMap(this.f3048b);
    }

    @Override // com.crashlytics.android.e.o0
    public File[] d() {
        return this.a;
    }

    @Override // com.crashlytics.android.e.o0
    public String e() {
        return this.a[0].getName();
    }

    @Override // com.crashlytics.android.e.o0
    public File f() {
        return this.a[0];
    }

    @Override // com.crashlytics.android.e.o0
    public void remove() {
        File[] fileArr = this.a;
        for (File file : fileArr) {
            c.g().e("CrashlyticsCore", "Removing invalid report file at " + file.getPath());
            file.delete();
        }
    }
}
