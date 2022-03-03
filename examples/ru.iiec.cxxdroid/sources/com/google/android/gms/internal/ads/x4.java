package com.google.android.gms.internal.ads;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@k2
public final class x4 {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ JSONException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7 A[Catch:{ JSONException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161 A[Catch:{ JSONException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a A[Catch:{ JSONException -> 0x0269 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.n3 a(android.content.Context r54, com.google.android.gms.internal.ads.j3 r55, java.lang.String r56) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.a(android.content.Context, com.google.android.gms.internal.ads.j3, java.lang.String):com.google.android.gms.internal.ads.n3");
    }

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static List<String> a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            list.add(jSONArray.getString(i2));
        }
        return list;
    }

    private static JSONArray a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:221:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x074b  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0830  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x08f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(android.content.Context r22, com.google.android.gms.internal.ads.q4 r23) {
        /*
        // Method dump skipped, instructions count: 2367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.a(android.content.Context, com.google.android.gms.internal.ads.q4):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(com.google.android.gms.internal.ads.n3 r7) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.a(com.google.android.gms.internal.ads.n3):org.json.JSONObject");
    }

    private static void a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }
}
