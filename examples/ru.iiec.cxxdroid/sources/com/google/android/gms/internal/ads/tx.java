package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.h;
import com.google.android.gms.common.l;
import com.google.android.gms.common.m;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class tx {
    private static final String s = "tx";
    protected Context a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f5664b;

    /* renamed from: c  reason: collision with root package name */
    private DexClassLoader f5665c;

    /* renamed from: d  reason: collision with root package name */
    private ex f5666d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f5667e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AdvertisingIdClient f5668f = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f5669g = false;

    /* renamed from: h  reason: collision with root package name */
    private Future f5670h = null;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5671i;

    /* renamed from: j  reason: collision with root package name */
    private volatile xp f5672j = null;

    /* renamed from: k  reason: collision with root package name */
    private Future f5673k = null;

    /* renamed from: l  reason: collision with root package name */
    private ww f5674l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5675m = false;
    private boolean n = false;
    private Map<Pair<String, String>, cz> o;
    private boolean p = false;
    private boolean q;
    private boolean r;

    final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(tx txVar, vx vxVar) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                tx.this.q = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                tx.this.q = false;
            }
        }
    }

    private tx(Context context) {
        boolean z = true;
        this.q = true;
        this.r = false;
        Context applicationContext = context.getApplicationContext();
        this.f5671i = applicationContext == null ? false : z;
        this.a = this.f5671i ? applicationContext : context;
        this.o = new HashMap();
    }

    public static tx a(Context context, String str, String str2, boolean z) {
        tx txVar = new tx(context);
        try {
            txVar.f5664b = Executors.newCachedThreadPool(new vx());
            txVar.f5669g = z;
            if (z) {
                txVar.f5670h = txVar.f5664b.submit(new wx(txVar));
            }
            txVar.f5664b.execute(new yx(txVar));
            try {
                h a2 = h.a();
                txVar.f5675m = a2.a(txVar.a) > 0;
                txVar.n = a2.b(txVar.a) == 0;
            } catch (Throwable unused) {
            }
            txVar.a(0, true);
            if (by.a()) {
                if (((Boolean) a50.g().a(k80.L1)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            txVar.f5666d = new ex(null);
            try {
                txVar.f5667e = txVar.f5666d.a(str);
                try {
                    File cacheDir = txVar.a.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = txVar.a.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new qx();
                        }
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1521499837408"));
                    if (!file.exists()) {
                        byte[] a3 = txVar.f5666d.a(txVar.f5667e, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(a3, 0, a3.length);
                        fileOutputStream.close();
                    }
                    txVar.b(cacheDir, "1521499837408");
                    try {
                        txVar.f5665c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, txVar.a.getClassLoader());
                        a(file);
                        txVar.a(cacheDir, "1521499837408");
                        a(String.format("%s/%s.dex", cacheDir, "1521499837408"));
                        if (!txVar.r) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.intent.action.USER_PRESENT");
                            intentFilter.addAction("android.intent.action.SCREEN_OFF");
                            txVar.a.registerReceiver(new a(txVar, null), intentFilter);
                            txVar.r = true;
                        }
                        txVar.f5674l = new ww(txVar);
                        txVar.p = true;
                        return txVar;
                    } catch (Throwable th) {
                        a(file);
                        txVar.a(cacheDir, "1521499837408");
                        a(String.format("%s/%s.dex", cacheDir, "1521499837408"));
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw new qx(e2);
                } catch (IOException e3) {
                    throw new qx(e3);
                } catch (fx e4) {
                    throw new qx(e4);
                } catch (NullPointerException e5) {
                    throw new qx(e5);
                }
            } catch (fx e6) {
                throw new qx(e6);
            }
        } catch (qx unused2) {
        }
    }

    private static void a(File file) {
        if (!file.exists()) {
            Log.d(s, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa A[SYNTHETIC, Splitter:B:43:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: fx | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:20:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[SYNTHETIC, Splitter:B:52:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb A[SYNTHETIC, Splitter:B:56:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tx.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    /* access modifiers changed from: private */
    public static boolean a(int i2, xp xpVar) {
        Long l2;
        String str;
        if (i2 >= 4) {
            return false;
        }
        if (xpVar == null) {
            return true;
        }
        if (((Boolean) a50.g().a(k80.O1)).booleanValue() && ((str = xpVar.y) == null || str.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
            return true;
        }
        if (!((Boolean) a50.g().a(k80.P1)).booleanValue()) {
            return false;
        }
        zu zuVar = xpVar.s0;
        return zuVar == null || (l2 = zuVar.f6218c) == null || l2.longValue() == -2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b0 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6 A[SYNTHETIC, Splitter:B:51:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd A[SYNTHETIC, Splitter:B:55:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ExcHandler: fx | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4 A[SYNTHETIC, Splitter:B:63:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00db A[SYNTHETIC, Splitter:B:67:0x00db] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tx.b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void o() {
        try {
            if (this.f5668f == null && this.f5671i) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.a);
                advertisingIdClient.start();
                this.f5668f = advertisingIdClient;
            }
        } catch (l | m | IOException unused) {
            this.f5668f = null;
        }
    }

    private final xp p() {
        try {
            return gj.a(this.a, this.a.getPackageName(), Integer.toString(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context a() {
        return this.a;
    }

    public final Method a(String str, String str2) {
        cz czVar = this.o.get(new Pair(str, str2));
        if (czVar == null) {
            return null;
        }
        return czVar.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.n) {
            Future<?> submit = this.f5664b.submit(new xx(this, i2, z));
            if (i2 == 0) {
                this.f5673k = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.o.put(new Pair<>(str, str2), new cz(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final xp b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return p();
    }

    public final boolean b() {
        return this.p;
    }

    public final ExecutorService c() {
        return this.f5664b;
    }

    public final DexClassLoader d() {
        return this.f5665c;
    }

    public final ex e() {
        return this.f5666d;
    }

    public final byte[] f() {
        return this.f5667e;
    }

    public final boolean g() {
        return this.f5675m;
    }

    public final ww h() {
        return this.f5674l;
    }

    public final boolean i() {
        return this.n;
    }

    public final boolean j() {
        return this.q;
    }

    public final xp k() {
        return this.f5672j;
    }

    public final Future l() {
        return this.f5673k;
    }

    public final AdvertisingIdClient m() {
        if (!this.f5669g) {
            return null;
        }
        if (this.f5668f != null) {
            return this.f5668f;
        }
        Future future = this.f5670h;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.f5670h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f5670h.cancel(true);
            }
        }
        return this.f5668f;
    }

    public final int n() {
        if (this.f5674l != null) {
            return ww.a();
        }
        return Integer.MIN_VALUE;
    }
}
