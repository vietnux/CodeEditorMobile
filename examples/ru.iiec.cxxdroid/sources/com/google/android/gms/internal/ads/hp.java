package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class hp {
    private static final ThreadLocal<SecureRandom> a = new ip();

    /* access modifiers changed from: private */
    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
