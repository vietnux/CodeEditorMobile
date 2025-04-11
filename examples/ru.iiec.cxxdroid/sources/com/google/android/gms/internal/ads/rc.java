package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@k2
public final class rc implements ic {
    private final String a;

    public rc() {
        this(null);
    }

    public rc(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.ic
    public final void a(String str) {
        String sb;
        String message;
        StringBuilder sb2;
        try {
            String valueOf = String.valueOf(str);
            qc.b(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                a50.b();
                fc.a(true, httpURLConnection, this.a);
                jc jcVar = new jc();
                jcVar.a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                jcVar.a(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                    sb3.append("Received non-success response code ");
                    sb3.append(responseCode);
                    sb3.append(" from pinging URL: ");
                    sb3.append(str);
                    qc.d(sb3.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            qc.d(sb);
        } catch (IOException e3) {
            message = e3.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            qc.d(sb);
        } catch (RuntimeException e4) {
            message = e4.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            qc.d(sb);
        }
    }
}
