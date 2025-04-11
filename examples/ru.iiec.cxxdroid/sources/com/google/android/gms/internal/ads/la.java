package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.x0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public final class la extends ja {
    @Override // com.google.android.gms.internal.ads.aa
    public final WebResourceResponse a(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i2, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.aa, com.google.android.gms.internal.ads.da
    public final mg a(lg lgVar, boolean z) {
        return new lh(lgVar, z);
    }

    @Override // com.google.android.gms.internal.ads.aa
    public final CookieManager c(Context context) {
        if (aa.f()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            qc.b("Failed to obtain CookieManager.", th);
            x0.j().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.aa, com.google.android.gms.internal.ads.fa
    public final int e() {
        return 16974374;
    }
}
