package e.b.b.a.e;

final class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f7806b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7807c;

    t(s sVar, g gVar) {
        this.f7807c = sVar;
        this.f7806b = gVar;
    }

    public final void run() {
        synchronized (s.a(this.f7807c)) {
            if (s.b(this.f7807c) != null) {
                s.b(this.f7807c).a(this.f7806b.b());
            }
        }
    }
}
