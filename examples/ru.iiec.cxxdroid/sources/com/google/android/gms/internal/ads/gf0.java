package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class gf0 extends tf0<eh0> implements pf0, vf0 {

    /* renamed from: c  reason: collision with root package name */
    private final mi f4421c;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.internal.ads.gf0 */
    /* JADX WARN: Multi-variable type inference failed */
    public gf0(Context context, sc scVar) {
        try {
            this.f4421c = new mi(new yh(context));
            this.f4421c.setWillNotDraw(true);
            this.f4421c.a(new hf0(this));
            this.f4421c.a(new if0(this));
            this.f4421c.addJavascriptInterface(new of0(this), "GoogleJsInterface");
            x0.f().a(context, scVar.f5529b, this.f4421c.getSettings());
        } catch (Throwable th) {
            throw new wg("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final fh0 a() {
        return new gh0(this);
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void a(wf0 wf0) {
        this.f4421c.a(new lf0(wf0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f4421c.b(str);
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
        rd.a.execute(new mf0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        qf0.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void c(String str) {
        rd.a.execute(new jf0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void d(String str) {
        rd.a.execute(new kf0(this, str));
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void destroy() {
        this.f4421c.destroy();
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void e(String str) {
        c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str) {
        this.f4421c.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.f4421c.loadData(str, "text/html", "UTF-8");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.tf0
    public final /* bridge */ /* synthetic */ eh0 k() {
        return this;
    }
}
