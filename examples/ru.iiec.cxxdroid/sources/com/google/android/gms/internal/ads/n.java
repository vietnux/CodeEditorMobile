package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@k2
public class n {
    private final lg a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5005b;

    public n(lg lgVar) {
        this(lgVar, "");
    }

    public n(lg lgVar, String str) {
        this.a = lgVar;
        this.f5005b = str;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        try {
            this.a.a("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            qc.b("Error occured while dispatching size change.", e2);
        }
    }

    public final void a(int i2, int i3, int i4, int i5, float f2, int i6) {
        try {
            this.a.a("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", (double) f2).put("rotation", i6));
        } catch (JSONException e2) {
            qc.b("Error occured while obtaining screen information.", e2);
        }
    }

    public final void a(String str) {
        try {
            this.a.a("onError", new JSONObject().put("message", str).put("action", this.f5005b));
        } catch (JSONException e2) {
            qc.b("Error occurred while dispatching error event.", e2);
        }
    }

    public final void b(int i2, int i3, int i4, int i5) {
        try {
            this.a.a("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            qc.b("Error occured while dispatching default position.", e2);
        }
    }

    public final void b(String str) {
        try {
            this.a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            qc.b("Error occured while dispatching ready Event.", e2);
        }
    }

    public final void c(String str) {
        try {
            this.a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            qc.b("Error occured while dispatching state change.", e2);
        }
    }
}
