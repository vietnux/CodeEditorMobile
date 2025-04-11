package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.o;
import com.google.android.gms.ads.internal.x0;
import org.json.JSONObject;

@k2
public final class th0<I, O> implements ih0<I, O> {
    private final kh0<O> a;

    /* renamed from: b  reason: collision with root package name */
    private final lh0<I> f5624b;

    /* renamed from: c  reason: collision with root package name */
    private final hg0 f5625c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5626d;

    th0(hg0 hg0, String str, lh0<I> lh0, kh0<O> kh0) {
        this.f5625c = hg0;
        this.f5626d = str;
        this.f5624b = lh0;
        this.a = kh0;
    }

    /* access modifiers changed from: private */
    public final void a(ug0 ug0, eh0 eh0, I i2, wd<O> wdVar) {
        try {
            x0.f();
            String b2 = u9.b();
            o.o.a(b2, new wh0(this, ug0, wdVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", b2);
            jSONObject.put("args", this.f5624b.a(i2));
            eh0.b(this.f5626d, jSONObject);
        } catch (Exception e2) {
            wdVar.a(e2);
            qc.b("Unable to invokeJavaScript", e2);
            ug0.c();
        } catch (Throwable th) {
            ug0.c();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ih0
    public final ld<O> a(I i2) {
        wd wdVar = new wd();
        ug0 b2 = this.f5625c.b((cx) null);
        b2.a(new uh0(this, b2, i2, wdVar), new vh0(this, wdVar, b2));
        return wdVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ld<O> b(I i2) {
        return a((Object) i2);
    }
}
