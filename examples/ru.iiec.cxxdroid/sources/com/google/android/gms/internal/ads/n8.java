package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@k2
public final class n8 implements p8 {
    @Override // com.google.android.gms.internal.ads.p8
    public final ld<AdvertisingIdClient.Info> a(Context context) {
        wd wdVar = new wd();
        a50.b();
        if (fc.f(context)) {
            s9.a(new o8(this, context, wdVar));
        }
        return wdVar;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final ld<String> a(String str, PackageInfo packageInfo) {
        return ad.a(str);
    }
}
