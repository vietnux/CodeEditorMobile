package g.v;

import g.r.d.i;
import g.s.g;

public class n extends m {
    public static int a(String str, String str2, boolean z) {
        i.c(str, "$this$compareTo");
        i.c(str2, "other");
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static final String a(String str, String str2, String str3, boolean z) {
        i.c(str, "$this$replace");
        i.c(str2, "oldValue");
        i.c(str3, "newValue");
        int i2 = 0;
        int a = o.a(str, str2, 0, z);
        if (a < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = g.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i2, a);
                sb.append(str3);
                i2 = a + length;
                if (a >= str.length()) {
                    break;
                }
                a = o.a(str, str2, a + i3, z);
            } while (a > 0);
            sb.append((CharSequence) str, i2, str.length());
            String sb2 = sb.toString();
            i.b(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String a(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(str, str2, str3, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            g.r.d.i.c(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            g.s.d r0 = g.v.o.b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            g.o.v r3 = (g.o.v) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = g.v.a.a(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.v.n.a(java.lang.CharSequence):boolean");
    }

    public static final boolean a(String str, int i2, String str2, int i3, int i4, boolean z) {
        i.c(str, "$this$regionMatches");
        i.c(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static /* synthetic */ boolean a(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c(str, str2, z);
    }

    public static boolean b(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean c(String str, String str2, boolean z) {
        i.c(str, "$this$startsWith");
        i.c(str2, "prefix");
        return !z ? str.startsWith(str2) : a(str, 0, str2, 0, str2.length(), z);
    }
}
