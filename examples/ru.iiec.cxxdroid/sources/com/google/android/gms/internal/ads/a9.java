package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.x0;

@k2
public final class a9 {
    private long a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f3773b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f3774c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f3775d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f3776e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3777f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final String f3778g;

    /* renamed from: h  reason: collision with root package name */
    private int f3779h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f3780i = 0;

    public a9(String str) {
        this.f3778g = str;
    }

    private static boolean a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            qc.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            qc.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            qc.d("Fail to fetch AdActivity theme");
            qc.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f3777f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f3778g);
            bundle.putLong("basets", this.f3773b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f3774c);
            bundle.putInt("preqs_in_session", this.f3775d);
            bundle.putLong("time_in_session", this.f3776e);
            bundle.putInt("pclick", this.f3779h);
            bundle.putInt("pimp", this.f3780i);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f3777f) {
            this.f3780i++;
        }
    }

    public final void a(j40 j40, long j2) {
        synchronized (this.f3777f) {
            long i2 = x0.j().m().i();
            long a2 = x0.m().a();
            if (this.f3773b == -1) {
                if (a2 - i2 > ((Long) a50.g().a(k80.G0)).longValue()) {
                    this.f3775d = -1;
                } else {
                    this.f3775d = x0.j().m().j();
                }
                this.f3773b = j2;
                j2 = this.f3773b;
            }
            this.a = j2;
            if (j40 == null || j40.f4676d == null || j40.f4676d.getInt("gw", 2) != 1) {
                this.f3774c++;
                this.f3775d++;
                if (this.f3775d == 0) {
                    this.f3776e = 0;
                    x0.j().m().b(a2);
                } else {
                    this.f3776e = a2 - x0.j().m().k();
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f3777f) {
            this.f3779h++;
        }
    }
}
