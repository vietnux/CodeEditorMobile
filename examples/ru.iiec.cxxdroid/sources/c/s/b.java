package c.s;

import android.os.Trace;

/* access modifiers changed from: package-private */
public final class b {
    public static void a() {
        Trace.endSection();
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }
}
