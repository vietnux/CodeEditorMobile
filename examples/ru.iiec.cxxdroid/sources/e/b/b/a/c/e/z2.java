package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public abstract class z2 extends y2 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f7736b;

    z2(d2 d2Var) {
        super(d2Var);
        this.a.a(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.f7736b;
    }

    /* access modifiers changed from: protected */
    public final void t() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean u();

    /* access modifiers changed from: protected */
    public void v() {
    }

    public final void w() {
        if (!this.f7736b) {
            v();
            this.a.G();
            this.f7736b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void x() {
        if (this.f7736b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!u()) {
            this.a.G();
            this.f7736b = true;
        }
    }
}
