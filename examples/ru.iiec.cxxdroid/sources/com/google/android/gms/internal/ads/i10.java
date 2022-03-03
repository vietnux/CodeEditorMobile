package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@k2
@TargetApi(14)
public final class i10 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4576b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4577c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4578d;

    /* renamed from: e  reason: collision with root package name */
    private final d10 f4579e;

    /* renamed from: f  reason: collision with root package name */
    private final i2 f4580f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4581g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4582h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4583i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4584j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4585k;

    /* renamed from: l  reason: collision with root package name */
    private final int f4586l;

    /* renamed from: m  reason: collision with root package name */
    private final int f4587m;
    private final int n;
    private final String o;
    private final boolean p;

    public i10(d10 d10, i2 i2Var) {
        this.f4579e = d10;
        this.f4580f = i2Var;
        this.f4578d = new Object();
        this.f4582h = ((Integer) a50.g().a(k80.R)).intValue();
        this.f4583i = ((Integer) a50.g().a(k80.S)).intValue();
        this.f4584j = ((Integer) a50.g().a(k80.T)).intValue();
        this.f4585k = ((Integer) a50.g().a(k80.U)).intValue();
        this.f4586l = ((Integer) a50.g().a(k80.X)).intValue();
        this.f4587m = ((Integer) a50.g().a(k80.Z)).intValue();
        this.n = ((Integer) a50.g().a(k80.a0)).intValue();
        this.f4581g = ((Integer) a50.g().a(k80.V)).intValue();
        this.o = (String) a50.g().a(k80.c0);
        this.p = ((Boolean) a50.g().a(k80.e0)).booleanValue();
        setName("ContentFetchTask");
    }

    private final m10 a(View view, c10 c10) {
        boolean z;
        if (view == null) {
            return new m10(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new m10(this, 0, 0);
            }
            c10.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new m10(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof lg)) {
            c10.h();
            WebView webView = (WebView) view;
            if (!n.g()) {
                z = false;
            } else {
                c10.h();
                webView.post(new k10(this, c10, webView, globalVisibleRect));
                z = true;
            }
            return z ? new m10(this, 0, 1) : new m10(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new m10(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                m10 a = a(viewGroup.getChildAt(i4), c10);
                i2 += a.a;
                i3 += a.f4935b;
            }
            return new m10(this, i2, i3);
        }
    }

    private static boolean e() {
        try {
            Context b2 = x0.i().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            x0.j().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void f() {
        synchronized (this.f4578d) {
            this.f4577c = true;
            boolean z = this.f4577c;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            qc.b(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.f4578d) {
            this.f4577c = false;
            this.f4578d.notifyAll();
            qc.b("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        try {
            c10 c10 = new c10(this.f4582h, this.f4583i, this.f4584j, this.f4585k, this.f4586l, this.f4587m, this.n);
            Context b2 = x0.i().b();
            if (b2 != null && !TextUtils.isEmpty(this.o)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) a50.g().a(k80.b0), "id", b2.getPackageName()));
                if (str != null && str.equals(this.o)) {
                    return;
                }
            }
            m10 a = a(view, c10);
            c10.i();
            if (a.a != 0 || a.f4935b != 0) {
                if (a.f4935b != 0 || c10.j() != 0) {
                    if (a.f4935b != 0 || !this.f4579e.a(c10)) {
                        this.f4579e.c(c10);
                    }
                }
            }
        } catch (Exception e2) {
            qc.b("Exception in fetchContentOnUIThread", e2);
            this.f4580f.a(e2, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c10 c10, WebView webView, String str, boolean z) {
        c10.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.p || TextUtils.isEmpty(webView.getTitle())) {
                    c10.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    c10.a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (c10.c()) {
                this.f4579e.b(c10);
            }
        } catch (JSONException unused) {
            qc.b("Json string may be malformed.");
        } catch (Throwable th) {
            qc.a("Failed to get webview content.", th);
            this.f4580f.a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void b() {
        synchronized (this.f4578d) {
            if (this.f4576b) {
                qc.b("Content hash thread already started, quiting...");
                return;
            }
            this.f4576b = true;
            start();
        }
    }

    public final c10 c() {
        return this.f4579e.a();
    }

    public final boolean d() {
        return this.f4577c;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[LOOP:1: B:29:0x007f->B:40:0x007f, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i10.run():void");
    }
}
