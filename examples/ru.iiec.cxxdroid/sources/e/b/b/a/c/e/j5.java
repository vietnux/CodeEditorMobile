package e.b.b.a.c.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import c.e.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class j5 implements v {
    y1 a;

    /* renamed from: b  reason: collision with root package name */
    d1 f7358b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f7359c;

    /* renamed from: d  reason: collision with root package name */
    private i1 f7360d;

    /* renamed from: e  reason: collision with root package name */
    private f5 f7361e;

    /* renamed from: f  reason: collision with root package name */
    private u f7362f;

    /* renamed from: g  reason: collision with root package name */
    private d2 f7363g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7364h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7365i;

    /* renamed from: j  reason: collision with root package name */
    private long f7366j;

    /* renamed from: k  reason: collision with root package name */
    private List<Runnable> f7367k;

    /* renamed from: l  reason: collision with root package name */
    private int f7368l;

    /* renamed from: m  reason: collision with root package name */
    private int f7369m;
    private boolean n;
    private boolean o;
    private boolean p;
    private FileLock q;
    private FileChannel r;
    private List<Long> s;
    private List<Long> t;
    long u;

    private final boolean A() {
        e();
        n();
        return this.f7365i;
    }

    private final int a(FileChannel fileChannel) {
        e();
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().y().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    a().B().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            a().y().a("Failed to read from channel", e2);
            return 0;
        }
    }

    private final s a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2) {
        String str3;
        String str4;
        int i2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            a().y().a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            a().y().a("Error retrieving installer package name. appId", z0.a(str));
            str3 = "Unknown";
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        try {
            PackageInfo b2 = c.b(context).b(str, 0);
            if (b2 != null) {
                CharSequence b3 = c.b(context).b(str);
                if (!TextUtils.isEmpty(b3)) {
                    b3.toString();
                }
                String str5 = b2.versionName;
                i2 = b2.versionCode;
                str4 = str5;
            } else {
                i2 = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            return new s(str, str2, str4, (long) i2, str3, 12451L, h().a(context, str), (String) null, z, false, "", 0L, j().j(str) ? j2 : 0, 0, z2, z3, false);
        } catch (PackageManager.NameNotFoundException unused2) {
            a().y().a("Error retrieving newly installed package info. appId, appName", z0.a(str), "Unknown");
            return null;
        }
    }

    private final void a(r rVar) {
        a aVar;
        e();
        if (TextUtils.isEmpty(rVar.b())) {
            a(rVar.e(), 204, null, null, null);
            return;
        }
        String b2 = rVar.b();
        String a2 = rVar.a();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(p0.f7492g.a()).encodedAuthority(p0.f7493h.a());
        String valueOf = String.valueOf(b2);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", a2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "12451");
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            a().F().a("Fetching remote configuration", rVar.e());
            c6 a3 = s().a(rVar.e());
            String b3 = s().b(rVar.e());
            if (a3 == null || TextUtils.isEmpty(b3)) {
                aVar = null;
            } else {
                a aVar2 = new a();
                aVar2.put("If-Modified-Since", b3);
                aVar = aVar2;
            }
            this.n = true;
            d1 m2 = m();
            String e2 = rVar.e();
            l5 l5Var = new l5(this);
            m2.d();
            m2.v();
            y.a(url);
            y.a(l5Var);
            m2.c().b(new h1(m2, e2, url, null, aVar, l5Var));
        } catch (MalformedURLException unused) {
            a().y().a("Failed to parse config URL. Not fetching. appId", z0.a(rVar.e()), uri);
        }
    }

    private final boolean a(int i2, FileChannel fileChannel) {
        e();
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().y().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                a().y().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            a().y().a("Failed to write to channel", e2);
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0ada, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r8 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ac, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e0, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fc, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021b, code lost:
        if (r8 == null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022e, code lost:
        r1 = r0;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0251, code lost:
        if (r8 != null) goto L_0x011d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0ac6  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0ada  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010a A[Catch:{ SQLiteException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022d A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:15:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r38, long r39) {
        /*
        // Method dump skipped, instructions count: 2792
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.a(java.lang.String, long):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r14, e.b.b.a.c.e.n0 r15) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.a(java.lang.String, e.b.b.a.c.e.n0):boolean");
    }

    private final e6[] a(String str, k6[] k6VarArr, f6[] f6VarArr) {
        y.b(str);
        return k().a(str, f6VarArr, k6VarArr);
    }

    private final Boolean b(r rVar) {
        try {
            if (rVar.k() != -2147483648L) {
                if (rVar.k() == ((long) c.b(getContext()).b(rVar.e(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = c.b(getContext()).b(rVar.e(), 0).versionName;
                if (rVar.d() != null && rVar.d().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static void b(i5 i5Var) {
        if (i5Var == null) {
            throw new IllegalStateException("Upload component not created");
        } else if (!i5Var.u()) {
            String valueOf = String.valueOf(i5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final void b(n0 n0Var, s sVar) {
        j0 j0Var;
        boolean z;
        r b2;
        y.a(sVar);
        y.b(sVar.f7562b);
        long nanoTime = System.nanoTime();
        e();
        n();
        String str = sVar.f7562b;
        h();
        if (s5.a(n0Var, sVar)) {
            if (!sVar.f7569i) {
                e(sVar);
            } else if (s().b(str, n0Var.f7448b)) {
                a().B().a("Dropping blacklisted event. appId", z0.a(str), g().a(n0Var.f7448b));
                boolean z2 = s().e(str) || s().f(str);
                if (!z2 && !"_err".equals(n0Var.f7448b)) {
                    h().a(str, 11, "_ev", n0Var.f7448b, 0);
                }
                if (z2 && (b2 = l().b(str)) != null) {
                    if (Math.abs(b().a() - Math.max(b2.q(), b2.p())) > p0.B.a().longValue()) {
                        a().E().a("Fetching config for blacklisted app");
                        a(b2);
                    }
                }
            } else {
                if (a().a(2)) {
                    a().F().a("Logging event", g().a(n0Var));
                }
                l().y();
                try {
                    e(sVar);
                    if (("_iap".equals(n0Var.f7448b) || "ecommerce_purchase".equals(n0Var.f7448b)) && !a(str, n0Var)) {
                        l().B();
                        return;
                    }
                    boolean h2 = s5.h(n0Var.f7448b);
                    boolean equals = "_err".equals(n0Var.f7448b);
                    c0 a2 = l().a(v(), str, true, h2, false, equals, false);
                    long intValue = a2.f7188b - ((long) p0.f7498m.a().intValue());
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            a().y().a("Data loss. Too many events logged. appId, count", z0.a(str), Long.valueOf(a2.f7188b));
                        }
                        l().B();
                        l().z();
                        return;
                    }
                    if (h2) {
                        long intValue2 = a2.a - ((long) p0.o.a().intValue());
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                a().y().a("Data loss. Too many public events logged. appId, count", z0.a(str), Long.valueOf(a2.a));
                            }
                            h().a(str, 16, "_ev", n0Var.f7448b, 0);
                            l().B();
                            l().z();
                            return;
                        }
                    }
                    if (equals) {
                        long max = a2.f7190d - ((long) Math.max(0, Math.min(1000000, j().b(sVar.f7562b, p0.n))));
                        if (max > 0) {
                            if (max == 1) {
                                a().y().a("Too many error events logged. appId, count", z0.a(str), Long.valueOf(a2.f7190d));
                            }
                            l().B();
                            l().z();
                            return;
                        }
                    }
                    Bundle t2 = n0Var.f7449c.t();
                    h().a(t2, "_o", n0Var.f7450d);
                    if (h().e(str)) {
                        h().a(t2, "_dbg", (Object) 1L);
                        h().a(t2, "_r", (Object) 1L);
                    }
                    long c2 = l().c(str);
                    if (c2 > 0) {
                        a().B().a("Data lost. Too many events stored on disk, deleted. appId", z0.a(str), Long.valueOf(c2));
                    }
                    i0 i0Var = r9;
                    i0 i0Var2 = new i0(this.f7363g, n0Var.f7450d, str, n0Var.f7448b, n0Var.f7451e, 0, t2);
                    j0 b3 = l().b(str, i0Var.f7308b);
                    if (b3 != null) {
                        i0 a3 = i0Var.a(this.f7363g, b3.f7341e);
                        j0Var = b3.a(a3.f7310d);
                        i0Var = a3;
                    } else if (l().f(str) < 500 || !h2) {
                        j0Var = new j0(str, i0Var.f7308b, 0, 0, i0Var.f7310d, 0, null, null, null);
                    } else {
                        a().y().a("Too many event names used, ignoring event. appId, name, supported count", z0.a(str), g().a(i0Var.f7308b), 500);
                        h().a(str, 8, (String) null, (String) null, 0);
                        l().z();
                        return;
                    }
                    l().a(j0Var);
                    e();
                    n();
                    y.a(i0Var);
                    y.a(sVar);
                    y.b(i0Var.a);
                    y.a(i0Var.a.equals(sVar.f7562b));
                    i6 i6Var = new i6();
                    i6Var.f7327c = 1;
                    i6Var.f7335k = "android";
                    i6Var.q = sVar.f7562b;
                    i6Var.p = sVar.f7565e;
                    i6Var.r = sVar.f7564d;
                    i6Var.E = sVar.f7571k == -2147483648L ? null : Integer.valueOf((int) sVar.f7571k);
                    i6Var.s = Long.valueOf(sVar.f7566f);
                    i6Var.A = sVar.f7563c;
                    i6Var.x = sVar.f7567g == 0 ? null : Long.valueOf(sVar.f7567g);
                    Pair<String, Boolean> a4 = i().a(sVar.f7562b);
                    if (a4 == null || TextUtils.isEmpty((CharSequence) a4.first)) {
                        if (!f().a(getContext()) && sVar.q) {
                            String string = Settings.Secure.getString(getContext().getContentResolver(), "android_id");
                            if (string == null) {
                                a().B().a("null secure ID. appId", z0.a(i6Var.q));
                                string = "null";
                            } else if (string.isEmpty()) {
                                a().B().a("empty secure ID. appId", z0.a(i6Var.q));
                            }
                            i6Var.H = string;
                        }
                    } else if (sVar.p) {
                        i6Var.u = (String) a4.first;
                        i6Var.v = (Boolean) a4.second;
                    }
                    f().t();
                    i6Var.f7337m = Build.MODEL;
                    f().t();
                    i6Var.f7336l = Build.VERSION.RELEASE;
                    i6Var.o = Integer.valueOf((int) f().y());
                    i6Var.n = f().z();
                    i6Var.t = null;
                    i6Var.f7330f = null;
                    i6Var.f7331g = null;
                    i6Var.f7332h = null;
                    i6Var.J = Long.valueOf(sVar.f7573m);
                    if (this.f7363g.s() && y.z()) {
                        i6Var.K = null;
                    }
                    r b4 = l().b(sVar.f7562b);
                    if (b4 == null) {
                        b4 = new r(this.f7363g, sVar.f7562b);
                        b4.b(this.f7363g.v().A());
                        b4.e(sVar.f7572l);
                        b4.c(sVar.f7563c);
                        b4.d(i().b(sVar.f7562b));
                        b4.g(0);
                        b4.b(0);
                        b4.c(0);
                        b4.a(sVar.f7564d);
                        b4.d(sVar.f7571k);
                        b4.f(sVar.f7565e);
                        b4.e(sVar.f7566f);
                        b4.f(sVar.f7567g);
                        b4.a(sVar.f7569i);
                        b4.a(sVar.f7573m);
                        l().a(b4);
                    }
                    i6Var.w = b4.a();
                    i6Var.D = b4.h();
                    List<r5> a5 = l().a(sVar.f7562b);
                    i6Var.f7329e = new k6[a5.size()];
                    for (int i2 = 0; i2 < a5.size(); i2++) {
                        k6 k6Var = new k6();
                        i6Var.f7329e[i2] = k6Var;
                        k6Var.f7397d = a5.get(i2).f7547c;
                        k6Var.f7396c = Long.valueOf(a5.get(i2).f7548d);
                        h().a(k6Var, a5.get(i2).f7549e);
                    }
                    try {
                        long a6 = l().a(i6Var);
                        b0 l2 = l();
                        if (i0Var.f7312f != null) {
                            Iterator<String> it = i0Var.f7312f.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if ("_r".equals(it.next())) {
                                        break;
                                    }
                                } else {
                                    boolean c3 = s().c(i0Var.a, i0Var.f7308b);
                                    c0 a7 = l().a(v(), i0Var.a, false, false, false, false, false);
                                    if (c3 && a7.f7191e < ((long) j().a(i0Var.a))) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (l2.a(i0Var, a6, z)) {
                            this.f7366j = 0;
                        }
                    } catch (IOException e2) {
                        a().y().a("Data loss. Failed to insert raw event metadata. appId", z0.a(i6Var.q), e2);
                    }
                    l().B();
                    if (a().a(2)) {
                        a().F().a("Event recorded", g().a(i0Var));
                    }
                    l().z();
                    x();
                    a().F().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                } finally {
                    l().z();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.r e(e.b.b.a.c.e.s r9) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.e(e.b.b.a.c.e.s):e.b.b.a.c.e.r");
    }

    private final y1 s() {
        b(this.a);
        return this.a;
    }

    private final i1 t() {
        i1 i1Var = this.f7360d;
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final f5 u() {
        b(this.f7361e);
        return this.f7361e;
    }

    private final long v() {
        long a2 = b().a();
        k1 i2 = i();
        i2.t();
        i2.d();
        long a3 = i2.f7379i.a();
        if (a3 == 0) {
            a3 = 1 + ((long) i2.o().z().nextInt(86400000));
            i2.f7379i.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private final boolean w() {
        e();
        n();
        return l().H() || !TextUtils.isEmpty(l().C());
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x() {
        /*
        // Method dump skipped, instructions count: 575
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.x():void");
    }

    private final void y() {
        e();
        if (this.n || this.o || this.p) {
            a().F().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.n), Boolean.valueOf(this.o), Boolean.valueOf(this.p));
            return;
        }
        a().F().a("Stopping uploading service(s)");
        List<Runnable> list = this.f7367k;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.f7367k.clear();
        }
    }

    private final boolean z() {
        String str;
        b1 b1Var;
        Object e2;
        e();
        try {
            this.r = new RandomAccessFile(new File(getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.q = this.r.tryLock();
            if (this.q != null) {
                a().F().a("Storage concurrent access okay");
                return true;
            }
            a().y().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e3) {
            e2 = e3;
            b1Var = a().y();
            str = "Failed to acquire storage lock";
            b1Var.a(str, e2);
            return false;
        } catch (IOException e4) {
            e2 = e4;
            b1Var = a().y();
            str = "Failed to access storage lock file";
            b1Var.a(str, e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final s a(String str) {
        b1 E;
        String str2;
        Object obj;
        String str3 = str;
        r b2 = l().b(str3);
        if (b2 == null || TextUtils.isEmpty(b2.d())) {
            E = a().E();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean b3 = b(b2);
            if (b3 == null || b3.booleanValue()) {
                return new s(str, b2.b(), b2.d(), b2.k(), b2.l(), b2.m(), b2.n(), (String) null, b2.c(), false, b2.h(), b2.A(), 0L, 0, b2.B(), b2.C(), false);
            }
            E = a().y();
            str2 = "App version does not match; dropping. appId";
            obj = z0.a(str);
        }
        E.a(str2, obj);
        return null;
    }

    @Override // e.b.b.a.c.e.v
    public z0 a() {
        throw null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(int i2, Throwable th, byte[] bArr, String str) {
        e();
        n();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.o = false;
                y();
                throw th2;
            }
        }
        List<Long> list = this.s;
        this.s = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                i().f7375e.a(b().a());
                i().f7376f.a(0);
                x();
                a().F().a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                l().y();
                try {
                    for (Long l2 : list) {
                        try {
                            b0 l3 = l();
                            long longValue = l2.longValue();
                            l3.d();
                            l3.v();
                            try {
                                if (l3.A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e2) {
                                l3.a().y().a("Failed to delete a bundle in a queue table", e2);
                                throw e2;
                            }
                        } catch (SQLiteException e3) {
                            if (this.t == null || !this.t.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    l().B();
                    l().z();
                    this.t = null;
                    if (!m().y() || !w()) {
                        this.u = -1;
                        x();
                    } else {
                        o();
                    }
                    this.f7366j = 0;
                } catch (Throwable th3) {
                    l().z();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                a().y().a("Database error while trying to delete uploaded bundles", e4);
                this.f7366j = b().b();
                a().F().a("Disable upload, time", Long.valueOf(this.f7366j));
            }
        } else {
            a().F().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            i().f7376f.a(b().a());
            if (!(i2 == 503 || i2 == 429)) {
                z = false;
            }
            if (z) {
                i().f7377g.a(b().a());
            }
            if (j().g(str)) {
                l().a(list);
            }
            x();
        }
        this.o = false;
        y();
    }

    /* access modifiers changed from: package-private */
    public final void a(d2 d2Var) {
        this.f7363g = d2Var;
    }

    /* access modifiers changed from: package-private */
    public final void a(i5 i5Var) {
        this.f7368l++;
    }

    /* access modifiers changed from: package-private */
    public final void a(n0 n0Var, s sVar) {
        List<w> list;
        List<w> list2;
        List<w> list3;
        b1 y;
        String str;
        Object a2;
        String c2;
        Object obj;
        y.a(sVar);
        y.b(sVar.f7562b);
        e();
        n();
        String str2 = sVar.f7562b;
        long j2 = n0Var.f7451e;
        h();
        if (s5.a(n0Var, sVar)) {
            if (!sVar.f7569i) {
                e(sVar);
                return;
            }
            l().y();
            try {
                b0 l2 = l();
                y.b(str2);
                l2.d();
                l2.v();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    l2.a().B().a("Invalid time querying timed out conditional properties", z0.a(str2), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = l2.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (w wVar : list) {
                    if (wVar != null) {
                        a().E().a("User property timed out", wVar.f7635b, g().c(wVar.f7637d.f7509c), wVar.f7637d.t());
                        if (wVar.f7641h != null) {
                            b(new n0(wVar.f7641h, j2), sVar);
                        }
                        l().f(str2, wVar.f7637d.f7509c);
                    }
                }
                b0 l3 = l();
                y.b(str2);
                l3.d();
                l3.v();
                if (i2 < 0) {
                    l3.a().B().a("Invalid time querying expired conditional properties", z0.a(str2), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = l3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (w wVar2 : list2) {
                    if (wVar2 != null) {
                        a().E().a("User property expired", wVar2.f7635b, g().c(wVar2.f7637d.f7509c), wVar2.f7637d.t());
                        l().c(str2, wVar2.f7637d.f7509c);
                        if (wVar2.f7645l != null) {
                            arrayList.add(wVar2.f7645l);
                        }
                        l().f(str2, wVar2.f7637d.f7509c);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    b(new n0((n0) obj2, j2), sVar);
                }
                b0 l4 = l();
                String str3 = n0Var.f7448b;
                y.b(str2);
                y.b(str3);
                l4.d();
                l4.v();
                if (i2 < 0) {
                    l4.a().B().a("Invalid time querying triggered conditional properties", z0.a(str2), l4.n().a(str3), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = l4.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (w wVar3 : list3) {
                    if (wVar3 != null) {
                        p5 p5Var = wVar3.f7637d;
                        r5 r5Var = new r5(wVar3.f7635b, wVar3.f7636c, p5Var.f7509c, j2, p5Var.t());
                        if (l().a(r5Var)) {
                            y = a().E();
                            str = "User property triggered";
                            a2 = wVar3.f7635b;
                            c2 = g().c(r5Var.f7547c);
                            obj = r5Var.f7549e;
                        } else {
                            y = a().y();
                            str = "Too many active user properties, ignoring";
                            a2 = z0.a(wVar3.f7635b);
                            c2 = g().c(r5Var.f7547c);
                            obj = r5Var.f7549e;
                        }
                        y.a(str, a2, c2, obj);
                        if (wVar3.f7643j != null) {
                            arrayList2.add(wVar3.f7643j);
                        }
                        wVar3.f7637d = new p5(r5Var);
                        wVar3.f7639f = true;
                        l().a(wVar3);
                    }
                }
                b(n0Var, sVar);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    b(new n0((n0) obj3, j2), sVar);
                }
                l().B();
            } finally {
                l().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(o5 o5Var) {
        e();
        b0 b0Var = new b0(this.f7363g);
        b0Var.x();
        this.f7359c = b0Var;
        j().a(this.a);
        u uVar = new u(this.f7363g);
        uVar.x();
        this.f7362f = uVar;
        f5 f5Var = new f5(this.f7363g);
        f5Var.x();
        this.f7361e = f5Var;
        this.f7360d = new i1(this.f7363g);
        if (this.f7368l != this.f7369m) {
            a().y().a("Not all upload components initialized", Integer.valueOf(this.f7368l), Integer.valueOf(this.f7369m));
        }
        this.f7364h = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(p5 p5Var, s sVar) {
        e();
        n();
        if (!TextUtils.isEmpty(sVar.f7563c)) {
            if (!sVar.f7569i) {
                e(sVar);
                return;
            }
            int c2 = h().c(p5Var.f7509c);
            if (c2 != 0) {
                h();
                String a2 = s5.a(p5Var.f7509c, 24, true);
                String str = p5Var.f7509c;
                h().a(sVar.f7562b, c2, "_ev", a2, str != null ? str.length() : 0);
                return;
            }
            int b2 = h().b(p5Var.f7509c, p5Var.t());
            if (b2 != 0) {
                h();
                String a3 = s5.a(p5Var.f7509c, 24, true);
                Object t2 = p5Var.t();
                h().a(sVar.f7562b, b2, "_ev", a3, (t2 == null || (!(t2 instanceof String) && !(t2 instanceof CharSequence))) ? 0 : String.valueOf(t2).length());
                return;
            }
            Object c3 = h().c(p5Var.f7509c, p5Var.t());
            if (c3 != null) {
                r5 r5Var = new r5(sVar.f7562b, p5Var.f7513g, p5Var.f7509c, p5Var.f7510d, c3);
                a().E().a("Setting user property", g().c(r5Var.f7547c), c3);
                l().y();
                try {
                    e(sVar);
                    boolean a4 = l().a(r5Var);
                    l().B();
                    if (a4) {
                        a().E().a("User property set", g().c(r5Var.f7547c), r5Var.f7549e);
                    } else {
                        a().y().a("Too many unique user properties are set. Ignoring user property", g().c(r5Var.f7547c), r5Var.f7549e);
                        h().a(sVar.f7562b, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    l().z();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(s sVar) {
        if (this.s != null) {
            this.t = new ArrayList();
            this.t.addAll(this.s);
        }
        b0 l2 = l();
        String str = sVar.f7562b;
        y.b(str);
        l2.d();
        l2.v();
        try {
            SQLiteDatabase A = l2.A();
            String[] strArr = {str};
            int delete = A.delete("apps", "app_id=?", strArr) + 0 + A.delete("events", "app_id=?", strArr) + A.delete("user_attributes", "app_id=?", strArr) + A.delete("conditional_properties", "app_id=?", strArr) + A.delete("raw_events", "app_id=?", strArr) + A.delete("raw_events_metadata", "app_id=?", strArr) + A.delete("queue", "app_id=?", strArr) + A.delete("audience_filter_values", "app_id=?", strArr) + A.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                l2.a().F().a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            l2.a().y().a("Error resetting analytics data. appId, error", z0.a(str), e2);
        }
        s a2 = a(getContext(), sVar.f7562b, sVar.f7563c, sVar.f7569i, sVar.p, sVar.q, sVar.n);
        if (!j().i(sVar.f7562b) || sVar.f7569i) {
            c(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(w wVar, s sVar) {
        b1 y;
        String str;
        Object a2;
        String c2;
        Object t2;
        b1 y2;
        String str2;
        Object a3;
        String c3;
        Object obj;
        y.a(wVar);
        y.b(wVar.f7635b);
        y.a((Object) wVar.f7636c);
        y.a(wVar.f7637d);
        y.b(wVar.f7637d.f7509c);
        e();
        n();
        if (!TextUtils.isEmpty(sVar.f7563c)) {
            if (!sVar.f7569i) {
                e(sVar);
                return;
            }
            w wVar2 = new w(wVar);
            boolean z = false;
            wVar2.f7639f = false;
            l().y();
            try {
                w e2 = l().e(wVar2.f7635b, wVar2.f7637d.f7509c);
                if (e2 != null && !e2.f7636c.equals(wVar2.f7636c)) {
                    a().B().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", g().c(wVar2.f7637d.f7509c), wVar2.f7636c, e2.f7636c);
                }
                if (e2 != null && e2.f7639f) {
                    wVar2.f7636c = e2.f7636c;
                    wVar2.f7638e = e2.f7638e;
                    wVar2.f7642i = e2.f7642i;
                    wVar2.f7640g = e2.f7640g;
                    wVar2.f7643j = e2.f7643j;
                    wVar2.f7639f = e2.f7639f;
                    wVar2.f7637d = new p5(wVar2.f7637d.f7509c, e2.f7637d.f7510d, wVar2.f7637d.t(), e2.f7637d.f7513g);
                } else if (TextUtils.isEmpty(wVar2.f7640g)) {
                    wVar2.f7637d = new p5(wVar2.f7637d.f7509c, wVar2.f7638e, wVar2.f7637d.t(), wVar2.f7637d.f7513g);
                    wVar2.f7639f = true;
                    z = true;
                }
                if (wVar2.f7639f) {
                    p5 p5Var = wVar2.f7637d;
                    r5 r5Var = new r5(wVar2.f7635b, wVar2.f7636c, p5Var.f7509c, p5Var.f7510d, p5Var.t());
                    if (l().a(r5Var)) {
                        y2 = a().E();
                        str2 = "User property updated immediately";
                        a3 = wVar2.f7635b;
                        c3 = g().c(r5Var.f7547c);
                        obj = r5Var.f7549e;
                    } else {
                        y2 = a().y();
                        str2 = "(2)Too many active user properties, ignoring";
                        a3 = z0.a(wVar2.f7635b);
                        c3 = g().c(r5Var.f7547c);
                        obj = r5Var.f7549e;
                    }
                    y2.a(str2, a3, c3, obj);
                    if (z && wVar2.f7643j != null) {
                        b(new n0(wVar2.f7643j, wVar2.f7638e), sVar);
                    }
                }
                if (l().a(wVar2)) {
                    y = a().E();
                    str = "Conditional property added";
                    a2 = wVar2.f7635b;
                    c2 = g().c(wVar2.f7637d.f7509c);
                    t2 = wVar2.f7637d.t();
                } else {
                    y = a().y();
                    str = "Too many conditional properties, ignoring";
                    a2 = z0.a(wVar2.f7635b);
                    c2 = g().c(wVar2.f7637d.f7509c);
                    t2 = wVar2.f7637d.t();
                }
                y.a(str, a2, c2, t2);
                l().B();
            } finally {
                l().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        e();
        if (this.f7367k == null) {
            this.f7367k = new ArrayList();
        }
        this.f7367k.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void a(boolean z) {
        x();
    }

    public final byte[] a(n0 n0Var, String str) {
        n();
        e();
        d2.J();
        throw null;
    }

    @Override // e.b.b.a.c.e.v
    public e b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void b(n0 n0Var, String str) {
        r b2 = l().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.d())) {
            a().E().a("No app data available; dropping event", str);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(n0Var.f7448b)) {
                a().B().a("Could not find package. appId", z0.a(str));
            }
        } else if (!b3.booleanValue()) {
            a().y().a("App version does not match; dropping event. appId", z0.a(str));
            return;
        }
        a(n0Var, new s(str, b2.b(), b2.d(), b2.k(), b2.l(), b2.m(), b2.n(), (String) null, b2.c(), false, b2.h(), b2.A(), 0L, 0, b2.B(), b2.C(), false));
    }

    /* access modifiers changed from: package-private */
    public final void b(p5 p5Var, s sVar) {
        e();
        n();
        if (!TextUtils.isEmpty(sVar.f7563c)) {
            if (!sVar.f7569i) {
                e(sVar);
                return;
            }
            a().E().a("Removing user property", g().c(p5Var.f7509c));
            l().y();
            try {
                e(sVar);
                l().c(sVar.f7562b, p5Var.f7509c);
                l().B();
                a().E().a("User property removed", g().c(p5Var.f7509c));
            } finally {
                l().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(s sVar) {
        e();
        n();
        y.b(sVar.f7562b);
        e(sVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(w wVar, s sVar) {
        y.a(wVar);
        y.b(wVar.f7635b);
        y.a(wVar.f7637d);
        y.b(wVar.f7637d.f7509c);
        e();
        n();
        if (!TextUtils.isEmpty(sVar.f7563c)) {
            if (!sVar.f7569i) {
                e(sVar);
                return;
            }
            l().y();
            try {
                e(sVar);
                w e2 = l().e(wVar.f7635b, wVar.f7637d.f7509c);
                if (e2 != null) {
                    a().E().a("Removing conditional user property", wVar.f7635b, g().c(wVar.f7637d.f7509c));
                    l().f(wVar.f7635b, wVar.f7637d.f7509c);
                    if (e2.f7639f) {
                        l().c(wVar.f7635b, wVar.f7637d.f7509c);
                    }
                    if (wVar.f7645l != null) {
                        Bundle bundle = null;
                        if (wVar.f7645l.f7449c != null) {
                            bundle = wVar.f7645l.f7449c.t();
                        }
                        b(h().a(wVar.f7645l.f7448b, bundle, e2.f7636c, wVar.f7645l.f7451e, true, false), sVar);
                    }
                } else {
                    a().B().a("Conditional user property doesn't exist", z0.a(wVar.f7635b), g().c(wVar.f7637d.f7509c));
                }
                l().B();
            } finally {
                l().z();
            }
        }
    }

    @Override // e.b.b.a.c.e.v
    public z1 c() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(e.b.b.a.c.e.s r22) {
        /*
        // Method dump skipped, instructions count: 956
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.j5.c(e.b.b.a.c.e.s):void");
    }

    public final String d(s sVar) {
        try {
            return (String) c().a(new m5(this, sVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            a().y().a("Failed to get app instance id. appId", z0.a(sVar.f7562b), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        e();
        l().E();
        if (i().f7375e.a() == 0) {
            i().f7375e.a(b().a());
        }
        x();
    }

    public void e() {
        throw null;
    }

    public h0 f() {
        throw null;
    }

    public x0 g() {
        throw null;
    }

    @Override // e.b.b.a.c.e.v
    public Context getContext() {
        throw null;
    }

    public s5 h() {
        throw null;
    }

    public k1 i() {
        throw null;
    }

    public y j() {
        throw null;
    }

    public final u k() {
        b(this.f7362f);
        return this.f7362f;
    }

    public final b0 l() {
        b(this.f7359c);
        return this.f7359c;
    }

    public final d1 m() {
        b(this.f7358b);
        return this.f7358b;
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (!this.f7364h) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void o() {
        r b2;
        String str;
        b1 F;
        String str2;
        e();
        n();
        this.p = true;
        try {
            Boolean E = this.f7363g.w().E();
            if (E == null) {
                F = a().B();
                str2 = "Upload data called on the client side before use of service was decided";
            } else if (E.booleanValue()) {
                F = a().y();
                str2 = "Upload called in the client side when service should be used";
            } else {
                if (this.f7366j <= 0) {
                    e();
                    if (this.s != null) {
                        F = a().F();
                        str2 = "Uploading requested multiple times";
                    } else if (!m().y()) {
                        a().F().a("Network not connected, ignoring upload request");
                    } else {
                        long a2 = b().a();
                        String str3 = null;
                        a((String) null, a2 - y.y());
                        long a3 = i().f7375e.a();
                        if (a3 != 0) {
                            a().E().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                        }
                        String C = l().C();
                        if (!TextUtils.isEmpty(C)) {
                            if (this.u == -1) {
                                this.u = l().J();
                            }
                            List<Pair<i6, Long>> a4 = l().a(C, j().b(C, p0.f7494i), Math.max(0, j().b(C, p0.f7495j)));
                            if (!a4.isEmpty()) {
                                Iterator<Pair<i6, Long>> it = a4.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = null;
                                        break;
                                    }
                                    i6 i6Var = (i6) it.next().first;
                                    if (!TextUtils.isEmpty(i6Var.u)) {
                                        str = i6Var.u;
                                        break;
                                    }
                                }
                                if (str != null) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= a4.size()) {
                                            break;
                                        }
                                        i6 i6Var2 = (i6) a4.get(i2).first;
                                        if (!(TextUtils.isEmpty(i6Var2.u) || i6Var2.u.equals(str))) {
                                            a4 = a4.subList(0, i2);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                h6 h6Var = new h6();
                                h6Var.f7307c = new i6[a4.size()];
                                ArrayList arrayList = new ArrayList(a4.size());
                                boolean z = y.z() && j().c(C);
                                for (int i3 = 0; i3 < h6Var.f7307c.length; i3++) {
                                    h6Var.f7307c[i3] = (i6) a4.get(i3).first;
                                    arrayList.add((Long) a4.get(i3).second);
                                    h6Var.f7307c[i3].t = 12451L;
                                    h6Var.f7307c[i3].f7330f = Long.valueOf(a2);
                                    h6Var.f7307c[i3].B = false;
                                    if (!z) {
                                        h6Var.f7307c[i3].K = null;
                                    }
                                }
                                if (a().a(2)) {
                                    str3 = g().a(h6Var);
                                }
                                byte[] a5 = h().a(h6Var);
                                String a6 = p0.s.a();
                                try {
                                    URL url = new URL(a6);
                                    y.a(!arrayList.isEmpty());
                                    if (this.s != null) {
                                        a().y().a("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.s = new ArrayList(arrayList);
                                    }
                                    i().f7376f.a(a2);
                                    String str4 = "?";
                                    if (h6Var.f7307c.length > 0) {
                                        str4 = h6Var.f7307c[0].q;
                                    }
                                    a().F().a("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(a5.length), str3);
                                    this.o = true;
                                    d1 m2 = m();
                                    k5 k5Var = new k5(this, C);
                                    m2.d();
                                    m2.v();
                                    y.a(url);
                                    y.a(a5);
                                    y.a(k5Var);
                                    m2.c().b(new h1(m2, C, url, a5, null, k5Var));
                                } catch (MalformedURLException unused) {
                                    a().y().a("Failed to parse upload URL. Not uploading. appId", z0.a(C), a6);
                                }
                            }
                        } else {
                            this.u = -1;
                            String a7 = l().a(a2 - y.y());
                            if (!TextUtils.isEmpty(a7) && (b2 = l().b(a7)) != null) {
                                a(b2);
                            }
                        }
                    }
                }
                x();
            }
            F.a(str2);
        } finally {
            this.p = false;
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        b1 y;
        Integer valueOf;
        Integer valueOf2;
        String str;
        e();
        n();
        if (!this.f7365i) {
            a().D().a("This instance being marked as an uploader");
            e();
            n();
            if (A() && z()) {
                int a2 = a(this.r);
                int B = this.f7363g.v().B();
                e();
                if (a2 > B) {
                    y = a().y();
                    valueOf = Integer.valueOf(a2);
                    valueOf2 = Integer.valueOf(B);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a2 < B) {
                    if (a(B, this.r)) {
                        y = a().F();
                        valueOf = Integer.valueOf(a2);
                        valueOf2 = Integer.valueOf(B);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        y = a().y();
                        valueOf = Integer.valueOf(a2);
                        valueOf2 = Integer.valueOf(B);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                y.a(str, valueOf, valueOf2);
            }
            this.f7365i = true;
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        this.f7369m++;
    }

    /* access modifiers changed from: package-private */
    public final d2 r() {
        return this.f7363g;
    }
}
