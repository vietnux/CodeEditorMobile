package f.a.a.a.n.e;

import f.a.a.a.c;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* access modifiers changed from: package-private */
public class h implements X509TrustManager {

    /* renamed from: f  reason: collision with root package name */
    private static final X509Certificate[] f8527f = new X509Certificate[0];
    private final TrustManager[] a;

    /* renamed from: b  reason: collision with root package name */
    private final i f8528b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8529c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f8530d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private final Set<X509Certificate> f8531e = Collections.synchronizedSet(new HashSet());

    public h(i iVar, g gVar) {
        this.a = a(iVar);
        this.f8528b = iVar;
        this.f8529c = gVar.d();
        for (String str : gVar.c()) {
            this.f8530d.add(a(str));
        }
    }

    private void a(X509Certificate[] x509CertificateArr) {
        if (this.f8529c == -1 || System.currentTimeMillis() - this.f8529c <= 15552000000L) {
            for (X509Certificate x509Certificate : a.a(x509CertificateArr, this.f8528b)) {
                if (a(x509Certificate)) {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        c.g().a("Fabric", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.f8529c) + " millis vs " + 15552000000L + " millis) falling back to system trust.");
    }

    private void a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.a) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    private boolean a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] bArr : this.f8530d) {
                if (Arrays.equals(bArr, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e2) {
            throw new CertificateException(e2);
        }
    }

    private byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    private TrustManager[] a(i iVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(iVar.a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (KeyStoreException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f8531e.contains(x509CertificateArr[0])) {
            a(x509CertificateArr, str);
            a(x509CertificateArr);
            this.f8531e.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f8527f;
    }
}
