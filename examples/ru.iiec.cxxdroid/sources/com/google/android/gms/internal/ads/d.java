package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.f;

@k2
public final class d extends n {

    /* renamed from: c  reason: collision with root package name */
    private String f4062c = "top-right";

    /* renamed from: d  reason: collision with root package name */
    private boolean f4063d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f4064e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f4065f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f4066g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f4067h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f4068i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f4069j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final Object f4070k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private final lg f4071l;

    /* renamed from: m  reason: collision with root package name */
    private final Activity f4072m;
    private zh n;
    private ImageView o;
    private LinearLayout p;
    private o q;
    private PopupWindow r;
    private RelativeLayout s;
    private ViewGroup t;

    static {
        f.b((Object[]) new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    }

    public d(lg lgVar, o oVar) {
        super(lgVar, "resize");
        this.f4071l = lgVar;
        this.f4072m = lgVar.b0();
        this.q = oVar;
    }

    private final void b(int i2, int i3) {
        a(i2, i3 - x0.f().b(this.f4072m)[0], this.f4069j, this.f4066g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] b() {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d.b():int[]");
    }

    public final void a(int i2, int i3) {
        this.f4064e = i2;
        this.f4065f = i3;
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.f4070k) {
            this.f4064e = i2;
            this.f4065f = i3;
            if (this.r != null && z) {
                int[] b2 = b();
                if (b2 != null) {
                    PopupWindow popupWindow = this.r;
                    a50.b();
                    int a = fc.a(this.f4072m, b2[0]);
                    a50.b();
                    popupWindow.update(a, fc.a(this.f4072m, b2[1]), this.r.getWidth(), this.r.getHeight());
                    b(b2[0], b2[1]);
                } else {
                    a(true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 840
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d.a(java.util.Map):void");
    }

    public final void a(boolean z) {
        synchronized (this.f4070k) {
            if (this.r != null) {
                this.r.dismiss();
                this.s.removeView(this.f4071l.getView());
                if (this.t != null) {
                    this.t.removeView(this.o);
                    this.t.addView(this.f4071l.getView());
                    this.f4071l.a(this.n);
                }
                if (z) {
                    c("default");
                    if (this.q != null) {
                        this.q.Y1();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f4070k) {
            z = this.r != null;
        }
        return z;
    }
}
