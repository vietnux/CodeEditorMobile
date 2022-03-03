package i.f0.f;

import i.f0.a;
import i.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class b {
    private final List<k> a;

    /* renamed from: b  reason: collision with root package name */
    private int f8856b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8857c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8858d;

    public b(List<k> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i2 = this.f8856b; i2 < this.a.size(); i2++) {
            if (this.a.get(i2).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public k a(SSLSocket sSLSocket) {
        k kVar;
        int i2 = this.f8856b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = this.a.get(i2);
            i2++;
            if (kVar.a(sSLSocket)) {
                this.f8856b = i2;
                break;
            }
        }
        if (kVar != null) {
            this.f8857c = b(sSLSocket);
            a.a.a(kVar, sSLSocket, this.f8858d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f8858d + ", modes=" + this.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f8858d = true;
        if (!this.f8857c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException);
        }
        return false;
    }
}
