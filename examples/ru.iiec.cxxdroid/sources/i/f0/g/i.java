package i.f0.g;

import i.s;
import i.y;
import java.net.Proxy;

public final class i {
    public static String a(s sVar) {
        String c2 = sVar.c();
        String e2 = sVar.e();
        if (e2 == null) {
            return c2;
        }
        return c2 + '?' + e2;
    }

    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.e());
        sb.append(' ');
        boolean b2 = b(yVar, type);
        s g2 = yVar.g();
        if (b2) {
            sb.append(g2);
        } else {
            sb.append(a(g2));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.d() && type == Proxy.Type.HTTP;
    }
}
