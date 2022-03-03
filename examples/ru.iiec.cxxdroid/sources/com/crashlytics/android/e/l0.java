package com.crashlytics.android.e;

import f.a.a.a.c;
import f.a.a.a.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class l0 {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static k0 a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new k0(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            l g2 = c.g();
            g2.e("CrashlyticsCore", "Could not parse map entry: " + str);
            return null;
        }
    }
}
