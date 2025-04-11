package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.t.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@k2
public final class e2 implements i2 {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f4158f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static i2 f4159g;

    /* renamed from: h  reason: collision with root package name */
    private static i2 f4160h;
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4161b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f4162c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f4163d;

    /* renamed from: e  reason: collision with root package name */
    private final sc f4164e;

    private e2(Context context) {
        this(context, sc.t());
    }

    private e2(Context context, sc scVar) {
        this.a = new Object();
        this.f4162c = new WeakHashMap<>();
        this.f4163d = Executors.newCachedThreadPool();
        this.f4161b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4164e = scVar;
    }

    private final Uri.Builder a(String str, String str2, String str3, int i2) {
        boolean z;
        String str4;
        try {
            z = c.b(this.f4161b).a();
        } catch (Throwable th) {
            qc.b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f4161b.getPackageName();
        } catch (Throwable unused) {
            qc.d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f4164e.f5529b).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", k80.a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "191880412").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", a50.d()).appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(a50.g().a(k80.i3)));
    }

    public static i2 a(Context context) {
        synchronized (f4158f) {
            if (f4159g == null) {
                if (((Boolean) a50.g().a(k80.f4788b)).booleanValue()) {
                    f4159g = new e2(context);
                } else {
                    f4159g = new j2();
                }
            }
        }
        return f4159g;
    }

    public static i2 a(Context context, sc scVar) {
        synchronized (f4158f) {
            if (f4160h == null) {
                if (((Boolean) a50.g().a(k80.f4788b)).booleanValue()) {
                    e2 e2Var = new e2(context, scVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (e2Var.a) {
                            e2Var.f4162c.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new g2(e2Var, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new f2(e2Var, Thread.getDefaultUncaughtExceptionHandler()));
                    f4160h = e2Var;
                } else {
                    f4160h = new j2();
                }
            }
        }
        return f4160h;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0040
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003b
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0034
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.fc.b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class<com.google.android.gms.internal.ads.e2> r8 = com.google.android.gms.internal.ads.e2.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0031
            r6 = 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0034:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x004a
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.a(r11, r0, r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e2.a(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.i2
    public final void a(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.i2
    public final void a(Throwable th, String str, float f2) {
        if (fc.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            np.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i2 = 0;
            int i3 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i3 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(name, stringWriter2, str, i3).toString());
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    this.f4163d.submit(new h2(this, new rc(), (String) obj));
                }
            }
        }
    }
}
