package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.oa;
import java.util.ArrayList;

public final class z0 extends ViewSwitcher {

    /* renamed from: b  reason: collision with root package name */
    private final oa f3383b;

    /* renamed from: c  reason: collision with root package name */
    private final ec f3384c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3385d = true;

    public z0(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f3383b = new oa(context);
        this.f3383b.a(str);
        this.f3383b.b(str2);
        if (context instanceof Activity) {
            this.f3384c = new ec((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f3384c = new ec(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f3384c.c();
    }

    public final oa a() {
        return this.f3383b;
    }

    public final void b() {
        l9.e("Disable position monitoring on adFrame.");
        ec ecVar = this.f3384c;
        if (ecVar != null) {
            ecVar.d();
        }
    }

    public final void c() {
        l9.e("Enable debug gesture detector on adFrame.");
        this.f3385d = true;
    }

    public final void d() {
        l9.e("Disable debug gesture detector on adFrame.");
        this.f3385d = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec ecVar = this.f3384c;
        if (ecVar != null) {
            ecVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec ecVar = this.f3384c;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f3385d) {
            return false;
        }
        this.f3383b.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && (childAt instanceof lg)) {
                arrayList.add((lg) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((lg) obj).destroy();
        }
    }
}
