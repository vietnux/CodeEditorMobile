package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.n;
import java.util.Locale;

public final class h5 {
    private String A;
    private boolean B;
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4489b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4490c;

    /* renamed from: d  reason: collision with root package name */
    private int f4491d;

    /* renamed from: e  reason: collision with root package name */
    private int f4492e;

    /* renamed from: f  reason: collision with root package name */
    private int f4493f;

    /* renamed from: g  reason: collision with root package name */
    private String f4494g;

    /* renamed from: h  reason: collision with root package name */
    private int f4495h;

    /* renamed from: i  reason: collision with root package name */
    private int f4496i;

    /* renamed from: j  reason: collision with root package name */
    private int f4497j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4498k;

    /* renamed from: l  reason: collision with root package name */
    private int f4499l;

    /* renamed from: m  reason: collision with root package name */
    private double f4500m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private float x;
    private int y;
    private int z;

    public h5(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        a(context);
        b(context);
        c(context);
        Locale locale = Locale.getDefault();
        boolean z2 = true;
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") == null ? false : z2;
        this.s = locale.getCountry();
        a50.b();
        this.t = fc.a();
        this.u = i.b(context);
        this.v = locale.getLanguage();
        this.w = b(context, packageManager);
        this.A = a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.x = displayMetrics.density;
            this.y = displayMetrics.widthPixels;
            this.z = displayMetrics.heightPixels;
        }
    }

    public h5(Context context, g5 g5Var) {
        context.getPackageManager();
        a(context);
        b(context);
        c(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.B = n.c() && i90.a(context);
        this.q = g5Var.f4387b;
        this.r = g5Var.f4388c;
        this.s = g5Var.f4390e;
        this.t = g5Var.f4391f;
        this.u = g5Var.f4392g;
        this.v = g5Var.f4395j;
        this.w = g5Var.f4396k;
        this.A = g5Var.f4397l;
        this.x = g5Var.s;
        this.y = g5Var.t;
        this.z = g5Var.u;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            x0.j().a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String a(Context context, PackageManager packageManager) {
        try {
            PackageInfo b2 = c.b(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.f4489b = audioManager.isMusicActive();
                this.f4490c = audioManager.isSpeakerphoneOn();
                this.f4491d = audioManager.getStreamVolume(3);
                this.f4492e = audioManager.getRingerMode();
                this.f4493f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                x0.j().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.f4489b = false;
        this.f4490c = false;
        this.f4491d = 0;
        this.f4492e = 0;
        this.f4493f = 0;
    }

    private static String b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b2 = c.b(context).b(activityInfo.packageName, 0);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @TargetApi(16)
    private final void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4494g = telephonyManager.getNetworkOperator();
        this.f4496i = telephonyManager.getNetworkType();
        this.f4497j = telephonyManager.getPhoneType();
        this.f4495h = -2;
        this.f4498k = false;
        this.f4499l = -1;
        x0.f();
        if (u9.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f4495h = activeNetworkInfo.getType();
                this.f4499l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f4495h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f4498k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f4500m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.f4500m = -1.0d;
        this.n = false;
    }

    public final g5 a() {
        return new g5(this.a, this.q, this.r, this.f4494g, this.s, this.t, this.u, this.f4489b, this.f4490c, this.v, this.w, this.A, this.f4491d, this.f4495h, this.f4496i, this.f4497j, this.f4492e, this.f4493f, this.x, this.y, this.z, this.f4500m, this.n, this.f4498k, this.f4499l, this.o, this.B, this.p);
    }
}
