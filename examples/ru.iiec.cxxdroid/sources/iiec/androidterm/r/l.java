package iiec.androidterm.r;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class l {

    /* renamed from: m  reason: collision with root package name */
    private static Map<Integer, String> f9390m;
    private String[] a = new String[256];

    /* renamed from: b  reason: collision with root package name */
    private String[] f9391b = new String[256];

    /* renamed from: c  reason: collision with root package name */
    private a f9392c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    private a f9393d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private a f9394e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private a f9395f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    private int f9396g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9397h;

    /* renamed from: i  reason: collision with root package name */
    private m f9398i;

    /* renamed from: j  reason: collision with root package name */
    private int f9399j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9400k;

    /* renamed from: l  reason: collision with root package name */
    private int f9401l;

    /* access modifiers changed from: private */
    public class a {
        private int a = 0;

        public a(l lVar) {
        }

        public void a() {
            int i2;
            int i3 = this.a;
            if (i3 == 1) {
                i2 = 3;
            } else if (i3 == 2) {
                i2 = 0;
            } else {
                return;
            }
            this.a = i2;
        }

        public int b() {
            int i2 = this.a;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return 1;
            }
            return i2 != 4 ? 0 : 2;
        }

        public boolean c() {
            return this.a != 0;
        }

        public void d() {
            int i2 = this.a;
            if (i2 == 1) {
                return;
            }
            if (i2 == 2) {
                this.a = 4;
            } else if (i2 == 3) {
            } else {
                if (i2 != 4) {
                    this.a = 1;
                } else {
                    this.a = 0;
                }
            }
        }

        public void e() {
            int i2;
            int i3 = this.a;
            if (i3 == 1) {
                i2 = 2;
            } else if (i3 == 3) {
                i2 = 0;
            } else {
                return;
            }
            this.a = i2;
        }
    }

    public l(m mVar) {
        this.f9398i = mVar;
        h();
        i();
    }

    private static int a(a aVar, int i2) {
        return aVar.b() << i2;
    }

    static boolean a(KeyEvent keyEvent) {
        return true;
    }

    private void b(String str) {
        if (str.equals("xterm")) {
            String[] strArr = this.a;
            strArr[122] = "\u001bOH";
            strArr[151] = "\u001bOH";
            strArr[123] = "\u001bOF";
            strArr[145] = "\u001bOF";
        } else {
            String[] strArr2 = this.a;
            strArr2[122] = "\u001b[1~";
            strArr2[151] = "\u001b[1~";
            strArr2[123] = "\u001b[4~";
            strArr2[145] = "\u001b[4~";
        }
        if (str.equals("vt100")) {
            String[] strArr3 = this.a;
            strArr3[131] = "\u001bOP";
            strArr3[132] = "\u001bOQ";
            strArr3[133] = "\u001bOR";
            strArr3[134] = "\u001bOS";
            strArr3[135] = "\u001bOt";
            strArr3[136] = "\u001bOu";
            strArr3[137] = "\u001bOv";
            strArr3[138] = "\u001bOl";
            strArr3[139] = "\u001bOw";
            strArr3[140] = "\u001bOx";
            strArr3[141] = "\u001b[23~";
            strArr3[142] = "\u001b[24~";
        } else if (str.startsWith("linux")) {
            String[] strArr4 = this.a;
            strArr4[131] = "\u001b[[A";
            strArr4[132] = "\u001b[[B";
            strArr4[133] = "\u001b[[C";
            strArr4[134] = "\u001b[[D";
            strArr4[135] = "\u001b[[E";
            strArr4[136] = "\u001b[17~";
            strArr4[137] = "\u001b[18~";
            strArr4[138] = "\u001b[19~";
            strArr4[139] = "\u001b[20~";
            strArr4[140] = "\u001b[21~";
            strArr4[141] = "\u001b[23~";
            strArr4[142] = "\u001b[24~";
        } else {
            String[] strArr5 = this.a;
            strArr5[131] = "\u001bOP";
            strArr5[132] = "\u001bOQ";
            strArr5[133] = "\u001bOR";
            strArr5[134] = "\u001bOS";
            strArr5[135] = "\u001b[15~";
            strArr5[136] = "\u001b[17~";
            strArr5[137] = "\u001b[18~";
            strArr5[138] = "\u001b[19~";
            strArr5[139] = "\u001b[20~";
            strArr5[140] = "\u001b[21~";
            strArr5[141] = "\u001b[23~";
            strArr5[142] = "\u001b[24~";
        }
    }

    private void h() {
        f9390m = new HashMap();
        f9390m.put(536870933, "\u001b[1;2D");
        f9390m.put(-2147483627, "\u001b[1;3D");
        f9390m.put(-1610612715, "\u001b[1;4D");
        f9390m.put(1073741845, "\u001b[1;5D");
        f9390m.put(1610612757, "\u001b[1;6D");
        f9390m.put(-1073741803, "\u001b[1;7D");
        f9390m.put(-536870891, "\u001b[1;8D");
        f9390m.put(536870934, "\u001b[1;2C");
        f9390m.put(-2147483626, "\u001b[1;3C");
        f9390m.put(-1610612714, "\u001b[1;4C");
        f9390m.put(1073741846, "\u001b[1;5C");
        f9390m.put(1610612758, "\u001b[1;6C");
        f9390m.put(-1073741802, "\u001b[1;7C");
        f9390m.put(-536870890, "\u001b[1;8C");
        f9390m.put(536870931, "\u001b[1;2A");
        f9390m.put(-2147483629, "\u001b[1;3A");
        f9390m.put(-1610612717, "\u001b[1;4A");
        f9390m.put(1073741843, "\u001b[1;5A");
        f9390m.put(1610612755, "\u001b[1;6A");
        f9390m.put(-1073741805, "\u001b[1;7A");
        f9390m.put(-536870893, "\u001b[1;8A");
        f9390m.put(536870932, "\u001b[1;2B");
        f9390m.put(-2147483628, "\u001b[1;3B");
        f9390m.put(-1610612716, "\u001b[1;4B");
        f9390m.put(1073741844, "\u001b[1;5B");
        f9390m.put(1610612756, "\u001b[1;6B");
        f9390m.put(-1073741804, "\u001b[1;7B");
        f9390m.put(-536870892, "\u001b[1;8B");
        f9390m.put(536871024, "\u001b[3;2~");
        f9390m.put(-2147483536, "\u001b[3;3~");
        f9390m.put(1073741936, "\u001b[3;5~");
        f9390m.put(536871036, "\u001b[2;2~");
        f9390m.put(-2147483524, "\u001b[2;3~");
        f9390m.put(1073741948, "\u001b[2;5~");
        f9390m.put(1073741946, "\u001b[1;5H");
        f9390m.put(1073741947, "\u001b[1;5F");
        f9390m.put(-2147483582, "\u001b\r");
        f9390m.put(1073741890, "\n");
        f9390m.put(1073741886, "\u0000");
        f9390m.put(536871043, "\u001b[1;2P");
        f9390m.put(536871044, "\u001b[1;2Q");
        f9390m.put(536871045, "\u001b[1;2R");
        f9390m.put(536871046, "\u001b[1;2S");
        f9390m.put(536871047, "\u001b[15;2~");
        f9390m.put(536871048, "\u001b[17;2~");
        f9390m.put(536871049, "\u001b[18;2~");
        f9390m.put(536871050, "\u001b[19;2~");
        f9390m.put(536871051, "\u001b[20;2~");
        f9390m.put(536871052, "\u001b[21;2~");
        String[] strArr = this.a;
        strArr[23] = "\r";
        strArr[19] = "\u001b[A";
        strArr[20] = "\u001b[B";
        strArr[22] = "\u001b[C";
        strArr[21] = "\u001b[D";
        b("vt100");
        String[] strArr2 = this.a;
        strArr2[120] = "\u001b[32~";
        strArr2[121] = "\u001b[34~";
        strArr2[61] = "\t";
        strArr2[66] = "\r";
        strArr2[111] = "\u001b";
        strArr2[124] = "\u001b[2~";
        strArr2[112] = "\u001b[3~";
        strArr2[92] = "\u001b[5~";
        strArr2[93] = "\u001b[6~";
        strArr2[67] = "";
        strArr2[143] = "\u001bOP";
        strArr2[154] = "/";
        strArr2[155] = "*";
        strArr2[156] = "-";
        strArr2[157] = "+";
        strArr2[160] = "\r";
        strArr2[161] = "=";
        strArr2[159] = ",";
        strArr2[158] = strArr2[112];
        strArr2[144] = strArr2[124];
        strArr2[145] = strArr2[123];
        strArr2[146] = strArr2[20];
        strArr2[147] = strArr2[93];
        strArr2[148] = strArr2[21];
        strArr2[149] = "5";
        strArr2[150] = strArr2[22];
        strArr2[151] = strArr2[122];
        strArr2[152] = strArr2[19];
        strArr2[153] = strArr2[92];
        String[] strArr3 = this.f9391b;
        strArr3[154] = "\u001bOo";
        strArr3[155] = "\u001bOj";
        strArr3[156] = "\u001bOm";
        strArr3[157] = "\u001bOk";
        strArr3[160] = "\u001bOM";
        strArr3[161] = "\u001bOX";
        strArr3[158] = "\u001bOn";
        strArr3[159] = "\u001bOl";
        strArr3[144] = "\u001bOp";
        strArr3[145] = "\u001bOq";
        strArr3[146] = "\u001bOr";
        strArr3[147] = "\u001bOs";
        strArr3[148] = "\u001bOt";
        strArr3[149] = "\u001bOu";
        strArr3[150] = "\u001bOv";
        strArr3[151] = "\u001bOw";
        strArr3[152] = "\u001bOx";
        strArr3[153] = "\u001bOy";
    }

    private void i() {
        this.f9396g = a(this.f9393d, 0) | a(this.f9392c, 2) | a(this.f9394e, 4) | a(this.f9395f, 6);
    }

    public int a(int i2) {
        return a(this.f9397h || this.f9394e.c(), this.f9395f.c(), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(boolean r8, boolean r9, int r10) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.l.a(boolean, boolean, int):int");
    }

    public void a(int i2, KeyEvent keyEvent) {
        a aVar;
        boolean a2 = a(keyEvent);
        if (i2 != 113 && i2 != 114) {
            switch (i2) {
                case 57:
                case 58:
                    if (a2) {
                        aVar = this.f9392c;
                        break;
                    } else {
                        return;
                    }
                case 59:
                case 60:
                    if (a2) {
                        aVar = this.f9393d;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            aVar.e();
            i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8, android.view.KeyEvent r9, boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.l.a(int, android.view.KeyEvent, boolean, boolean):void");
    }

    public void a(String str) {
        b(str);
    }

    public void a(boolean z) {
        if (z) {
            this.f9394e.d();
        } else {
            this.f9394e.e();
        }
        i();
    }

    public boolean a() {
        return this.f9400k;
    }

    public boolean a(int i2, KeyEvent keyEvent, boolean z) {
        String str;
        if (keyEvent != null) {
            int i3 = (this.f9397h || this.f9394e.c()) ? 1073741824 : 0;
            if ((keyEvent.getMetaState() & 2) != 0) {
                i3 |= Integer.MIN_VALUE;
            }
            if ((keyEvent.getMetaState() & 1) != 0) {
                i3 |= 536870912;
            }
            str = f9390m.get(Integer.valueOf(keyEvent.getScanCode() | 268435456 | i3));
            if (str == null) {
                str = f9390m.get(Integer.valueOf(i3 | i2));
            }
        } else {
            str = null;
        }
        if (str == null && i2 >= 0 && i2 < this.a.length) {
            if (z) {
                str = this.f9391b[i2];
            }
            if (str == null) {
                str = this.a[i2];
            }
        }
        if (str == null) {
            return false;
        }
        this.f9398i.b(str);
        return true;
    }

    public int b() {
        return this.f9401l;
    }

    public void b(int i2) {
        this.f9399j = i2;
    }

    public void b(boolean z) {
        if (z) {
            this.f9395f.d();
        } else {
            this.f9395f.e();
        }
        i();
    }

    public int c() {
        return this.f9396g;
    }

    public void c(boolean z) {
        this.f9397h = z;
    }

    public void d(boolean z) {
        this.f9400k = z;
    }

    public boolean d() {
        return this.f9392c.c();
    }

    public void e(boolean z) {
        if (z) {
            String[] strArr = this.a;
            strArr[19] = "\u001bOA";
            strArr[152] = "\u001bOA";
            strArr[20] = "\u001bOB";
            strArr[146] = "\u001bOB";
            strArr[22] = "\u001bOC";
            strArr[150] = "\u001bOC";
            strArr[21] = "\u001bOD";
            strArr[148] = "\u001bOD";
            return;
        }
        String[] strArr2 = this.a;
        strArr2[19] = "\u001b[A";
        strArr2[152] = "\u001b[A";
        strArr2[20] = "\u001b[B";
        strArr2[146] = "\u001b[B";
        strArr2[22] = "\u001b[C";
        strArr2[150] = "\u001b[C";
        strArr2[21] = "\u001b[D";
        strArr2[148] = "\u001b[D";
    }

    public boolean e() {
        return this.f9394e.c();
    }

    public void f() {
        this.f9397h = false;
    }

    public void g() {
    }
}
