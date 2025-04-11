package e.b.b.a.c.e;

public final class j6 extends d<j6> {

    /* renamed from: c  reason: collision with root package name */
    public long[] f7370c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f7371d;

    public j6() {
        long[] jArr = m.a;
        this.f7370c = jArr;
        this.f7371d = jArr;
        this.f7211b = null;
        this.a = -1;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        long[] jArr;
        int a = super.a();
        long[] jArr2 = this.f7370c;
        int i2 = 0;
        if (jArr2 != null && jArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                jArr = this.f7370c;
                if (i3 >= jArr.length) {
                    break;
                }
                i4 += b.b(jArr[i3]);
                i3++;
            }
            a = a + i4 + (jArr.length * 1);
        }
        long[] jArr3 = this.f7371d;
        if (jArr3 == null || jArr3.length <= 0) {
            return a;
        }
        int i5 = 0;
        while (true) {
            long[] jArr4 = this.f7371d;
            if (i2 >= jArr4.length) {
                return a + i5 + (jArr4.length * 1);
            }
            i5 += b.b(jArr4[i2]);
            i2++;
        }
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        int i2;
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 != 8) {
                if (c2 == 10) {
                    i2 = aVar.a(aVar.e());
                    int a = aVar.a();
                    int i3 = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i3++;
                    }
                    aVar.e(a);
                    long[] jArr = this.f7370c;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(i3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f7370c, 0, jArr2, 0, length);
                    }
                    while (length < jArr2.length) {
                        jArr2[length] = aVar.f();
                        length++;
                    }
                    this.f7370c = jArr2;
                } else if (c2 == 16) {
                    int a2 = m.a(aVar, 16);
                    long[] jArr3 = this.f7371d;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(a2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f7371d, 0, jArr4, 0, length2);
                    }
                    while (length2 < jArr4.length - 1) {
                        jArr4[length2] = aVar.f();
                        aVar.c();
                        length2++;
                    }
                    jArr4[length2] = aVar.f();
                    this.f7371d = jArr4;
                } else if (c2 == 18) {
                    i2 = aVar.a(aVar.e());
                    int a3 = aVar.a();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i4++;
                    }
                    aVar.e(a3);
                    long[] jArr5 = this.f7371d;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    long[] jArr6 = new long[(i4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f7371d, 0, jArr6, 0, length3);
                    }
                    while (length3 < jArr6.length) {
                        jArr6[length3] = aVar.f();
                        length3++;
                    }
                    this.f7371d = jArr6;
                } else if (!super.a(aVar, c2)) {
                    return this;
                }
                aVar.d(i2);
            } else {
                int a4 = m.a(aVar, 8);
                long[] jArr7 = this.f7370c;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                long[] jArr8 = new long[(a4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f7370c, 0, jArr8, 0, length4);
                }
                while (length4 < jArr8.length - 1) {
                    jArr8[length4] = aVar.f();
                    aVar.c();
                    length4++;
                }
                jArr8[length4] = aVar.f();
                this.f7370c = jArr8;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        long[] jArr = this.f7370c;
        int i2 = 0;
        if (jArr != null && jArr.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr2 = this.f7370c;
                if (i3 >= jArr2.length) {
                    break;
                }
                bVar.a(1, jArr2[i3]);
                i3++;
            }
        }
        long[] jArr3 = this.f7371d;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f7371d;
                if (i2 >= jArr4.length) {
                    break;
                }
                bVar.a(2, jArr4[i2]);
                i2++;
            }
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        if (!h.a(this.f7370c, j6Var.f7370c) || !h.a(this.f7371d, j6Var.f7371d)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(j6Var.f7211b);
        }
        f fVar2 = j6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (((((j6.class.getName().hashCode() + 527) * 31) + h.a(this.f7370c)) * 31) + h.a(this.f7371d)) * 31;
        f fVar = this.f7211b;
        return hashCode + ((fVar == null || fVar.a()) ? 0 : this.f7211b.hashCode());
    }
}
