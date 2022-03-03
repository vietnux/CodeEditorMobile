package e.b.b.a.c.e;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class d7 extends w6<Double> {
    d7(g7 g7Var, String str, Double d2) {
        super(g7Var, str, d2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f7670b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid double value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
