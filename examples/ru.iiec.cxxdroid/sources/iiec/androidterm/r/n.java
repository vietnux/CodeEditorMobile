package iiec.androidterm.r;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class n {
    private static final char[] X = new char[128];
    private int A;
    private boolean B;
    private int C = 0;
    private boolean D = false;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int[] M = new int[2];
    private boolean N;
    private int O = 0;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = false;
    private int S = 0;
    private ByteBuffer T;
    private CharBuffer U;
    private CharsetDecoder V;
    private s W;
    private l a;

    /* renamed from: b  reason: collision with root package name */
    private int f9420b;

    /* renamed from: c  reason: collision with root package name */
    private int f9421c;

    /* renamed from: d  reason: collision with root package name */
    private int f9422d;

    /* renamed from: e  reason: collision with root package name */
    private int f9423e;

    /* renamed from: f  reason: collision with root package name */
    private q f9424f;

    /* renamed from: g  reason: collision with root package name */
    private q f9425g;

    /* renamed from: h  reason: collision with root package name */
    private q f9426h;

    /* renamed from: i  reason: collision with root package name */
    private m f9427i;

    /* renamed from: j  reason: collision with root package name */
    private int f9428j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f9429k = new int[16];

    /* renamed from: l  reason: collision with root package name */
    private byte[] f9430l = new byte[512];

    /* renamed from: m  reason: collision with root package name */
    private int f9431m;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean[] y;
    private int z;

    static {
        for (char c2 = 0; c2 < 128; c2 = (char) (c2 + 1)) {
            X[c2] = c2;
        }
        char[] cArr = X;
        cArr[95] = ' ';
        cArr[98] = 9225;
        cArr[99] = 9228;
        cArr[100] = 9229;
        cArr[101] = 9226;
        cArr[104] = 9252;
        cArr[105] = 9227;
        cArr[125] = 163;
        cArr[102] = 176;
        cArr[96] = 11045;
        cArr[126] = 8226;
        cArr[121] = 8804;
        cArr[124] = 8800;
        cArr[122] = 8805;
        cArr[103] = 177;
        cArr[123] = 960;
        cArr[46] = 9660;
        cArr[44] = 9664;
        cArr[43] = 9654;
        cArr[45] = 9650;
        cArr[104] = '#';
        cArr[97] = 9618;
        cArr[48] = 9608;
        cArr[113] = 9472;
        cArr[120] = 9474;
        cArr[109] = 9492;
        cArr[106] = 9496;
        cArr[108] = 9484;
        cArr[107] = 9488;
        cArr[119] = 9516;
        cArr[117] = 9508;
        cArr[116] = 9500;
        cArr[118] = 9524;
        cArr[110] = 9532;
        cArr[111] = 9146;
        cArr[112] = 9147;
        cArr[114] = 9148;
        cArr[115] = 9149;
    }

    public n(m mVar, q qVar, int i2, int i3, d dVar) {
        this.f9427i = mVar;
        this.f9424f = qVar;
        this.f9426h = this.f9424f;
        this.f9425g = new q(i2, i3, i3, dVar);
        this.f9422d = i3;
        this.f9423e = i2;
        this.y = new boolean[this.f9423e];
        a(dVar);
        this.T = ByteBuffer.allocate(4);
        this.U = CharBuffer.allocate(2);
        this.V = Charset.forName("UTF-8").newDecoder();
        this.V.onMalformedInput(CodingErrorAction.REPLACE);
        this.V.onUnmappableCharacter(CodingErrorAction.REPLACE);
        l();
    }

    private void A() {
        c(e(1) - 1, d(1) - 1);
    }

    private void B() {
        this.f9431m = 0;
    }

    private void C() {
        this.n = 0;
    }

    private int a(int i2, int i3, boolean z2) {
        int i4 = this.f9429k[i2];
        return (i4 < 0 || (i4 == 0 && z2)) ? i3 : i4;
    }

    private void a(byte b2) {
        int i2 = this.f9431m;
        if (i2 < 512) {
            byte[] bArr = this.f9430l;
            this.f9431m = i2 + 1;
            bArr[i2] = b2;
            o();
            return;
        }
        p(b2);
    }

    private void a(byte b2, boolean z2) {
        int i2;
        int i3;
        if (z2 && this.Q && l(b2)) {
            return;
        }
        if ((b2 & 128) == 128 && (i3 = b2 & Byte.MAX_VALUE) <= 31) {
            a((byte) 27, false);
            a((byte) (i3 + 64), false);
        } else if (b2 == 0) {
        } else {
            if (b2 != 24 && b2 != 26) {
                if (b2 != 27) {
                    switch (b2) {
                        case 7:
                            if (this.p != 8) {
                                return;
                            }
                            break;
                        case 8:
                            i2 = Math.max(0, this.f9421c - 1);
                            break;
                        case 9:
                            i2 = j(this.f9421c);
                            break;
                        case 10:
                        case 11:
                        case 12:
                            p();
                            return;
                        case 13:
                            l(0);
                            return;
                        case 14:
                            d(true);
                            return;
                        case 15:
                            d(false);
                            return;
                        default:
                            this.o = false;
                            switch (this.p) {
                                case 0:
                                    if (b2 >= 32) {
                                        k(b2);
                                        break;
                                    }
                                    break;
                                case 1:
                                    b(b2);
                                    break;
                                case 2:
                                    f(b2);
                                    break;
                                case 3:
                                    i(b2);
                                    break;
                                case 4:
                                    j(b2);
                                    break;
                                case 5:
                                    d(b2);
                                    break;
                                case 6:
                                    c(b2);
                                    break;
                                case 7:
                                    e(b2);
                                    break;
                                case 8:
                                    g(b2);
                                    break;
                                case 9:
                                    h(b2);
                                    break;
                                default:
                                    p(b2);
                                    break;
                            }
                            if (!this.o) {
                                this.p = 0;
                                return;
                            }
                            return;
                    }
                    l(i2);
                    return;
                } else if (this.p != 8) {
                    n(1);
                    return;
                }
                g(b2);
            } else if (this.p != 0) {
                this.p = 0;
                k(Byte.MAX_VALUE);
            }
        }
    }

    private void a(int i2, byte b2) {
        int i3;
        if (b2 == 65) {
            i3 = 0;
        } else if (b2 != 66) {
            switch (b2) {
                case 48:
                    i3 = 2;
                    break;
                case 49:
                    i3 = 3;
                    break;
                case 50:
                    i3 = 4;
                    break;
                default:
                    p(b2);
                    return;
            }
        } else {
            i3 = 1;
        }
        this.M[i2] = i3;
        n();
    }

    private void a(int i2, int i3, int i4) {
        b(i2, i3, i4, 1);
    }

    private void a(int i2, String str) {
        if (i2 == 0 || i2 == 2) {
            this.f9427i.a(str);
        }
    }

    private void a(char[] cArr) {
        c((Character.isHighSurrogate(cArr[0]) ? Character.toCodePoint(cArr[0], cArr[1]) : cArr[0]) == 1 ? 1 : 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x001c */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: char[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    private void a(char[] cArr, int i2, int i3, int i4) {
        char c2;
        while (i2 < i3 && cArr[i2] != 0) {
            if (Character.isHighSurrogate(cArr[i2])) {
                char c3 = cArr[i2];
                i2++;
                c2 = Character.toCodePoint(c3, cArr[i2]);
            } else {
                c2 = cArr[i2];
            }
            b(c2 == true ? 1 : 0, i4);
            i2++;
        }
    }

    private boolean a(int i2) {
        return g(i2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(byte b2) {
        int i2;
        if (b2 != 35) {
            if (b2 != 48) {
                if (b2 == 72) {
                    this.y[this.f9421c] = true;
                    return;
                } else if (b2 != 80) {
                    if (b2 == 93) {
                        B();
                        i2 = 8;
                    } else if (b2 == 99) {
                        this.f9426h.a(this.f9423e + 1, this.f9422d, v());
                        this.f9426h.a(this.f9423e, this.f9422d, v());
                        return;
                    } else if (b2 == 40) {
                        i2 = 3;
                    } else if (b2 == 41) {
                        i2 = 4;
                    } else if (b2 == 55) {
                        this.q = this.f9420b;
                        this.r = this.f9421c;
                        this.s = this.J;
                        this.t = this.u & 192;
                        return;
                    } else if (b2 == 56) {
                        d(this.q, this.r);
                        this.J = this.s;
                        this.u = (this.u & -193) | this.t;
                        return;
                    } else if (b2 == 61) {
                        this.K = true;
                        return;
                    } else if (b2 == 62) {
                        this.K = false;
                        return;
                    } else if (b2 == 77) {
                        int i3 = this.f9420b;
                        int i4 = this.z;
                        if (i3 <= i4) {
                            this.f9426h.a(0, i4, this.f9423e, this.A - (i4 + 1), 0, i4 + 1);
                            a(0, this.z, this.f9423e);
                            return;
                        }
                        this.f9420b = i3 - 1;
                        return;
                    } else if (b2 != 78) {
                        if (b2 == 90) {
                            y();
                            return;
                        } else if (b2 != 91) {
                            switch (b2) {
                                case 68:
                                    break;
                                case 69:
                                    l(0);
                                    break;
                                case 70:
                                    d(0, this.A - 1);
                                    return;
                                default:
                                    p(b2);
                                    return;
                            }
                            p();
                            return;
                        } else {
                            i2 = 5;
                        }
                    }
                }
            }
            o(b2);
            return;
        }
        i2 = 2;
        b(i2);
    }

    private void b(int i2) {
        this.p = i2;
        this.o = true;
    }

    private void b(int i2, int i3) {
        int i4;
        int i5;
        q qVar;
        int i6;
        int i7;
        int i8;
        boolean m2 = m();
        int g2 = r.g(i2);
        boolean z2 = false;
        if (m2 && this.f9421c == this.f9423e - 1 && (this.B || g2 == 2)) {
            this.f9426h.d(this.f9420b);
            this.f9421c = 0;
            this.D = true;
            int i9 = this.f9420b;
            if (i9 + 1 < this.A) {
                this.f9420b = i9 + 1;
            } else {
                w();
            }
        }
        if ((this.x && (g2 != 0)) && (i7 = (i6 = this.f9421c) + g2) < (i8 = this.f9423e)) {
            q qVar2 = this.f9426h;
            int i10 = this.f9420b;
            qVar2.a(i6, i10, i8 - i7, 1, i7, i10);
        }
        if (g2 == 0) {
            if (this.D) {
                qVar = this.f9426h;
                i5 = this.f9423e - this.C;
                i4 = this.f9420b - 1;
            } else {
                qVar = this.f9426h;
                i5 = this.f9421c - this.C;
                i4 = this.f9420b;
            }
            qVar.b(i5, i4, i2, i3);
        } else {
            this.f9426h.b(this.f9421c, this.f9420b, i2, i3);
            this.D = false;
        }
        if (m2) {
            if (this.f9421c == this.f9423e - 1) {
                z2 = true;
            }
            this.B = z2;
            if (this.B) {
                this.f9426h.d(this.f9420b);
            }
        }
        this.f9421c = Math.min(this.f9421c + g2, this.f9423e - 1);
        if (g2 > 0) {
            this.C = g2;
        }
    }

    private void b(int i2, int i3, int i4, int i5) {
        this.f9426h.b(i2, i3, i4, i5, 32, v());
    }

    private void c(byte b2) {
        q qVar;
        int d2 = d(0);
        int f2 = f(d2);
        int i2 = this.u;
        if (b2 == 104) {
            this.u = i2 | f2;
            if (d2 == 1) {
                this.a.e(true);
            } else if ((d2 == 47 || d2 == 1047 || d2 == 1049) && (qVar = this.f9425g) != null) {
                this.f9426h = qVar;
            }
            if (d2 >= 1000 && d2 <= 1003) {
                this.w = d2;
            }
        } else if (b2 == 108) {
            this.u = (~f2) & i2;
            if (d2 == 1) {
                this.a.e(false);
            } else if (d2 == 47 || d2 == 1047 || d2 == 1049) {
                this.f9426h = this.f9424f;
            }
            if (d2 >= 1000 && d2 <= 1003) {
                this.w = 0;
            }
        } else if (b2 == 114) {
            this.u = ((~f2) & i2) | (this.v & f2);
        } else if (b2 != 115) {
            m(b2);
        } else {
            this.v = (this.v & (~f2)) | (i2 & f2);
        }
        int i3 = ~i2;
        int i4 = this.u;
        int i5 = i3 & i4;
        if (((i4 ^ i2) & 8) != 0) {
            b(0, 0, this.f9423e, this.f9422d);
            d(0, 0);
        }
        if ((i5 & 64) != 0) {
            c(0, 0);
        }
    }

    private void c(int i2) {
        b(i2, v());
    }

    private void c(int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f9422d;
        if ((this.u & 64) != 0) {
            i5 = this.z;
            i4 = this.A;
        } else {
            i4 = i6;
            i5 = 0;
        }
        d(Math.max(i5, Math.min(i3 + i5, i4 - 1)), Math.max(0, Math.min(i2, this.f9423e - 1)));
    }

    private void c(boolean z2) {
        int d2 = d(0);
        if (d2 != 4) {
            o(d2);
        } else {
            this.x = z2;
        }
    }

    private int d(int i2) {
        return a(0, i2, true);
    }

    private void d(byte b2) {
        int min;
        int i2;
        int i3;
        int i4;
        int min2;
        int i5;
        int i6;
        if (b2 != 71) {
            if (b2 != 72) {
                if (b2 == 80) {
                    int i7 = this.f9423e - this.f9421c;
                    int min3 = Math.min(d(1), i7);
                    int i8 = i7 - min3;
                    q qVar = this.f9426h;
                    int i9 = this.f9421c;
                    int i10 = this.f9420b;
                    qVar.a(i9 + min3, i10, i8, 1, i9, i10);
                    a(this.f9421c + i8, this.f9420b, min3);
                    return;
                } else if (b2 != 84) {
                    if (b2 == 88) {
                        i2 = this.f9421c;
                        i4 = this.f9420b;
                        i3 = d(0);
                    } else if (b2 == 90) {
                        min = k(this.f9421c);
                    } else if (b2 == 114) {
                        int max = Math.max(0, Math.min(d(1) - 1, this.f9422d - 2));
                        int max2 = Math.max(max + 2, Math.min(e(this.f9422d), this.f9422d));
                        this.z = max;
                        this.A = max2;
                        d(this.z, 0);
                        return;
                    } else if (b2 != 99) {
                        if (b2 != 100) {
                            switch (b2) {
                                case 63:
                                    b(6);
                                    return;
                                case 64:
                                    int i11 = this.f9423e - this.f9421c;
                                    int min4 = Math.min(d(1), i11);
                                    q qVar2 = this.f9426h;
                                    int i12 = this.f9421c;
                                    int i13 = this.f9420b;
                                    qVar2.a(i12, i13, i11 - min4, 1, i12 + min4, i13);
                                    a(this.f9421c, this.f9420b, min4);
                                    return;
                                case 65:
                                    min2 = Math.max(this.z, this.f9420b - d(1));
                                    break;
                                case 66:
                                    min2 = Math.min(this.A - 1, this.f9420b + d(1));
                                    break;
                                case 67:
                                    min = Math.min(this.f9423e - 1, this.f9421c + d(1));
                                    break;
                                case 68:
                                    min = Math.max(0, this.f9421c - d(1));
                                    break;
                                default:
                                    switch (b2) {
                                        case 74:
                                            int d2 = d(0);
                                            if (d2 == 0) {
                                                int i14 = this.f9421c;
                                                a(i14, this.f9420b, this.f9423e - i14);
                                                int i15 = this.f9420b;
                                                b(0, i15 + 1, this.f9423e, this.f9422d - (i15 + 1));
                                                return;
                                            } else if (d2 != 1) {
                                                if (d2 == 2) {
                                                    b(0, 0, this.f9423e, this.f9422d);
                                                    return;
                                                }
                                                p(b2);
                                                return;
                                            } else {
                                                b(0, 0, this.f9423e, this.f9420b);
                                                i5 = this.f9420b;
                                                i6 = this.f9421c + 1;
                                                a(0, i5, i6);
                                                return;
                                            }
                                        case 75:
                                            int d3 = d(0);
                                            if (d3 == 0) {
                                                i2 = this.f9421c;
                                                i4 = this.f9420b;
                                                i3 = this.f9423e - i2;
                                                break;
                                            } else {
                                                if (d3 != 1) {
                                                    if (d3 == 2) {
                                                        i5 = this.f9420b;
                                                        i6 = this.f9423e;
                                                        a(0, i5, i6);
                                                        return;
                                                    }
                                                    p(b2);
                                                    return;
                                                }
                                                i5 = this.f9420b;
                                                i6 = this.f9421c + 1;
                                                a(0, i5, i6);
                                                return;
                                            }
                                        case 76:
                                            int i16 = this.A - this.f9420b;
                                            int min5 = Math.min(d(1), i16);
                                            q qVar3 = this.f9426h;
                                            int i17 = this.f9420b;
                                            qVar3.a(0, i17, this.f9423e, i16 - min5, 0, i17 + min5);
                                            b(0, this.f9420b, this.f9423e, min5);
                                            return;
                                        case 77:
                                            int i18 = this.A - this.f9420b;
                                            int min6 = Math.min(d(1), i18);
                                            int i19 = i18 - min6;
                                            q qVar4 = this.f9426h;
                                            int i20 = this.f9420b;
                                            qVar4.a(0, i20 + min6, this.f9423e, i19, 0, i20);
                                            b(0, this.f9420b + i19, this.f9423e, min6);
                                            return;
                                        default:
                                            switch (b2) {
                                                case 102:
                                                    break;
                                                case 103:
                                                    int d4 = d(0);
                                                    if (d4 == 0) {
                                                        this.y[this.f9421c] = false;
                                                        return;
                                                    } else if (d4 == 3) {
                                                        for (int i21 = 0; i21 < this.f9423e; i21++) {
                                                            this.y[i21] = false;
                                                        }
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                case 104:
                                                    c(true);
                                                    return;
                                                default:
                                                    switch (b2) {
                                                        case 108:
                                                            c(false);
                                                            return;
                                                        case 109:
                                                            x();
                                                            return;
                                                        case 110:
                                                            int d5 = d(0);
                                                            if (d5 == 5) {
                                                                byte[] bArr = {27, 91, 48, 110};
                                                                this.f9427i.c(bArr, 0, bArr.length);
                                                                return;
                                                            } else if (d5 == 6) {
                                                                byte[] bytes = String.format(Locale.US, "\u001b[%d;%dR", Integer.valueOf(this.f9420b + 1), Integer.valueOf(this.f9421c + 1)).getBytes();
                                                                this.f9427i.c(bytes, 0, bytes.length);
                                                                return;
                                                            } else {
                                                                return;
                                                            }
                                                        default:
                                                            m(b2);
                                                            return;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            min2 = Math.min(Math.max(1, d(1)), this.f9422d) - 1;
                        }
                        m(min2);
                        return;
                    } else {
                        y();
                        return;
                    }
                    a(i2, i4, i3);
                    return;
                } else {
                    o(b2);
                    return;
                }
            }
            A();
            return;
        }
        min = Math.min(Math.max(1, d(1)), this.f9423e) - 1;
        l(min);
    }

    private void d(int i2, int i3) {
        this.f9420b = Math.min(i2, this.f9422d - 1);
        this.f9421c = Math.min(i3, this.f9423e - 1);
        this.B = false;
    }

    private void d(boolean z2) {
        this.L = z2;
        n();
    }

    private int e(int i2) {
        return a(1, i2, true);
    }

    private void e(byte b2) {
        if (b2 == 64) {
            b(false);
        } else if (b2 == 71) {
            b(true);
        } else {
            return;
        }
        this.R = true;
    }

    private int f(int i2) {
        if (i2 < 1 || i2 > 32) {
            return 0;
        }
        return 1 << i2;
    }

    private void f(byte b2) {
        if (b2 != 56) {
            p(b2);
        } else {
            this.f9426h.b(0, 0, this.f9423e, this.f9422d, 69, v());
        }
    }

    private void g(byte b2) {
        if (b2 == 7) {
            q();
        } else if (b2 != 27) {
            a(b2);
        } else {
            b(9);
        }
    }

    private boolean g(int i2) {
        return i2 >= 0 && i2 < 260;
    }

    private int h(int i2) {
        int i3 = -1;
        while (true) {
            int i4 = this.n;
            if (i4 >= this.f9431m) {
                break;
            }
            byte[] bArr = this.f9430l;
            this.n = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == i2) {
                break;
            } else if (b2 < 48 || b2 > 57) {
                p(b2);
            } else {
                if (i3 < 0) {
                    i3 = 0;
                }
                i3 = ((i3 * 10) + b2) - 48;
            }
        }
        return i3;
    }

    private void h(byte b2) {
        if (b2 != 92) {
            a((byte) 27);
            a(b2);
            b(8);
            return;
        }
        q();
    }

    private String i(int i2) {
        int i3 = this.n;
        int i4 = i3;
        while (true) {
            int i5 = this.n;
            if (i5 >= this.f9431m) {
                break;
            }
            byte[] bArr = this.f9430l;
            this.n = i5 + 1;
            if (bArr[i5] == i2) {
                break;
            }
            i4++;
        }
        if (i3 == i4) {
            return "";
        }
        try {
            return new String(this.f9430l, i3, i4 - i3, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(this.f9430l, i3, i4 - i3);
        }
    }

    private void i(byte b2) {
        a(0, b2);
    }

    private int j(int i2) {
        do {
            i2++;
            int i3 = this.f9423e;
            if (i2 >= i3) {
                return i3 - 1;
            }
        } while (!this.y[i2]);
        return i2;
    }

    private void j(byte b2) {
        a(1, b2);
    }

    private int k(int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (this.y[i3]) {
                return i3;
            }
        }
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [byte, char], vars: [r2v0 ??, r2v1 ??, r2v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    private void k(
/*
[16] Method generation error in method: iiec.androidterm.r.n.k(byte):void, file: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:190)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:145)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:337)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    
*/

    private void l(int i2) {
        this.f9421c = i2;
        this.B = false;
    }

    private boolean l(byte b2) {
        int i2;
        if (this.S == 0 && (b2 & 128) == 0) {
            return false;
        }
        if (this.S <= 0) {
            if ((b2 & 224) == 192) {
                this.S = 1;
            } else {
                if ((b2 & 240) == 224) {
                    i2 = 2;
                } else if ((b2 & 248) == 240) {
                    i2 = 3;
                } else {
                    c(65533);
                    return true;
                }
                this.S = i2;
            }
            this.T.put(b2);
        } else if ((b2 & 192) != 128) {
            this.S = 0;
            this.T.clear();
            c(65533);
            return l(b2);
        } else {
            this.T.put(b2);
            int i3 = this.S - 1;
            this.S = i3;
            if (i3 == 0) {
                ByteBuffer byteBuffer = this.T;
                CharBuffer charBuffer = this.U;
                CharsetDecoder charsetDecoder = this.V;
                byteBuffer.rewind();
                charsetDecoder.reset();
                charsetDecoder.decode(byteBuffer, charBuffer, true);
                charsetDecoder.flush(charBuffer);
                char[] array = charBuffer.array();
                if (array[0] < 128 || array[0] > 159) {
                    a(array);
                } else {
                    a((byte) array[0], false);
                }
                byteBuffer.clear();
                charBuffer.clear();
            }
        }
        return true;
    }

    private void m(byte b2) {
        if (b2 >= 48 && b2 <= 57) {
            int i2 = this.f9428j;
            int[] iArr = this.f9429k;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = b2 - 48;
                if (i3 >= 0) {
                    i4 += i3 * 10;
                }
                this.f9429k[this.f9428j] = i4;
            }
        } else if (b2 == 59) {
            int i5 = this.f9428j;
            if (i5 < this.f9429k.length) {
                this.f9428j = i5 + 1;
            }
        } else {
            p(b2);
            return;
        }
        o();
    }

    private void m(int i2) {
        this.f9420b = i2;
        this.B = false;
    }

    private boolean m() {
        return (this.u & 128) != 0;
    }

    private void n() {
        this.N = this.M[this.L ? 1 : 0] == 2;
    }

    private void n(byte b2) {
        a(b2, true);
    }

    private void n(int i2) {
        this.p = i2;
        this.f9428j = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            this.f9429k[i3] = -1;
        }
    }

    private void o() {
        this.o = true;
    }

    private void o(byte b2) {
        r();
    }

    private void o(int i2) {
    }

    private void p() {
        int i2 = this.f9420b + 1;
        if (i2 >= this.A) {
            w();
            i2 = this.A - 1;
        }
        m(i2);
    }

    private void p(byte b2) {
        r();
    }

    private void q() {
        C();
        int h2 = h(59);
        if (h2 == 0 || h2 == 1 || h2 == 2) {
            a(h2, i(-1));
        } else {
            o(h2);
        }
        r();
    }

    private void r() {
        this.p = 0;
    }

    private int s() {
        return this.H;
    }

    private int t() {
        return this.J;
    }

    private int u() {
        return this.F;
    }

    private int v() {
        return p.a(u(), s(), t());
    }

    private void w() {
        this.O++;
        this.f9426h.b(this.z, this.A, v());
    }

    private void x() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int i7 = this.f9428j;
            if (i6 <= i7) {
                int i8 = this.f9429k[i6];
                if (i8 < 0) {
                    if (i7 <= 0) {
                        i8 = 0;
                    }
                    i2 = i6;
                    i6 = i2 + 1;
                }
                if (i8 == 0) {
                    this.F = this.G;
                    this.H = this.I;
                    this.J = 0;
                } else {
                    if (i8 == 1) {
                        i5 = this.J | 1;
                    } else if (i8 == 3) {
                        i5 = this.J | 2;
                    } else if (i8 == 4) {
                        i5 = 4 | this.J;
                    } else if (i8 == 5) {
                        i5 = this.J | 8;
                    } else if (i8 == 7) {
                        i5 = this.J | 16;
                    } else if (i8 == 8) {
                        i5 = this.J | 32;
                    } else if (i8 == 10) {
                        d(false);
                    } else if (i8 == 11) {
                        d(true);
                    } else if (i8 == 22) {
                        i5 = this.J & -2;
                    } else if (i8 == 23) {
                        i5 = this.J & -3;
                    } else if (i8 == 24) {
                        i5 = this.J & -5;
                    } else if (i8 == 25) {
                        i5 = this.J & -9;
                    } else if (i8 == 27) {
                        i5 = this.J & -17;
                    } else if (i8 == 28) {
                        i5 = this.J & -33;
                    } else {
                        if (i8 < 30 || i8 > 37) {
                            if (i8 == 38 && (i2 = i6 + 2) <= this.f9428j) {
                                int[] iArr = this.f9429k;
                                if (iArr[i6 + 1] == 5) {
                                    int i9 = iArr[i2];
                                    if (a(i9)) {
                                        this.F = i9;
                                    }
                                    i6 = i2 + 1;
                                }
                            }
                            if (i8 == 39) {
                                this.F = this.G;
                            } else {
                                if (i8 < 40 || i8 > 47) {
                                    if (i8 == 48 && (i2 = i6 + 2) <= this.f9428j) {
                                        int[] iArr2 = this.f9429k;
                                        if (iArr2[i6 + 1] == 5) {
                                            this.H = iArr2[i2];
                                            int i10 = iArr2[i2];
                                            if (a(i10)) {
                                                this.H = i10;
                                            }
                                            i6 = i2 + 1;
                                        }
                                    }
                                    if (i8 == 49) {
                                        this.H = this.I;
                                    } else if (i8 >= 90 && i8 <= 97) {
                                        i4 = (i8 - 90) + 8;
                                    } else if (i8 >= 100 && i8 <= 107) {
                                        i3 = (i8 - 100) + 8;
                                    }
                                } else {
                                    i3 = i8 - 40;
                                }
                                this.H = i3;
                            }
                        } else {
                            i4 = i8 - 30;
                        }
                        this.F = i4;
                    }
                    this.J = i5;
                }
                i2 = i6;
                i6 = i2 + 1;
            } else {
                return;
            }
        }
    }

    private void y() {
        byte[] bArr = {27, 91, 63, 49, 59, 50, 99};
        this.f9427i.c(bArr, 0, bArr.length);
    }

    private void z() {
        int i2 = 0;
        while (i2 < this.f9423e) {
            this.y[i2] = (i2 & 7) == 0 && i2 != 0;
            i2++;
        }
    }

    public String a(int i2, int i3, int i4, int i5) {
        return this.f9426h.a(i2, i3, i4, i5);
    }

    public void a() {
        this.O = 0;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.n.a(int, int):void");
    }

    public void a(d dVar) {
        this.G = 256;
        this.I = 257;
        this.f9424f.a(dVar);
        q qVar = this.f9425g;
        if (qVar != null) {
            qVar.a(dVar);
        }
    }

    public void a(l lVar) {
        this.a = lVar;
    }

    public void a(s sVar) {
        this.W = sVar;
    }

    public void a(boolean z2) {
        this.P = z2;
        if (!this.R) {
            b(z2);
        }
    }

    public void a(byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byte b2 = bArr[i2 + i4];
            try {
                n(b2);
                this.E++;
            } catch (Exception e2) {
                Log.e("EmulatorView", "Exception while processing character " + Integer.toString(this.E) + " code " + Integer.toString(b2), e2);
            }
        }
    }

    public void b() {
        q qVar = this.f9425g;
        if (qVar != null) {
            qVar.a();
            this.f9425g = null;
        }
    }

    public void b(boolean z2) {
        if (z2 && !this.Q) {
            this.S = 0;
            this.T.clear();
            this.U.clear();
        }
        this.Q = z2;
        s sVar = this.W;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final int c() {
        return this.f9421c;
    }

    public final int d() {
        return this.f9420b;
    }

    public final boolean e() {
        return this.K;
    }

    public final int f() {
        return this.w;
    }

    public final boolean g() {
        return (this.u & 32) != 0;
    }

    public q h() {
        return this.f9426h;
    }

    public int i() {
        return this.O;
    }

    public final boolean j() {
        return (this.u & 33554432) != 0;
    }

    public boolean k() {
        return this.Q;
    }

    public void l() {
        this.f9420b = 0;
        this.f9421c = 0;
        this.f9428j = 0;
        this.o = false;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.u |= 128;
        this.u |= 33554432;
        this.v = 0;
        this.x = false;
        this.z = 0;
        this.A = this.f9422d;
        this.B = false;
        this.F = this.G;
        this.H = this.I;
        this.K = false;
        this.L = false;
        int[] iArr = this.M;
        iArr[0] = 1;
        iArr[1] = 2;
        n();
        z();
        b(0, 0, this.f9423e, this.f9422d);
        b(this.P);
        this.R = false;
        this.S = 0;
        this.T.clear();
        this.U.clear();
    }
}
