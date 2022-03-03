package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import com.google.android.gms.ads.internal.x0;

@k2
public class mi extends ji {

    /* renamed from: h  reason: collision with root package name */
    private boolean f4969h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4970i;

    public mi(yh yhVar) {
        super(yhVar);
        x0.j().j();
    }

    private final synchronized void c() {
        if (!this.f4970i) {
            this.f4970i = true;
            x0.j().k();
        }
    }

    public final synchronized void S() {
        l9.e("Destroying WebView!");
        c();
        rd.a.execute(new ni(this));
    }

    public final synchronized boolean Y() {
        return this.f4969h;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    public void b(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.si, com.google.android.gms.internal.ads.ji
    public final synchronized void c(li liVar) {
        if (Y()) {
            l9.e("Blank page loaded, 1...");
            S();
            return;
        }
        super.c(liVar);
    }

    public synchronized void destroy() {
        if (!this.f4969h) {
            this.f4969h = true;
            b(false);
            l9.e("Initiating WebView self destruct sequence in 3...");
            l9.e("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e2) {
                x0.j().a(e2, "AdWebViewImpl.loadUrlUnsafe");
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (Y()) {
            qc.d("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            synchronized (this) {
                if (!Y()) {
                    b(true);
                }
                c();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!Y()) {
            super.loadData(str, str2, str3);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!Y()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ji
    public synchronized void loadUrl(String str) {
        if (!Y()) {
            super.loadUrl(str);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!Y()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!Y()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!Y()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !Y() && super.onTouchEvent(motionEvent);
    }

    public void stopLoading() {
        if (!Y()) {
            super.stopLoading();
        }
    }
}
