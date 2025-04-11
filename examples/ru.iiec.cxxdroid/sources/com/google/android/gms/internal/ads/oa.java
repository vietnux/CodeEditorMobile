package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.List;

@k2
public final class oa {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private String f5137b;

    /* renamed from: c  reason: collision with root package name */
    private String f5138c;

    /* renamed from: d  reason: collision with root package name */
    private String f5139d;

    /* renamed from: e  reason: collision with root package name */
    private String f5140e;

    /* renamed from: f  reason: collision with root package name */
    private final float f5141f;

    /* renamed from: g  reason: collision with root package name */
    private float f5142g;

    /* renamed from: h  reason: collision with root package name */
    private float f5143h;

    /* renamed from: i  reason: collision with root package name */
    private float f5144i;

    /* renamed from: j  reason: collision with root package name */
    private int f5145j;

    /* renamed from: k  reason: collision with root package name */
    private int f5146k;

    /* renamed from: l  reason: collision with root package name */
    private float f5147l;

    /* renamed from: m  reason: collision with root package name */
    private float f5148m;
    private float n;
    private float o;
    private Handler p;
    private Runnable q;

    public oa(Context context) {
        this.f5145j = 0;
        this.q = new pa(this);
        this.a = context;
        this.f5141f = context.getResources().getDisplayMetrics().density;
        this.f5146k = ViewConfiguration.get(this.a).getScaledTouchSlop();
        x0.u().b();
        this.p = x0.u().a();
    }

    public oa(Context context, String str) {
        this(context);
        this.f5137b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private final void a(int i2, float f2, float f3) {
        if (i2 == 0) {
            this.f5145j = 0;
            this.f5142g = f2;
            this.f5143h = f3;
            this.f5144i = f3;
            return;
        }
        int i3 = this.f5145j;
        if (i3 != -1) {
            if (i2 == 2) {
                if (f3 > this.f5143h) {
                    this.f5143h = f3;
                } else if (f3 < this.f5144i) {
                    this.f5144i = f3;
                }
                if (this.f5143h - this.f5144i > this.f5141f * 30.0f) {
                    this.f5145j = -1;
                    return;
                }
                int i4 = this.f5145j;
                if (i4 == 0 || i4 == 2 ? f2 - this.f5142g >= this.f5141f * 50.0f : !(!(i4 == 1 || i4 == 3) || f2 - this.f5142g > this.f5141f * -50.0f)) {
                    this.f5142g = f2;
                    this.f5145j++;
                }
                int i5 = this.f5145j;
                if (i5 == 1 || i5 == 3) {
                    if (f2 > this.f5142g) {
                        this.f5142g = f2;
                    }
                } else if (i5 == 2 && f2 < this.f5142g) {
                    this.f5142g = f2;
                }
            } else if (i2 == 1 && i3 == 4) {
                a();
            }
        }
    }

    private final boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(this.f5147l - f2) < ((float) this.f5146k) && Math.abs(this.f5148m - f3) < ((float) this.f5146k) && Math.abs(this.n - f4) < ((float) this.f5146k) && Math.abs(this.o - f5) < ((float) this.f5146k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa.e():void");
    }

    public final void a() {
        try {
            if (!((Boolean) a50.g().a(k80.O2)).booleanValue()) {
                if (!((Boolean) a50.g().a(k80.N2)).booleanValue()) {
                    e();
                    return;
                }
            }
            if (!(this.a instanceof Activity)) {
                qc.c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(x0.p().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = x0.p().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a2 = a((List<String>) arrayList, "Ad Information", true);
            int a3 = a(arrayList, str, ((Boolean) a50.g().a(k80.N2)).booleanValue());
            int a4 = a(arrayList, str2, ((Boolean) a50.g().a(k80.O2)).booleanValue());
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a, x0.h().e());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new qa(this, a2, a3, a4));
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            if (l9.a()) {
                Log.v("Ads", "", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (i5 == i2) {
            e();
            return;
        }
        if (i5 == i3) {
            if (((Boolean) a50.g().a(k80.N2)).booleanValue()) {
                qc.b("Debug mode [Creative Preview] selected.");
                s9.a(new ta(this));
                return;
            }
        }
        if (i5 == i4) {
            if (((Boolean) a50.g().a(k80.O2)).booleanValue()) {
                qc.b("Debug mode [Troubleshooting] selected.");
                s9.a(new ua(this));
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (((Boolean) a50.g().a(k80.P2)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f5145j = 0;
                this.f5147l = motionEvent.getX();
                this.f5148m = motionEvent.getY();
                return;
            }
            int i2 = this.f5145j;
            if (i2 != -1) {
                boolean z = true;
                if (i2 == 0 && actionMasked == 5) {
                    this.f5145j = 5;
                    this.n = motionEvent.getX(1);
                    this.o = motionEvent.getY(1);
                    this.p.postDelayed(this.q, ((Long) a50.g().a(k80.Q2)).longValue());
                } else if (this.f5145j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i3 = 0; i3 < historySize; i3++) {
                                if (!a(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3))) {
                                    z2 = true;
                                }
                            }
                            if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f5145j = -1;
                        this.p.removeCallbacks(this.q);
                    }
                }
            }
        } else {
            int historySize2 = motionEvent.getHistorySize();
            for (int i4 = 0; i4 < historySize2; i4++) {
                a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i4), motionEvent.getHistoricalY(0, i4));
            }
            a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
        }
    }

    public final void a(String str) {
        this.f5138c = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
        x0.f();
        u9.a(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        x0.p().a(this.a, this.f5138c, this.f5139d, this.f5140e);
    }

    public final void b(String str) {
        this.f5139d = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        x0.p().a(this.a, this.f5138c, this.f5139d);
    }

    public final void c(String str) {
        this.f5137b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f5145j = 4;
        a();
    }

    public final void d(String str) {
        this.f5140e = str;
    }
}
