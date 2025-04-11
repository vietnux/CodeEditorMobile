package e.b.a;

import com.google.android.gms.ads.d;

@Deprecated
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f7007b = new c(-1, -2, "mb");

    /* renamed from: c  reason: collision with root package name */
    public static final c f7008c = new c(320, 50, "mb");

    /* renamed from: d  reason: collision with root package name */
    public static final c f7009d = new c(300, 250, "as");

    /* renamed from: e  reason: collision with root package name */
    public static final c f7010e = new c(468, 60, "as");

    /* renamed from: f  reason: collision with root package name */
    public static final c f7011f = new c(728, 90, "as");

    /* renamed from: g  reason: collision with root package name */
    public static final c f7012g = new c(160, 600, "as");
    private final d a;

    private c(int i2, int i3, String str) {
        this(new d(i2, i3));
    }

    public c(d dVar) {
        this.a = dVar;
    }

    public final int a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
