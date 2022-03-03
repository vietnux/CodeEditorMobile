package h.a.a;

class h {
    final d a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8677b;

    h(d dVar, a aVar) {
        this.a = dVar;
        this.f8677b = aVar;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int e2 = (e() << 24) + (e() << 16) + (e() << 8) + e();
        return this.a.f8654b == 1 ? a(e2) : e2;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return (a((short) (i2 >>> 16)) & 65535) | (a((short) i2) << 16);
    }

    public int a(byte[] bArr) {
        return this.f8677b.a(bArr);
    }

    /* access modifiers changed from: package-private */
    public long a(long j2) {
        return (((long) a((int) (j2 >>> 32))) & -1) | (((long) a((int) j2)) << 32);
    }

    /* access modifiers changed from: package-private */
    public short a(short s) {
        return (short) (((s >>> 8) & 255) | (s << 8));
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.a.a == 1 ? (long) a() : c();
    }

    public void b(int i2) {
        this.f8677b.a(i2);
    }

    public void b(long j2) {
        this.f8677b.a(j2);
    }

    /* access modifiers changed from: package-private */
    public long c() {
        long e2 = (((long) ((((e() << 24) + (e() << 16)) + (e() << 8)) + (e() << 0))) << 32) + (((long) ((e() << 24) + (e() << 16) + (e() << 8) + (e() << 0))) & 4294967295L);
        return this.a.f8654b == 1 ? a(e2) : e2;
    }

    /* access modifiers changed from: package-private */
    public long c(long j2) {
        int i2 = 0;
        while (true) {
            d dVar = this.a;
            if (i2 < dVar.f8659g) {
                l a2 = dVar.a(i2);
                long j3 = a2.f8684c;
                if (j2 < j3 || j2 >= a2.f8686e + j3) {
                    i2++;
                } else {
                    long j4 = j2 - j3;
                    if (j4 < a2.f8685d) {
                        return a2.f8683b + j4;
                    }
                    throw new c("Can not convert virtual memory address " + Long.toHexString(j2) + " to file offset - found segment " + a2 + " but address maps to memory outside file range");
                }
            } else {
                throw new c("Cannot find segment for address " + Long.toHexString(j2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public short d() {
        short e2 = (short) ((e() << 8) + (e() << 0));
        return this.a.f8654b == 1 ? a(e2) : e2;
    }

    /* access modifiers changed from: package-private */
    public short e() {
        return this.f8677b.a();
    }
}
