package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.u9;
import java.util.HashMap;
import java.util.Map;

final class v implements e0<lg> {
    v() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        x0.f();
        DisplayMetrics a = u9.a((WindowManager) lgVar2.getContext().getSystemService("window"));
        int i2 = a.widthPixels;
        int i3 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) lgVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i2));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i3));
        lgVar2.a("locationReady", hashMap);
        qc.d("GET LOCATION COMPILED");
    }
}
