package i.f0.k;

import i.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    final Method f9096c;

    /* renamed from: d  reason: collision with root package name */
    final Method f9097d;

    c(Method method, Method method2) {
        this.f9096c = method;
        this.f9097d = method2;
    }

    public static c c() {
        try {
            return new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // i.f0.k.f
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a = f.a(list);
            this.f9096c.invoke(sSLParameters, a.toArray(new String[a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw i.f0.c.a("unable to set ssl parameters", (Exception) e2);
        }
    }

    @Override // i.f0.k.f
    public String b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9097d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw i.f0.c.a("unable to get selected protocols", (Exception) e2);
        }
    }
}
