package f.a.a.a.n.e;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class d {

    /* renamed from: k  reason: collision with root package name */
    private static c f8511k = c.a;
    private HttpURLConnection a = null;

    /* renamed from: b  reason: collision with root package name */
    public final URL f8512b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8513c;

    /* renamed from: d  reason: collision with root package name */
    private f f8514d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8515e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8516f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8517g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f8518h = 8192;

    /* renamed from: i  reason: collision with root package name */
    private String f8519i;

    /* renamed from: j  reason: collision with root package name */
    private int f8520j;

    /* access modifiers changed from: package-private */
    public class a extends b<d> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InputStream f8521d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OutputStream f8522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Closeable closeable, boolean z, InputStream inputStream, OutputStream outputStream) {
            super(closeable, z);
            this.f8521d = inputStream;
            this.f8522e = outputStream;
        }

        @Override // f.a.a.a.n.e.d.e
        public d b() {
            byte[] bArr = new byte[d.this.f8518h];
            while (true) {
                int read = this.f8521d.read(bArr);
                if (read == -1) {
                    return d.this;
                }
                this.f8522e.write(bArr, 0, read);
            }
        }
    }

    protected static abstract class b<V> extends e<V> {

        /* renamed from: b  reason: collision with root package name */
        private final Closeable f8524b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8525c;

        protected b(Closeable closeable, boolean z) {
            this.f8524b = closeable;
            this.f8525c = z;
        }

        /* access modifiers changed from: protected */
        @Override // f.a.a.a.n.e.d.e
        public void a() {
            Closeable closeable = this.f8524b;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.f8525c) {
                try {
                    this.f8524b.close();
                } catch (IOException unused) {
                }
            } else {
                this.f8524b.close();
            }
        }
    }

    public interface c {
        public static final c a = new a();

        static class a implements c {
            a() {
            }

            @Override // f.a.a.a.n.e.d.c
            public HttpURLConnection a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            @Override // f.a.a.a.n.e.d.c
            public HttpURLConnection a(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        }

        HttpURLConnection a(URL url);

        HttpURLConnection a(URL url, Proxy proxy);
    }

    /* renamed from: f.a.a.a.n.e.d$d  reason: collision with other inner class name */
    public static class C0130d extends RuntimeException {
        protected C0130d(IOException iOException) {
            super(iOException);
        }

        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* access modifiers changed from: protected */
    public static abstract class e<V> implements Callable<V> {
        protected e() {
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract V b();

        @Override // java.util.concurrent.Callable
        public V call() {
            Throwable th;
            boolean z = true;
            try {
                V b2 = b();
                try {
                    a();
                    return b2;
                } catch (IOException e2) {
                    throw new C0130d(e2);
                }
            } catch (C0130d e3) {
                throw e3;
            } catch (IOException e4) {
                throw new C0130d(e4);
            } catch (Throwable th2) {
                th = th2;
                a();
                throw th;
            }
        }
    }

    public static class f extends BufferedOutputStream {

        /* renamed from: b  reason: collision with root package name */
        private final CharsetEncoder f8526b;

        public f(OutputStream outputStream, String str, int i2) {
            super(outputStream, i2);
            this.f8526b = Charset.forName(d.f(str)).newEncoder();
        }

        public f b(String str) {
            ByteBuffer encode = this.f8526b.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public d(CharSequence charSequence, String str) {
        try {
            this.f8512b = new URL(charSequence.toString());
            this.f8513c = str;
        } catch (MalformedURLException e2) {
            throw new C0130d(e2);
        }
    }

    public static d a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a2 = a(charSequence, map);
        if (z) {
            a2 = c((CharSequence) a2);
        }
        return d((CharSequence) a2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    public static java.lang.String a(java.lang.CharSequence r3, java.util.Map<?, ?> r4) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.e.d.a(java.lang.CharSequence, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.charAt(r2) != '&') goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.StringBuilder a(java.lang.String r4, java.lang.StringBuilder r5) {
        /*
            r0 = 63
            int r1 = r4.indexOf(r0)
            int r2 = r5.length()
            int r2 = r2 + -1
            r3 = -1
            if (r1 != r3) goto L_0x0013
        L_0x000f:
            r5.append(r0)
            goto L_0x001e
        L_0x0013:
            if (r1 >= r2) goto L_0x001e
            char r4 = r4.charAt(r2)
            r0 = 38
            if (r4 == r0) goto L_0x001e
            goto L_0x000f
        L_0x001e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.e.d.a(java.lang.String, java.lang.StringBuilder):java.lang.StringBuilder");
    }

    public static d b(CharSequence charSequence) {
        return new d(charSequence, "DELETE");
    }

    public static d b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a2 = a(charSequence, map);
        if (z) {
            a2 = c((CharSequence) a2);
        }
        return e((CharSequence) a2);
    }

    private static StringBuilder b(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    public static String c(CharSequence charSequence) {
        int i2;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i2 = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i2) + aSCIIString.substring(i2).replace("+", "%2B");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new C0130d(iOException);
            }
        } catch (IOException e3) {
            throw new C0130d(e3);
        }
    }

    public static d d(CharSequence charSequence) {
        return new d(charSequence, "GET");
    }

    public static d e(CharSequence charSequence) {
        return new d(charSequence, "POST");
    }

    public static d f(CharSequence charSequence) {
        return new d(charSequence, "PUT");
    }

    /* access modifiers changed from: private */
    public static String f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    private HttpURLConnection q() {
        try {
            HttpURLConnection a2 = this.f8519i != null ? f8511k.a(this.f8512b, r()) : f8511k.a(this.f8512b);
            a2.setRequestMethod(this.f8513c);
            return a2;
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    private Proxy r() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f8519i, this.f8520j));
    }

    public int a(String str, int i2) {
        f();
        return j().getHeaderFieldInt(str, i2);
    }

    public d a(int i2) {
        j().setConnectTimeout(i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public d a(InputStream inputStream, OutputStream outputStream) {
        return (d) new a(inputStream, this.f8516f, inputStream, outputStream).call();
    }

    public d a(CharSequence charSequence) {
        try {
            m();
            this.f8514d.b(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public d a(String str, Number number) {
        a(str, (String) null, number);
        return this;
    }

    public d a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            c("Content-Type", str);
            return this;
        }
        c("Content-Type", str + "; charset=" + str2);
        return this;
    }

    public d a(String str, String str2, Number number) {
        a(str, str2, number != null ? number.toString() : null);
        return this;
    }

    public d a(String str, String str2, String str3) {
        a(str, str2, (String) null, str3);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0023 A[SYNTHETIC, Splitter:B:19:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.a.a.a.n.e.d a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001a }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001a }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001a }
            r3.a(r4, r5, r6, r1)     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            r1.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            return r3
        L_0x0012:
            r4 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x0015:
            r4 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            r4 = move-exception
        L_0x001b:
            f.a.a.a.n.e.d$d r5 = new f.a.a.a.n.e.d$d     // Catch:{ all -> 0x0018 }
            r5.<init>(r4)     // Catch:{ all -> 0x0018 }
            throw r5     // Catch:{ all -> 0x0018 }
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.e.d.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):f.a.a.a.n.e.d");
    }

    public d a(String str, String str2, String str3, InputStream inputStream) {
        try {
            n();
            b(str, str2, str3);
            a(inputStream, this.f8514d);
            return this;
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public d a(String str, String str2, String str3, String str4) {
        try {
            n();
            b(str, str2, str3);
            this.f8514d.b(str4);
            return this;
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public d a(Map.Entry<String, String> entry) {
        c(entry.getKey(), entry.getValue());
        return this;
    }

    public d a(boolean z) {
        j().setUseCaches(z);
        return this;
    }

    public String a() {
        return a(d());
    }

    public String a(String str) {
        ByteArrayOutputStream c2 = c();
        try {
            a(b(), c2);
            return c2.toString(f(str));
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public d b(String str) {
        a(str, (String) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public d b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        f("Content-Disposition", sb.toString());
        if (str3 != null) {
            f("Content-Type", str3);
        }
        a("\r\n");
        return this;
    }

    public BufferedInputStream b() {
        return new BufferedInputStream(o(), this.f8518h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    protected java.lang.String b(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.e.d.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public d c(String str, String str2) {
        j().setRequestProperty(str, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream c() {
        int i2 = i();
        return i2 > 0 ? new ByteArrayOutputStream(i2) : new ByteArrayOutputStream();
    }

    public String c(String str) {
        f();
        return j().getHeaderField(str);
    }

    public int d(String str) {
        return a(str, -1);
    }

    public String d() {
        return d("Content-Type", "charset");
    }

    public String d(String str, String str2) {
        return b(c(str), str2);
    }

    /* access modifiers changed from: protected */
    public d e() {
        f fVar = this.f8514d;
        if (fVar == null) {
            return this;
        }
        if (this.f8515e) {
            fVar.b("\r\n--00content0boundary00--\r\n");
        }
        if (this.f8516f) {
            try {
                this.f8514d.close();
            } catch (IOException unused) {
            }
        } else {
            this.f8514d.close();
        }
        this.f8514d = null;
        return this;
    }

    public d e(String str, String str2) {
        a(str, (String) null, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    public d f() {
        try {
            e();
            return this;
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public d f(String str, String str2) {
        a((CharSequence) str);
        a(": ");
        a((CharSequence) str2);
        a("\r\n");
        return this;
    }

    public int g() {
        try {
            e();
            return j().getResponseCode();
        } catch (IOException e2) {
            throw new C0130d(e2);
        }
    }

    public String h() {
        return c("Content-Encoding");
    }

    public int i() {
        return d("Content-Length");
    }

    public HttpURLConnection j() {
        if (this.a == null) {
            this.a = q();
        }
        return this.a;
    }

    public String k() {
        return j().getRequestMethod();
    }

    public boolean l() {
        return 200 == g();
    }

    /* access modifiers changed from: protected */
    public d m() {
        if (this.f8514d != null) {
            return this;
        }
        j().setDoOutput(true);
        this.f8514d = new f(j().getOutputStream(), b(j().getRequestProperty("Content-Type"), "charset"), this.f8518h);
        return this;
    }

    /* access modifiers changed from: protected */
    public d n() {
        String str;
        f fVar;
        if (!this.f8515e) {
            this.f8515e = true;
            b("multipart/form-data; boundary=00content0boundary00");
            m();
            fVar = this.f8514d;
            str = "--00content0boundary00\r\n";
        } else {
            fVar = this.f8514d;
            str = "\r\n--00content0boundary00\r\n";
        }
        fVar.b(str);
        return this;
    }

    public InputStream o() {
        InputStream inputStream;
        if (g() < 400) {
            try {
                inputStream = j().getInputStream();
            } catch (IOException e2) {
                throw new C0130d(e2);
            }
        } else {
            inputStream = j().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = j().getInputStream();
                } catch (IOException e3) {
                    throw new C0130d(e3);
                }
            }
        }
        if (!this.f8517g || !"gzip".equals(h())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e4) {
            throw new C0130d(e4);
        }
    }

    public URL p() {
        return j().getURL();
    }

    public String toString() {
        return k() + ' ' + p();
    }
}
