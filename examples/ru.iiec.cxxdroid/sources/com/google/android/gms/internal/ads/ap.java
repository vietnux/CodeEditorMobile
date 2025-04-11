package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

public final class ap implements uo<Mac> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.uo
    public final /* synthetic */ Mac a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
