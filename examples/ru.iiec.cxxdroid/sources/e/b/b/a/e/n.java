package e.b.b.a.e;

final class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ m f7795b;

    n(m mVar) {
        this.f7795b = mVar;
    }

    public final void run() {
        synchronized (m.a(this.f7795b)) {
            if (m.b(this.f7795b) != null) {
                m.b(this.f7795b).a();
            }
        }
    }
}
