package f.a.a.a.n.e;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class f {
    public static final SSLSocketFactory a(g gVar) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new h(new i(gVar.b(), gVar.a()), gVar)}, null);
        return instance.getSocketFactory();
    }
}
