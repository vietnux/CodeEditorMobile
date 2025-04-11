package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;

public final class q0<V> {
    private final w6<V> a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7517b;

    private q0(String str, w6<V> w6Var) {
        y.a(w6Var);
        this.a = w6Var;
        this.f7517b = str;
    }

    static q0<Double> a(String str, double d2, double d3) {
        return new q0<>(str, p0.a.a(str, -3.0d));
    }

    static q0<Integer> a(String str, int i2, int i3) {
        return new q0<>(str, p0.a.a(str, i2));
    }

    static q0<Long> a(String str, long j2, long j3) {
        return new q0<>(str, p0.a.a(str, j2));
    }

    static q0<String> a(String str, String str2, String str3) {
        return new q0<>(str, p0.a.a(str, str2));
    }

    static q0<Boolean> a(String str, boolean z, boolean z2) {
        return new q0<>(str, p0.a.a(str, z));
    }

    public final V a() {
        return this.a.a();
    }

    public final V a(V v) {
        return v != null ? v : this.a.a();
    }

    public final String b() {
        return this.f7517b;
    }
}
