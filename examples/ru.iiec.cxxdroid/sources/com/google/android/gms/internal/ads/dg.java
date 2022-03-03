package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.v1;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;

@k2
@TargetApi(11)
public final class dg extends WebChromeClient {
    private final lg a;

    public dg(lg lgVar) {
        this.a = lgVar;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof lg)) {
            return webView.getContext();
        }
        lg lgVar = (lg) webView;
        Activity b0 = lgVar.b0();
        return b0 != null ? b0 : lgVar.getContext();
    }

    private final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        v1 h2;
        try {
            if (this.a == null || this.a.M() == null || this.a.M().h() == null || (h2 = this.a.M().h()) == null || h2.b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    create = builder.setView(linearLayout).setPositiveButton(17039370, new jg(jsPromptResult, editText)).setNegativeButton(17039360, new ig(jsPromptResult)).setOnCancelListener(new hg(jsPromptResult)).create();
                } else {
                    create = builder.setMessage(str3).setPositiveButton(17039370, new gg(jsResult)).setNegativeButton(17039360, new fg(jsResult)).setOnCancelListener(new eg(jsResult)).create();
                }
                create.show();
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            h2.a(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e2) {
            qc.c("Fail to display Dialog.", e2);
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof lg)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            d P = ((lg) webView).P();
            if (P == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                P.f2();
                return;
            }
        }
        qc.d(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = kg.a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            qc.a(sb2);
        } else if (i2 == 2) {
            qc.d(sb2);
        } else if (i2 == 3 || i2 == 4 || i2 != 5) {
            qc.c(sb2);
        } else {
            qc.b(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.V() != null) {
            webView2.setWebViewClient(this.a.V());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 != 0) {
            if (j3 == 0) {
                j2 = Math.min(j2 + Math.min(131072L, j5), 1048576L);
            } else if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        } else if (j3 > j5 || j3 > 1048576) {
            j3 = 0;
        }
        quotaUpdater.updateQuota(j3);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            x0.f();
            if (!u9.b(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                x0.f();
                if (!u9.b(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        d P = this.a.P();
        if (P == null) {
            qc.d("Could not get ad overlay when hiding custom view.");
        } else {
            P.g2();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (n.i()) {
            if (!((Boolean) a50.g().a(k80.A0)).booleanValue()) {
                lg lgVar = this.a;
                if (lgVar == null || lgVar.M() == null || this.a.M().g() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a2 = this.a.M().g().a(permissionRequest.getResources());
                if (a2.length > 0) {
                    permissionRequest.grant(a2);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        d P = this.a.P();
        if (P == null) {
            qc.d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        P.a(view, customViewCallback);
        P.setRequestedOrientation(i2);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
