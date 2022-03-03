package e.b.b.a.c.c;

public final class o extends d<o> {

    /* renamed from: b  reason: collision with root package name */
    public String f7128b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f7129c = "";

    /* renamed from: d  reason: collision with root package name */
    public long f7130d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f7131e = "";

    /* renamed from: f  reason: collision with root package name */
    public long f7132f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f7133g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f7134h = 0;

    /* renamed from: i  reason: collision with root package name */
    public n[] f7135i = n.b();

    public o() {
        this.a = null;
    }

    @Override // e.b.b.a.c.c.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            switch (c2) {
                case 0:
                    return this;
                case 10:
                    this.f7128b = aVar.b();
                    break;
                case 18:
                    this.f7129c = aVar.b();
                    break;
                case 24:
                    this.f7130d = aVar.d();
                    break;
                case 34:
                    this.f7131e = aVar.b();
                    break;
                case 40:
                    this.f7132f = aVar.d();
                    break;
                case 48:
                    this.f7133g = aVar.d();
                    break;
                case 58:
                case 66:
                case 74:
                case 82:
                case 90:
                    aVar.b();
                    break;
                case 96:
                    this.f7134h = aVar.e();
                    break;
                case 106:
                    int a = m.a(aVar, 106);
                    n[] nVarArr = this.f7135i;
                    int length = nVarArr == null ? 0 : nVarArr.length;
                    n[] nVarArr2 = new n[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f7135i, 0, nVarArr2, 0, length);
                    }
                    while (length < nVarArr2.length - 1) {
                        nVarArr2[length] = new n();
                        aVar.a(nVarArr2[length]);
                        aVar.c();
                        length++;
                    }
                    nVarArr2[length] = new n();
                    aVar.a(nVarArr2[length]);
                    this.f7135i = nVarArr2;
                    break;
                default:
                    if (super.a(aVar, c2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
