package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@k2
public abstract class o10 {

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f5122b;
    protected Object a = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        synchronized (this.a) {
            if (f5122b != null) {
                return f5122b;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    f5122b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f5122b;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);
}
