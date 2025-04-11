package com.google.android.gms.internal.ads;

final class oe implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ie f5158b;

    oe(ie ieVar) {
        this.f5158b = ieVar;
    }

    public final void run() {
        if (this.f5158b.q != null) {
            this.f5158b.q.d();
        }
    }
}
