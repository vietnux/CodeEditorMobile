package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

public class rk extends bc0<String> {
    private final Object o = new Object();
    private xj0<String> p;

    public rk(int i2, String str, xj0<String> xj0, ej0 ej0) {
        super(i2, str, ej0);
        this.p = xj0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.bc0
    public final di0<String> a(ba0 ba0) {
        String str;
        try {
            byte[] bArr = ba0.f3855b;
            String str2 = "ISO-8859-1";
            String str3 = ba0.f3856c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i2].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(ba0.f3855b);
        }
        return di0.a(str, ne.a(ba0));
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        xj0<String> xj0;
        synchronized (this.o) {
            xj0 = this.p;
        }
        if (xj0 != null) {
            xj0.a(str);
        }
    }
}
