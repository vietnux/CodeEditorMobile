package e.b.b.a.c.b;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class d1 implements t0 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, TreeMap<String, byte[]>> f7032b;

    /* renamed from: c  reason: collision with root package name */
    private final Status f7033c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7034d;

    /* renamed from: e  reason: collision with root package name */
    private final List<byte[]> f7035e;

    public d1(Status status, Map<String, TreeMap<String, byte[]>> map) {
        this(status, map, -1);
    }

    private d1(Status status, Map<String, TreeMap<String, byte[]>> map, long j2) {
        this(status, map, -1, null);
    }

    public d1(Status status, Map<String, TreeMap<String, byte[]>> map, long j2, List<byte[]> list) {
        this.f7033c = status;
        this.f7032b = map;
        this.f7034d = j2;
        this.f7035e = list;
    }

    public d1(Status status, Map<String, TreeMap<String, byte[]>> map, List<byte[]> list) {
        this(status, map, -1, list);
    }

    @Override // e.b.b.a.c.b.t0
    public final byte[] a(String str, byte[] bArr, String str2) {
        Map<String, TreeMap<String, byte[]>> map = this.f7032b;
        boolean z = false;
        if (!(map == null || map.get(str2) == null || this.f7032b.get(str2).get(str) == null)) {
            z = true;
        }
        if (z) {
            return this.f7032b.get(str2).get(str);
        }
        return null;
    }

    @Override // e.b.b.a.c.b.t0
    public final Map<String, Set<String>> l() {
        HashMap hashMap = new HashMap();
        Map<String, TreeMap<String, byte[]>> map = this.f7032b;
        if (map != null) {
            for (String str : map.keySet()) {
                TreeMap<String, byte[]> treeMap = this.f7032b.get(str);
                if (treeMap != null) {
                    hashMap.put(str, treeMap.keySet());
                }
            }
        }
        return hashMap;
    }

    @Override // e.b.b.a.c.b.t0, com.google.android.gms.common.api.j
    public final Status m() {
        return this.f7033c;
    }

    @Override // e.b.b.a.c.b.t0
    public final long n() {
        return this.f7034d;
    }

    @Override // e.b.b.a.c.b.t0
    public final List<byte[]> o() {
        return this.f7035e;
    }
}
