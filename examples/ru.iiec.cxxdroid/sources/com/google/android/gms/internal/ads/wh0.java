package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.h;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class wh0 implements h {
    private final ug0 a;

    /* renamed from: b  reason: collision with root package name */
    private final wd f5939b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ th0 f5940c;

    public wh0(th0 th0, ug0 ug0, wd wdVar) {
        this.f5940c = th0;
        this.a = ug0;
        this.f5939b = wdVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.h
    public final void a(String str) {
        if (str == null) {
            try {
                this.f5939b.a(new hh0());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.a.c();
                throw th;
            }
        } else {
            this.f5939b.a(new hh0(str));
        }
        this.a.c();
    }

    @Override // com.google.android.gms.ads.internal.gmsg.h
    public final void a(JSONObject jSONObject) {
        try {
            this.f5939b.b(this.f5940c.a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f5939b.b(e2);
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
        this.a.c();
    }
}
