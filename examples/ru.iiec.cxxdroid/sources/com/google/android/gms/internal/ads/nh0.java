package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

@k2
public final class nh0 {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final mh0<JSONObject> f5099b = new ph0();

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.ph0, com.google.android.gms.internal.ads.mh0<org.json.JSONObject>] */
    static {
        kh0 kh0 = oh0.a;
    }

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}
