package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.oa;

/* access modifiers changed from: package-private */
@k2
public final class h extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    private oa f3288b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3289c;

    public h(Context context, String str, String str2) {
        super(context);
        this.f3288b = new oa(context, str);
        this.f3288b.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3289c) {
            return false;
        }
        this.f3288b.a(motionEvent);
        return false;
    }
}
