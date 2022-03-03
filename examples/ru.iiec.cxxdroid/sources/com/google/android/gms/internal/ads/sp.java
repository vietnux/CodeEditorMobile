package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

final class sp extends op {
    sp() {
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
