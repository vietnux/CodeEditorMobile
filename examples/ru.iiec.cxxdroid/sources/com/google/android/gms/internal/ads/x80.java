package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@k2
public final class x80 {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final List<v80> f6007b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f6008c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f6009d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private String f6010e;

    /* renamed from: f  reason: collision with root package name */
    private x80 f6011f;

    public x80(boolean z, String str, String str2) {
        this.a = z;
        this.f6008c.put("action", str);
        this.f6008c.put("ad_format", str2);
    }

    public final v80 a() {
        return a(x0.m().b());
    }

    public final v80 a(long j2) {
        if (!this.a) {
            return null;
        }
        return new v80(j2, null, null);
    }

    public final void a(x80 x80) {
        synchronized (this.f6009d) {
            this.f6011f = x80;
        }
    }

    public final void a(String str) {
        if (this.a) {
            synchronized (this.f6009d) {
                this.f6010e = str;
            }
        }
    }

    public final void a(String str, String str2) {
        n80 d2;
        if (this.a && !TextUtils.isEmpty(str2) && (d2 = x0.j().d()) != null) {
            synchronized (this.f6009d) {
                r80 a2 = d2.a(str);
                Map<String, String> map = this.f6008c;
                map.put(str, a2.a(map.get(str), str2));
            }
        }
    }

    public final boolean a(v80 v80, long j2, String... strArr) {
        synchronized (this.f6009d) {
            for (String str : strArr) {
                this.f6007b.add(new v80(j2, str, v80));
            }
        }
        return true;
    }

    public final boolean a(v80 v80, String... strArr) {
        if (!this.a || v80 == null) {
            return false;
        }
        return a(v80, x0.m().b(), strArr);
    }

    public final String b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f6009d) {
            for (v80 v80 : this.f6007b) {
                long a2 = v80.a();
                String b2 = v80.b();
                v80 c2 = v80.c();
                if (c2 != null && a2 > 0) {
                    sb2.append(b2);
                    sb2.append('.');
                    sb2.append(a2 - c2.a());
                    sb2.append(',');
                }
            }
            this.f6007b.clear();
            if (!TextUtils.isEmpty(this.f6010e)) {
                sb2.append(this.f6010e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> c() {
        synchronized (this.f6009d) {
            n80 d2 = x0.j().d();
            if (d2 != null) {
                if (this.f6011f != null) {
                    return d2.a(this.f6008c, this.f6011f.c());
                }
            }
            return this.f6008c;
        }
    }

    public final v80 d() {
        synchronized (this.f6009d) {
        }
        return null;
    }
}
