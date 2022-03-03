package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.u9;

@k2
public final class l {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f3265l == 4 && adOverlayInfoParcel.f3257d == null) {
            d40 d40 = adOverlayInfoParcel.f3256c;
            if (d40 != null) {
                d40.d();
            }
            x0.c();
            a.a(context, adOverlayInfoParcel.f3255b, adOverlayInfoParcel.f3263j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.n.f5532e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!n.i()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        x0.f();
        u9.a(context, intent);
    }
}
