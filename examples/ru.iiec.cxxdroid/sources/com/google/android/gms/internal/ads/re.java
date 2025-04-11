package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class re implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ie f5437b;

    re(ie ieVar) {
        this.f5437b = ieVar;
    }

    public final void run() {
        if (this.f5437b.q != null) {
            this.f5437b.q.g();
        }
    }
}
