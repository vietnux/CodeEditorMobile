package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* access modifiers changed from: package-private */
public final class k10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private ValueCallback<String> f4744b = new l10(this);

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c10 f4745c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WebView f4746d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f4747e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i10 f4748f;

    k10(i10 i10, c10 c10, WebView webView, boolean z) {
        this.f4748f = i10;
        this.f4745c = c10;
        this.f4746d = webView;
        this.f4747e = z;
    }

    public final void run() {
        if (this.f4746d.getSettings().getJavaScriptEnabled()) {
            try {
                this.f4746d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f4744b);
            } catch (Throwable unused) {
                this.f4744b.onReceiveValue("");
            }
        }
    }
}
