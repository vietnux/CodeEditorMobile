package h.a.a;

/* access modifiers changed from: package-private */
public final class m extends j {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8691b;

    m(h hVar, long j2, int i2, k kVar) {
        super(kVar);
        hVar.b(j2);
        this.f8691b = new byte[i2];
        int a = hVar.a(this.f8691b);
        if (a == i2) {
            byte[] bArr = this.f8691b;
            for (byte b2 : bArr) {
            }
            return;
        }
        throw new c("Error reading string table (read " + a + "bytes - expected to read " + this.f8691b.length + "bytes)");
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr = this.f8691b;
            if (bArr[i3] == 0) {
                return new String(bArr, i2, i3 - i2);
            }
            i3++;
        }
    }
}
