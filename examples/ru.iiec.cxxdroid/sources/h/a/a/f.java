package h.a.a;

public class f extends j {

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8671b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f8672c;

    f(h hVar, k kVar) {
        super(kVar);
        hVar.b(kVar.f8679c);
        int a = hVar.a();
        int a2 = hVar.a();
        this.f8671b = new int[a];
        for (int i2 = 0; i2 < a; i2++) {
            this.f8671b[i2] = hVar.a();
        }
        this.f8672c = new int[a2];
        for (int i3 = 0; i3 < a2; i3++) {
            this.f8672c[i3] = hVar.a();
        }
        int i4 = (a * 4) + (a2 * 4) + 8;
        if (kVar.f8680d != ((long) i4)) {
            throw new c("Error reading string table (read " + i4 + "bytes, expected to read " + kVar.f8680d + "bytes).");
        }
    }
}
