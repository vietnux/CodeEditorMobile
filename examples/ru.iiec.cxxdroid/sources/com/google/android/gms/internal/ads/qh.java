package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class qh extends h7 {
    private final ri a;

    public qh() {
        this(null);
    }

    private qh(ri riVar) {
        this(null, null);
    }

    private qh(ri riVar, SSLSocketFactory sSLSocketFactory) {
        this.a = null;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<z50> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new z50(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, bc0<?> bc0) {
        byte[] m2 = bc0.m();
        if (m2 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(m2);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    @Override // com.google.android.gms.internal.ads.h7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.of b(com.google.android.gms.internal.ads.bc0<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qh.b(com.google.android.gms.internal.ads.bc0, java.util.Map):com.google.android.gms.internal.ads.of");
    }
}
