package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.AppMeasurement;
import e.b.b.a.e.g;
import e.b.b.a.e.j;
import e.b.c.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseInstanceId {

    /* renamed from: g  reason: collision with root package name */
    private static final long f6590g = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: h  reason: collision with root package name */
    private static q f6591h;

    /* renamed from: i  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f6592i;
    private final a a;

    /* renamed from: b  reason: collision with root package name */
    private final g f6593b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f6594c;

    /* renamed from: d  reason: collision with root package name */
    private final j f6595d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6596e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6597f;

    FirebaseInstanceId(a aVar) {
        this(aVar, new g(aVar.a()));
    }

    private FirebaseInstanceId(a aVar, g gVar) {
        this.f6595d = new j();
        this.f6596e = false;
        if (g.a(aVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f6591h == null) {
                    f6591h = new q(aVar.a());
                }
            }
            this.a = aVar;
            this.f6593b = gVar;
            this.f6594c = new e0(aVar, this, gVar);
            this.f6597f = o();
            if (h()) {
                k();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private static <T> T a(g<T> gVar) {
        try {
            return (T) j.a((g) gVar);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw new IOException(cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private final String a(String str, String str2, Bundle bundle) {
        return ((e0) this.f6594c).a(str, str2, bundle);
    }

    static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f6592i == null) {
                f6592i = new ScheduledThreadPoolExecutor(1);
            }
            f6592i.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private static String c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(a aVar) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) aVar.a(FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    public static FirebaseInstanceId i() {
        return getInstance(a.e());
    }

    private final synchronized void j() {
        if (!this.f6596e) {
            a(0);
        }
    }

    private final void k() {
        r d2 = d();
        if (d2 == null || d2.a(this.f6593b.c()) || f6591h.a() != null) {
            j();
        }
    }

    static String l() {
        return g.a(f6591h.b("").a());
    }

    static q m() {
        return f6591h;
    }

    static boolean n() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    private final boolean o() {
        ApplicationInfo applicationInfo;
        Context a2 = this.a.a();
        SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", true);
        }
        try {
            PackageManager packageManager = a2.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return p();
    }

    private final boolean p() {
        try {
            Class.forName("com.google.firebase.messaging.a");
            return true;
        } catch (ClassNotFoundException unused) {
            Context a2 = this.a.a();
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(a2.getPackageName());
            ResolveInfo resolveService = a2.getPackageManager().resolveService(intent, 0);
            return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
        }
    }

    public String a() {
        k();
        return l();
    }

    public String a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String c2 = c(str2);
            r a2 = f6591h.a("", str, c2);
            return (a2 == null || a2.a(this.f6593b.c())) ? this.f6595d.a(str, c2, new d0(this, str, c2)) : a2.a;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j2) {
        a(new s(this, this.f6593b, Math.min(Math.max(30L, j2 << 1), f6590g)), j2);
        this.f6596e = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        r d2 = d();
        if (d2 == null || d2.a(this.f6593b.c())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String str2 = d2.a;
        String valueOf2 = String.valueOf(str);
        a(str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        this.f6596e = z;
    }

    public String b() {
        r d2 = d();
        if (d2 == null || d2.a(this.f6593b.c())) {
            j();
        }
        if (d2 != null) {
            return d2.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String b(String str, String str2) {
        String str3 = (String) a(this.f6594c.b(str, str2));
        f6591h.a("", str, str2, str3, this.f6593b.c());
        return str3;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        r d2 = d();
        if (d2 == null || d2.a(this.f6593b.c())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String str2 = d2.a;
        String valueOf2 = String.valueOf(str);
        a(str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle);
    }

    public final synchronized void b(boolean z) {
        SharedPreferences.Editor edit = this.a.a().getSharedPreferences("com.google.firebase.messaging", 0).edit();
        edit.putBoolean("auto_init", z);
        edit.apply();
        if (!this.f6597f && z) {
            k();
        }
        this.f6597f = z;
    }

    /* access modifiers changed from: package-private */
    public final a c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final r d() {
        return f6591h.a("", g.a(this.a), "*");
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return a(g.a(this.a), "*");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void f() {
        f6591h.b();
        if (h()) {
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        f6591h.c("");
        j();
    }

    public final synchronized boolean h() {
        return this.f6597f;
    }
}
