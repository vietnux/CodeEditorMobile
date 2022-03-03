package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@k2
@TargetApi(11)
public final class jh extends kh {
    public jh(lg lgVar, boolean z) {
        super(lgVar, z);
    }

    @Override // android.webkit.WebViewClient, com.google.android.gms.internal.ads.mg
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
