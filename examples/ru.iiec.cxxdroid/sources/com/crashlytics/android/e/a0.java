package com.crashlytics.android.e;

import android.content.Context;
import f.a.a.a.n.b.i;
import java.io.File;
import java.util.Set;

/* access modifiers changed from: package-private */
public class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final c f2902d = new c();
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2903b;

    /* renamed from: c  reason: collision with root package name */
    private y f2904c;

    public interface b {
        File a();
    }

    /* access modifiers changed from: private */
    public static final class c implements y {
        private c() {
        }

        @Override // com.crashlytics.android.e.y
        public void a() {
        }

        @Override // com.crashlytics.android.e.y
        public void a(long j2, String str) {
        }

        @Override // com.crashlytics.android.e.y
        public d b() {
            return null;
        }

        @Override // com.crashlytics.android.e.y
        public byte[] c() {
            return null;
        }

        @Override // com.crashlytics.android.e.y
        public void d() {
        }
    }

    a0(Context context, b bVar) {
        this(context, bVar, null);
    }

    a0(Context context, b bVar, String str) {
        this.a = context;
        this.f2903b = bVar;
        this.f2904c = f2902d;
        a(str);
    }

    private String a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    private File b(String str) {
        return new File(this.f2903b.a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f2904c.d();
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, String str) {
        this.f2904c.a(j2, str);
    }

    /* access modifiers changed from: package-private */
    public void a(File file, int i2) {
        this.f2904c = new m0(file, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f2904c.a();
        this.f2904c = f2902d;
        if (str != null) {
            if (!i.a(this.a, "com.crashlytics.CollectCustomLogs", true)) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                a(b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Set<String> set) {
        File[] listFiles = this.f2903b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public d b() {
        return this.f2904c.b();
    }

    /* access modifiers changed from: package-private */
    public byte[] c() {
        return this.f2904c.c();
    }
}
