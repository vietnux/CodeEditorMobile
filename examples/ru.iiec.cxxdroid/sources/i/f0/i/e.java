package i.f0.i;

import i.f0.c;
import j.f;
import java.io.IOException;

public final class e {
    static final f a = f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f8972b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f8973c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    static final String[] f8974d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f8974d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = c.a("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f8973c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 : iArr) {
            f8973c[i4 | 8] = f8973c[i4] + "|PADDED";
        }
        String[] strArr3 = f8973c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 : iArr2) {
            for (int i6 : iArr) {
                int i7 = i6 | i5;
                f8973c[i7] = f8973c[i6] + '|' + f8973c[i5];
                f8973c[i7 | 8] = f8973c[i6] + '|' + f8973c[i5] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = f8973c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = f8974d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(c.a(str, objArr));
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return "";
        }
        if (!(b2 == 2 || b2 == 3)) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : f8974d[b3];
            }
            if (!(b2 == 7 || b2 == 8)) {
                String[] strArr = f8973c;
                String str = b3 < strArr.length ? strArr[b3] : f8974d[b3];
                return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f8974d[b3];
    }

    static String a(boolean z, int i2, int i3, byte b2, byte b3) {
        String[] strArr = f8972b;
        String a2 = b2 < strArr.length ? strArr[b2] : c.a("0x%02x", Byte.valueOf(b2));
        String a3 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = a2;
        objArr[4] = a3;
        return c.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(c.a(str, objArr));
    }
}
