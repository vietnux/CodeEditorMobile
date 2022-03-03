package com.crashlytics.android.e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.e.a0;
import com.crashlytics.android.e.i;
import com.crashlytics.android.e.p0;
import com.crashlytics.android.e.r;
import com.google.android.gms.measurement.AppMeasurement;
import f.a.a.a.n.b.j;
import f.a.a.a.n.b.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class k {
    static final FilenameFilter r = new i("BeginSession");
    static final FilenameFilter s = new p();
    static final FileFilter t = new q();
    static final Comparator<File> u = new r();
    static final Comparator<File> v = new s();
    private static final Pattern w = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> x = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] y = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    private final l a;

    /* renamed from: b  reason: collision with root package name */
    private final j f2929b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.a.a.n.e.e f2930c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a.a.a.n.b.p f2931d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f2932e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.a.a.n.f.a f2933f;

    /* renamed from: g  reason: collision with root package name */
    private final a f2934g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f2935h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f2936i;

    /* renamed from: j  reason: collision with root package name */
    private final p0.c f2937j = new e0(this, null);

    /* renamed from: k  reason: collision with root package name */
    private final p0.b f2938k = new f0(this, null);

    /* renamed from: l  reason: collision with root package name */
    private final w f2939l;

    /* renamed from: m  reason: collision with root package name */
    private final t0 f2940m;
    private final String n;
    private final b o;
    private final com.crashlytics.android.c.n p;
    private r q;

    /* access modifiers changed from: package-private */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            k.this.m();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public interface a0 {
        void a(FileOutputStream fileOutputStream);
    }

    /* access modifiers changed from: package-private */
    public class b implements Callable<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a.a.a.n.g.q f2942b;

        b(f.a.a.a.n.g.q qVar) {
            this.f2942b = qVar;
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() {
            if (k.this.f()) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
                return Boolean.FALSE;
            }
            f.a.a.a.c.g().e("CrashlyticsCore", "Finalizing previously open sessions.");
            k.this.a((k) this.f2942b, (f.a.a.a.n.g.q) true);
            f.a.a.a.c.g().e("CrashlyticsCore", "Closed all previously open sessions");
            return Boolean.TRUE;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b0 implements FilenameFilter {
        b0() {
        }

        public boolean accept(File file, String str) {
            return f.f2911e.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        c() {
        }

        public void run() {
            k kVar = k.this;
            kVar.a(kVar.a((k) new b0()));
        }
    }

    /* access modifiers changed from: private */
    public static final class c0 implements a0.b {
        private final f.a.a.a.n.f.a a;

        public c0(f.a.a.a.n.f.a aVar) {
            this.a = aVar;
        }

        @Override // com.crashlytics.android.e.a0.b
        public File a() {
            File file = new File(this.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements FilenameFilter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f2945b;

        d(k kVar, Set set) {
            this.f2945b = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.f2945b.contains(str.substring(0, 35));
        }
    }

    /* access modifiers changed from: private */
    public static final class d0 implements p0.d {
        private final f.a.a.a.i a;

        /* renamed from: b  reason: collision with root package name */
        private final j0 f2946b;

        /* renamed from: c  reason: collision with root package name */
        private final f.a.a.a.n.g.p f2947c;

        class a implements i.d {
            a() {
            }

            @Override // com.crashlytics.android.e.i.d
            public void a(boolean z) {
                d0.this.f2946b.a(z);
            }
        }

        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f2948b;

            b(d0 d0Var, i iVar) {
                this.f2948b = iVar;
            }

            public void run() {
                this.f2948b.c();
            }
        }

        public d0(f.a.a.a.i iVar, j0 j0Var, f.a.a.a.n.g.p pVar) {
            this.a = iVar;
            this.f2946b = j0Var;
            this.f2947c = pVar;
        }

        @Override // com.crashlytics.android.e.p0.d
        public boolean a() {
            Activity b2 = this.a.l().b();
            if (b2 == null || b2.isFinishing()) {
                return true;
            }
            i a2 = i.a(b2, this.f2947c, new a());
            b2.runOnUiThread(new b(this, a2));
            f.a.a.a.c.g().e("CrashlyticsCore", "Waiting for user opt-in.");
            a2.a();
            return a2.b();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Callable<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f2949b;

        e(o oVar) {
            this.f2949b = oVar;
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() {
            File first;
            TreeSet<File> treeSet = this.f2949b.a;
            String p = k.this.p();
            if (!(p == null || treeSet.isEmpty() || (first = treeSet.first()) == null)) {
                k kVar = k.this;
                kVar.a((k) kVar.a.j(), (Context) first, (File) p);
            }
            k.this.a((k) treeSet);
            return Boolean.TRUE;
        }
    }

    private final class e0 implements p0.c {
        private e0() {
        }

        /* synthetic */ e0(k kVar, i iVar) {
            this();
        }

        @Override // com.crashlytics.android.e.p0.c
        public File[] a() {
            return k.this.h();
        }

        @Override // com.crashlytics.android.e.p0.c
        public File[] b() {
            return k.this.d().listFiles();
        }

        @Override // com.crashlytics.android.e.p0.c
        public File[] c() {
            return k.this.g();
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements x {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f2952c;

        f(k kVar, String str, String str2, long j2) {
            this.a = str;
            this.f2951b = str2;
            this.f2952c = j2;
        }

        @Override // com.crashlytics.android.e.k.x
        public void a(g gVar) {
            q0.a(gVar, this.a, this.f2951b, this.f2952c);
        }
    }

    private final class f0 implements p0.b {
        private f0() {
        }

        /* synthetic */ f0(k kVar, i iVar) {
            this();
        }

        @Override // com.crashlytics.android.e.p0.b
        public boolean a() {
            return k.this.f();
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements a0 {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f2954c;

        class a extends HashMap<String, Object> {
            a() {
                put("session_id", g.this.a);
                put("generator", g.this.f2953b);
                put("started_at_seconds", Long.valueOf(g.this.f2954c));
            }
        }

        g(k kVar, String str, String str2, long j2) {
            this.a = str;
            this.f2953b = str2;
            this.f2954c = j2;
        }

        @Override // com.crashlytics.android.e.k.a0
        public void a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new a()).toString().getBytes());
        }
    }

    /* access modifiers changed from: private */
    public static final class g0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Context f2956b;

        /* renamed from: c  reason: collision with root package name */
        private final o0 f2957c;

        /* renamed from: d  reason: collision with root package name */
        private final p0 f2958d;

        public g0(Context context, o0 o0Var, p0 p0Var) {
            this.f2956b = context;
            this.f2957c = o0Var;
            this.f2958d = p0Var;
        }

        public void run() {
            if (f.a.a.a.n.b.i.b(this.f2956b)) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.f2958d.a(this.f2957c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements x {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2959b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2960c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f2961d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2962e;

        h(String str, String str2, String str3, String str4, int i2) {
            this.a = str;
            this.f2959b = str2;
            this.f2960c = str3;
            this.f2961d = str4;
            this.f2962e = i2;
        }

        @Override // com.crashlytics.android.e.k.x
        public void a(g gVar) {
            q0.a(gVar, this.a, k.this.f2934g.a, this.f2959b, this.f2960c, this.f2961d, this.f2962e, k.this.n);
        }
    }

    /* access modifiers changed from: package-private */
    public static class h0 implements FilenameFilter {

        /* renamed from: b  reason: collision with root package name */
        private final String f2964b;

        public h0(String str) {
            this.f2964b = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2964b);
            sb.append(".cls");
            return !str.equals(sb.toString()) && str.contains(this.f2964b) && !str.endsWith(".cls_temp");
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends z {
        i(String str) {
            super(str);
        }

        @Override // com.crashlytics.android.e.k.z
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements a0 {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2966c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f2967d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2968e;

        class a extends HashMap<String, Object> {
            a() {
                put("app_identifier", j.this.a);
                put("api_key", k.this.f2934g.a);
                put("version_code", j.this.f2965b);
                put("version_name", j.this.f2966c);
                put("install_uuid", j.this.f2967d);
                put("delivery_mechanism", Integer.valueOf(j.this.f2968e));
                put("unity_version", TextUtils.isEmpty(k.this.n) ? "" : k.this.n);
            }
        }

        j(String str, String str2, String str3, String str4, int i2) {
            this.a = str;
            this.f2965b = str2;
            this.f2966c = str3;
            this.f2967d = str4;
            this.f2968e = i2;
        }

        @Override // com.crashlytics.android.e.k.a0
        public void a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new a()).toString().getBytes());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.crashlytics.android.e.k$k  reason: collision with other inner class name */
    public class C0070k implements x {
        final /* synthetic */ boolean a;

        C0070k(k kVar, boolean z) {
            this.a = z;
        }

        @Override // com.crashlytics.android.e.k.x
        public void a(g gVar) {
            q0.a(gVar, Build.VERSION.RELEASE, Build.VERSION.CODENAME, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class l implements a0 {
        final /* synthetic */ boolean a;

        class a extends HashMap<String, Object> {
            a() {
                put("version", Build.VERSION.RELEASE);
                put("build_version", Build.VERSION.CODENAME);
                put("is_rooted", Boolean.valueOf(l.this.a));
            }
        }

        l(k kVar, boolean z) {
            this.a = z;
        }

        @Override // com.crashlytics.android.e.k.a0
        public void a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new a()).toString().getBytes());
        }
    }

    /* access modifiers changed from: package-private */
    public class m implements x {
        final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2972b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f2973c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f2974d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2975e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f2976f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f2977g;

        m(k kVar, int i2, int i3, long j2, long j3, boolean z, Map map, int i4) {
            this.a = i2;
            this.f2972b = i3;
            this.f2973c = j2;
            this.f2974d = j3;
            this.f2975e = z;
            this.f2976f = map;
            this.f2977g = i4;
        }

        @Override // com.crashlytics.android.e.k.x
        public void a(g gVar) {
            q0.a(gVar, this.a, Build.MODEL, this.f2972b, this.f2973c, this.f2974d, this.f2975e, this.f2976f, this.f2977g, Build.MANUFACTURER, Build.PRODUCT);
        }
    }

    /* access modifiers changed from: package-private */
    public class n implements a0 {
        final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f2979c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f2980d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2981e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f2982f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f2983g;

        class a extends HashMap<String, Object> {
            a() {
                put("arch", Integer.valueOf(n.this.a));
                put("build_model", Build.MODEL);
                put("available_processors", Integer.valueOf(n.this.f2978b));
                put("total_ram", Long.valueOf(n.this.f2979c));
                put("disk_space", Long.valueOf(n.this.f2980d));
                put("is_emulator", Boolean.valueOf(n.this.f2981e));
                put("ids", n.this.f2982f);
                put("state", Integer.valueOf(n.this.f2983g));
                put("build_manufacturer", Build.MANUFACTURER);
                put("build_product", Build.PRODUCT);
            }
        }

        n(k kVar, int i2, int i3, long j2, long j3, boolean z, Map map, int i4) {
            this.a = i2;
            this.f2978b = i3;
            this.f2979c = j2;
            this.f2980d = j3;
            this.f2981e = z;
            this.f2982f = map;
            this.f2983g = i4;
        }

        @Override // com.crashlytics.android.e.k.a0
        public void a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new a()).toString().getBytes());
        }
    }

    /* access modifiers changed from: package-private */
    public class o implements x {
        final /* synthetic */ w0 a;

        o(k kVar, w0 w0Var) {
            this.a = w0Var;
        }

        @Override // com.crashlytics.android.e.k.x
        public void a(g gVar) {
            w0 w0Var = this.a;
            q0.a(gVar, w0Var.a, w0Var.f3045b, w0Var.f3046c);
        }
    }

    static class p implements FilenameFilter {
        p() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    static class q implements FileFilter {
        q() {
        }

        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    }

    static class r implements Comparator<File> {
        r() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    static class s implements Comparator<File> {
        s() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* access modifiers changed from: package-private */
    public class t implements r.a {
        t() {
        }

        @Override // com.crashlytics.android.e.r.a
        public void a(r.b bVar, Thread thread, Throwable th, boolean z) {
            k.this.a(bVar, thread, th, z);
        }
    }

    /* access modifiers changed from: package-private */
    public class u implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Date f2985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f2986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Throwable f2987d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r.b f2988e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f2989f;

        u(Date date, Thread thread, Throwable th, r.b bVar, boolean z) {
            this.f2985b = date;
            this.f2986c = thread;
            this.f2987d = th;
            this.f2988e = bVar;
            this.f2989f = z;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            f.a.a.a.n.g.n nVar;
            f.a.a.a.n.g.q qVar;
            k.this.a.t();
            k.this.a((k) this.f2985b, (Date) this.f2986c, (Thread) this.f2987d);
            f.a.a.a.n.g.u a = this.f2988e.a();
            if (a != null) {
                qVar = a.f8585b;
                nVar = a.f8587d;
            } else {
                qVar = null;
                nVar = null;
            }
            if ((nVar == null || nVar.f8567d) || this.f2989f) {
                k.this.a((k) this.f2985b.getTime());
            }
            k.this.a(qVar);
            k.this.m();
            if (qVar != null) {
                k.this.a(qVar.f8577b);
            }
            if (!k.this.c((k) a)) {
                k.this.b((k) a);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public class v implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f2991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2992c;

        v(long j2, String str) {
            this.f2991b = j2;
            this.f2992c = str;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            if (k.this.f()) {
                return null;
            }
            k.this.f2936i.a(this.f2991b, this.f2992c);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static class w implements FilenameFilter {
        private w() {
        }

        /* synthetic */ w(i iVar) {
            this();
        }

        public boolean accept(File file, String str) {
            return !k.s.accept(file, str) && k.w.matcher(str).matches();
        }
    }

    /* access modifiers changed from: private */
    public interface x {
        void a(g gVar);
    }

    /* access modifiers changed from: private */
    public static final class y implements r.b {
        private y() {
        }

        /* synthetic */ y(i iVar) {
            this();
        }

        @Override // com.crashlytics.android.e.r.b
        public f.a.a.a.n.g.u a() {
            return f.a.a.a.n.g.r.d().a();
        }
    }

    /* access modifiers changed from: package-private */
    public static class z implements FilenameFilter {

        /* renamed from: b  reason: collision with root package name */
        private final String f2994b;

        public z(String str) {
            this.f2994b = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f2994b) && !str.endsWith(".cls_temp");
        }
    }

    k(l lVar, j jVar, f.a.a.a.n.e.e eVar, f.a.a.a.n.b.p pVar, j0 j0Var, f.a.a.a.n.f.a aVar, a aVar2, v0 v0Var, b bVar, com.crashlytics.android.c.n nVar) {
        new AtomicInteger(0);
        this.a = lVar;
        this.f2929b = jVar;
        this.f2930c = eVar;
        this.f2931d = pVar;
        this.f2932e = j0Var;
        this.f2933f = aVar;
        this.f2934g = aVar2;
        this.n = v0Var.a();
        this.o = bVar;
        this.p = nVar;
        Context j2 = lVar.j();
        this.f2935h = new c0(aVar);
        this.f2936i = new a0(j2, this.f2935h);
        this.f2939l = new w(j2);
        this.f2940m = new d0(1024, new n0(10));
    }

    private t a(String str, String str2) {
        String b2 = f.a.a.a.n.b.i.b(this.a.j(), "com.crashlytics.ApiEndpoint");
        return new h(new v(this.a, b2, str, this.f2930c), new f0(this.a, b2, str2, this.f2930c));
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(long j2) {
        if (n()) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        } else if (this.p != null) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j2);
            this.p.a("clx", "_ae", bundle);
        } else {
            f.a.a.a.c.g().e("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(Context context, File file, String str) {
        byte[] b2 = g0.b(file);
        byte[] a2 = g0.a(file);
        byte[] a3 = g0.a(file, context);
        if (b2 == null || b2.length == 0) {
            f.a.a.a.l g2 = f.a.a.a.c.g();
            g2.a("CrashlyticsCore", "No minidump data found in directory " + file);
            return;
        }
        c(str, "<native-crash: minidump>");
        byte[] b3 = b(str, "BeginSession.json");
        byte[] b4 = b(str, "SessionApp.json");
        byte[] b5 = b(str, "SessionDevice.json");
        byte[] b6 = b(str, "SessionOS.json");
        byte[] d2 = g0.d(new c0(c()).b(str));
        a0 a0Var = new a0(this.a.j(), this.f2935h, str);
        byte[] c2 = a0Var.c();
        a0Var.a();
        byte[] d3 = g0.d(new c0(c()).a(str));
        File file2 = new File(this.f2933f.a(), str);
        if (!file2.mkdir()) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Couldn't create native sessions directory");
            return;
        }
        b(b2, new File(file2, "minidump"));
        b(a2, new File(file2, "metadata"));
        b(a3, new File(file2, "binaryImages"));
        b(b3, new File(file2, "session"));
        b(b4, new File(file2, "app"));
        b(b5, new File(file2, "device"));
        b(b6, new File(file2, "os"));
        b(d2, new File(file2, "user"));
        b(c2, new File(file2, "logs"));
        b(d3, new File(file2, "keys"));
    }

    private void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.l();
            } catch (IOException e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    private static void a(g gVar, File file) {
        Throwable th;
        FileInputStream fileInputStream;
        if (!file.exists()) {
            f.a.a.a.c.g().c("CrashlyticsCore", "Tried to include a file that doesn't exist: " + file.getName(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a(fileInputStream, gVar, (int) file.length());
                f.a.a.a.n.b.i.a((Closeable) fileInputStream, "Failed to close file input stream.");
            } catch (Throwable th2) {
                th = th2;
                f.a.a.a.n.b.i.a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            f.a.a.a.n.b.i.a((Closeable) fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    private void a(g gVar, String str) {
        String[] strArr = y;
        for (String str2 : strArr) {
            File[] a2 = a(new z(str + str2 + ".cls"));
            if (a2.length == 0) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Can't find " + str2 + " data for session ID " + str, null);
            } else {
                f.a.a.a.c.g().e("CrashlyticsCore", "Collecting " + str2 + " data for session ID " + str);
                a(gVar, a2[0]);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.crashlytics.android.e.g r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.e.k.a(com.crashlytics.android.e.g, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    private static void a(g gVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, f.a.a.a.n.b.i.f8384d);
        for (File file : fileArr) {
            try {
                f.a.a.a.c.g().e("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                a(gVar, file);
            } catch (Exception e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Error writting non-fatal to session.", e2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(f.a.a.a.n.g.q qVar, boolean z2) {
        b((z2 ? 1 : 0) + 8);
        File[] q2 = q();
        if (q2.length <= z2) {
            f.a.a.a.c.g().e("CrashlyticsCore", "No open sessions to be closed.");
            return;
        }
        g(a(q2[z2 ? 1 : 0]));
        if (qVar == null) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
        } else {
            a(q2, (int) z2, qVar.a);
        }
    }

    private void a(File file, String str, int i2) {
        f.a.a.a.l g2 = f.a.a.a.c.g();
        g2.e("CrashlyticsCore", "Collecting session parts for ID " + str);
        File[] a2 = a(new z(str + "SessionCrash"));
        boolean z2 = a2 != null && a2.length > 0;
        f.a.a.a.c.g().e("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", str, Boolean.valueOf(z2)));
        File[] a3 = a(new z(str + "SessionEvent"));
        boolean z3 = a3 != null && a3.length > 0;
        f.a.a.a.c.g().e("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", str, Boolean.valueOf(z3)));
        if (z2 || z3) {
            a(file, str, a(str, a3, i2), z2 ? a2[0] : null);
        } else {
            f.a.a.a.l g3 = f.a.a.a.c.g();
            g3.e("CrashlyticsCore", "No events present for session ID " + str);
        }
        f.a.a.a.l g4 = f.a.a.a.c.g();
        g4.e("CrashlyticsCore", "Removing session part files for ID " + str);
        a(str);
    }

    private void a(File file, String str, File[] fileArr, File file2) {
        f fVar;
        Throwable th;
        Exception e2;
        boolean z2 = file2 != null;
        File b2 = z2 ? b() : e();
        if (!b2.exists()) {
            b2.mkdirs();
        }
        try {
            fVar = new f(b2, str);
            try {
                g a2 = g.a(fVar);
                f.a.a.a.c.g().e("CrashlyticsCore", "Collecting SessionStart data for session ID " + str);
                a(a2, file);
                a2.a(4, new Date().getTime() / 1000);
                a2.a(5, z2);
                a2.d(11, 1);
                a2.a(12, 3);
                a(a2, str);
                a(a2, fileArr, str);
                if (z2) {
                    a(a2, file2);
                }
                f.a.a.a.n.b.i.a(a2, "Error flushing session file stream");
                f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close CLS file");
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.a.a.a.c.g().c("CrashlyticsCore", "Failed to write session file for session ID: " + str, e2);
                    f.a.a.a.n.b.i.a((Flushable) null, "Error flushing session file stream");
                    a(fVar);
                } catch (Throwable th2) {
                    th = th2;
                    f.a.a.a.n.b.i.a((Flushable) null, "Error flushing session file stream");
                    f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close CLS file");
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            fVar = null;
            f.a.a.a.c.g().c("CrashlyticsCore", "Failed to write session file for session ID: " + str, e2);
            f.a.a.a.n.b.i.a((Flushable) null, "Error flushing session file stream");
            a(fVar);
        } catch (Throwable th3) {
            th = th3;
            fVar = null;
            f.a.a.a.n.b.i.a((Flushable) null, "Error flushing session file stream");
            f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close CLS file");
            throw th;
        }
    }

    private static void a(InputStream inputStream, g gVar, int i2) {
        int read;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < bArr.length && (read = inputStream.read(bArr, i3, bArr.length - i3)) >= 0) {
            i3 += read;
        }
        gVar.a(bArr);
    }

    private void a(String str) {
        for (File file : c(str)) {
            file.delete();
        }
    }

    private void a(String str, int i2) {
        File c2 = c();
        x0.a(c2, new z(str + "SessionEvent"), i2, v);
    }

    private void a(String str, String str2, a0 a0Var) {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            File c2 = c();
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(c2, str + str2));
            try {
                a0Var.a(fileOutputStream2);
                f.a.a.a.n.b.i.a((Closeable) fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                f.a.a.a.n.b.i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f.a.a.a.n.b.i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
            throw th;
        }
    }

    private void a(String str, String str2, x xVar) {
        Throwable th;
        f fVar;
        g gVar = null;
        try {
            fVar = new f(c(), str + str2);
            try {
                gVar = g.a(fVar);
                xVar.a(gVar);
                f.a.a.a.n.b.i.a(gVar, "Failed to flush to session " + str2 + " file.");
                f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close session " + str2 + " file.");
            } catch (Throwable th2) {
                th = th2;
                f.a.a.a.n.b.i.a(gVar, "Failed to flush to session " + str2 + " file.");
                f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fVar = null;
            f.a.a.a.n.b.i.a(gVar, "Failed to flush to session " + str2 + " file.");
            f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    private void a(String str, Date date) {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", this.a.p());
        long time = date.getTime() / 1000;
        a(str, "BeginSession", new f(this, str, format, time));
        a(str, "BeginSession.json", new g(this, str, format, time));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(Date date, Thread thread, Throwable th) {
        f fVar;
        Throwable th2;
        Exception e2;
        g gVar = null;
        try {
            String o2 = o();
            if (o2 == null) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
                f.a.a.a.n.b.i.a((Flushable) null, "Failed to flush to session begin file.");
                f.a.a.a.n.b.i.a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            c(o2, th.getClass().getName());
            fVar = new f(c(), o2 + "SessionCrash");
            try {
                gVar = g.a(fVar);
                a(gVar, date, thread, th, AppMeasurement.CRASH_ORIGIN, true);
            } catch (Exception e3) {
                e2 = e3;
            }
            f.a.a.a.n.b.i.a(gVar, "Failed to flush to session begin file.");
            f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e4) {
            e2 = e4;
            fVar = null;
            try {
                f.a.a.a.c.g().c("CrashlyticsCore", "An error occurred in the fatal exception logger", e2);
                f.a.a.a.n.b.i.a(gVar, "Failed to flush to session begin file.");
                f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th3) {
                th2 = th3;
                f.a.a.a.n.b.i.a(gVar, "Failed to flush to session begin file.");
                f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close fatal exception file output stream.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            fVar = null;
            f.a.a.a.n.b.i.a(gVar, "Failed to flush to session begin file.");
            f.a.a.a.n.b.i.a((Closeable) fVar, "Failed to close fatal exception file output stream.");
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(Set<File> set) {
        for (File file : set) {
            c(file);
        }
    }

    private void a(byte[] bArr, File file) {
        Throwable th;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                f.a.a.a.n.b.i.a(gZIPOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                f.a.a.a.n.b.i.a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f.a.a.a.n.b.i.a(gZIPOutputStream);
            throw th;
        }
    }

    private void a(File[] fileArr, int i2, int i3) {
        f.a.a.a.c.g().e("CrashlyticsCore", "Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String a2 = a(file);
            f.a.a.a.l g2 = f.a.a.a.c.g();
            g2.e("CrashlyticsCore", "Closing session: " + a2);
            a(file, a2, i3);
            i2++;
        }
    }

    private void a(File[] fileArr, Set<String> set) {
        f.a.a.a.l g2;
        StringBuilder sb;
        String str;
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = w.matcher(name);
            if (!matcher.matches()) {
                g2 = f.a.a.a.c.g();
                sb = new StringBuilder();
                str = "Deleting unknown file: ";
            } else if (!set.contains(matcher.group(1))) {
                g2 = f.a.a.a.c.g();
                sb = new StringBuilder();
                str = "Trimming session file: ";
            }
            sb.append(str);
            sb.append(name);
            g2.e("CrashlyticsCore", sb.toString());
            file.delete();
        }
    }

    private File[] a(File file, FilenameFilter filenameFilter) {
        return b(file.listFiles(filenameFilter));
    }

    private File[] a(FileFilter fileFilter) {
        return b(c().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private File[] a(FilenameFilter filenameFilter) {
        return a(c(), filenameFilter);
    }

    private File[] a(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        f.a.a.a.c.g().e("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", Integer.valueOf(i2)));
        a(str, i2);
        return a(new z(str + "SessionEvent"));
    }

    private w0 b(String str) {
        return f() ? new w0(this.a.y(), this.a.z(), this.a.x()) : new c0(c()).c(str);
    }

    private void b(int i2) {
        HashSet hashSet = new HashSet();
        File[] q2 = q();
        int min = Math.min(i2, q2.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(a(q2[i3]));
        }
        this.f2936i.a(hashSet);
        a(a(new w(null)), hashSet);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(f.a.a.a.n.g.u uVar) {
        if (uVar == null) {
            f.a.a.a.c.g().a("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context j2 = this.a.j();
        f.a.a.a.n.g.e eVar = uVar.a;
        p0 p0Var = new p0(this.f2934g.a, a(eVar.f8555c, eVar.f8556d), this.f2937j, this.f2938k);
        for (File file : g()) {
            this.f2929b.a(new g0(j2, new r0(file, x), p0Var));
        }
    }

    private void b(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            a(bArr, file);
        }
    }

    private byte[] b(String str, String str2) {
        File c2 = c();
        return g0.d(new File(c2, str + str2));
    }

    private File[] b(File file) {
        return b(file.listFiles());
    }

    private File[] b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void c(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                c(file2);
            }
        }
        file.delete();
    }

    private static void c(String str, String str2) {
        com.crashlytics.android.c.b bVar = (com.crashlytics.android.c.b) f.a.a.a.c.a(com.crashlytics.android.c.b.class);
        if (bVar == null) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.a(new j.a(str, str2));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean c(f.a.a.a.n.g.u uVar) {
        return uVar != null && uVar.f8587d.a && !this.f2932e.a();
    }

    private File[] c(String str) {
        return a(new h0(str));
    }

    private void d(String str) {
        String e2 = this.f2931d.e();
        a aVar = this.f2934g;
        String str2 = aVar.f2900e;
        String str3 = aVar.f2901f;
        String f2 = this.f2931d.f();
        int h2 = f.a.a.a.n.b.l.a(this.f2934g.f2898c).h();
        a(str, "SessionApp", new h(e2, str2, str3, f2, h2));
        a(str, "SessionApp.json", new j(e2, str2, str3, f2, h2));
    }

    private void e(String str) {
        Context j2 = this.a.j();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a2 = f.a.a.a.n.b.i.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = f.a.a.a.n.b.i.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean l2 = f.a.a.a.n.b.i.l(j2);
        Map<p.a, String> g2 = this.f2931d.g();
        int f2 = f.a.a.a.n.b.i.f(j2);
        a(str, "SessionDevice", new m(this, a2, availableProcessors, b2, blockCount, l2, g2, f2));
        a(str, "SessionDevice.json", new n(this, a2, availableProcessors, b2, blockCount, l2, g2, f2));
    }

    private void f(String str) {
        boolean m2 = f.a.a.a.n.b.i.m(this.a.j());
        a(str, "SessionOS", new C0070k(this, m2));
        a(str, "SessionOS.json", new l(this, m2));
    }

    private void g(String str) {
        a(str, "SessionUser", new o(this, b(str)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        Date date = new Date();
        String eVar = new e(this.f2931d).toString();
        f.a.a.a.l g2 = f.a.a.a.c.g();
        g2.e("CrashlyticsCore", "Opening a new session with ID " + eVar);
        a(eVar, date);
        d(eVar);
        f(eVar);
        e(eVar);
        this.f2936i.a(eVar);
    }

    private boolean n() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String o() {
        File[] q2 = q();
        if (q2.length > 0) {
            return a(q2[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String p() {
        File[] q2 = q();
        if (q2.length > 1) {
            return a(q2[1]);
        }
        return null;
    }

    private File[] q() {
        File[] i2 = i();
        Arrays.sort(i2, u);
        return i2;
    }

    private void r() {
        File d2 = d();
        if (d2.exists()) {
            File[] a2 = a(d2, new b0());
            Arrays.sort(a2, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < a2.length && hashSet.size() < 4; i2++) {
                hashSet.add(a(a2[i2]));
            }
            a(b(d2), hashSet);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f2929b.a(new c());
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, f.a.a.a.n.g.u uVar) {
        if (uVar == null) {
            f.a.a.a.c.g().a("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        f.a.a.a.n.g.e eVar = uVar.a;
        new p0(this.f2934g.a, a(eVar.f8555c, eVar.f8556d), this.f2937j, this.f2938k).a(f2, c(uVar) ? new d0(this.a, this.f2932e, uVar.f8586c) : new p0.a());
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int a2 = i2 - x0.a(b(), i2, v);
        x0.a(c(), s, a2 - x0.a(e(), a2, v), v);
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, String str) {
        this.f2929b.a(new v(j2, str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(r.b bVar, Thread thread, Throwable th, boolean z2) {
        f.a.a.a.l g2 = f.a.a.a.c.g();
        g2.e("CrashlyticsCore", "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.f2939l.a();
        this.f2929b.b(new u(new Date(), thread, th, bVar, z2));
    }

    /* access modifiers changed from: package-private */
    public void a(f.a.a.a.n.g.q qVar) {
        a(qVar, false);
    }

    /* access modifiers changed from: package-private */
    public void a(f.a.a.a.n.g.u uVar) {
        if (uVar.f8587d.f8567d && this.o.a()) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Registered Firebase Analytics event listener");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z2) {
        j();
        this.q = new r(new t(), new y(null), z2, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.q);
    }

    /* access modifiers changed from: package-private */
    public void a(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Found invalid session part file: " + file);
            hashSet.add(a(file));
        }
        if (!hashSet.isEmpty()) {
            File d2 = d();
            if (!d2.exists()) {
                d2.mkdir();
            }
            File[] a2 = a(new d(this, hashSet));
            for (File file2 : a2) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Moving session file: " + file2);
                if (!file2.renameTo(new File(d2, file2.getName()))) {
                    f.a.a.a.c.g().e("CrashlyticsCore", "Could not move session file. Deleting " + file2);
                    file2.delete();
                }
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(o oVar) {
        if (oVar == null) {
            return true;
        }
        return ((Boolean) this.f2929b.b(new e(oVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public File b() {
        return new File(c(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public boolean b(f.a.a.a.n.g.q qVar) {
        return ((Boolean) this.f2929b.b(new b(qVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public File c() {
        return this.f2933f.a();
    }

    /* access modifiers changed from: package-private */
    public File d() {
        return new File(c(), "invalidClsFiles");
    }

    /* access modifiers changed from: package-private */
    public File e() {
        return new File(c(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        r rVar = this.q;
        return rVar != null && rVar.a();
    }

    /* access modifiers changed from: package-private */
    public File[] g() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, a(b(), s));
        Collections.addAll(linkedList, a(e(), s));
        Collections.addAll(linkedList, a(c(), s));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public File[] h() {
        return a(t);
    }

    /* access modifiers changed from: package-private */
    public File[] i() {
        return a(r);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f2929b.a(new a());
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f2939l.b();
    }
}
