package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class xf0 implements pf0, vf0 {

    /* renamed from: b  reason: collision with root package name */
    private final lg f6023b;

    public xf0(Context context, sc scVar, cx cxVar, u1 u1Var) {
        x0.g();
        this.f6023b = sg.a(context, zh.e(), "", false, false, cxVar, scVar, null, null, null, r20.a());
        this.f6023b.getView().setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        a50.b();
        if (fc.b()) {
            runnable.run();
        } else {
            u9.f5718h.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final fh0 a() {
        return new gh0(this);
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void a(wf0 wf0) {
        th M = this.f6023b.M();
        wf0.getClass();
        M.a(ag0.a(wf0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f6023b.b(str);
    }

    @Override // com.google.android.gms.internal.ads.eh0
    public final void a(String str, e0<? super eh0> e0Var) {
        this.f6023b.a(str, new zf0(e0Var));
    }

    @Override // com.google.android.gms.internal.ads.pf0
    public final void a(String str, String str2) {
        qf0.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, Map map) {
        qf0.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ff0, com.google.android.gms.internal.ads.pf0
    public final void a(String str, JSONObject jSONObject) {
        qf0.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.gg0, com.google.android.gms.internal.ads.pf0
    public final void b(String str) {
        a(new yf0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.eh0
    public final void b(String str, e0<? super eh0> e0Var) {
        this.f6023b.b(str, new fg0(this, e0Var));
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        qf0.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void c(String str) {
        a(new dg0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void d(String str) {
        a(new eg0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void destroy() {
        this.f6023b.destroy();
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void e(String str) {
        a(new cg0(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }
}
