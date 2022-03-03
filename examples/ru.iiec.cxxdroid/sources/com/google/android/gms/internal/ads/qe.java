package com.google.android.gms.internal.ads;

final class qe implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ie f5338b;

    qe(ie ieVar) {
        this.f5338b = ieVar;
    }

    public final void run() {
        if (this.f5338b.q != null) {
            this.f5338b.q.e();
            this.f5338b.q.c();
        }
    }
}
