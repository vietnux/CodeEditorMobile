package i;

import i.f0.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s {

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f9162i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9163b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9164c;

    /* renamed from: d  reason: collision with root package name */
    final String f9165d;

    /* renamed from: e  reason: collision with root package name */
    final int f9166e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f9167f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9168g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9169h;

    public static final class a {
        String a;

        /* renamed from: b  reason: collision with root package name */
        String f9170b = "";

        /* renamed from: c  reason: collision with root package name */
        String f9171c = "";

        /* renamed from: d  reason: collision with root package name */
        String f9172d;

        /* renamed from: e  reason: collision with root package name */
        int f9173e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f9174f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        List<String> f9175g;

        /* renamed from: h  reason: collision with root package name */
        String f9176h;

        /* access modifiers changed from: package-private */
        /* renamed from: i.s$a$a  reason: collision with other inner class name */
        public enum EnumC0140a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            this.f9174f.add("");
        }

        private static String a(String str, int i2, int i3) {
            return c.a(s.a(str, i2, i3, false));
        }

        private void a(String str, int i2, int i3, boolean z, boolean z2) {
            String a2 = s.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!f(a2)) {
                if (g(a2)) {
                    d();
                    return;
                }
                List<String> list = this.f9174f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f9174f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f9174f.add(a2);
                }
                if (z) {
                    this.f9174f.add("");
                }
            }
        }

        private static int b(String str, int i2, int i3) {
            try {
                int parseInt = Integer.parseInt(s.a(str, i2, i3, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private static int c(String str, int i2, int i3) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        private void d() {
            List<String> list = this.f9174f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f9174f.isEmpty()) {
                this.f9174f.add("");
                return;
            }
            List<String> list2 = this.f9174f;
            list2.set(list2.size() - 1, "");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f9174f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f9174f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f9174f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = i.f0.c.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.s.a.d(java.lang.String, int, int):void");
        }

        private static int e(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                    }
                }
            }
            return -1;
        }

        private static int f(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* access modifiers changed from: package-private */
        public EnumC0140a a(s sVar, String str) {
            int i2;
            int a2;
            int i3;
            int b2 = c.b(str, 0, str.length());
            int c2 = c.c(str, b2, str.length());
            if (e(str, b2, c2) != -1) {
                if (str.regionMatches(true, b2, "https:", 0, 6)) {
                    this.a = "https";
                    b2 += 6;
                } else if (!str.regionMatches(true, b2, "http:", 0, 5)) {
                    return EnumC0140a.UNSUPPORTED_SCHEME;
                } else {
                    this.a = "http";
                    b2 += 5;
                }
            } else if (sVar == null) {
                return EnumC0140a.MISSING_SCHEME;
            } else {
                this.a = sVar.a;
            }
            int f2 = f(str, b2, c2);
            char c3 = '?';
            char c4 = '#';
            if (f2 >= 2 || sVar == null || !sVar.a.equals(this.a)) {
                int i4 = b2 + f2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = c.a(str, i4, c2, "@/\\?#");
                    char charAt = a2 != c2 ? str.charAt(a2) : 65535;
                    if (charAt == 65535 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        i2 = a2;
                        int c5 = c(str, i4, i2);
                        int i5 = c5 + 1;
                        this.f9172d = a(str, i4, c5);
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a3 = c.a(str, i4, a2, ':');
                                i3 = a2;
                                String a4 = s.a(str, i4, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    a4 = this.f9170b + "%40" + a4;
                                }
                                this.f9170b = a4;
                                if (a3 != i3) {
                                    this.f9171c = s.a(str, a3 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i3 = a2;
                                this.f9171c += "%40" + s.a(str, i4, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            }
                            i4 = i3 + 1;
                        }
                        c3 = '?';
                        c4 = '#';
                    }
                }
                i2 = a2;
                int c52 = c(str, i4, i2);
                int i52 = c52 + 1;
                this.f9172d = a(str, i4, c52);
                if (i52 < i2) {
                    this.f9173e = b(str, i52, i2);
                    if (this.f9173e == -1) {
                        return EnumC0140a.INVALID_PORT;
                    }
                } else {
                    this.f9173e = s.c(this.a);
                }
                if (this.f9172d == null) {
                    return EnumC0140a.INVALID_HOST;
                }
            } else {
                this.f9170b = sVar.f();
                this.f9171c = sVar.b();
                this.f9172d = sVar.f9165d;
                this.f9173e = sVar.f9166e;
                this.f9174f.clear();
                this.f9174f.addAll(sVar.d());
                if (b2 == c2 || str.charAt(b2) == '#') {
                    a(sVar.e());
                }
                i2 = b2;
            }
            int a5 = c.a(str, i2, c2, "?#");
            d(str, i2, a5);
            if (a5 < c2 && str.charAt(a5) == '?') {
                int a6 = c.a(str, a5, c2, '#');
                this.f9175g = s.e(s.a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, null));
                a5 = a6;
            }
            if (a5 < c2 && str.charAt(a5) == '#') {
                this.f9176h = s.a(str, 1 + a5, c2, "", true, false, false, false, null);
            }
            return EnumC0140a.SUCCESS;
        }

        public a a(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i2);
            }
            this.f9173e = i2;
            return this;
        }

        public a a(String str) {
            this.f9175g = str != null ? s.e(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f9172d != null) {
                return new s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            int i2 = this.f9173e;
            return i2 != -1 ? i2 : s.c(this.a);
        }

        public a b(String str) {
            if (str != null) {
                String a2 = a(str, 0, str.length());
                if (a2 != null) {
                    this.f9172d = a2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        public a c() {
            int size = this.f9174f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f9174f.set(i2, s.a(this.f9174f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.f9175g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.f9175g.get(i3);
                    if (str != null) {
                        this.f9175g.set(i3, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f9176h;
            if (str2 != null) {
                this.f9176h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a c(String str) {
            if (str != null) {
                this.f9171c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a d(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a e(String str) {
            if (str != null) {
                this.f9170b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.f9170b.isEmpty() || !this.f9171c.isEmpty()) {
                sb.append(this.f9170b);
                if (!this.f9171c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f9171c);
                }
                sb.append('@');
            }
            if (this.f9172d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f9172d);
                sb.append(']');
            } else {
                sb.append(this.f9172d);
            }
            int b2 = b();
            if (b2 != s.c(this.a)) {
                sb.append(':');
                sb.append(b2);
            }
            s.b(sb, this.f9174f);
            if (this.f9175g != null) {
                sb.append('?');
                s.a(sb, this.f9175g);
            }
            if (this.f9176h != null) {
                sb.append('#');
                sb.append(this.f9176h);
            }
            return sb.toString();
        }
    }

    s(a aVar) {
        this.a = aVar.a;
        this.f9163b = a(aVar.f9170b, false);
        this.f9164c = a(aVar.f9171c, false);
        this.f9165d = aVar.f9172d;
        this.f9166e = aVar.b();
        a(aVar.f9174f, false);
        List<String> list = aVar.f9175g;
        String str = null;
        this.f9167f = list != null ? a(list, true) : null;
        String str2 = aVar.f9176h;
        this.f9168g = str2 != null ? a(str2, false) : str;
        this.f9169h = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i4, i3)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            j.c cVar = new j.c();
            cVar.a(str, i2, i4);
            a(cVar, str, i4, i3, str2, z, z2, z3, z4, charset);
            return cVar.s();
        }
        return str.substring(i2, i3);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                j.c cVar = new j.c();
                cVar.a(str, i2, i4);
                a(cVar, str, i4, i3, z);
                return cVar.s();
            }
        }
        return str.substring(i2, i3);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void a(j.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        j.c cVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new j.c();
                    }
                    if (charset == null || charset.equals(c.f8805d)) {
                        cVar2.c(codePointAt);
                    } else {
                        cVar2.a(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!cVar2.g()) {
                        int readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        cVar.writeByte((int) f9162i[(readByte >> 4) & 15]);
                        cVar.writeByte((int) f9162i[readByte & 15]);
                    }
                } else {
                    cVar.c(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(j.c cVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int a2 = c.a(str.charAt(i2 + 1));
                int a3 = c.a(str.charAt(i4));
                if (!(a2 == -1 || a3 == -1)) {
                    cVar.writeByte((a2 << 4) + a3);
                    i2 = i4;
                    i2 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.writeByte(32);
                i2 += Character.charCount(codePointAt);
            }
            cVar.c(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && c.a(str.charAt(i2 + 1)) != -1 && c.a(str.charAt(i4)) != -1;
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static s d(String str) {
        a aVar = new a();
        if (aVar.a(null, str) == a.EnumC0140a.SUCCESS) {
            return aVar.a();
        }
        return null;
    }

    static List<String> e(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public a a(String str) {
        a aVar = new a();
        if (aVar.a(this, str) == a.EnumC0140a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public String a() {
        if (this.f9168g == null) {
            return null;
        }
        return this.f9169h.substring(this.f9169h.indexOf(35) + 1);
    }

    public s b(String str) {
        a a2 = a(str);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    public String b() {
        if (this.f9164c.isEmpty()) {
            return "";
        }
        int indexOf = this.f9169h.indexOf(64);
        return this.f9169h.substring(this.f9169h.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public String c() {
        int indexOf = this.f9169h.indexOf(47, this.a.length() + 3);
        String str = this.f9169h;
        return this.f9169h.substring(indexOf, c.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int indexOf = this.f9169h.indexOf(47, this.a.length() + 3);
        String str = this.f9169h;
        int a2 = c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = c.a(this.f9169h, i2, a2, '/');
            arrayList.add(this.f9169h.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String e() {
        if (this.f9167f == null) {
            return null;
        }
        int indexOf = this.f9169h.indexOf(63) + 1;
        String str = this.f9169h;
        return this.f9169h.substring(indexOf, c.a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f9169h.equals(this.f9169h);
    }

    public String f() {
        if (this.f9163b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f9169h;
        return this.f9169h.substring(length, c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f9165d;
    }

    public boolean h() {
        return this.a.equals("https");
    }

    public int hashCode() {
        return this.f9169h.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.f9170b = f();
        aVar.f9171c = b();
        aVar.f9172d = this.f9165d;
        aVar.f9173e = this.f9166e != c(this.a) ? this.f9166e : -1;
        aVar.f9174f.clear();
        aVar.f9174f.addAll(d());
        aVar.a(e());
        aVar.f9176h = a();
        return aVar;
    }

    public int j() {
        return this.f9166e;
    }

    public String k() {
        if (this.f9167f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.f9167f);
        return sb.toString();
    }

    public String l() {
        a a2 = a("/...");
        a2.e("");
        a2.c("");
        return a2.a().toString();
    }

    public String m() {
        return this.a;
    }

    public URI n() {
        a i2 = i();
        i2.c();
        String aVar = i2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f9169h;
    }
}
