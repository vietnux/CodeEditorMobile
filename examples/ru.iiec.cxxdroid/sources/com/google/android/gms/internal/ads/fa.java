package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;

@TargetApi(14)
public class fa extends da {
    @Override // com.google.android.gms.internal.ads.aa
    public final String a(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // com.google.android.gms.internal.ads.aa
    public int e() {
        return 1;
    }
}
