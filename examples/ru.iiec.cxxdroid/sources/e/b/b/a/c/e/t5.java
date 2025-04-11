package e.b.b.a.c.e;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class t5 extends SSLSocketFactory {
    private final SSLSocketFactory a;

    t5() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private t5(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new u5(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a((SSLSocket) this.a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        return a((SSLSocket) this.a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a((SSLSocket) this.a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a((SSLSocket) this.a.createSocket(socket, str, i2, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }
}
