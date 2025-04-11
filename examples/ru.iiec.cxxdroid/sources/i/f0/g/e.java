package i.f0.g;

import i.a0;
import i.f0.c;
import i.l;
import i.m;
import i.r;
import i.s;
import i.y;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public final class e {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static int a(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static int a(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static long a(a0 a0Var) {
        return a(a0Var.q());
    }

    public static long a(r rVar) {
        return a(rVar.a("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static r a(r rVar, r rVar2) {
        Set<String> c2 = c(rVar2);
        if (c2.isEmpty()) {
            return new r.a().a();
        }
        r.a aVar = new r.a();
        int b2 = rVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            String a = rVar.a(i2);
            if (c2.contains(a)) {
                aVar.a(a, rVar.b(i2));
            }
        }
        return aVar.a();
    }

    public static void a(m mVar, s sVar, r rVar) {
        if (mVar != m.a) {
            List<l> a = l.a(sVar, rVar);
            if (!a.isEmpty()) {
                mVar.a(sVar, a);
            }
        }
    }

    public static boolean a(a0 a0Var, r rVar, y yVar) {
        for (String str : d(a0Var)) {
            if (!c.a(rVar.b(str), yVar.b(str))) {
                return false;
            }
        }
        return true;
    }

    public static int b(String str, int i2) {
        while (i2 < str.length() && ((r0 = str.charAt(i2)) == ' ' || r0 == '\t')) {
            i2++;
        }
        return i2;
    }

    public static boolean b(a0 a0Var) {
        if (a0Var.y().e().equals("HEAD")) {
            return false;
        }
        int o = a0Var.o();
        return (((o >= 100 && o < 200) || o == 204 || o == 304) && a(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static boolean b(r rVar) {
        return c(rVar).contains("*");
    }

    public static Set<String> c(r rVar) {
        Set<String> emptySet = Collections.emptySet();
        int b2 = rVar.b();
        Set<String> set = emptySet;
        for (int i2 = 0; i2 < b2; i2++) {
            if ("Vary".equalsIgnoreCase(rVar.a(i2))) {
                String b3 = rVar.b(i2);
                if (set.isEmpty()) {
                    set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : b3.split(",")) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    public static boolean c(a0 a0Var) {
        return b(a0Var.q());
    }

    private static Set<String> d(a0 a0Var) {
        return c(a0Var.q());
    }

    public static r e(a0 a0Var) {
        return a(a0Var.t().y().c(), a0Var.q());
    }
}
