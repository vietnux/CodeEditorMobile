package h.a.a;

public class o extends j {

    /* renamed from: b  reason: collision with root package name */
    public final n[] f8696b;

    public o(h hVar, k kVar) {
        super(kVar);
        int i2 = (int) (kVar.f8680d / kVar.f8681e);
        this.f8696b = new n[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8696b[i3] = new n(hVar, kVar.f8679c + (((long) i3) * kVar.f8681e), kVar.f8678b);
        }
    }
}
