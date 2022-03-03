package f.a.a.a;

import android.os.SystemClock;
import android.text.TextUtils;
import f.a.a.a.n.b.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public class e implements Callable<Map<String, k>> {

    /* renamed from: b  reason: collision with root package name */
    final String f8355b;

    e(String str) {
        this.f8355b = str;
    }

    private k a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        Throwable th;
        IOException e2;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    throw new IllegalStateException("Invalid format of fabric file," + zipEntry.getName());
                }
                k kVar = new k(property, property2, property3);
                i.a((Closeable) inputStream);
                return kVar;
            } catch (IOException e3) {
                e2 = e3;
                try {
                    c.g().c("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e2);
                    i.a((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    i.a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            inputStream = null;
            c.g().c("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e2);
            i.a((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            i.a((Closeable) inputStream);
            throw th;
        }
    }

    private Map<String, k> b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.e");
            k kVar = new k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.b(), kVar);
            c.g().d("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, k> c() {
        k a;
        HashMap hashMap = new HashMap();
        ZipFile a2 = a();
        Enumeration<? extends ZipEntry> entries = a2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7 && (a = a(zipEntry, a2)) != null) {
                hashMap.put(a.b(), a);
                c.g().d("Fabric", String.format("Found kit:[%s] version:[%s]", a.b(), a.c()));
            }
        }
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public ZipFile a() {
        return new ZipFile(this.f8355b);
    }

    @Override // java.util.concurrent.Callable
    public Map<String, k> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(b());
        hashMap.putAll(c());
        l g2 = c.g();
        g2.d("Fabric", "finish scanning in " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return hashMap;
    }
}
