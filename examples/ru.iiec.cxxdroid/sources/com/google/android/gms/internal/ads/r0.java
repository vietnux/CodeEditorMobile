package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@k2
@TargetApi(19)
public final class r0 extends o0 {

    /* renamed from: h  reason: collision with root package name */
    private Object f5364h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private PopupWindow f5365i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5366j = false;

    r0(Context context, r8 r8Var, lg lgVar, n0 n0Var) {
        super(context, r8Var, lgVar, n0Var);
    }

    private final void d() {
        synchronized (this.f5364h) {
            this.f5366j = true;
            if ((this.f4361b instanceof Activity) && ((Activity) this.f4361b).isDestroyed()) {
                this.f5365i = null;
            }
            if (this.f5365i != null) {
                if (this.f5365i.isShowing()) {
                    this.f5365i.dismiss();
                }
                this.f5365i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.g0
    public final void a(int i2) {
        d();
        super.a(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.o0
    public final void c() {
        Context context = this.f4361b;
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.f4361b).isDestroyed()) {
            FrameLayout frameLayout = new FrameLayout(this.f4361b);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(this.f4362c.getView(), -1, -1);
            synchronized (this.f5364h) {
                if (!this.f5366j) {
                    this.f5365i = new PopupWindow((View) frameLayout, 1, 1, false);
                    this.f5365i.setOutsideTouchable(true);
                    this.f5365i.setClippingEnabled(false);
                    qc.b("Displaying the 1x1 popup off the screen.");
                    try {
                        this.f5365i.showAtLocation(window.getDecorView(), 0, -1, -1);
                    } catch (Exception unused) {
                        this.f5365i = null;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.na, com.google.android.gms.internal.ads.g0
    public final void cancel() {
        d();
        super.cancel();
    }
}
