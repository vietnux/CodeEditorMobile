package com.google.android.gms.internal.ads;

final class ni0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ld f5101b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ li0 f5102c;

    ni0(li0 li0, ld ldVar) {
        this.f5102c = li0;
        this.f5101b = ldVar;
    }

    public final void run() {
        for (ld ldVar : li0.e(this.f5102c).keySet()) {
            if (ldVar != this.f5101b) {
                ((fi0) li0.e(this.f5102c).get(ldVar)).a();
            }
        }
    }
}
