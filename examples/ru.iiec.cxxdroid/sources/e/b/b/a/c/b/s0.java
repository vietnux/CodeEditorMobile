package e.b.b.a.c.b;

import java.util.HashMap;
import java.util.Map;

public final class s0 {
    private long a = 43200;

    /* renamed from: b */
    private Map<String, String> f7077b;

    /* renamed from: c */
    private int f7078c;

    /* renamed from: d */
    private int f7079d = -1;

    /* renamed from: e */
    private int f7080e = -1;

    /* renamed from: f */
    private String f7081f;

    public final r0 a() {
        return new r0(this);
    }

    public final s0 a(int i2) {
        this.f7078c = 10300;
        return this;
    }

    public final s0 a(long j2) {
        this.a = j2;
        return this;
    }

    public final s0 a(String str) {
        this.f7081f = str;
        return this;
    }

    public final s0 a(String str, String str2) {
        if (this.f7077b == null) {
            this.f7077b = new HashMap();
        }
        this.f7077b.put(str, str2);
        return this;
    }

    public final s0 b(int i2) {
        this.f7079d = i2;
        return this;
    }

    public final s0 c(int i2) {
        this.f7080e = i2;
        return this;
    }
}
