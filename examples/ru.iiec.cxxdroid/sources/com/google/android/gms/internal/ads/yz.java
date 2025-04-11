package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import org.json.JSONObject;

@k2
public final class yz implements l00 {
    private final pz a;

    /* renamed from: b  reason: collision with root package name */
    private final lg f6166b;

    /* renamed from: c  reason: collision with root package name */
    private final e0<lg> f6167c = new zz(this);

    /* renamed from: d  reason: collision with root package name */
    private final e0<lg> f6168d = new a00(this);

    /* renamed from: e  reason: collision with root package name */
    private final e0<lg> f6169e = new b00(this);

    public yz(pz pzVar, lg lgVar) {
        this.a = pzVar;
        this.f6166b = lgVar;
        lg lgVar2 = this.f6166b;
        lgVar2.b("/updateActiveView", this.f6167c);
        lgVar2.b("/untrackActiveViewUnit", this.f6168d);
        lgVar2.b("/visibilityChanged", this.f6169e);
        String valueOf = String.valueOf(this.a.f5274e.d());
        qc.b(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final void a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f6166b.b("AFMA_updateActiveView", jSONObject);
        } else {
            this.a.b(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l00
    public final void b() {
        lg lgVar = this.f6166b;
        lgVar.a("/visibilityChanged", this.f6169e);
        lgVar.a("/untrackActiveViewUnit", this.f6168d);
        lgVar.a("/updateActiveView", this.f6167c);
    }
}
