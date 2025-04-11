package e.b.b.a.c.e;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
public final class u5 extends SSLSocket {

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocket f7619b;

    u5(t5 t5Var, SSLSocket sSLSocket) {
        this.f7619b = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f7619b.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.f7619b.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7619b.close();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.f7619b.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i2) {
        this.f7619b.connect(socketAddress, i2);
    }

    public final boolean equals(Object obj) {
        return this.f7619b.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f7619b.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f7619b.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f7619b.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f7619b.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f7619b.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.f7619b.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f7619b.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f7619b.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f7619b.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f7619b.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f7619b.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f7619b.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.f7619b.getOutputStream();
    }

    public final int getPort() {
        return this.f7619b.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.f7619b.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f7619b.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f7619b.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.f7619b.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f7619b.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f7619b.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.f7619b.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f7619b.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f7619b.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f7619b.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f7619b.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f7619b.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f7619b.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f7619b.isBound();
    }

    public final boolean isClosed() {
        return this.f7619b.isClosed();
    }

    public final boolean isConnected() {
        return this.f7619b.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f7619b.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f7619b.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f7619b.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i2) {
        this.f7619b.sendUrgentData(i2);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f7619b.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f7619b.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f7619b.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f7619b.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.f7619b.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f7619b.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.f7619b.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i2, int i3, int i4) {
        this.f7619b.setPerformancePreferences(i2, i3, i4);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i2) {
        this.f7619b.setReceiveBufferSize(i2);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.f7619b.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i2) {
        this.f7619b.setSendBufferSize(i2);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i2) {
        this.f7619b.setSoLinger(z, i2);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i2) {
        this.f7619b.setSoTimeout(i2);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.f7619b.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i2) {
        this.f7619b.setTrafficClass(i2);
    }

    public final void setUseClientMode(boolean z) {
        this.f7619b.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f7619b.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.f7619b.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.f7619b.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.f7619b.startHandshake();
    }

    public final String toString() {
        return this.f7619b.toString();
    }
}
