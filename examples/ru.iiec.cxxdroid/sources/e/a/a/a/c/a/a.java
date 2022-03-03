package e.a.a.a.c.a;

import e.a.a.a.e.b;
import e.a.a.a.e.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;

public class a<T> {
    private final b a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final String f6982b;

    protected a(String str) {
        this.f6982b = str;
    }

    private b<T> a(String str) {
        return str.contains("Bad API request") ? c.a(str) : c.a((Object) str);
    }

    private String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.OutputStream r3, e.a.a.a.c.a.b r4) {
        /*
            r2 = this;
            java.lang.String r4 = r4.a()
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x001a }
            r1.<init>(r3)     // Catch:{ all -> 0x001a }
            r1.write(r4)     // Catch:{ all -> 0x0017 }
            r1.close()
            return
        L_0x0017:
            r3 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()
        L_0x0020:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.c.a.a.a(java.io.OutputStream, e.a.a.a.c.a.b):void");
    }

    private HttpURLConnection b(String str) {
        return (HttpURLConnection) URI.create(str).toURL().openConnection();
    }

    public static <T> a<T> c() {
        return new a<>("https://pastebin.com/api/api_post.php");
    }

    public static <T> a<T> d() {
        return new a<>("https://pastebin.com/raw.php");
    }

    public a<T> a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    public b<T> a() {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = b(this.f6982b + "?" + this.a.a());
            b<T> a2 = a(a(httpURLConnection.getInputStream()));
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return a2;
        } catch (IOException unused) {
            b<T> a3 = c.a("Unable to connect to Pastebin endpoint!");
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return a3;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public b<T> b() {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = b(this.f6982b);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            a(httpURLConnection.getOutputStream(), this.a);
            b<T> a2 = a(a(httpURLConnection.getInputStream()));
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return a2;
        } catch (IOException unused) {
            b<T> a3 = c.a("Unable to connect to Pastebin endpoint!");
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return a3;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
