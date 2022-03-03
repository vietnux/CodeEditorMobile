package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public abstract class i5 extends h5 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f7326c;

    i5(j5 j5Var) {
        super(j5Var);
        this.f7306b.a(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f7326c;
    }

    /* access modifiers changed from: protected */
    public final void v() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean w();

    public final void x() {
        if (!this.f7326c) {
            w();
            this.f7306b.q();
            this.f7326c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
