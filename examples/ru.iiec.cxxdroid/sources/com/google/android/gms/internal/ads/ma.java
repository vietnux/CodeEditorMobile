package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@k2
public final class ma {
    private boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f4942b = 1.0f;

    public static float a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean c() {
        return this.f4942b >= 0.0f;
    }

    public final synchronized float a() {
        if (!c()) {
            return 1.0f;
        }
        return this.f4942b;
    }

    public final synchronized void a(float f2) {
        this.f4942b = f2;
    }

    public final synchronized void a(boolean z) {
        this.a = z;
    }

    public final synchronized boolean b() {
        return this.a;
    }
}
