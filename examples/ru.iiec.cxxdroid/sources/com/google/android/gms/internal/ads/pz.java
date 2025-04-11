package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class pz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5271b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f5272c;

    /* renamed from: d  reason: collision with root package name */
    private final b10 f5273d;

    /* renamed from: e  reason: collision with root package name */
    protected final nz f5274e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5275f;

    /* renamed from: g  reason: collision with root package name */
    private final WindowManager f5276g;

    /* renamed from: h  reason: collision with root package name */
    private final PowerManager f5277h;

    /* renamed from: i  reason: collision with root package name */
    private final KeyguardManager f5278i;

    /* renamed from: j  reason: collision with root package name */
    private final DisplayMetrics f5279j;

    /* renamed from: k  reason: collision with root package name */
    private xz f5280k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5281l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5282m = false;
    private boolean n = false;
    private boolean o;
    private boolean p;
    private BroadcastReceiver q;
    private final HashSet<mz> r = new HashSet<>();
    private ub s;
    private final HashSet<l00> t = new HashSet<>();
    private final Rect u = new Rect();
    private final sz v;
    private float w;

    public pz(Context context, n40 n40, q8 q8Var, sc scVar, b10 b10) {
        new WeakReference(q8Var);
        this.f5273d = b10;
        this.f5272c = new WeakReference<>(null);
        this.o = true;
        this.p = false;
        this.s = new ub(200);
        this.f5274e = new nz(UUID.randomUUID().toString(), scVar, n40.f5046b, q8Var.f5328k, q8Var.a(), n40.f5053i);
        this.f5276g = (WindowManager) context.getSystemService("window");
        this.f5277h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f5278i = (KeyguardManager) context.getSystemService("keyguard");
        this.f5275f = context;
        this.v = new sz(this, new Handler());
        this.f5275f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.v);
        this.f5279j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f5276g.getDefaultDisplay();
        this.u.right = defaultDisplay.getWidth();
        this.u.bottom = defaultDisplay.getHeight();
        d();
    }

    private static int a(int i2, DisplayMetrics displayMetrics) {
        return (int) (((float) i2) / displayMetrics.density);
    }

    private final JSONObject a(View view, Boolean bool) {
        if (view == null) {
            return j().put("isAttachedToWindow", false).put("isScreenOn", g()).put("isVisible", false);
        }
        boolean a = x0.h().a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e2) {
            qc.b("Failure getting view location.", e2);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject j2 = j();
        j2.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", a(this.u.top, this.f5279j)).put("bottom", a(this.u.bottom, this.f5279j)).put("left", a(this.u.left, this.f5279j)).put("right", a(this.u.right, this.f5279j))).put("adBox", new JSONObject().put("top", a(rect.top, this.f5279j)).put("bottom", a(rect.bottom, this.f5279j)).put("left", a(rect.left, this.f5279j)).put("right", a(rect.right, this.f5279j))).put("globalVisibleBox", new JSONObject().put("top", a(rect2.top, this.f5279j)).put("bottom", a(rect2.bottom, this.f5279j)).put("left", a(rect2.left, this.f5279j)).put("right", a(rect2.right, this.f5279j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", a(rect3.top, this.f5279j)).put("bottom", a(rect3.bottom, this.f5279j)).put("left", a(rect3.left, this.f5279j)).put("right", a(rect3.right, this.f5279j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", a(rect4.top, this.f5279j)).put("bottom", a(rect4.bottom, this.f5279j)).put("left", a(rect4.left, this.f5279j)).put("right", a(rect4.right, this.f5279j))).put("screenDensity", (double) this.f5279j.density);
        j2.put("isVisible", (bool == null ? Boolean.valueOf(x0.f().a(view, this.f5277h, this.f5278i)) : bool).booleanValue());
        return j2;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = a(jSONObject);
            ArrayList arrayList = new ArrayList(this.t);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((l00) obj).a(a, z);
            }
        } catch (Throwable th) {
            qc.b("Skipping active view message.", th);
        }
    }

    private final boolean g() {
        return Build.VERSION.SDK_INT >= 20 ? this.f5277h.isInteractive() : this.f5277h.isScreenOn();
    }

    private final void h() {
        xz xzVar = this.f5280k;
        if (xzVar != null) {
            xzVar.a(this);
        }
    }

    private final void i() {
        ViewTreeObserver viewTreeObserver = this.f5272c.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f5274e.b()).put("activeViewJSON", this.f5274e.c()).put("timestamp", x0.m().b()).put("adFormat", this.f5274e.a()).put("hashCode", this.f5274e.d()).put("isMraid", this.f5274e.e()).put("isStopped", this.n).put("isPaused", this.f5282m).put("isNative", this.f5274e.f()).put("isScreenOn", g()).put("appMuted", x0.E().b()).put("appVolume", (double) x0.E().a()).put("deviceVolume", (double) this.w);
        return jSONObject;
    }

    public final void a() {
        synchronized (this.f5271b) {
            this.f5282m = true;
            a(3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        boolean z;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        synchronized (this.f5271b) {
            Iterator<l00> it = this.t.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (this.o) {
                    View c2 = this.f5273d.c();
                    boolean z2 = c2 != null && x0.f().a(c2, this.f5277h, this.f5278i);
                    boolean z3 = c2 != null && z2 && c2.getGlobalVisibleRect(new Rect(), null);
                    if (this.f5273d.a()) {
                        e();
                    } else if (i2 != 1 || this.s.a() || z3 != this.p) {
                        if (z3 || this.p || i2 != 1) {
                            try {
                                a(a(c2, Boolean.valueOf(z2)), false);
                                this.p = z3;
                            } catch (RuntimeException | JSONException e2) {
                                qc.a("Active view update failed.", e2);
                            }
                            View c3 = this.f5273d.b().c();
                            if (!(c3 == null || (viewTreeObserver2 = c3.getViewTreeObserver()) == (viewTreeObserver = this.f5272c.get()))) {
                                i();
                                if (!this.f5281l || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                                    this.f5281l = true;
                                    viewTreeObserver2.addOnScrollChangedListener(this);
                                    viewTreeObserver2.addOnGlobalLayoutListener(this);
                                }
                                this.f5272c = new WeakReference<>(viewTreeObserver2);
                            }
                            h();
                        }
                    }
                }
            }
        }
    }

    public final void a(l00 l00) {
        if (this.t.isEmpty()) {
            synchronized (this.f5271b) {
                if (this.q == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.q = new qz(this);
                    x0.F().a(this.f5275f, this.q, intentFilter);
                }
            }
            a(3);
        }
        this.t.add(l00);
        try {
            l00.a(a(a(this.f5273d.c(), (Boolean) null)), false);
        } catch (JSONException e2) {
            qc.b("Skipping measurement update for new client.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(l00 l00, Map<String, String> map) {
        String valueOf = String.valueOf(this.f5274e.d());
        qc.b(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
        b(l00);
    }

    public final void a(xz xzVar) {
        synchronized (this.f5271b) {
            this.f5280k = xzVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f5274e.d());
    }

    public final void b() {
        synchronized (this.f5271b) {
            this.f5282m = false;
            a(3);
        }
    }

    public final void b(l00 l00) {
        this.t.remove(l00);
        l00.b();
        if (this.t.isEmpty()) {
            synchronized (this.f5271b) {
                i();
                synchronized (this.f5271b) {
                    if (this.q != null) {
                        try {
                            x0.F().a(this.f5275f, this.q);
                        } catch (IllegalStateException e2) {
                            qc.b("Failed trying to unregister the receiver", e2);
                        } catch (Exception e3) {
                            x0.j().a(e3, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.q = null;
                    }
                }
                this.f5275f.getContentResolver().unregisterContentObserver(this.v);
                int i2 = 0;
                this.o = false;
                h();
                ArrayList arrayList = new ArrayList(this.t);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    b((l00) obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Map<String, String> map) {
        a(3);
    }

    public final void c() {
        synchronized (this.f5271b) {
            this.n = true;
            a(3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator<mz> it = this.r.iterator();
            while (it.hasNext()) {
                it.next().a(this, z);
            }
        }
    }

    public final void d() {
        this.w = ma.a(this.f5275f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5271b
            monitor-enter(r0)
            boolean r1 = r4.o     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0042
            org.json.JSONObject r1 = r4.j()     // Catch:{ JSONException -> 0x001e, RuntimeException -> 0x0017 }
            java.lang.String r2 = "doneReasonCode"
            java.lang.String r3 = "u"
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x001e, RuntimeException -> 0x0017 }
            r2 = 1
            r4.a(r1, r2)     // Catch:{ JSONException -> 0x001e, RuntimeException -> 0x0017 }
            goto L_0x0022
        L_0x0017:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L_0x001a:
            com.google.android.gms.internal.ads.qc.b(r2, r1)
            goto L_0x0022
        L_0x001e:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L_0x001a
        L_0x0022:
            java.lang.String r1 = "Untracking ad unit: "
            com.google.android.gms.internal.ads.nz r2 = r4.f5274e
            java.lang.String r2 = r2.d()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.concat(r2)
            goto L_0x003f
        L_0x0039:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x003f:
            com.google.android.gms.internal.ads.qc.b(r1)
        L_0x0042:
            monitor-exit(r0)
            return
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pz.e():void");
    }

    public final boolean f() {
        boolean z;
        synchronized (this.f5271b) {
            z = this.o;
        }
        return z;
    }

    public final void onGlobalLayout() {
        a(2);
    }

    public final void onScrollChanged() {
        a(1);
    }
}
