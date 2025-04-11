package e.b.b.a.c.b;

import java.util.HashMap;
import java.util.Map;

public final class r {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, m> f7067b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7068c;

    public r() {
        this(-1);
    }

    private r(int i2, long j2, Map<String, m> map, boolean z) {
        this.a = 0;
        this.f7067b = new HashMap();
        this.f7068c = false;
    }

    private r(long j2) {
        this(0, -1, null, false);
    }

    public final int a() {
        return this.a;
    }

    public final void a(int i2) {
        this.a = i2;
    }

    public final void a(long j2) {
    }

    public final void a(Map<String, m> map) {
        this.f7067b = map;
    }

    public final void a(boolean z) {
        this.f7068c = z;
    }

    public final boolean b() {
        return this.f7068c;
    }

    public final Map<String, m> c() {
        return this.f7067b;
    }
}
