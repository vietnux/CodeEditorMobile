package iiec.androidterm.compat;

public class a {
    public static final int a = a();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9281b;

    static {
        int i2 = a;
        f9281b = i2 >= 11 && i2 <= 20;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return iiec.androidterm.compat.b.a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int a() {
        /*
            int r0 = iiec.androidterm.compat.b.a()     // Catch:{ VerifyError -> 0x0005 }
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
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.compat.a.a():int");
    }
}
