package com.google.android.gms.internal.ads;

final class le implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ie f4871b;

    le(ie ieVar) {
        this.f4871b = ieVar;
    }

    public final void run() {
        if (this.f4871b.q != null) {
            this.f4871b.q.f();
        }
    }
}
