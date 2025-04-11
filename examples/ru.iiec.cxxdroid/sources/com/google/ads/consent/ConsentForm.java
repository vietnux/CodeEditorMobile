package com.google.ads.consent;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import e.b.d.e;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;

public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    public static class Builder {
        private boolean adFreeOption = false;
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean nonPersonalizedAdsOption = false;
        private boolean personalizedAdsOption = false;

        public Builder(Context context2, URL url) {
            this.context = context2;
            this.appPrivacyPolicyURL = url;
            if (this.appPrivacyPolicyURL == null) {
                throw new IllegalArgumentException("Must provide valid app privacy policy url to create a ConsentForm");
            }
        }

        public Builder a(ConsentFormListener consentFormListener) {
            this.listener = consentFormListener;
            return this;
        }

        public ConsentForm a() {
            return new ConsentForm(this);
        }

        public Builder b() {
            this.adFreeOption = true;
            return this;
        }

        public Builder c() {
            this.nonPersonalizedAdsOption = true;
            return this;
        }

        public Builder d() {
            this.personalizedAdsOption = true;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    private ConsentForm(Builder builder) {
        this.context = builder.context;
        this.listener = builder.listener == null ? new ConsentFormListener(this) {
            /* class com.google.ads.consent.ConsentForm.AnonymousClass1 */
        } : builder.listener;
        this.personalizedAdsOption = builder.personalizedAdsOption;
        this.nonPersonalizedAdsOption = builder.nonPersonalizedAdsOption;
        this.adFreeOption = builder.adFreeOption;
        this.appPrivacyPolicyURL = builder.appPrivacyPolicyURL;
        this.dialog = new Dialog(this.context, 16973840);
        this.loadState = LoadState.NOT_READY;
        this.webView = new WebView(this.context);
        this.webView.setBackgroundColor(0);
        this.dialog.setContentView(this.webView);
        this.dialog.setCancelable(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebViewClient(new WebViewClient() {
            /* class com.google.ads.consent.ConsentForm.AnonymousClass2 */
            boolean isInternalRedirect;

            private void a(String str) {
                if (b(str)) {
                    this.isInternalRedirect = true;
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("action");
                    String queryParameter2 = parse.getQueryParameter("status");
                    String queryParameter3 = parse.getQueryParameter("url");
                    char c2 = 65535;
                    int hashCode = queryParameter.hashCode();
                    if (hashCode != -1370505102) {
                        if (hashCode != 150940456) {
                            if (hashCode == 1671672458 && queryParameter.equals("dismiss")) {
                                c2 = 1;
                            }
                        } else if (queryParameter.equals("browser")) {
                            c2 = 2;
                        }
                    } else if (queryParameter.equals("load_complete")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        ConsentForm.this.b((ConsentForm) queryParameter2);
                    } else if (c2 == 1) {
                        this.isInternalRedirect = false;
                        ConsentForm.this.a((ConsentForm) queryParameter2);
                    } else if (c2 == 2) {
                        ConsentForm.this.c(queryParameter3);
                    }
                }
            }

            private boolean b(String str) {
                return !TextUtils.isEmpty(str) && str.startsWith("consent://");
            }

            public void onLoadResource(WebView webView, String str) {
                a(str);
            }

            public void onPageFinished(WebView webView, String str) {
                if (!this.isInternalRedirect) {
                    ConsentForm.this.a((ConsentForm) webView);
                }
                super.onPageFinished(webView, str);
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                ConsentForm.this.loadState = LoadState.NOT_READY;
                ConsentForm.this.listener.a(webResourceError.toString());
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(24)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                String uri = webResourceRequest.getUrl().toString();
                if (!b(uri)) {
                    return false;
                }
                a(uri);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!b(str)) {
                    return false;
                }
                a(str);
                return true;
            }
        });
    }

    private static String a(Context context2) {
        Drawable applicationIcon = context2.getPackageManager().getApplicationIcon(context2.getApplicationInfo());
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("info", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("args", hashMap);
        return String.format("javascript:%s(%s)", str, new e().a(hashMap2));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(WebView webView2) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", b(this.context));
        hashMap.put("app_icon", a(this.context));
        hashMap.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        hashMap.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        hashMap.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        hashMap.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.a(this.context).d()));
        hashMap.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData g2 = ConsentInformation.a(this.context).g();
        hashMap.put("plat", g2.d());
        hashMap.put("consent_info", g2);
        webView2.loadUrl(a("setUpConsentDialog", new e().a(hashMap)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str) {
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(str)) {
            this.listener.a("No information provided.");
        } else if (str.contains("Error")) {
            this.listener.a(str);
        } else {
            char c2 = 65535;
            int hashCode = str.hashCode();
            boolean z = false;
            if (hashCode != -1152655096) {
                if (hashCode != -258041904) {
                    if (hashCode == 1666911234 && str.equals("non_personalized")) {
                        c2 = 1;
                    }
                } else if (str.equals("personalized")) {
                    c2 = 0;
                }
            } else if (str.equals("ad_free")) {
                c2 = 2;
            }
            if (c2 == 0) {
                consentStatus = ConsentStatus.PERSONALIZED;
            } else if (c2 != 1) {
                consentStatus = ConsentStatus.UNKNOWN;
                if (c2 == 2) {
                    z = true;
                }
            } else {
                consentStatus = ConsentStatus.NON_PERSONALIZED;
            }
            ConsentInformation.a(this.context).a(consentStatus, "form");
            this.listener.a(consentStatus, Boolean.valueOf(z));
        }
    }

    private static String b(Context context2) {
        return context2.getApplicationInfo().loadLabel(context2.getPackageManager()).toString();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.a("No information");
        } else if (str.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.a(str);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.listener.a("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            this.listener.a("No Activity found to handle browser intent.");
        }
    }

    public void a() {
        LoadState loadState2 = this.loadState;
        if (loadState2 == LoadState.LOADING) {
            this.listener.a("Cannot simultaneously load multiple consent forms.");
        } else if (loadState2 == LoadState.LOADED) {
            this.listener.a();
        } else {
            this.loadState = LoadState.LOADING;
            this.webView.loadUrl("file:///android_asset/consentform.html");
        }
    }

    public void b() {
        ConsentFormListener consentFormListener;
        String str;
        if (this.loadState != LoadState.LOADED) {
            consentFormListener = this.listener;
            str = "Consent form is not ready to be displayed.";
        } else if (ConsentInformation.a(this.context).e()) {
            consentFormListener = this.listener;
            str = "Error: tagged for under age of consent";
        } else {
            this.dialog.getWindow().setLayout(-1, -1);
            this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                /* class com.google.ads.consent.ConsentForm.AnonymousClass3 */

                public void onShow(DialogInterface dialogInterface) {
                    ConsentForm.this.listener.b();
                }
            });
            this.dialog.show();
            if (!this.dialog.isShowing()) {
                this.listener.a("Consent form could not be displayed.");
                return;
            }
            return;
        }
        consentFormListener.a(str);
    }
}
