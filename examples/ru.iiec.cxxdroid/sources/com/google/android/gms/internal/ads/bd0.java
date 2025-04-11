package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class bd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3880b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3881c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ bc0 f3882d;

    bd0(bc0 bc0, String str, long j2) {
        this.f3882d = bc0;
        this.f3880b = str;
        this.f3881c = j2;
    }

    public final void run() {
        this.f3882d.f3866b.a(this.f3880b, this.f3881c);
        this.f3882d.f3866b.a(toString());
    }
}
