package e.b.b.a.c.d;

final class k extends h {
    private final i a = new i();

    k() {
    }

    @Override // e.b.b.a.c.d.h
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
