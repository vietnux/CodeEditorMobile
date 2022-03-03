package e.b.d.y;

import e.b.d.w.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

public class a implements Closeable {
    private static final char[] q = ")]}'\n".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private final Reader f8031b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8032c = false;

    /* renamed from: d  reason: collision with root package name */
    private final char[] f8033d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    private int f8034e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f8035f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f8036g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f8037h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f8038i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f8039j;

    /* renamed from: k  reason: collision with root package name */
    private int f8040k;

    /* renamed from: l  reason: collision with root package name */
    private String f8041l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f8042m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    /* renamed from: e.b.d.y.a$a  reason: collision with other inner class name */
    static class C0115a extends e {
        C0115a() {
        }

        @Override // e.b.d.w.e
        public void a(a aVar) {
            int i2;
            if (aVar instanceof e.b.d.w.m.e) {
                ((e.b.d.w.m.e) aVar).D();
                return;
            }
            int i3 = aVar.f8038i;
            if (i3 == 0) {
                i3 = aVar.n();
            }
            if (i3 == 13) {
                i2 = 9;
            } else if (i3 == 12) {
                i2 = 8;
            } else if (i3 == 14) {
                i2 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.B() + aVar.t());
            }
            aVar.f8038i = i2;
        }
    }

    static {
        e.a = new C0115a();
    }

    public a(Reader reader) {
        int[] iArr = this.f8042m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.f8031b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void D() {
        if (!this.f8032c) {
            c("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private void E() {
        b(true);
        this.f8034e--;
        int i2 = this.f8034e;
        char[] cArr = q;
        if (i2 + cArr.length <= this.f8035f || a(cArr.length)) {
            int i3 = 0;
            while (true) {
                char[] cArr2 = q;
                if (i3 >= cArr2.length) {
                    this.f8034e += cArr2.length;
                    return;
                } else if (this.f8033d[this.f8034e + i3] == cArr2[i3]) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        D();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String F() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.y.a.F():java.lang.String");
    }

    private int G() {
        String str;
        String str2;
        int i2;
        char c2 = this.f8033d[this.f8034e];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c2 != 'n' && c2 != 'N') {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f8034e + i3 >= this.f8035f && !a(i3 + 1)) {
                return 0;
            }
            char c3 = this.f8033d[this.f8034e + i3];
            if (!(c3 == str2.charAt(i3) || c3 == str.charAt(i3))) {
                return 0;
            }
        }
        if ((this.f8034e + length < this.f8035f || a(length + 1)) && a(this.f8033d[this.f8034e + length])) {
            return 0;
        }
        this.f8034e += length;
        this.f8038i = i2;
        return i2;
    }

    private int H() {
        int i2;
        char c2;
        char[] cArr = this.f8033d;
        int i3 = this.f8034e;
        int i4 = 0;
        int i5 = this.f8035f;
        int i6 = 0;
        char c3 = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 + i6 == i5) {
                if (i6 == cArr.length) {
                    return i4;
                }
                if (!a(i6 + 1)) {
                    break;
                }
                i3 = this.f8034e;
                i5 = this.f8035f;
            }
            c2 = cArr[i3 + i6];
            if (c2 == '+') {
                i4 = 0;
                if (c3 != 5) {
                    return 0;
                }
            } else if (c2 == 'E' || c2 == 'e') {
                i4 = 0;
                if (c3 != 2 && c3 != 4) {
                    return 0;
                }
                c3 = 5;
                i6++;
            } else {
                if (c2 == '-') {
                    i4 = 0;
                    if (c3 == 0) {
                        c3 = 1;
                        z2 = true;
                    } else if (c3 != 5) {
                        return 0;
                    }
                } else if (c2 == '.') {
                    i4 = 0;
                    if (c3 != 2) {
                        return 0;
                    }
                    c3 = 3;
                } else if (c2 >= '0' && c2 <= '9') {
                    if (c3 == 1 || c3 == 0) {
                        j2 = (long) (-(c2 - '0'));
                        i4 = 0;
                        c3 = 2;
                    } else {
                        if (c3 == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - ((long) (c2 - '0'));
                            int i7 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                            boolean z3 = i7 > 0 || (i7 == 0 && j3 < j2);
                            j2 = j3;
                            z = z3 & z;
                        } else if (c3 == 3) {
                            i4 = 0;
                            c3 = 4;
                        } else if (c3 == 5 || c3 == 6) {
                            i4 = 0;
                            c3 = 7;
                        }
                        i4 = 0;
                    }
                }
                i6++;
            }
            c3 = 6;
            i6++;
        }
        if (a(c2)) {
            return 0;
        }
        if (c3 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.f8039j = j2;
            this.f8034e += i6;
            i2 = 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.f8040k = i6;
            i2 = 16;
        }
        this.f8038i = i2;
        return i2;
    }

    private char I() {
        int i2;
        int i3;
        if (this.f8034e != this.f8035f || a(1)) {
            char[] cArr = this.f8033d;
            int i4 = this.f8034e;
            this.f8034e = i4 + 1;
            char c2 = cArr[i4];
            if (c2 == '\n') {
                this.f8036g++;
                this.f8037h = this.f8034e;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 != 'u') {
                    c("Invalid escape sequence");
                    throw null;
                } else if (this.f8034e + 4 <= this.f8035f || a(4)) {
                    char c3 = 0;
                    int i5 = this.f8034e;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c4 = this.f8033d[i5];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i2 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f8033d, this.f8034e, 4));
                            } else {
                                i2 = c4 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c4 - '0';
                        }
                        c3 = (char) (c5 + i3);
                        i5++;
                    }
                    this.f8034e += 4;
                    return c3;
                } else {
                    c("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        c("Unterminated escape sequence");
        throw null;
    }

    private void J() {
        char c2;
        do {
            if (this.f8034e < this.f8035f || a(1)) {
                char[] cArr = this.f8033d;
                int i2 = this.f8034e;
                this.f8034e = i2 + 1;
                c2 = cArr[i2];
                if (c2 == '\n') {
                    this.f8036g++;
                    this.f8037h = this.f8034e;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        D();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.y.a.K():void");
    }

    private boolean a(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        D();
        return false;
    }

    private boolean a(int i2) {
        int i3;
        char[] cArr = this.f8033d;
        int i4 = this.f8037h;
        int i5 = this.f8034e;
        this.f8037h = i4 - i5;
        int i6 = this.f8035f;
        if (i6 != i5) {
            this.f8035f = i6 - i5;
            System.arraycopy(cArr, i5, cArr, 0, this.f8035f);
        } else {
            this.f8035f = 0;
        }
        this.f8034e = 0;
        do {
            Reader reader = this.f8031b;
            int i7 = this.f8035f;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            this.f8035f += read;
            if (this.f8036g == 0 && (i3 = this.f8037h) == 0 && this.f8035f > 0 && cArr[0] == 65279) {
                this.f8034e++;
                this.f8037h = i3 + 1;
                i2++;
            }
        } while (this.f8035f < i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f8034e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f8034e--;
        r2 = a(2);
        r7.f8034e++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r2 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        D();
        r2 = r7.f8034e;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == '*') goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r3 == '/') goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r7.f8034e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r7.f8034e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (b("*\/") == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        c("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        r7.f8034e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r1 != '#') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(boolean r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.y.a.b(boolean):int");
    }

    private String b(char c2) {
        char[] cArr = this.f8033d;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f8034e;
            int i3 = this.f8035f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f8034e = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f8034e = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(I());
                    } else {
                        if (c3 == '\n') {
                            this.f8036g++;
                            this.f8037h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f8034e = i2;
                    if (!a(1)) {
                        c("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private void b(int i2) {
        int i3 = this.n;
        int[] iArr = this.f8042m;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            int[] iArr3 = new int[(i3 * 2)];
            String[] strArr = new String[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.f8042m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.f8042m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr4[i4] = i2;
    }

    private boolean b(String str) {
        int length = str.length();
        while (true) {
            if (this.f8034e + length > this.f8035f && !a(length)) {
                return false;
            }
            char[] cArr = this.f8033d;
            int i2 = this.f8034e;
            if (cArr[i2] == '\n') {
                this.f8036g++;
                this.f8037h = i2 + 1;
            } else {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f8033d[this.f8034e + i3] == str.charAt(i3)) {
                    }
                }
                return true;
            }
            this.f8034e++;
        }
    }

    private IOException c(String str) {
        throw new d(str + t());
    }

    private void c(char c2) {
        char[] cArr = this.f8033d;
        while (true) {
            int i2 = this.f8034e;
            int i3 = this.f8035f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f8034e = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f8034e = i4;
                        I();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f8036g++;
                            this.f8037h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f8034e = i2;
                    if (!a(1)) {
                        c("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String A() {
        String str;
        char c2;
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 10) {
            str = F();
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 11) {
                str = this.f8041l;
                this.f8041l = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f8039j);
            } else if (i2 == 16) {
                str = new String(this.f8033d, this.f8034e, this.f8040k);
                this.f8034e += this.f8040k;
            } else {
                throw new IllegalStateException("Expected a string but was " + B() + t());
            }
            str = b(c2);
        }
        this.f8038i = 0;
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public b B() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void C() {
        char c2;
        int i2 = 0;
        do {
            int i3 = this.f8038i;
            if (i3 == 0) {
                i3 = n();
            }
            if (i3 == 3) {
                b(1);
            } else if (i3 == 1) {
                b(3);
            } else if (i3 == 4 || i3 == 2) {
                this.n--;
                i2--;
                this.f8038i = 0;
            } else if (i3 == 14 || i3 == 10) {
                K();
                this.f8038i = 0;
            } else {
                if (i3 == 8 || i3 == 12) {
                    c2 = '\'';
                } else if (i3 == 9 || i3 == 13) {
                    c2 = '\"';
                } else {
                    if (i3 == 16) {
                        this.f8034e += this.f8040k;
                    }
                    this.f8038i = 0;
                }
                c(c2);
                this.f8038i = 0;
            }
            i2++;
            this.f8038i = 0;
        } while (i2 != 0);
        int[] iArr = this.p;
        int i4 = this.n;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.o[i4 - 1] = "null";
    }

    public final void a(boolean z) {
        this.f8032c = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8038i = 0;
        this.f8042m[0] = 8;
        this.n = 1;
        this.f8031b.close();
    }

    public void l() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 3) {
            b(1);
            this.p[this.n - 1] = 0;
            this.f8038i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + B() + t());
    }

    public void m() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 1) {
            b(3);
            this.f8038i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + B() + t());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int n() {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.y.a.n():int");
    }

    public void o() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 4) {
            this.n--;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f8038i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + B() + t());
    }

    public void p() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 2) {
            this.n--;
            String[] strArr = this.o;
            int i3 = this.n;
            strArr[i3] = null;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f8038i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + B() + t());
    }

    public String q() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f8042m[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.p[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean r() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean s() {
        return this.f8032c;
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return " at line " + (this.f8036g + 1) + " column " + ((this.f8034e - this.f8037h) + 1) + " path " + q();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }

    public boolean u() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 5) {
            this.f8038i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f8038i = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + B() + t());
        }
    }

    public double v() {
        String str;
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            this.f8038i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f8039j;
        }
        if (i2 == 16) {
            this.f8041l = new String(this.f8033d, this.f8034e, this.f8040k);
            this.f8034e += this.f8040k;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = b(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = F();
            } else if (i2 != 11) {
                throw new IllegalStateException("Expected a double but was " + B() + t());
            }
            this.f8041l = str;
        }
        this.f8038i = 11;
        double parseDouble = Double.parseDouble(this.f8041l);
        if (this.f8032c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f8041l = null;
            this.f8038i = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + t());
    }

    public int w() {
        String b2;
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            long j2 = this.f8039j;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f8038i = 0;
                int[] iArr = this.p;
                int i4 = this.n - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.f8039j + t());
        }
        if (i2 == 16) {
            this.f8041l = new String(this.f8033d, this.f8034e, this.f8040k);
            this.f8034e += this.f8040k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                b2 = F();
            } else {
                b2 = b(i2 == 8 ? '\'' : '\"');
            }
            this.f8041l = b2;
            try {
                int parseInt = Integer.parseInt(this.f8041l);
                this.f8038i = 0;
                int[] iArr2 = this.p;
                int i5 = this.n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + B() + t());
        }
        this.f8038i = 11;
        double parseDouble = Double.parseDouble(this.f8041l);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.f8041l = null;
            this.f8038i = 0;
            int[] iArr3 = this.p;
            int i7 = this.n - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.f8041l + t());
    }

    public long x() {
        String b2;
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            this.f8038i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f8039j;
        }
        if (i2 == 16) {
            this.f8041l = new String(this.f8033d, this.f8034e, this.f8040k);
            this.f8034e += this.f8040k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                b2 = F();
            } else {
                b2 = b(i2 == 8 ? '\'' : '\"');
            }
            this.f8041l = b2;
            try {
                long parseLong = Long.parseLong(this.f8041l);
                this.f8038i = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + B() + t());
        }
        this.f8038i = 11;
        double parseDouble = Double.parseDouble(this.f8041l);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f8041l = null;
            this.f8038i = 0;
            int[] iArr3 = this.p;
            int i5 = this.n - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f8041l + t());
    }

    public String y() {
        String str;
        char c2;
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 14) {
            str = F();
        } else {
            if (i2 == 12) {
                c2 = '\'';
            } else if (i2 == 13) {
                c2 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + B() + t());
            }
            str = b(c2);
        }
        this.f8038i = 0;
        this.o[this.n - 1] = str;
        return str;
    }

    public void z() {
        int i2 = this.f8038i;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 7) {
            this.f8038i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + B() + t());
    }
}
