package e.b.b.a.c.b;

import java.util.List;
import java.util.Map;

public final class p {
    private Map<String, Map<String, byte[]>> a;

    /* renamed from: b  reason: collision with root package name */
    private long f7065b;

    /* renamed from: c  reason: collision with root package name */
    private List<byte[]> f7066c;

    public p(Map<String, Map<String, byte[]>> map, long j2, List<byte[]> list) {
        this.a = map;
        this.f7065b = j2;
        this.f7066c = list;
    }

    public final long a() {
        return this.f7065b;
    }

    public final void a(long j2) {
        this.f7065b = j2;
    }

    public final boolean a(String str) {
        return str != null && d() && this.a.get(str) != null && !this.a.get(str).isEmpty();
    }

    public final boolean a(String str, String str2) {
        return d() && a(str2) && b(str, str2) != null;
    }

    public final List<byte[]> b() {
        return this.f7066c;
    }

    public final byte[] b(String str, String str2) {
        if (str == null || !a(str2)) {
            return null;
        }
        return this.a.get(str2).get(str);
    }

    public final Map<String, Map<String, byte[]>> c() {
        return this.a;
    }

    public final boolean d() {
        Map<String, Map<String, byte[]>> map = this.a;
        return map != null && !map.isEmpty();
    }
}
