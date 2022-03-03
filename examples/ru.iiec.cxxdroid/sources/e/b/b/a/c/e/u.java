package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* access modifiers changed from: package-private */
public final class u extends i5 {
    u(j5 j5Var) {
        super(j5Var);
    }

    private final Boolean a(double d2, y5 y5Var) {
        try {
            return a(new BigDecimal(d2), y5Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean a(long j2, y5 y5Var) {
        try {
            return a(new BigDecimal(j2), y5Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean a(String str, int i2, boolean z, String str2, List<String> list, String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i2 == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i2 != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i2) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    a().B().a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    private final Boolean a(String str, a6 a6Var) {
        Integer num;
        ArrayList arrayList;
        y.a(a6Var);
        if (str == null || (num = a6Var.f7162c) == null || num.intValue() == 0) {
            return null;
        }
        if (a6Var.f7162c.intValue() == 6) {
            String[] strArr = a6Var.f7165f;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (a6Var.f7163d == null) {
            return null;
        }
        int intValue = a6Var.f7162c.intValue();
        Boolean bool = a6Var.f7164e;
        boolean z = bool != null && bool.booleanValue();
        String upperCase = (z || intValue == 1 || intValue == 6) ? a6Var.f7163d : a6Var.f7163d.toUpperCase(Locale.ENGLISH);
        String[] strArr2 = a6Var.f7165f;
        if (strArr2 == null) {
            arrayList = null;
        } else if (z) {
            arrayList = Arrays.asList(strArr2);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr2) {
                arrayList2.add(str2.toUpperCase(Locale.ENGLISH));
            }
            arrayList = arrayList2;
        }
        return a(str, intValue, z, upperCase, arrayList, intValue == 1 ? upperCase : null);
    }

    private final Boolean a(String str, y5 y5Var) {
        if (!s5.k(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), y5Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r3 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean a(java.math.BigDecimal r10, e.b.b.a.c.e.y5 r11, double r12) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.u.a(java.math.BigDecimal, e.b.b.a.c.e.y5, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0a1e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0a21  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0a29  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0a42  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.e6[] a(java.lang.String r50, e.b.b.a.c.e.f6[] r51, e.b.b.a.c.e.k6[] r52) {
        /*
        // Method dump skipped, instructions count: 3010
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.u.a(java.lang.String, e.b.b.a.c.e.f6[], e.b.b.a.c.e.k6[]):e.b.b.a.c.e.e6[]");
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.i5
    public final boolean w() {
        return false;
    }
}
