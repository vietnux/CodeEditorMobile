package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class fp implements bk {
    private Mac a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4344b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4345c;

    /* renamed from: d  reason: collision with root package name */
    private final Key f4346d;

    public fp(String str, Key key, int i2) {
        if (i2 >= 10) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i2 > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i2 > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i2 > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f4345c = str;
            this.f4344b = i2;
            this.f4346d = key;
            this.a = to.f5646g.a(str);
            this.a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.ads.bk
    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = to.f5646g.a(this.f4345c);
            mac.init(this.f4346d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f4344b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f4344b);
        return bArr2;
    }
}
