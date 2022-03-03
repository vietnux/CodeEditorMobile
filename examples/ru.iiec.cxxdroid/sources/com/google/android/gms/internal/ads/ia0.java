package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ia0 implements e0<Object> {
    private final /* synthetic */ o1 a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ha0 f4603b;

    ia0(ha0 ha0, o1 o1Var) {
        this.f4603b = ha0;
        this.a = o1Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        lg lgVar = (lg) this.f4603b.a.get();
        if (lgVar == null) {
            this.a.a("/loadHtml", this);
            return;
        }
        lgVar.M().a(new ja0(this, map, this.a));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            lgVar.loadData(str, "text/html", "UTF-8");
        } else {
            lgVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
