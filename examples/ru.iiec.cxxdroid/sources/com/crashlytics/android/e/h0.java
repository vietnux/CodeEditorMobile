package com.crashlytics.android.e;

import com.crashlytics.android.e.o0;
import f.a.a.a.c;
import java.io.File;
import java.util.Map;

class h0 implements o0 {
    private final File a;

    public h0(File file) {
        this.a = file;
    }

    @Override // com.crashlytics.android.e.o0
    public o0.a a() {
        return o0.a.NATIVE;
    }

    @Override // com.crashlytics.android.e.o0
    public String b() {
        return this.a.getName();
    }

    @Override // com.crashlytics.android.e.o0
    public Map<String, String> c() {
        return null;
    }

    @Override // com.crashlytics.android.e.o0
    public File[] d() {
        return this.a.listFiles();
    }

    @Override // com.crashlytics.android.e.o0
    public String e() {
        return null;
    }

    @Override // com.crashlytics.android.e.o0
    public File f() {
        return null;
    }

    @Override // com.crashlytics.android.e.o0
    public void remove() {
        File[] d2 = d();
        for (File file : d2) {
            c.g().e("CrashlyticsCore", "Removing native report file at " + file.getPath());
            file.delete();
        }
        c.g().e("CrashlyticsCore", "Removing native report directory at " + this.a);
        this.a.delete();
    }
}
