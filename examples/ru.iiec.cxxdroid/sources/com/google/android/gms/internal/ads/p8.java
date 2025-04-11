package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

public interface p8 {
    ld<AdvertisingIdClient.Info> a(Context context);

    ld<String> a(String str, PackageInfo packageInfo);
}
