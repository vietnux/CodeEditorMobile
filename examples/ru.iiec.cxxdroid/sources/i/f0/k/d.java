package i.f0.k;

import i.f0.c;
import i.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
public class d extends f {

    /* renamed from: c  reason: collision with root package name */
    private final Method f9098c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f9099d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f9100e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f9101f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f9102g;

    private static class a implements InvocationHandler {
        private final List<String> a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9103b;

        /* renamed from: c  reason: collision with root package name */
        String f9104c;

        a(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c.f8803b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f9103b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj2 = this.a.get(0);
                            break;
                        } else if (this.a.contains(list.get(i2))) {
                            obj2 = list.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    String str = (String) obj2;
                    this.f9104c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f9104c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f9098c = method;
        this.f9099d = method2;
        this.f9100e = method3;
        this.f9101f = cls;
        this.f9102g = cls2;
    }

    public static f c() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            return new d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // i.f0.k.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f9100e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to remove alpn", (Exception) e2);
        }
    }

    @Override // i.f0.k.f
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        List<String> a2 = f.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f9101f, this.f9102g}, new a(a2));
            this.f9098c.invoke(null, sSLSocket, newProxyInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to set alpn", (Exception) e2);
        }
    }

    @Override // i.f0.k.f
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f9099d.invoke(null, sSLSocket));
            if (!aVar.f9103b && aVar.f9104c == null) {
                f.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f9103b) {
                return null;
            } else {
                return aVar.f9104c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to get selected protocol", (Exception) e2);
        }
    }
}
