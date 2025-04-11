package e.b.d.w.m.o;

import java.util.TimeZone;

public class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    private static int a(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    private static int a(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i4 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        } else {
            i5 = i2;
            i4 = 0;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 >= 0) {
                i4 = (i4 * 10) - digit2;
                i5 = i6;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        }
        return -i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.m.o.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }
}
