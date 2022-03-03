package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* access modifiers changed from: package-private */
@k2
public final class ki extends WebViewClient {
    private final oi a;

    /* renamed from: b  reason: collision with root package name */
    private final ti f4825b;

    /* renamed from: c  reason: collision with root package name */
    private final qi f4826c;

    /* renamed from: d  reason: collision with root package name */
    private final si f4827d;

    /* renamed from: e  reason: collision with root package name */
    private final ui f4828e = new ui();

    ki(oi oiVar, ti tiVar, qi qiVar, si siVar) {
        this.a = oiVar;
        this.f4825b = tiVar;
        this.f4826c = qiVar;
        this.f4827d = siVar;
    }

    private final boolean a(li liVar) {
        return this.a.b(liVar);
    }

    private final WebResourceResponse b(li liVar) {
        return this.f4825b.d(liVar);
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            l9.e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            this.f4826c.a(new li(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.f4827d.c(new li(str));
        }
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.f4828e.a(i2, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f4828e.a(sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return b(new li(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return b(new li(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return a(new li(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return a(new li(str));
    }
}
