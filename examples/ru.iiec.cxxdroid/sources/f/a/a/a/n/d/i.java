package f.a.a.a.n.d;

import android.content.Context;

public class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f8501b;

    /* renamed from: c  reason: collision with root package name */
    private final e f8502c;

    public i(Context context, e eVar) {
        this.f8501b = context;
        this.f8502c = eVar;
    }

    public void run() {
        try {
            f.a.a.a.n.b.i.c(this.f8501b, "Performing time based file roll over.");
            if (!this.f8502c.b()) {
                this.f8502c.c();
            }
        } catch (Exception e2) {
            f.a.a.a.n.b.i.a(this.f8501b, "Failed to roll over file", e2);
        }
    }
}
