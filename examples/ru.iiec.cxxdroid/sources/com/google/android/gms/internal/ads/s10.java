package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.m;
import java.io.UnsupportedEncodingException;

@k2
public final class s10 {
    public static int a(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        return m.a(bArr, 0, bArr.length, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d1, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s10.a(java.lang.String, boolean):java.lang.String[]");
    }
}
