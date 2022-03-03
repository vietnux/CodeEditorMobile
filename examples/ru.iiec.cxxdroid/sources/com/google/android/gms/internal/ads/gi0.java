package com.google.android.gms.internal.ads;

final class gi0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ei0 f4436b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fi0 f4437c;

    gi0(fi0 fi0, ei0 ei0) {
        this.f4437c = fi0;
        this.f4436b = ei0;
    }

    public final void run() {
        synchronized (fi0.a(this.f4437c)) {
            if (fi0.b(this.f4437c) == -2) {
                fi0.a(this.f4437c, fi0.c(this.f4437c));
                if (fi0.d(this.f4437c) == null) {
                    this.f4437c.a(4);
                } else if (!fi0.e(this.f4437c) || fi0.a(this.f4437c, 1)) {
                    this.f4436b.a(this.f4437c);
                    fi0.a(this.f4437c, this.f4436b);
                } else {
                    String f2 = fi0.f(this.f4437c);
                    StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(f2);
                    sb.append(" as delayed impression is not supported");
                    qc.d(sb.toString());
                    this.f4437c.a(2);
                }
            }
        }
    }
}
