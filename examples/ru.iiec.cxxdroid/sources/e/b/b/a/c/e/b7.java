package e.b.b.a.c.e;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class b7 extends w6<Integer> {
    b7(g7 g7Var, String str, Integer num) {
        super(g7Var, str, num, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Integer a(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f7670b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
            sb.append("Invalid integer value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
