package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class wk implements rj<wj> {
    @Override // com.google.android.gms.internal.ads.rj
    public final xj<wj> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c2 = 65535;
        if (((lowerCase.hashCode() == 1420614889 && lowerCase.equals("hybridencrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                c2 = 0;
            }
            if (c2 == 0) {
                tk tkVar = new tk();
                if (i2 <= 0) {
                    return tkVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
    }
}
