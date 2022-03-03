package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class ne {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e2) {
            e4.a(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static tw a(ba0 ba0) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = ba0.f3856c;
        String str = map.get("Date");
        long a = str != null ? a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j3 = 0;
            int i3 = 0;
            j2 = 0;
            while (i2 < split.length) {
                String trim = split[i2].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            j3 = 0;
            j2 = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j5 = currentTimeMillis + (j3 * 1000);
            if (i2 == 0) {
                Long.signum(j2);
                j4 = (j2 * 1000) + j5;
                tw twVar = new tw();
                twVar.a = ba0.f3855b;
                twVar.f5657b = str5;
                twVar.f5661f = j5;
                twVar.f5660e = j4;
                twVar.f5658c = a;
                twVar.f5659d = a3;
                twVar.f5662g = map;
                twVar.f5663h = ba0.f3857d;
                return twVar;
            }
        } else if (a <= 0 || a2 < a) {
            j5 = 0;
        } else {
            j4 = (a2 - a) + currentTimeMillis;
            j5 = j4;
            tw twVar2 = new tw();
            twVar2.a = ba0.f3855b;
            twVar2.f5657b = str5;
            twVar2.f5661f = j5;
            twVar2.f5660e = j4;
            twVar2.f5658c = a;
            twVar2.f5659d = a3;
            twVar2.f5662g = map;
            twVar2.f5663h = ba0.f3857d;
            return twVar2;
        }
        j4 = j5;
        tw twVar22 = new tw();
        twVar22.a = ba0.f3855b;
        twVar22.f5657b = str5;
        twVar22.f5661f = j5;
        twVar22.f5660e = j4;
        twVar22.f5658c = a;
        twVar22.f5659d = a3;
        twVar22.f5662g = map;
        twVar22.f5663h = ba0.f3857d;
        return twVar22;
    }

    static String a(long j2) {
        return a().format(new Date(j2));
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
