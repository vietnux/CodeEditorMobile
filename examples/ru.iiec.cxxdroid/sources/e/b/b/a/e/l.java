package e.b.b.a.e;

final class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f7791b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ k f7792c;

    l(k kVar, g gVar) {
        this.f7792c = kVar;
        this.f7791b = gVar;
    }

    public final void run() {
        if (this.f7791b.c()) {
            k.a(this.f7792c).f();
            return;
        }
        try {
            k.a(this.f7792c).a(k.b(this.f7792c).a(this.f7791b));
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                k.a(this.f7792c).a((Exception) e2.getCause());
            } else {
                k.a(this.f7792c).a((Exception) e2);
            }
        } catch (Exception e3) {
            k.a(this.f7792c).a(e3);
        }
    }
}
