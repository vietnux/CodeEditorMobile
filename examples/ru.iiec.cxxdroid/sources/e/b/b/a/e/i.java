package e.b.b.a.e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class i {
    public static final Executor a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f7788b = new w();

    private static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
