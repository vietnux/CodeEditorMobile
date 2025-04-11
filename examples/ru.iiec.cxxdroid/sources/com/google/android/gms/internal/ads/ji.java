package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.x0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@k2
public class ji extends WebView implements oi, qi, si, ti {

    /* renamed from: b  reason: collision with root package name */
    private final List<oi> f4714b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<ti> f4715c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<qi> f4716d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<si> f4717e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final yh f4718f;

    /* renamed from: g  reason: collision with root package name */
    protected final WebViewClient f4719g;

    public ji(yh yhVar) {
        super(yhVar);
        this.f4718f = yhVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        x0.h().a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            qc.b("Unable to enable Javascript.", e2);
        }
        setLayerType(1, null);
        this.f4719g = new ki(this, this, this, this);
        super.setWebViewClient(this.f4719g);
    }

    /* access modifiers changed from: protected */
    public final yh a() {
        return this.f4718f;
    }

    @Override // com.google.android.gms.internal.ads.qi
    public final void a(li liVar) {
        for (qi qiVar : this.f4716d) {
            qiVar.a(liVar);
        }
    }

    public final void a(oi oiVar) {
        this.f4714b.add(oiVar);
    }

    public final void a(qi qiVar) {
        this.f4716d.add(qiVar);
    }

    public final void a(si siVar) {
        this.f4717e.add(siVar);
    }

    public final void a(ti tiVar) {
        this.f4715c.add(tiVar);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            l9.e("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    public void b(String str) {
        pi.a(this, str);
    }

    @Override // com.google.android.gms.internal.ads.oi
    public final boolean b(li liVar) {
        for (oi oiVar : this.f4714b) {
            if (oiVar.b(liVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.si
    public void c(li liVar) {
        for (si siVar : this.f4717e) {
            siVar.c(liVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final WebResourceResponse d(li liVar) {
        for (ti tiVar : this.f4715c) {
            WebResourceResponse d2 = tiVar.d(liVar);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            x0.j().a(e2, "CoreWebView.loadUrl");
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }
}
