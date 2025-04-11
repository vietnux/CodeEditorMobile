package e.b.d.w;

import java.math.BigDecimal;

public final class f extends Number {

    /* renamed from: b  reason: collision with root package name */
    private final String f7937b;

    public f(String str) {
        this.f7937b = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f7937b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f7937b;
        String str2 = ((f) obj).f7937b;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f7937b);
    }

    public int hashCode() {
        return this.f7937b.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f7937b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f7937b).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f7937b     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f7937b     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f7937b
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.f.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f7937b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f7937b).longValue();
        }
    }

    public String toString() {
        return this.f7937b;
    }
}
