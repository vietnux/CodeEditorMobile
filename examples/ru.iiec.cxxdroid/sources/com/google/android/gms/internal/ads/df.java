package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@k2
@TargetApi(14)
public final class df {
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) a50.g().a(k80.x)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f4101b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4102c = true;

    df() {
    }

    public final void a() {
        this.f4102c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, te teVar) {
        if (teVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f4102c || Math.abs(timestamp - this.f4101b) >= this.a) {
                this.f4102c = false;
                this.f4101b = timestamp;
                u9.f5718h.post(new ef(this, teVar));
            }
        }
    }
}
