package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.n;

/* access modifiers changed from: package-private */
@k2
public final class pi {
    private static Boolean a;

    private pi() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (!n.g() || !a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    @TargetApi(19)
    private static boolean a(WebView webView) {
        boolean booleanValue;
        synchronized (pi.class) {
            if (a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    a = true;
                } catch (IllegalStateException unused) {
                    a = false;
                }
            }
            booleanValue = a.booleanValue();
        }
        return booleanValue;
    }
}
