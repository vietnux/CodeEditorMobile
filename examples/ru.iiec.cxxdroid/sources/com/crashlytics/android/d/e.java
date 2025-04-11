package com.crashlytics.android.d;

import f.a.a.a.i;
import f.a.a.a.n.b.a;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import java.util.HashMap;
import java.util.Map;

class e extends a {

    /* renamed from: g  reason: collision with root package name */
    private final g f2896g;

    public e(i iVar, String str, String str2, f.a.a.a.n.e.e eVar, g gVar) {
        super(iVar, str, str2, eVar, c.GET);
        this.f2896g = gVar;
    }

    private d a(d dVar, String str, String str2) {
        dVar.c("Accept", "application/json");
        dVar.c("User-Agent", "Crashlytics Android SDK/" + this.f8375e.p());
        dVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        dVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f8375e.p());
        dVar.c("X-CRASHLYTICS-API-KEY", str);
        dVar.c("X-CRASHLYTICS-BETA-TOKEN", a(str2));
        return dVar;
    }

    static String a(String str) {
        return "3:" + str;
    }

    private Map<String, String> a(d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.a);
        hashMap.put("display_version", dVar.f2893b);
        hashMap.put("instance", dVar.f2894c);
        hashMap.put("source", "3");
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.crashlytics.android.d.f a(java.lang.String r8, java.lang.String r9, com.crashlytics.android.d.d r10) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.d.e.a(java.lang.String, java.lang.String, com.crashlytics.android.d.d):com.crashlytics.android.d.f");
    }
}
