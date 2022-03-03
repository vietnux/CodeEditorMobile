package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

/* access modifiers changed from: package-private */
@k2
public final class t8 {
    private long a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f5596b = -1;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.f5596b);
        return bundle;
    }

    public final long b() {
        return this.f5596b;
    }

    public final void c() {
        this.f5596b = SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.a = SystemClock.elapsedRealtime();
    }
}
