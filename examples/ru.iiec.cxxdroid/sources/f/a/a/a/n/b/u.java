package f.a.a.a.n.b;

import android.os.SystemClock;
import android.util.Log;

public class u {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8445b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8446c;

    /* renamed from: d  reason: collision with root package name */
    private long f8447d;

    /* renamed from: e  reason: collision with root package name */
    private long f8448e;

    public u(String str, String str2) {
        this.a = str;
        this.f8445b = str2;
        this.f8446c = !Log.isLoggable(str2, 2);
    }

    private void c() {
        String str = this.f8445b;
        Log.v(str, this.a + ": " + this.f8448e + "ms");
    }

    public synchronized void a() {
        if (!this.f8446c) {
            this.f8447d = SystemClock.elapsedRealtime();
            this.f8448e = 0;
        }
    }

    public synchronized void b() {
        if (!this.f8446c) {
            if (this.f8448e == 0) {
                this.f8448e = SystemClock.elapsedRealtime() - this.f8447d;
                c();
            }
        }
    }
}
