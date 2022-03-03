package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.o.a;
import com.google.android.gms.common.util.o;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class xg extends FrameLayout implements lg {

    /* renamed from: b  reason: collision with root package name */
    private final lg f6024b;

    /* renamed from: c  reason: collision with root package name */
    private final bf f6025c;

    public xg(lg lgVar) {
        super(lgVar.getContext());
        this.f6024b = lgVar;
        this.f6025c = new bf(lgVar.a0(), this, this);
        addView(this.f6024b.getView());
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final String A0() {
        return this.f6024b.A0();
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final void A1() {
        this.f6024b.A1();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int B0() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final void B1() {
        this.f6024b.B1();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int C0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final v80 D0() {
        return this.f6024b.D0();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final void E0() {
        this.f6024b.E0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final th M() {
        return this.f6024b.M();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void O() {
        TextView textView = new TextView(getContext());
        Resources b2 = x0.j().b();
        textView.setText(b2 != null ? b2.getString(a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final d P() {
        return this.f6024b.P();
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final w80 Q() {
        return this.f6024b.Q();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void R() {
        this.f6024b.R();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void S() {
        this.f6025c.a();
        this.f6024b.S();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void T() {
        this.f6024b.T();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void U() {
        this.f6024b.U();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final WebViewClient V() {
        return this.f6024b.V();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final String W() {
        return this.f6024b.W();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final boolean Y() {
        return this.f6024b.Y();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void Z() {
        setBackgroundColor(0);
        this.f6024b.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(Context context) {
        this.f6024b.a(context);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(c cVar) {
        this.f6024b.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(d dVar) {
        this.f6024b.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final void a(bh bhVar) {
        this.f6024b.a(bhVar);
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final void a(p00 p00) {
        this.f6024b.a(p00);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(y90 y90) {
        this.f6024b.a(y90);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(zh zhVar) {
        this.f6024b.a(zhVar);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str) {
        this.f6024b.a(str);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, e0<? super lg> e0Var) {
        this.f6024b.a(str, e0Var);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, o<e0<? super lg>> oVar) {
        this.f6024b.a(str, oVar);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, String str2, String str3) {
        this.f6024b.a(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, Map<String, ?> map) {
        this.f6024b.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, JSONObject jSONObject) {
        this.f6024b.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final void a(boolean z) {
        this.f6024b.a(z);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z, int i2) {
        this.f6024b.a(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z, int i2, String str) {
        this.f6024b.a(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z, int i2, String str, String str2) {
        this.f6024b.a(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final Context a0() {
        return this.f6024b.a0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void b(d dVar) {
        this.f6024b.b(dVar);
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str) {
        this.f6024b.b(str);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void b(String str, e0<? super lg> e0Var) {
        this.f6024b.b(str, e0Var);
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        this.f6024b.b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.hh, com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final Activity b0() {
        return this.f6024b.b0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void c(boolean z) {
        this.f6024b.c(z);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final boolean c0() {
        return this.f6024b.c0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void d(boolean z) {
        this.f6024b.d(z);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void destroy() {
        this.f6024b.destroy();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void e(int i2) {
        this.f6024b.e(i2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void e(boolean z) {
        this.f6024b.e(z);
    }

    @Override // com.google.android.gms.internal.ads.ih, com.google.android.gms.internal.ads.lg
    public final boolean e0() {
        return this.f6024b.e0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void g(boolean z) {
        this.f6024b.g(z);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.oh
    public final zh g0() {
        return this.f6024b.g0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final View.OnClickListener getOnClickListener() {
        return this.f6024b.getOnClickListener();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final int getRequestedOrientation() {
        return this.f6024b.getRequestedOrientation();
    }

    @Override // com.google.android.gms.internal.ads.sh, com.google.android.gms.internal.ads.lg
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final WebView getWebView() {
        return this.f6024b.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final y90 h0() {
        return this.f6024b.h0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final boolean i0() {
        return this.f6024b.i0();
    }

    @Override // com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.lg
    public final cx l0() {
        return this.f6024b.l0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void loadData(String str, String str2, String str3) {
        this.f6024b.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6024b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void loadUrl(String str) {
        this.f6024b.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final d o0() {
        return this.f6024b.o0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void onPause() {
        this.f6025c.b();
        this.f6024b.onPause();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void onResume() {
        this.f6024b.onResume();
    }

    @Override // com.google.android.gms.internal.ads.rh, com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final sc p0() {
        return this.f6024b.p0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void r0() {
        this.f6024b.r0();
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final bh s0() {
        return this.f6024b.s0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6024b.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6024b.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setRequestedOrientation(int i2) {
        this.f6024b.setRequestedOrientation(i2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6024b.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6024b.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void stopLoading() {
        this.f6024b.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final boolean t0() {
        return this.f6024b.t0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void v0() {
        this.f6024b.v0();
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final u1 x0() {
        return this.f6024b.x0();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final boolean y0() {
        return this.f6024b.y0();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final bf z0() {
        return this.f6025c;
    }
}
