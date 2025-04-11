package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

public final class yo implements uo<KeyFactory> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.uo
    public final /* synthetic */ KeyFactory a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
