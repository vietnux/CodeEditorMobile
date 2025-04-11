package h.a.a;

class g extends j {

    /* renamed from: b  reason: collision with root package name */
    public final int f8673b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8674c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8675d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8676e = new byte[this.f8674c];

    public static final class a {
        public a(int i2, int i3, int i4, int i5) {
        }
    }

    g(h hVar, k kVar) {
        super(kVar);
        hVar.b(kVar.f8679c);
        this.f8673b = hVar.a();
        this.f8674c = hVar.a();
        this.f8675d = hVar.a();
        byte[] bArr = new byte[this.f8673b];
        int a2 = hVar.a(bArr);
        if (a2 == this.f8673b) {
            hVar.b(a2 % 4);
            if (this.f8675d == 1) {
                new a(hVar.a(), hVar.a(), hVar.a(), hVar.a());
            }
            int a3 = hVar.a(this.f8676e);
            if (a3 == this.f8674c) {
                new String(bArr, 0, this.f8673b - 1);
                return;
            }
            throw new c("Error reading note name (read=" + a3 + ", expected=" + this.f8674c + ")");
        }
        throw new c("Error reading note name (read=" + a2 + ", expected=" + this.f8673b + ")");
    }
}
