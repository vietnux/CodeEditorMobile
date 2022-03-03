package com.google.android.gms.internal.ads;

final class ke implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ie f4819b;

    ke(ie ieVar) {
        this.f4819b = ieVar;
    }

    public final void run() {
        if (this.f4819b.q != null) {
            this.f4819b.q.b();
        }
    }
}
