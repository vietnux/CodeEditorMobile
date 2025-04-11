package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.f;
import java.util.HashMap;
import java.util.Map;

@k2
public final class bh extends p60 {

    /* renamed from: b  reason: collision with root package name */
    private final kf f3900b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3901c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3902d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3903e;

    /* renamed from: f  reason: collision with root package name */
    private final float f3904f;

    /* renamed from: g  reason: collision with root package name */
    private int f3905g;

    /* renamed from: h  reason: collision with root package name */
    private r60 f3906h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3907i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3908j = true;

    /* renamed from: k  reason: collision with root package name */
    private float f3909k;

    /* renamed from: l  reason: collision with root package name */
    private float f3910l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3911m;
    private boolean n;

    public bh(kf kfVar, float f2, boolean z, boolean z2) {
        this.f3900b = kfVar;
        this.f3904f = f2;
        this.f3902d = z;
        this.f3903e = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        rd.a.execute(new ch(this, hashMap));
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean K0() {
        boolean z;
        boolean d1 = d1();
        synchronized (this.f3901c) {
            if (!d1) {
                try {
                    if (this.n && this.f3903e) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float L0() {
        float f2;
        synchronized (this.f3901c) {
            f2 = this.f3910l;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final r60 M0() {
        r60 r60;
        synchronized (this.f3901c) {
            r60 = this.f3906h;
        }
        return r60;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final int Q0() {
        int i2;
        synchronized (this.f3901c) {
            i2 = this.f3905g;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean X0() {
        boolean z;
        synchronized (this.f3901c) {
            z = this.f3908j;
        }
        return z;
    }

    public final void a(float f2, int i2, boolean z, float f3) {
        boolean z2;
        int i3;
        synchronized (this.f3901c) {
            this.f3909k = f2;
            z2 = this.f3908j;
            this.f3908j = z;
            i3 = this.f3905g;
            this.f3905g = i2;
            float f4 = this.f3910l;
            this.f3910l = f3;
            if (Math.abs(this.f3910l - f4) > 1.0E-4f) {
                this.f3900b.getView().invalidate();
            }
        }
        rd.a.execute(new dh(this, i3, i2, z2, z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, boolean z, boolean z2) {
        synchronized (this.f3901c) {
            boolean z3 = false;
            boolean z4 = i2 != i3;
            boolean z5 = !this.f3907i && i3 == 1;
            boolean z6 = z4 && i3 == 1;
            boolean z7 = z4 && i3 == 2;
            boolean z8 = z4 && i3 == 3;
            boolean z9 = z != z2;
            if (this.f3907i || z5) {
                z3 = true;
            }
            this.f3907i = z3;
            if (this.f3906h != null) {
                if (z5) {
                    try {
                        this.f3906h.R0();
                    } catch (RemoteException e2) {
                        qc.c("Unable to call onVideoStart()", e2);
                    }
                }
                if (z6) {
                    try {
                        this.f3906h.Y0();
                    } catch (RemoteException e3) {
                        qc.c("Unable to call onVideoPlay()", e3);
                    }
                }
                if (z7) {
                    try {
                        this.f3906h.W0();
                    } catch (RemoteException e4) {
                        qc.c("Unable to call onVideoPause()", e4);
                    }
                }
                if (z8) {
                    try {
                        this.f3906h.w0();
                    } catch (RemoteException e5) {
                        qc.c("Unable to call onVideoEnd()", e5);
                    }
                }
                if (z9) {
                    try {
                        this.f3906h.h(z2);
                    } catch (RemoteException e6) {
                        qc.c("Unable to call onVideoMute()", e6);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void a(r60 r60) {
        synchronized (this.f3901c) {
            this.f3906h = r60;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map) {
        this.f3900b.a("pubVideoCmd", map);
    }

    public final void b(t70 t70) {
        synchronized (this.f3901c) {
            boolean z = t70.f5593b;
            this.f3911m = t70.f5594c;
            this.n = t70.f5595d;
        }
        a("initialState", f.a("muteStart", t70.f5593b ? "1" : "0", "customControlsRequested", t70.f5594c ? "1" : "0", "clickToExpandRequested", t70.f5595d ? "1" : "0"));
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void c1() {
        a("play", null);
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final boolean d1() {
        boolean z;
        synchronized (this.f3901c) {
            z = this.f3902d && this.f3911m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void k(boolean z) {
        a(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float n1() {
        return this.f3904f;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final float v1() {
        float f2;
        synchronized (this.f3901c) {
            f2 = this.f3909k;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void y() {
        a("pause", null);
    }
}
