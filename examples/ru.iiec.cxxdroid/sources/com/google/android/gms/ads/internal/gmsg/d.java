package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.v1;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.tk0;
import java.util.Map;

@k2
public final class d implements e0<lg> {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f3162d = f.a((Object[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (Object[]) new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final v1 a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.internal.ads.d f3163b;

    /* renamed from: c  reason: collision with root package name */
    private final o f3164c;

    public d(v1 v1Var, com.google.android.gms.internal.ads.d dVar, o oVar) {
        this.a = v1Var;
        this.f3163b = dVar;
        this.f3164c = oVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        v1 v1Var;
        lg lgVar2 = lgVar;
        int intValue = f3162d.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (v1Var = this.a) != null && !v1Var.b()) {
            this.a.a(null);
        } else if (intValue == 1) {
            this.f3163b.a(map);
        } else if (intValue == 3) {
            new g(lgVar2, map).a();
        } else if (intValue == 4) {
            new tk0(lgVar2, map).b();
        } else if (intValue == 5) {
            new com.google.android.gms.internal.ads.f(lgVar2, map).a();
        } else if (intValue == 6) {
            this.f3163b.a(true);
        } else if (intValue != 7) {
            qc.c("Unknown MRAID command called.");
        } else if (((Boolean) a50.g().a(k80.M)).booleanValue()) {
            this.f3164c.P1();
        }
    }
}
