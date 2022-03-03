package com.crashlytics.android.c;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class a0 {
    public final b0 a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2787b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2788c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f2789d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2790e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Object> f2791f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2792g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Object> f2793h;

    /* renamed from: i  reason: collision with root package name */
    private String f2794i;

    /* access modifiers changed from: package-private */
    public static class b {
        final c a;

        /* renamed from: b  reason: collision with root package name */
        final long f2795b = System.currentTimeMillis();

        /* renamed from: c  reason: collision with root package name */
        Map<String, String> f2796c = null;

        /* renamed from: d  reason: collision with root package name */
        String f2797d = null;

        /* renamed from: e  reason: collision with root package name */
        Map<String, Object> f2798e = null;

        /* renamed from: f  reason: collision with root package name */
        String f2799f = null;

        /* renamed from: g  reason: collision with root package name */
        Map<String, Object> f2800g = null;

        public b(c cVar) {
            this.a = cVar;
        }

        public b a(Map<String, Object> map) {
            this.f2798e = map;
            return this;
        }

        public a0 a(b0 b0Var) {
            return new a0(b0Var, this.f2795b, this.a, this.f2796c, this.f2797d, this.f2798e, this.f2799f, this.f2800g);
        }

        public b b(Map<String, String> map) {
            this.f2796c = map;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public enum c {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    private a0(b0 b0Var, long j2, c cVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.a = b0Var;
        this.f2787b = j2;
        this.f2788c = cVar;
        this.f2789d = map;
        this.f2790e = str;
        this.f2791f = map2;
        this.f2792g = str2;
        this.f2793h = map3;
    }

    public static b a(long j2) {
        b bVar = new b(c.INSTALL);
        bVar.b(Collections.singletonMap("installedAt", String.valueOf(j2)));
        return bVar;
    }

    public static b a(c cVar, Activity activity) {
        Map<String, String> singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        b bVar = new b(cVar);
        bVar.b(singletonMap);
        return bVar;
    }

    public static b a(String str) {
        Map<String, String> singletonMap = Collections.singletonMap("sessionId", str);
        b bVar = new b(c.CRASH);
        bVar.b(singletonMap);
        return bVar;
    }

    public static b a(String str, String str2) {
        b a2 = a(str);
        a2.a(Collections.singletonMap("exceptionName", str2));
        return a2;
    }

    public String toString() {
        if (this.f2794i == null) {
            this.f2794i = "[" + a0.class.getSimpleName() + ": " + "timestamp=" + this.f2787b + ", type=" + this.f2788c + ", details=" + this.f2789d + ", customType=" + this.f2790e + ", customAttributes=" + this.f2791f + ", predefinedType=" + this.f2792g + ", predefinedAttributes=" + this.f2793h + ", metadata=[" + this.a + "]]";
        }
        return this.f2794i;
    }
}
