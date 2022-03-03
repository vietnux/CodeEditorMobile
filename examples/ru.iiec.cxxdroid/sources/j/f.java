package j;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f implements Serializable, Comparable<f> {

    /* renamed from: e  reason: collision with root package name */
    static final char[] f9476e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    public static final f f9477f = a(new byte[0]);

    /* renamed from: b  reason: collision with root package name */
    final byte[] f9478b;

    /* renamed from: c  reason: collision with root package name */
    transient int f9479c;

    /* renamed from: d  reason: collision with root package name */
    transient String f9480d;

    f(byte[] bArr) {
        this.f9478b = bArr;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    static int a(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i4 == i2) {
                return i3;
            }
            int codePointAt = str.codePointAt(i3);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i4++;
            i3 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f a(String str) {
        if (str != null) {
            byte[] a = b.a(str);
            if (a != null) {
                return new f(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((a(str.charAt(i3)) << 4) + a(str.charAt(i3 + 1)));
            }
            return a(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    private f c(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f9478b));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f d(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(u.a));
            fVar.f9480d = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public byte a(int i2) {
        return this.f9478b[i2];
    }

    /* renamed from: a */
    public int compareTo(f fVar) {
        int m2 = m();
        int m3 = fVar.m();
        int min = Math.min(m2, m3);
        for (int i2 = 0; i2 < min; i2++) {
            int a = a(i2) & 255;
            int a2 = fVar.a(i2) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            }
        }
        if (m2 == m3) {
            return 0;
        }
        return m2 < m3 ? -1 : 1;
    }

    public f a(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.f9478b;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i2 == 0 && i3 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(this.f9478b, i2, bArr2, 0, i4);
                    return new f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f9478b.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        byte[] bArr = this.f9478b;
        cVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i2, f fVar, int i3, int i4) {
        return fVar.a(i3, this.f9478b, i2, i4);
    }

    public boolean a(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f9478b;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && u.a(bArr2, i2, bArr, i3, i4);
        }
    }

    public final boolean b(f fVar) {
        return a(0, fVar, 0, fVar.m());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int m2 = fVar.m();
            byte[] bArr = this.f9478b;
            return m2 == bArr.length && fVar.a(0, bArr, 0, bArr.length);
        }
    }

    public String h() {
        return b.a(this.f9478b);
    }

    public int hashCode() {
        int i2 = this.f9479c;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f9478b);
        this.f9479c = hashCode;
        return hashCode;
    }

    public String i() {
        byte[] bArr = this.f9478b;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f9476e;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public f j() {
        return c("MD5");
    }

    public f k() {
        return c("SHA-1");
    }

    public f l() {
        return c("SHA-256");
    }

    public int m() {
        return this.f9478b.length;
    }

    public f n() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f9478b;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 < 65 || b2 > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr2);
            }
        }
    }

    public byte[] o() {
        return (byte[]) this.f9478b.clone();
    }

    public String p() {
        String str = this.f9480d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f9478b, u.a);
        this.f9480d = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f9478b.length == 0) {
            return "[size=0]";
        }
        String p = p();
        int a = a(p, 64);
        if (a == -1) {
            if (this.f9478b.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(i());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f9478b.length);
                sb2.append(" hex=");
                sb2.append(a(0, 64).i());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = p.substring(0, a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a < p.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f9478b.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
