package e.b.b.a.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.n;

public abstract class c<T> {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private T f7014b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final T a(Context context) {
        if (this.f7014b == null) {
            y.a(context);
            Context remoteContext = n.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f7014b = a((IBinder) remoteContext.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new a("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new a("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new a("Could not access creator.", e4);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f7014b;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);
}
