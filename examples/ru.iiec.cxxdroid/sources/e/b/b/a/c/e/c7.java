package e.b.b.a.c.e;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class c7 extends w6<Boolean> {
    c7(g7 g7Var, String str, Boolean bool) {
        super(g7Var, str, bool, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.w6
    public final /* synthetic */ Boolean a(String str) {
        if (r6.f7551c.matcher(str).matches()) {
            return true;
        }
        if (r6.f7552d.matcher(str).matches()) {
            return false;
        }
        String str2 = this.f7670b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
