package h.a.a;

public class e extends j {

    /* renamed from: b  reason: collision with root package name */
    long[] f8669b;

    /* renamed from: c  reason: collision with root package name */
    int[] f8670c;

    e(h hVar, k kVar) {
        super(kVar);
        byte b2 = hVar.a.a;
        hVar.b(kVar.f8679c);
        int a = hVar.a();
        hVar.a();
        int a2 = hVar.a();
        hVar.a();
        this.f8669b = new long[a2];
        this.f8670c = new int[a];
        for (int i2 = 0; i2 < a2; i2++) {
            this.f8669b[i2] = hVar.b();
        }
        for (int i3 = 0; i3 < a; i3++) {
            this.f8670c[i3] = hVar.a();
        }
    }
}
