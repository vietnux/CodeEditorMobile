package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* access modifiers changed from: package-private */
public final class d0 extends Writer {

    /* renamed from: b  reason: collision with root package name */
    private final String f1253b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f1254c = new StringBuilder(128);

    d0(String str) {
        this.f1253b = str;
    }

    private void l() {
        if (this.f1254c.length() > 0) {
            Log.d(this.f1253b, this.f1254c.toString());
            StringBuilder sb = this.f1254c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        l();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                l();
            } else {
                this.f1254c.append(c2);
            }
        }
    }
}
