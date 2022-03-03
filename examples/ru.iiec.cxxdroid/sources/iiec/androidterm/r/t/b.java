package iiec.androidterm.r.t;

public class b {
    public static final int a = a();

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return iiec.androidterm.r.t.c.a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int a() {
        /*
            int r0 = iiec.androidterm.r.t.c.a()     // Catch:{ VerifyError -> 0x0005 }
            goto L_0x0011
        L_0x0005:
            java.lang.String r0 = android.os.Build.VERSION.SDK     // Catch:{ NumberFormatException -> 0x0010 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0010 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.t.b.a():int");
    }
}
