package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class me implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4948b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4949c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ie f4950d;

    me(ie ieVar, String str, String str2) {
        this.f4950d = ieVar;
        this.f4948b = str;
        this.f4949c = str2;
    }

    public final void run() {
        if (this.f4950d.q != null) {
            this.f4950d.q.a(this.f4948b, this.f4949c);
        }
    }
}
