package i;

import i.f0.c;
import i.f0.g.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f9141j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f9142k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f9143l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f9144m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9145b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9146c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9147d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9148e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f9149f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9150g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9151h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f9152i;

    private l(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.f9145b = str2;
        this.f9146c = j2;
        this.f9147d = str3;
        this.f9148e = str4;
        this.f9149f = z;
        this.f9150g = z2;
        this.f9152i = z3;
        this.f9151h = z4;
    }

    private static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static long a(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f9144m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f9144m).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
                i8 = parseInt2;
                i5 = parseInt;
            } else if (i6 == -1 && matcher.usePattern(f9143l).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(f9142k).matches()) {
                i7 = f9142k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f9141j).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f8806e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static i.l a(long r24, i.s r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: i.l.a(long, i.s, java.lang.String):i.l");
    }

    public static l a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String a2 = c.a(str);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<l> a(s sVar, r rVar) {
        List<String> b2 = rVar.b("Set-Cookie");
        int size = b2.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            l a2 = a(sVar, b2.get(i2));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !c.d(str);
    }

    private static long b(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public String a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f9145b);
        if (this.f9151h) {
            if (this.f9146c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = d.a(new Date(this.f9146c));
            }
            sb.append(str);
        }
        if (!this.f9152i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f9147d);
        }
        sb.append("; path=");
        sb.append(this.f9148e);
        if (this.f9149f) {
            sb.append("; secure");
        }
        if (this.f9150g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String b() {
        return this.f9145b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.a.equals(this.a) && lVar.f9145b.equals(this.f9145b) && lVar.f9147d.equals(this.f9147d) && lVar.f9148e.equals(this.f9148e) && lVar.f9146c == this.f9146c && lVar.f9149f == this.f9149f && lVar.f9150g == this.f9150g && lVar.f9151h == this.f9151h && lVar.f9152i == this.f9152i;
    }

    public int hashCode() {
        long j2 = this.f9146c;
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + this.f9145b.hashCode()) * 31) + this.f9147d.hashCode()) * 31) + this.f9148e.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f9149f ? 1 : 0)) * 31) + (!this.f9150g ? 1 : 0)) * 31) + (!this.f9151h ? 1 : 0)) * 31) + (!this.f9152i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }
}
