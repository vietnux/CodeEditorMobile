package com.crashlytics.android.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import f.a.a.a.n.b.p;

/* access modifiers changed from: package-private */
public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2897b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2898c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2899d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2900e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2901f;

    a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.f2897b = str2;
        this.f2898c = str3;
        this.f2899d = str4;
        this.f2900e = str5;
        this.f2901f = str6;
    }

    public static a a(Context context, p pVar, String str, String str2) {
        String packageName = context.getPackageName();
        String h2 = pVar.h();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, h2, packageName, num, str3);
    }
}
