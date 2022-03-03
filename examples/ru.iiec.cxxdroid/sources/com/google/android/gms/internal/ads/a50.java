package com.google.android.gms.internal.ads;

@k2
public final class a50 {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f3764g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static a50 f3765h;
    private final fc a = new fc();

    /* renamed from: b  reason: collision with root package name */
    private final r40 f3766b = new r40(new h40(), new g40(), new f70(), new wc0(), new p6(), new q(), new xc0());

    /* renamed from: c  reason: collision with root package name */
    private final String f3767c = fc.c();

    /* renamed from: d  reason: collision with root package name */
    private final g80 f3768d = new g80();

    /* renamed from: e  reason: collision with root package name */
    private final h80 f3769e = new h80();

    /* renamed from: f  reason: collision with root package name */
    private final i80 f3770f = new i80();

    static {
        a50 a50 = new a50();
        synchronized (f3764g) {
            f3765h = a50;
        }
    }

    protected a50() {
    }

    private static a50 a() {
        a50 a50;
        synchronized (f3764g) {
            a50 = f3765h;
        }
        return a50;
    }

    public static fc b() {
        return a().a;
    }

    public static r40 c() {
        return a().f3766b;
    }

    public static String d() {
        return a().f3767c;
    }

    public static h80 e() {
        return a().f3769e;
    }

    public static g80 f() {
        return a().f3768d;
    }

    public static i80 g() {
        return a().f3770f;
    }
}
