package e.b.d.y;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class c implements Closeable, Flushable {

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f8054k = new String[128];

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f8055l;

    /* renamed from: b  reason: collision with root package name */
    private final Writer f8056b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f8057c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    private int f8058d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f8059e;

    /* renamed from: f  reason: collision with root package name */
    private String f8060f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8061g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8062h;

    /* renamed from: i  reason: collision with root package name */
    private String f8063i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8064j;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f8054k[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f8054k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f8055l = (String[]) strArr.clone();
        String[] strArr2 = f8055l;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f8060f = ":";
        this.f8064j = true;
        if (writer != null) {
            this.f8056b = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private c a(int i2, int i3, String str) {
        int w = w();
        if (w != i3 && w != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f8063i == null) {
            this.f8058d--;
            if (w == i3) {
                v();
            }
            this.f8056b.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f8063i);
        }
    }

    private c a(int i2, String str) {
        u();
        a(i2);
        this.f8056b.write(str);
        return this;
    }

    private void a(int i2) {
        int i3 = this.f8058d;
        int[] iArr = this.f8057c;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f8057c = iArr2;
        }
        int[] iArr3 = this.f8057c;
        int i4 = this.f8058d;
        this.f8058d = i4 + 1;
        iArr3[i4] = i2;
    }

    private void b(int i2) {
        this.f8057c[this.f8058d - 1] = i2;
    }

    private void e(String str) {
        String str2;
        String[] strArr = this.f8062h ? f8055l : f8054k;
        this.f8056b.write("\"");
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f8056b.write(str, i2, i3 - i2);
            }
            this.f8056b.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f8056b.write(str, i2, length - i2);
        }
        this.f8056b.write("\"");
    }

    private void t() {
        int w = w();
        if (w == 5) {
            this.f8056b.write(44);
        } else if (w != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        v();
        b(4);
    }

    private void u() {
        int w = w();
        if (w == 1) {
            b(2);
        } else if (w == 2) {
            this.f8056b.append(',');
        } else if (w != 4) {
            if (w != 6) {
                if (w != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f8061g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
            return;
        } else {
            this.f8056b.append((CharSequence) this.f8060f);
            b(5);
            return;
        }
        v();
    }

    private void v() {
        if (this.f8059e != null) {
            this.f8056b.write("\n");
            int i2 = this.f8058d;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f8056b.write(this.f8059e);
            }
        }
    }

    private int w() {
        int i2 = this.f8058d;
        if (i2 != 0) {
            return this.f8057c[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void x() {
        if (this.f8063i != null) {
            t();
            e(this.f8063i);
            this.f8063i = null;
        }
    }

    public c a(Boolean bool) {
        if (bool == null) {
            return s();
        }
        x();
        u();
        this.f8056b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return s();
        }
        x();
        String obj = number.toString();
        if (this.f8061g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            u();
            this.f8056b.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void a(boolean z) {
        this.f8062h = z;
    }

    public c b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f8063i != null) {
            throw new IllegalStateException();
        } else if (this.f8058d != 0) {
            this.f8063i = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void b(boolean z) {
        this.f8061g = z;
    }

    public final void c(String str) {
        String str2;
        if (str.length() == 0) {
            this.f8059e = null;
            str2 = ":";
        } else {
            this.f8059e = str;
            str2 = ": ";
        }
        this.f8060f = str2;
    }

    public final void c(boolean z) {
        this.f8064j = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8056b.close();
        int i2 = this.f8058d;
        if (i2 > 1 || (i2 == 1 && this.f8057c[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8058d = 0;
    }

    public c d(String str) {
        if (str == null) {
            return s();
        }
        x();
        u();
        e(str);
        return this;
    }

    public c d(boolean z) {
        x();
        u();
        this.f8056b.write(z ? "true" : "false");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f8058d != 0) {
            this.f8056b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g(long j2) {
        x();
        u();
        this.f8056b.write(Long.toString(j2));
        return this;
    }

    public c l() {
        x();
        a(1, "[");
        return this;
    }

    public c m() {
        x();
        a(3, "{");
        return this;
    }

    public c n() {
        a(1, 2, "]");
        return this;
    }

    public c o() {
        a(3, 5, "}");
        return this;
    }

    public final boolean p() {
        return this.f8064j;
    }

    public final boolean q() {
        return this.f8062h;
    }

    public boolean r() {
        return this.f8061g;
    }

    public c s() {
        if (this.f8063i != null) {
            if (this.f8064j) {
                x();
            } else {
                this.f8063i = null;
                return this;
            }
        }
        u();
        this.f8056b.write("null");
        return this;
    }
}
