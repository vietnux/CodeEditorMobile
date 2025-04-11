package e.b.b.a.c.e;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class a7 extends w6<Long> {
    a7(g7 g7Var, String str, Long l2) {
        super(g7Var, str, l2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f7670b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 25 + String.valueOf(str).length());
            sb.append("Invalid long value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
