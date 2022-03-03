package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class j {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4651b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4652c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4653d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4654e;

    private j(l lVar) {
        this.a = lVar.a;
        this.f4651b = lVar.f4839b;
        this.f4652c = lVar.f4840c;
        this.f4653d = lVar.f4841d;
        this.f4654e = lVar.f4842e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.f4651b).put("calendar", this.f4652c).put("storePicture", this.f4653d).put("inlineVideo", this.f4654e);
        } catch (JSONException e2) {
            qc.b("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
