package f.a.a.a.n.b;

/* access modifiers changed from: package-private */
public class b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8376b;

    b(String str, boolean z) {
        this.a = str;
        this.f8376b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8376b != bVar.f8376b) {
            return false;
        }
        String str = this.a;
        String str2 = bVar.a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f8376b ? 1 : 0);
    }
}
