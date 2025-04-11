package iiec.androidterm.compat;

import java.io.UnsupportedEncodingException;

public class c {

    /* access modifiers changed from: package-private */
    public static abstract class a {
        public byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public int f9282b;

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends a {

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f9283f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        private static final int[] f9284g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c  reason: collision with root package name */
        private int f9285c;

        /* renamed from: d  reason: collision with root package name */
        private int f9286d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f9287e;

        public b(int i2, byte[] bArr) {
            this.a = bArr;
            this.f9287e = (i2 & 8) == 0 ? f9283f : f9284g;
            this.f9285c = 0;
            this.f9286d = 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
            r16.f9285c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
            if (r20 != false) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f1, code lost:
            r16.f9285c = r5;
            r16.f9286d = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
            r16.f9282b = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
            if (r5 == 0) goto L_0x011a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
            if (r5 == 1) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
            if (r5 == 2) goto L_0x0112;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
            if (r5 == 3) goto L_0x0103;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
            if (r5 == 4) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
            r1 = r9 + 1;
            r6[r9] = (byte) (r8 >> 10);
            r9 = r1 + 1;
            r6[r1] = (byte) (r8 >> 2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
            r6[r9] = (byte) (r8 >> 4);
            r9 = r9 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x011a, code lost:
            r16.f9285c = r5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00ef A[EDGE_INSN: B:70:0x00ef->B:54:0x00ef ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(byte[] r17, int r18, int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 285
            */
            throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.compat.c.b.a(byte[], int, int, boolean):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: iiec.androidterm.compat.c$c  reason: collision with other inner class name */
    public static class C0141c extends a {

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f9288j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        private static final byte[] f9289k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f9290c;

        /* renamed from: d  reason: collision with root package name */
        int f9291d;

        /* renamed from: e  reason: collision with root package name */
        private int f9292e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f9293f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f9294g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f9295h;

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f9296i;

        public C0141c(int i2, byte[] bArr) {
            this.a = bArr;
            boolean z = true;
            this.f9293f = (i2 & 1) == 0;
            this.f9294g = (i2 & 2) == 0;
            this.f9295h = (i2 & 4) == 0 ? false : z;
            this.f9296i = (i2 & 8) == 0 ? f9288j : f9289k;
            this.f9290c = new byte[2];
            this.f9291d = 0;
            this.f9292e = this.f9294g ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x00e9 A[SYNTHETIC] */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 492
            */
            throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.compat.c.C0141c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i2) {
        return a(str.getBytes(), i2);
    }

    public static byte[] a(byte[] bArr, int i2) {
        return a(bArr, 0, bArr.length, i2);
    }

    public static byte[] a(byte[] bArr, int i2, int i3, int i4) {
        b bVar = new b(i4, new byte[((i3 * 3) / 4)]);
        if (bVar.a(bArr, i2, i3, true)) {
            int i5 = bVar.f9282b;
            byte[] bArr2 = bVar.a;
            if (i5 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr, int i2) {
        return b(bArr, 0, bArr.length, i2);
    }

    public static byte[] b(byte[] bArr, int i2, int i3, int i4) {
        C0141c cVar = new C0141c(i4, null);
        int i5 = (i3 / 3) * 4;
        int i6 = 2;
        if (!cVar.f9293f) {
            int i7 = i3 % 3;
            if (i7 != 0) {
                if (i7 == 1) {
                    i5 += 2;
                } else if (i7 == 2) {
                    i5 += 3;
                }
            }
        } else if (i3 % 3 > 0) {
            i5 += 4;
        }
        if (cVar.f9294g && i3 > 0) {
            int i8 = ((i3 - 1) / 57) + 1;
            if (!cVar.f9295h) {
                i6 = 1;
            }
            i5 += i8 * i6;
        }
        cVar.a = new byte[i5];
        cVar.a(bArr, i2, i3, true);
        return cVar.a;
    }

    public static String c(byte[] bArr, int i2) {
        try {
            return new String(b(bArr, i2), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
