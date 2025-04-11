package com.crashlytics.android.c;

final class b0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2811b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2812c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2813d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2814e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f2815f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2816g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2817h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2818i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2819j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2820k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2821l;

    /* renamed from: m  reason: collision with root package name */
    private String f2822m;

    public b0(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.f2811b = str2;
        this.f2812c = str3;
        this.f2813d = str4;
        this.f2814e = str5;
        this.f2815f = bool;
        this.f2816g = str6;
        this.f2817h = str7;
        this.f2818i = str8;
        this.f2819j = str9;
        this.f2820k = str10;
        this.f2821l = str11;
    }

    public String toString() {
        if (this.f2822m == null) {
            this.f2822m = "appBundleId=" + this.a + ", executionId=" + this.f2811b + ", installationId=" + this.f2812c + ", androidId=" + this.f2813d + ", advertisingId=" + this.f2814e + ", limitAdTrackingEnabled=" + this.f2815f + ", betaDeviceToken=" + this.f2816g + ", buildId=" + this.f2817h + ", osVersion=" + this.f2818i + ", deviceModel=" + this.f2819j + ", appVersionCode=" + this.f2820k + ", appVersionName=" + this.f2821l;
        }
        return this.f2822m;
    }
}
