package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.c;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import org.json.JSONObject;

@k2
public final class c00 implements l00 {
    private final pz a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3934b;

    /* renamed from: c  reason: collision with root package name */
    private final c f3935c;

    /* renamed from: d  reason: collision with root package name */
    private ug0 f3936d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3937e;

    /* renamed from: f  reason: collision with root package name */
    private final e0<eh0> f3938f = new h00(this);

    /* renamed from: g  reason: collision with root package name */
    private final e0<eh0> f3939g = new i00(this);

    /* renamed from: h  reason: collision with root package name */
    private final e0<eh0> f3940h = new j00(this);

    /* renamed from: i  reason: collision with root package name */
    private final e0<eh0> f3941i = new k00(this);

    public c00(pz pzVar, hg0 hg0, Context context) {
        this.a = pzVar;
        this.f3934b = context;
        this.f3935c = new c(this.f3934b);
        this.f3936d = hg0.b((cx) null);
        this.f3936d.a(new d00(this), new e00(this));
        String valueOf = String.valueOf(this.a.f5274e.d());
        qc.b(valueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(valueOf) : new String("Core JS tracking ad unit: "));
    }

    /* access modifiers changed from: package-private */
    public final void a(eh0 eh0) {
        eh0.b("/updateActiveView", this.f3938f);
        eh0.b("/untrackActiveViewUnit", this.f3939g);
        eh0.b("/visibilityChanged", this.f3940h);
        if (x0.C().d(this.f3934b)) {
            eh0.b("/logScionEvent", this.f3941i);
        }
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final void a(JSONObject jSONObject, boolean z) {
        this.f3936d.a(new f00(this, jSONObject), new ae());
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final boolean a() {
        return this.f3937e;
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final void b() {
        this.f3936d.a(new g00(this), new ae());
        this.f3936d.c();
    }

    /* access modifiers changed from: package-private */
    public final void b(eh0 eh0) {
        eh0.a("/visibilityChanged", this.f3940h);
        eh0.a("/untrackActiveViewUnit", this.f3939g);
        eh0.a("/updateActiveView", this.f3938f);
        if (x0.C().d(this.f3934b)) {
            eh0.a("/logScionEvent", this.f3941i);
        }
    }
}
