package f.a.a.a;

import f.a.a.a.n.b.u;
import f.a.a.a.n.c.f;
import f.a.a.a.n.c.g;
import f.a.a.a.n.c.n;

/* access modifiers changed from: package-private */
public class h<Result> extends g<Void, Void, Result> {
    final i<Result> p;

    public h(i<Result> iVar) {
        this.p = iVar;
    }

    private u a(String str) {
        u uVar = new u(this.p.n() + "." + str, "KitInitialization");
        uVar.a();
        return uVar;
    }

    /* access modifiers changed from: protected */
    public Result a(Void... voidArr) {
        u a = a("doInBackground");
        Result i2 = !f() ? this.p.i() : null;
        a.b();
        return i2;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.c.a
    public void b(Result result) {
        this.p.a((Object) result);
        this.p.f8359e.a(new g(this.p.n() + " Initialization was cancelled"));
    }

    @Override // f.a.a.a.n.c.j
    public f c() {
        return f.HIGH;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.c.a
    public void c(Result result) {
        this.p.b((Object) result);
        this.p.f8359e.a(result);
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.c.a
    public void g() {
        super.g();
        u a = a("onPreExecute");
        try {
            boolean s = this.p.s();
            a.b();
            if (s) {
                return;
            }
        } catch (n e2) {
            throw e2;
        } catch (Exception e3) {
            c.g().c("Fabric", "Failure onPreExecute()", e3);
            a.b();
        } catch (Throwable th) {
            a.b();
            b(true);
            throw th;
        }
        b(true);
    }
}
