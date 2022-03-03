package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* access modifiers changed from: package-private */
public final class g6 extends h7 {
    private final pg a;

    g6(pg pgVar) {
        this.a = pgVar;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final of b(bc0<?> bc0, Map<String, String> map) {
        try {
            HttpResponse a2 = this.a.a(bc0, map);
            int statusCode = a2.getStatusLine().getStatusCode();
            Header[] allHeaders = a2.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new z50(header.getName(), header.getValue()));
            }
            if (a2.getEntity() == null) {
                return new of(statusCode, arrayList);
            }
            long contentLength = a2.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new of(statusCode, arrayList, (int) a2.getEntity().getContentLength(), a2.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e2) {
            throw new SocketTimeoutException(e2.getMessage());
        }
    }
}
