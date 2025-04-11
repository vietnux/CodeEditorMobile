package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class el implements rj<bk> {
    @Override // com.google.android.gms.internal.ads.rj
    public final xj<bk> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c2 = 65535;
        if (((lowerCase.hashCode() == 107855 && lowerCase.equals("mac")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                c2 = 0;
            }
            if (c2 == 0) {
                cl clVar = new cl();
                if (i2 <= 0) {
                    return clVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", str));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
    }
}
