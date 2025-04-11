package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@k2
@TargetApi(14)
public final class nf implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager a;

    /* renamed from: b  reason: collision with root package name */
    private final pf f5089b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5090c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5091d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5092e;

    /* renamed from: f  reason: collision with root package name */
    private float f5093f = 1.0f;

    public nf(Context context, pf pfVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.f5089b = pfVar;
    }

    private final void d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f5091d && !this.f5092e && this.f5093f > 0.0f;
        if (z4 && !(z2 = this.f5090c)) {
            AudioManager audioManager = this.a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f5090c = z3;
            }
            this.f5089b.a();
        } else if (!z4 && (z = this.f5090c)) {
            AudioManager audioManager2 = this.a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f5090c = z3;
            }
            this.f5089b.a();
        }
    }

    public final float a() {
        float f2 = this.f5092e ? 0.0f : this.f5093f;
        if (this.f5090c) {
            return f2;
        }
        return 0.0f;
    }

    public final void a(float f2) {
        this.f5093f = f2;
        d();
    }

    public final void a(boolean z) {
        this.f5092e = z;
        d();
    }

    public final void b() {
        this.f5091d = true;
        d();
    }

    public final void c() {
        this.f5091d = false;
        d();
    }

    public final void onAudioFocusChange(int i2) {
        this.f5090c = i2 > 0;
        this.f5089b.a();
    }
}
