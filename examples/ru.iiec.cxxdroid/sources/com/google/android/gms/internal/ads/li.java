package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@k2
public final class li {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4886b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f4887c;

    @TargetApi(21)
    public li(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public li(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private li(String str, Uri uri, String str2, Map<String, String> map) {
        this.a = str;
        this.f4886b = uri;
        this.f4887c = map == null ? Collections.emptyMap() : map;
    }
}
