package c.h.i;

import android.os.Handler;
import android.os.Looper;

/* access modifiers changed from: package-private */
public class b {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
