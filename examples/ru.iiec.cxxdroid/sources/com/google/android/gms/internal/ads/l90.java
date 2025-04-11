package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class l90 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final o1 f4851b;

    /* renamed from: c  reason: collision with root package name */
    private qc0 f4852c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f4853d;

    /* renamed from: e  reason: collision with root package name */
    String f4854e;

    /* renamed from: f  reason: collision with root package name */
    Long f4855f;

    /* renamed from: g  reason: collision with root package name */
    WeakReference<View> f4856g;

    public l90(o1 o1Var) {
        this.f4851b = o1Var;
    }

    private final void c() {
        this.f4854e = null;
        this.f4855f = null;
        WeakReference<View> weakReference = this.f4856g;
        if (weakReference != null) {
            View view = weakReference.get();
            this.f4856g = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }

    public final void a() {
        if (this.f4852c != null && this.f4855f != null) {
            c();
            try {
                this.f4852c.x1();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(qc0 qc0) {
        this.f4852c = qc0;
        e0 e0Var = this.f4853d;
        if (e0Var != null) {
            this.f4851b.a("/unconfirmedClick", e0Var);
        }
        this.f4853d = new m90(this);
        this.f4851b.b("/unconfirmedClick", this.f4853d);
    }

    public final qc0 b() {
        return this.f4852c;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f4856g;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f4854e == null || this.f4855f == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f4854e);
                    jSONObject.put("time_interval", x0.m().a() - this.f4855f.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f4851b.a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e2) {
                    qc.b("Unable to dispatch sendMessageToNativeJs event", e2);
                }
            }
            c();
        }
    }
}
