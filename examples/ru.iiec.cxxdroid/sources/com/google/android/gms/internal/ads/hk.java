package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class hk implements rj<pj> {
    @Override // com.google.android.gms.internal.ads.rj
    public final xj<pj> a(String str, String str2, int i2) {
        xj<pj> xjVar;
        String lowerCase = str2.toLowerCase();
        char c2 = 65535;
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : 65535) == 0) {
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                xjVar = new jk();
            } else if (c2 == 1) {
                xjVar = new lk();
            } else if (c2 == 2) {
                xjVar = new mk();
            } else if (c2 == 3) {
                xjVar = new nk();
            } else if (c2 == 4) {
                xjVar = new ok();
            } else if (c2 == 5) {
                xjVar = new qk();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
            }
            if (xjVar.getVersion() >= i2) {
                return xjVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
    }
}
