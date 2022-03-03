package i.f0.l;

import i.f0.k.f;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public abstract class c {
    public static c a(X509TrustManager x509TrustManager) {
        return f.d().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
