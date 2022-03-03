package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.jn;

public final class sj {
    public static jn a(String str, String str2, String str3, int i2, boolean z) {
        jn.a q = jn.q();
        q.a(str2);
        String valueOf = String.valueOf(str3);
        q.b(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink."));
        q.a(0);
        q.a(true);
        q.c(str);
        return (jn) q.h();
    }
}
