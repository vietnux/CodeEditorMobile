package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.x0;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@k2
@TargetApi(11)
public class kh extends mg {
    public kh(lg lgVar, boolean z) {
        super(lgVar, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof lg)) {
            qc.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        lg lgVar = (lg) webView;
        b8 b8Var = this.w;
        if (b8Var != null) {
            b8Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (lgVar.M() != null) {
            lgVar.M().f();
        }
        String str2 = (String) a50.g().a(lgVar.g0().b() ? k80.K : lgVar.e0() ? k80.J : k80.I);
        x0.f();
        return u9.c(lgVar.getContext(), lgVar.p0().f5529b, str2);
    }
}
