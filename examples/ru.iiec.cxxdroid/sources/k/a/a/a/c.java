package k.a.a.a;

import java.io.File;

public class c {
    private static final char a = File.separatorChar;

    static {
        Character.toString('.');
        a();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int c2 = c(str);
        return c2 == -1 ? "" : str.substring(c2 + 1);
    }

    static boolean a() {
        return a == '\\';
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(d(str) + 1);
    }

    public static int c(String str) {
        int lastIndexOf;
        if (str != null && d(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static int d(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }
}
