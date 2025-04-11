package c.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f1871b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f1872c;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler a(Looper looper) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i2 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // c.b.a.a.c
    public void a(Runnable runnable) {
        this.f1871b.execute(runnable);
    }

    @Override // c.b.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // c.b.a.a.c
    public void b(Runnable runnable) {
        if (this.f1872c == null) {
            synchronized (this.a) {
                if (this.f1872c == null) {
                    this.f1872c = a(Looper.getMainLooper());
                }
            }
        }
        this.f1872c.post(runnable);
    }
}
