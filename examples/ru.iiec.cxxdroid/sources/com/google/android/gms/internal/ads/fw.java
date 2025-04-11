package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
public final class fw implements Runnable {
    private fw() {
    }

    public final void run() {
        try {
            dw.a(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            dw.f4137e.countDown();
            throw th;
        }
        dw.f4137e.countDown();
    }
}
