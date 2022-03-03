package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@k2
public final class x10 extends o10 {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f5977c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5978d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5979e;

    public x10(int i2) {
        int i3 = i2 / 8;
        this.f5978d = i2 % 8 > 0 ? i3 + 1 : i3;
        this.f5979e = i2;
    }

    @Override // com.google.android.gms.internal.ads.o10
    public final byte[] a(String str) {
        synchronized (this.a) {
            this.f5977c = a();
            if (this.f5977c == null) {
                return new byte[0];
            }
            this.f5977c.reset();
            this.f5977c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f5977c.digest();
            byte[] bArr = new byte[(digest.length > this.f5978d ? this.f5978d : digest.length)];
            System.arraycopy(digest, 0, bArr, 0, bArr.length);
            if (this.f5979e % 8 > 0) {
                long j2 = 0;
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    if (i2 > 0) {
                        j2 <<= 8;
                    }
                    j2 += (long) (bArr[i2] & 255);
                }
                long j3 = j2 >>> (8 - (this.f5979e % 8));
                for (int i3 = this.f5978d - 1; i3 >= 0; i3--) {
                    bArr[i3] = (byte) ((int) (255 & j3));
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
