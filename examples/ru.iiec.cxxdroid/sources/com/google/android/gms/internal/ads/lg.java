package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.common.util.o;

@k2
public interface lg extends q0, kf, hh, ih, mh, ph, rh, sh, q00, ff0, gg0 {
    th M();

    void O();

    d P();

    @Override // com.google.android.gms.internal.ads.kf
    w80 Q();

    void R();

    void S();

    void T();

    void U();

    WebViewClient V();

    String W();

    boolean Y();

    void Z();

    void a(Context context);

    void a(d dVar);

    @Override // com.google.android.gms.internal.ads.kf
    void a(bh bhVar);

    void a(y90 y90);

    void a(zh zhVar);

    void a(String str);

    void a(String str, e0<? super lg> e0Var);

    void a(String str, o<e0<? super lg>> oVar);

    void a(String str, String str2, String str3);

    Context a0();

    void b(d dVar);

    void b(String str, e0<? super lg> e0Var);

    @Override // com.google.android.gms.internal.ads.hh, com.google.android.gms.internal.ads.kf
    Activity b0();

    void c(boolean z);

    boolean c0();

    void d(boolean z);

    void destroy();

    void e(int i2);

    void e(boolean z);

    @Override // com.google.android.gms.internal.ads.ih
    boolean e0();

    void g(boolean z);

    @Override // com.google.android.gms.internal.ads.oh
    zh g0();

    @Override // com.google.android.gms.internal.ads.hh, com.google.android.gms.internal.ads.kf
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    View.OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    @Override // com.google.android.gms.internal.ads.sh
    View getView();

    WebView getWebView();

    int getWidth();

    y90 h0();

    boolean i0();

    @Override // com.google.android.gms.internal.ads.ph
    cx l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i2, int i3);

    d o0();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.rh, com.google.android.gms.internal.ads.kf
    sc p0();

    void r0();

    @Override // com.google.android.gms.internal.ads.kf
    bh s0();

    @Override // com.google.android.gms.internal.ads.kf
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i2);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    boolean t0();

    void v0();

    @Override // com.google.android.gms.internal.ads.kf
    u1 x0();

    boolean y0();
}
