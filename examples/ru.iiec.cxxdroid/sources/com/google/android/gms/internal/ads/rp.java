package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

final class rp extends op {
    private final pp a = new pp();

    rp() {
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
