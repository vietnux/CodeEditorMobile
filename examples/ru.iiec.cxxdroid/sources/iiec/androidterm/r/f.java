package iiec.androidterm.r;

/* access modifiers changed from: package-private */
public class f {
    private char[] a;

    /* renamed from: b  reason: collision with root package name */
    private short[] f9385b;

    /* renamed from: c  reason: collision with root package name */
    private int f9386c;

    public f(int i2) {
        b(i2);
        char[] cArr = this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = ' ';
        }
        this.f9385b[0] = (short) i2;
    }

    public f(char[] cArr) {
        b(cArr.length);
        System.arraycopy(cArr, 0, this.a, 0, this.f9386c);
        this.f9385b[0] = (short) cArr.length;
    }

    private void b(int i2) {
        this.f9386c = i2;
        this.f9385b = new short[i2];
        this.a = new char[((int) (((float) i2) * 1.5f))];
    }

    public int a(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i2 + this.f9385b[i2];
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0095 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x00a3 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v12, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010a, code lost:
        if (r13 != 2) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0110, code lost:
        if (r13 == r8) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0114, code lost:
        if (r1 != (r2 - 2)) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
        r4[r1 + 1] = (short) (r4[r1] - 1);
        r4[0] = (short) (r7 + r16);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        r7 = r7 + r16;
        r9 = iiec.androidterm.r.r.a(r3, r7);
        r10 = (r1 + r9) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0132, code lost:
        if (r10 >= r2) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0134, code lost:
        r10 = (a(r10) + r5) - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013b, code lost:
        r10 = r6 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013e, code lost:
        if (r9 != 2) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0140, code lost:
        r3[r7] = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0144, code lost:
        if (r10 <= 1) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0146, code lost:
        java.lang.System.arraycopy(r3, r7 + r10, r3, r7 + 1, (r6 - r7) - r10);
        r10 = r10 - 1;
        r5 = r5 - r10;
        r4[0] = (short) (r4[0] - r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0159, code lost:
        java.lang.System.arraycopy(r3, r7 + r10, r3, r7, ((r6 == true ? 1 : 0) - r7) - r10);
        r5 = r5 - r10;
        r4[0] = (short) (r4[0] - r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0168, code lost:
        if (r1 != 0) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016a, code lost:
        r6 = 1;
        r4[1] = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016f, code lost:
        r6 = 1;
        r4[r1 + 1] = (short) (r4[r1] - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0178, code lost:
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.f.a(int, int):void");
    }

    public char[] a() {
        return this.a;
    }

    public int b() {
        return this.f9385b[0];
    }
}
