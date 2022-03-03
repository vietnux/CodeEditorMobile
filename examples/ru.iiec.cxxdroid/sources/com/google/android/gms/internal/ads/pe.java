package com.google.android.gms.internal.ads;

final class pe implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5246b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5247c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ie f5248d;

    pe(ie ieVar, int i2, int i3) {
        this.f5248d = ieVar;
        this.f5246b = i2;
        this.f5247c = i3;
    }

    public final void run() {
        if (this.f5248d.q != null) {
            this.f5248d.q.a(this.f5246b, this.f5247c);
        }
    }
}
