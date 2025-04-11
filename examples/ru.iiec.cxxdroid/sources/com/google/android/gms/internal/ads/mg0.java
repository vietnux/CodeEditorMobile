package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class mg0 implements e0<eh0> {
    private final /* synthetic */ yg0 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vf0 f4967b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hg0 f4968c;

    mg0(hg0 hg0, yg0 yg0, vf0 vf0) {
        this.f4968c = hg0;
        this.a = yg0;
        this.f4967b = vf0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(eh0 eh0, Map map) {
        synchronized (this.f4968c.a) {
            if (this.a.a() != -1) {
                if (this.a.a() != 1) {
                    this.f4968c.f4526h = 0;
                    this.f4968c.f4523e.a(this.f4967b);
                    this.a.a(this.f4967b);
                    this.f4968c.f4525g = this.a;
                    l9.e("Successfully loaded JS Engine.");
                }
            }
        }
    }
}
