package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class h4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ JSONObject f4486b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4487c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f4 f4488d;

    h4(f4 f4Var, JSONObject jSONObject, String str) {
        this.f4488d = f4Var;
        this.f4486b = jSONObject;
        this.f4487c = str;
    }

    public final void run() {
        this.f4488d.f4277h = f4.f4272m.b((cx) null);
        this.f4488d.f4277h.a(new i4(this), new j4(this));
    }
}
