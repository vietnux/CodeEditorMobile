package e.b.b.a.c.e;

public final class h6 extends d<h6> {

    /* renamed from: c  reason: collision with root package name */
    public i6[] f7307c = i6.e();

    public h6() {
        this.f7211b = null;
        this.a = -1;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        i6[] i6VarArr = this.f7307c;
        if (i6VarArr != null && i6VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                i6[] i6VarArr2 = this.f7307c;
                if (i2 >= i6VarArr2.length) {
                    break;
                }
                i6 i6Var = i6VarArr2[i2];
                if (i6Var != null) {
                    a += b.b(1, i6Var);
                }
                i2++;
            }
        }
        return a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                int a = m.a(aVar, 10);
                i6[] i6VarArr = this.f7307c;
                int length = i6VarArr == null ? 0 : i6VarArr.length;
                i6[] i6VarArr2 = new i6[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7307c, 0, i6VarArr2, 0, length);
                }
                while (length < i6VarArr2.length - 1) {
                    i6VarArr2[length] = new i6();
                    aVar.a(i6VarArr2[length]);
                    aVar.c();
                    length++;
                }
                i6VarArr2[length] = new i6();
                aVar.a(i6VarArr2[length]);
                this.f7307c = i6VarArr2;
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        i6[] i6VarArr = this.f7307c;
        if (i6VarArr != null && i6VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                i6[] i6VarArr2 = this.f7307c;
                if (i2 >= i6VarArr2.length) {
                    break;
                }
                i6 i6Var = i6VarArr2[i2];
                if (i6Var != null) {
                    bVar.a(1, i6Var);
                }
                i2++;
            }
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        if (!h.a(this.f7307c, h6Var.f7307c)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(h6Var.f7211b);
        }
        f fVar2 = h6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (((h6.class.getName().hashCode() + 527) * 31) + h.a(this.f7307c)) * 31;
        f fVar = this.f7211b;
        return hashCode + ((fVar == null || fVar.a()) ? 0 : this.f7211b.hashCode());
    }
}
