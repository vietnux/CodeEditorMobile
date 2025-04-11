package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.qc;

/* access modifiers changed from: package-private */
public final class s0 extends WebViewClient {
    private final /* synthetic */ r0 a;

    s0(r0 r0Var) {
        this.a = r0Var;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.a.f3327h != null) {
            try {
                this.a.f3327h.c(0);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.a.g2())) {
            return false;
        }
        if (str.startsWith((String) a50.g().a(k80.t2))) {
            if (this.a.f3327h != null) {
                try {
                    this.a.f3327h.c(3);
                } catch (RemoteException e2) {
                    qc.d("#007 Could not call remote method.", e2);
                }
            }
            this.a.h(0);
            return true;
        }
        if (str.startsWith((String) a50.g().a(k80.u2))) {
            if (this.a.f3327h != null) {
                try {
                    this.a.f3327h.c(0);
                } catch (RemoteException e3) {
                    qc.d("#007 Could not call remote method.", e3);
                }
            }
            this.a.h(0);
            return true;
        }
        if (str.startsWith((String) a50.g().a(k80.v2))) {
            if (this.a.f3327h != null) {
                try {
                    this.a.f3327h.n0();
                } catch (RemoteException e4) {
                    qc.d("#007 Could not call remote method.", e4);
                }
            }
            this.a.h(this.a.o(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.a.f3327h != null) {
                try {
                    this.a.f3327h.j0();
                } catch (RemoteException e5) {
                    qc.d("#007 Could not call remote method.", e5);
                }
            }
            this.a.q(this.a.p(str));
            return true;
        }
    }
}
