package g.v;

import g.o.e;
import g.r.d.i;
import g.s.b;
import g.s.d;
import g.s.g;

public class o extends n {
    public static final int a(CharSequence charSequence, char c2, int i2, boolean z) {
        i.c(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return a(charSequence, new char[]{c2}, i2, z);
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return a(charSequence, c2, i2, z);
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        b dVar = !z2 ? new d(g.a(i2, 0), g.b(i3, charSequence.length())) : g.c(g.b(i2, c(charSequence)), g.a(i3, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = dVar.a();
            int b2 = dVar.b();
            int c2 = dVar.c();
            if (c2 >= 0) {
                if (a > b2) {
                    return -1;
                }
            } else if (a < b2) {
                return -1;
            }
            while (!a(charSequence2, 0, charSequence, a, charSequence2.length(), z)) {
                if (a == b2) {
                    return -1;
                }
                a += c2;
            }
            return a;
        }
        int a2 = dVar.a();
        int b3 = dVar.b();
        int c3 = dVar.c();
        if (c3 >= 0) {
            if (a2 > b3) {
                return -1;
            }
        } else if (a2 < b3) {
            return -1;
        }
        while (!n.a((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
            if (a2 == b3) {
                return -1;
            }
            a2 += c3;
        }
        return a2;
    }

    static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return a(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static final int a(CharSequence charSequence, String str, int i2, boolean z) {
        i.c(charSequence, "$this$indexOf");
        i.c(str, "string");
        return (z || !(charSequence instanceof String)) ? a(charSequence, str, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i2);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return a(charSequence, str, i2, z);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        i.c(charSequence, "$this$indexOfAny");
        i.c(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int i3 = g.a(i2, 0);
            int c2 = c(charSequence);
            if (i3 > c2) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i3);
                int length = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z2 = false;
                        break;
                    } else if (b.a(cArr[i4], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return i3;
                }
                if (i3 == c2) {
                    return -1;
                }
                i3++;
            }
        } else {
            return ((String) charSequence).indexOf(e.a(cArr), i2);
        }
    }

    public static final String a(String str, char c2, String str2) {
        i.c(str, "$this$substringAfterLast");
        i.c(str2, "missingDelimiterValue");
        int i2 = b(str, c2, 0, false, 6, null);
        if (i2 == -1) {
            return str2;
        }
        String substring = str.substring(i2 + 1, str.length());
        i.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String a(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return a(str, c2, str2);
    }

    public static String a(String str, CharSequence charSequence) {
        i.c(str, "$this$removePrefix");
        i.c(charSequence, "prefix");
        if (!b(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        i.b(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final boolean a(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        i.c(charSequence, "$this$regionMatchesImpl");
        i.c(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!b.a(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.c(charSequence, "$this$contains");
        i.c(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else if (a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return a(charSequence, charSequence2, z);
    }

    public static final int b(CharSequence charSequence, char c2, int i2, boolean z) {
        i.c(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        return b(charSequence, new char[]{c2}, i2, z);
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = c(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return b(charSequence, c2, i2, z);
    }

    public static final int b(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        i.c(charSequence, "$this$lastIndexOfAny");
        i.c(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int i3 = g.b(i2, c(charSequence)); i3 >= 0; i3--) {
                char charAt = charSequence.charAt(i3);
                int length = cArr.length;
                boolean z2 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (b.a(cArr[i4], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return i3;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(e.a(cArr), i2);
    }

    public static final d b(CharSequence charSequence) {
        i.c(charSequence, "$this$indices");
        return new d(0, charSequence.length() - 1);
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.c(charSequence, "$this$startsWith");
        i.c(charSequence2, "prefix");
        return (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) ? a(charSequence, 0, charSequence2, 0, charSequence2.length(), z) : n.a((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static final int c(CharSequence charSequence) {
        i.c(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }
}
