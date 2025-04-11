package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.x0;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

@k2
@TargetApi(8)
public class aa {
    private aa() {
    }

    public static boolean a(lg lgVar) {
        if (lgVar == null) {
            return false;
        }
        lgVar.onPause();
        return true;
    }

    public static boolean b(lg lgVar) {
        if (lgVar == null) {
            return false;
        }
        lgVar.onResume();
        return true;
    }

    public static boolean f() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        throw null;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f2) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse a(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public mg a(lg lgVar, boolean z) {
        throw null;
    }

    public String a(Context context) {
        return "";
    }

    public String a(SslError sslError) {
        throw null;
    }

    public Set<String> a(Uri uri) {
        throw null;
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean a(DownloadManager.Request request) {
        throw null;
    }

    public boolean a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean a(Window window) {
        throw null;
    }

    public int b() {
        throw null;
    }

    public void b(Context context) {
    }

    public boolean b(View view) {
        throw null;
    }

    public int c() {
        return 5;
    }

    public CookieManager c(Context context) {
        if (f()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            qc.b("Failed to obtain CookieManager.", th);
            x0.j().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public boolean c(View view) {
        throw null;
    }

    public ViewGroup.LayoutParams d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int e() {
        throw null;
    }
}
