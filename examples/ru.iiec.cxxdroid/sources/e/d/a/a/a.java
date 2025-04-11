package e.d.a.a;

import java.io.InputStream;
import java.io.OutputStream;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[][] f8177b = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 2, 2, 3, -1}, new byte[]{-2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, -2, -2, -2, -2, -2, -2}, new byte[]{-2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, 1, 1, 1, 1, 1, 1, 1, 1, -2, -2, -2, -2, -2, -2, -2, -2}, new byte[]{-2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, 2, 2, 2, 2, 2, 2, 2, 2, -2, -2, -2, -2, -2, -2, -2, -2}};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f8178c = {Byte.MAX_VALUE, 31, 15, 7};
    private int a = 0;

    private int a(InputStream inputStream) {
        int i2;
        int read = inputStream.read();
        if (read == 254 || read == 255) {
            inputStream.read();
            read = inputStream.read();
            i2 = this.a + 2;
        } else {
            if (read == 239) {
                inputStream.read();
                inputStream.read();
                read = inputStream.read();
                i2 = this.a + 3;
            }
            return read;
        }
        this.a = i2;
        return read;
    }

    private h0 a(InputStream inputStream, char[] cArr, String str, l lVar) {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int read = inputStream.read();
            if (read != -1 && !lVar.b()) {
                this.a++;
                if (read == 13) {
                    if (str.equals("Windows")) {
                        inputStream.read();
                        this.a++;
                    }
                    read = 10;
                }
                if (read == 10) {
                    i2++;
                }
                cArr[i3] = (char) read;
                i3++;
            }
        }
        return new h0(i3, i2);
    }

    private h0 a(InputStream inputStream, char[] cArr, boolean z, String str, l lVar) {
        int read;
        int a2 = a(inputStream);
        int i2 = 1;
        int i3 = 0;
        while (a2 != -1 && (read = inputStream.read()) != -1 && !lVar.b()) {
            this.a += 2;
            char c2 = (char) (z ? (a2 << 8) | read : a2 | (read << 8));
            if (c2 == '\r') {
                if (str.equals("Windows")) {
                    inputStream.read();
                    inputStream.read();
                    this.a++;
                }
                c2 = '\n';
            }
            if (c2 == '\n') {
                i2++;
            }
            cArr[i3] = c2;
            a2 = inputStream.read();
            i3++;
        }
        return new h0(i3, i2);
    }

    public static String a(InputStream inputStream, String str) {
        String str2 = null;
        try {
            if (str.equals("UTF-16BE")) {
                inputStream.read();
            }
            int i2 = 0;
            while (str2 == null) {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                if (read == 10 && i2 != 13) {
                    str2 = "Unix";
                }
                if (i2 == 13) {
                    str2 = read == 10 ? "Windows" : "Mac OS 9";
                }
                if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
                    inputStream.read();
                }
                i2 = read;
            }
        } catch (Exception unused) {
        }
        return str2 == null ? "Unix" : str2;
    }

    private void a(OutputStream outputStream, j jVar, String str, l lVar) {
        while (jVar.l() && !lVar.b()) {
            char o = jVar.o();
            this.a++;
            if (o != 65535) {
                if (o == '\n' && str.equals("Windows")) {
                    outputStream.write(13);
                } else if (o == '\n' && str.equals("Mac OS 9")) {
                    o = '\r';
                }
                outputStream.write(o);
            } else {
                return;
            }
        }
    }

    private void a(OutputStream outputStream, j jVar, boolean z, String str, l lVar) {
        int i2;
        a(outputStream, z ? "UTF-16BE" : "UTF-16LE");
        while (jVar.l() && !lVar.b()) {
            char o = jVar.o();
            this.a++;
            if (o != 65535) {
                if (o != '\n' || !str.equals("Windows")) {
                    if (o == '\n' && str.equals("Mac OS 9")) {
                        o = '\r';
                    }
                } else if (z) {
                    outputStream.write(0);
                    outputStream.write(13);
                } else {
                    outputStream.write(13);
                    outputStream.write(0);
                }
                if (z) {
                    outputStream.write(o >>> '\b');
                    i2 = o & 255;
                } else {
                    outputStream.write(o & 255);
                    i2 = o >>> '\b';
                }
                outputStream.write(i2);
            } else {
                return;
            }
        }
    }

    private h0 b(InputStream inputStream, char[] cArr, String str, l lVar) {
        int i2;
        int a2 = a(inputStream);
        int i3 = 1;
        int i4 = 0;
        byte b2 = 0;
        int i5 = 0;
        byte b3 = 0;
        while (a2 != -1 && !lVar.b()) {
            this.a++;
            b2 = f8177b[b2][a2 >>> 3];
            if (b2 == -2 || b2 == -1) {
                cArr[i4] = '?';
                i4++;
                b2 = 0;
            } else if (b2 == 0) {
                int i6 = i5 + (a2 & 127);
                if (i6 == 13) {
                    if (str.equals("Windows")) {
                        inputStream.read();
                        this.a++;
                    }
                    i6 = 10;
                }
                if (i6 <= 65535) {
                    if (i6 == 10) {
                        i3++;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i6;
                } else {
                    int i7 = i4 + 1;
                    cArr[i4] = (char) ((i6 >> 10) + 55232);
                    cArr[i7] = (char) ((i6 & 1023) + 56320);
                    i2 = i7 + 1;
                }
                i4 = i2;
            } else if (b2 == 1 || b2 == 2 || b2 == 3) {
                if (b3 == 0) {
                    b3 = f8178c[b2];
                }
                i5 = (i5 + (a2 & b3)) << 6;
                b3 = 63;
                a2 = inputStream.read();
            } else {
                a2 = inputStream.read();
            }
            i5 = 0;
            b3 = 0;
            a2 = inputStream.read();
        }
        return new h0(i4, i3);
    }

    private void b(OutputStream outputStream, j jVar, String str, l lVar) {
        int i2;
        int i3;
        a(outputStream, "UTF-8");
        while (jVar.l() && !lVar.b()) {
            int o = jVar.o();
            this.a++;
            if (o != 65535) {
                if (o >= 55296 && o <= 57343) {
                    o = ((o - 55232) << 10) + (jVar.o() & 1023);
                }
                if (o >= 128) {
                    if (o < 2048) {
                        i3 = (o >> 6) + 192;
                    } else {
                        if (o < 65536) {
                            i2 = (o >> 12) + 224;
                        } else {
                            outputStream.write((o >> 18) + 240);
                            i2 = ((o >> 12) & 63) + 128;
                        }
                        outputStream.write(i2);
                        i3 = ((o >> 6) & 63) + 128;
                    }
                    outputStream.write(i3);
                    o = (o & 63) + 128;
                } else if (o == 10 && str.equals("Windows")) {
                    outputStream.write(13);
                } else if (o == 10 && str.equals("Mac OS 9")) {
                    o = 13;
                }
                outputStream.write(o);
            } else {
                return;
            }
        }
    }

    public h0 a(InputStream inputStream, char[] cArr, String str, String str2, l lVar) {
        this.a = 0;
        if (str.equals("ISO-8859-1")) {
            return a(inputStream, cArr, str2, lVar);
        }
        if (str.equals("UTF-16BE")) {
            return a(inputStream, cArr, true, str2, lVar);
        }
        if (str.equals("UTF-16LE")) {
            return a(inputStream, cArr, false, str2, lVar);
        }
        if (str.equals("UTF-8")) {
            return b(inputStream, cArr, str2, lVar);
        }
        o0.a("Unsupported encoding option" + str);
        return new h0(0, 0);
    }

    public void a(OutputStream outputStream, j jVar, String str, String str2, l lVar) {
        boolean z;
        this.a = 0;
        jVar.h(0);
        if (str.equals("ISO-8859-1")) {
            a(outputStream, jVar, str2, lVar);
            return;
        }
        if (str.equals("UTF-16BE")) {
            z = true;
        } else if (str.equals("UTF-16LE")) {
            z = false;
        } else if (str.equals("UTF-8")) {
            b(outputStream, jVar, str2, lVar);
            return;
        } else {
            o0.a("Unsupported encoding option" + str);
            return;
        }
        a(outputStream, jVar, z, str2, lVar);
    }

    public void a(OutputStream outputStream, String str) {
    }
}
