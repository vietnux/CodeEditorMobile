package com.crashlytics.android.e;

import f.a.a.a.l;
import f.a.a.a.n.b.h;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class p0 {

    /* renamed from: g  reason: collision with root package name */
    static final Map<String, String> f3016g = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");

    /* renamed from: h  reason: collision with root package name */
    private static final short[] f3017h = {10, 20, 30, 60, 120, 300};
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final t f3018b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3019c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3020d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3021e;

    /* renamed from: f  reason: collision with root package name */
    private Thread f3022f;

    /* access modifiers changed from: package-private */
    public static final class a implements d {
        a() {
        }

        @Override // com.crashlytics.android.e.p0.d
        public boolean a() {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        boolean a();
    }

    /* access modifiers changed from: package-private */
    public interface c {
        File[] a();

        File[] b();

        File[] c();
    }

    /* access modifiers changed from: package-private */
    public interface d {
        boolean a();
    }

    private class e extends h {

        /* renamed from: b  reason: collision with root package name */
        private final float f3023b;

        /* renamed from: c  reason: collision with root package name */
        private final d f3024c;

        e(float f2, d dVar) {
            this.f3023b = f2;
            this.f3024c = dVar;
        }

        private void b() {
            l g2 = f.a.a.a.c.g();
            g2.e("CrashlyticsCore", "Starting report processing in " + this.f3023b + " second(s)...");
            float f2 = this.f3023b;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<o0> a = p0.this.a();
            if (!p0.this.f3021e.a()) {
                if (a.isEmpty() || this.f3024c.a()) {
                    int i2 = 0;
                    while (!a.isEmpty() && !p0.this.f3021e.a()) {
                        l g3 = f.a.a.a.c.g();
                        g3.e("CrashlyticsCore", "Attempting to send " + a.size() + " report(s)");
                        for (o0 o0Var : a) {
                            p0.this.a(o0Var);
                        }
                        a = p0.this.a();
                        if (!a.isEmpty()) {
                            int i3 = i2 + 1;
                            long j2 = (long) p0.f3017h[Math.min(i2, p0.f3017h.length - 1)];
                            l g4 = f.a.a.a.c.g();
                            g4.e("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + j2 + " seconds");
                            Thread.sleep(j2 * 1000);
                            i2 = i3;
                        }
                    }
                    return;
                }
                l g5 = f.a.a.a.c.g();
                g5.e("CrashlyticsCore", "User declined to send. Removing " + a.size() + " Report(s).");
                for (o0 o0Var2 : a) {
                    o0Var2.remove();
                }
            }
        }

        @Override // f.a.a.a.n.b.h
        public void a() {
            try {
                b();
            } catch (Exception e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e2);
            }
            p0.this.f3022f = null;
        }
    }

    public p0(String str, t tVar, c cVar, b bVar) {
        if (tVar != null) {
            this.f3018b = tVar;
            this.f3019c = str;
            this.f3020d = cVar;
            this.f3021e = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* access modifiers changed from: package-private */
    public List<o0> a() {
        File[] c2;
        File[] b2;
        File[] a2;
        f.a.a.a.c.g().e("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.a) {
            c2 = this.f3020d.c();
            b2 = this.f3020d.b();
            a2 = this.f3020d.a();
        }
        LinkedList linkedList = new LinkedList();
        if (c2 != null) {
            for (File file : c2) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Found crash report " + file.getPath());
                linkedList.add(new r0(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (b2 != null) {
            for (File file2 : b2) {
                String a3 = k.a(file2);
                if (!hashMap.containsKey(a3)) {
                    hashMap.put(a3, new LinkedList());
                }
                ((List) hashMap.get(a3)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Found invalid session: " + str);
            List list = (List) hashMap.get(str);
            linkedList.add(new z(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (a2 != null) {
            for (File file3 : a2) {
                linkedList.add(new h0(file3));
            }
        }
        if (linkedList.isEmpty()) {
            f.a.a.a.c.g().e("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }

    public synchronized void a(float f2, d dVar) {
        if (this.f3022f != null) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.f3022f = new Thread(new e(f2, dVar), "Crashlytics Report Uploader");
        this.f3022f.start();
    }

    /* access modifiers changed from: package-private */
    public boolean a(o0 o0Var) {
        boolean z;
        synchronized (this.a) {
            z = false;
            try {
                boolean a2 = this.f3018b.a(new s(this.f3019c, o0Var));
                l g2 = f.a.a.a.c.g();
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(a2 ? "complete: " : "FAILED: ");
                sb.append(o0Var.b());
                g2.b("CrashlyticsCore", sb.toString());
                if (a2) {
                    o0Var.remove();
                    z = true;
                }
            } catch (Exception e2) {
                l g3 = f.a.a.a.c.g();
                g3.c("CrashlyticsCore", "Error occurred sending report " + o0Var, e2);
            }
        }
        return z;
    }
}
