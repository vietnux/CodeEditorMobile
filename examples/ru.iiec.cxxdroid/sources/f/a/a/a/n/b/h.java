package f.a.a.a.n.b;

import android.os.Process;

public abstract class h implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
