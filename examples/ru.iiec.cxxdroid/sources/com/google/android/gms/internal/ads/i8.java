package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

public class i8 implements a70 {

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f4594c = e4.f4172b;
    private final h7 a;

    /* renamed from: b  reason: collision with root package name */
    private final j9 f4595b;

    public i8(h7 h7Var) {
        this(h7Var, new j9(4096));
    }

    private i8(h7 h7Var, j9 j9Var) {
        this.a = h7Var;
        this.f4595b = j9Var;
    }

    @Deprecated
    public i8(pg pgVar) {
        this(pgVar, new j9(4096));
    }

    @Deprecated
    private i8(pg pgVar, j9 j9Var) {
        this.a = new g6(pgVar);
        this.f4595b = j9Var;
    }

    private static void a(String str, bc0<?> bc0, d3 d3Var) {
        c0 p = bc0.p();
        int o = bc0.o();
        try {
            p.a(d3Var);
            bc0.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(o)));
        } catch (d3 e2) {
            bc0.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(o)));
            throw e2;
        }
    }

    private final byte[] a(InputStream inputStream, int i2) {
        qj qjVar = new qj(this.f4595b, i2);
        if (inputStream != null) {
            try {
                byte[] a2 = this.f4595b.a(1024);
                while (true) {
                    int read = inputStream.read(a2);
                    if (read == -1) {
                        break;
                    }
                    qjVar.write(a2, 0, read);
                }
                byte[] byteArray = qjVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        e4.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f4595b.a(a2);
                qjVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        e4.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f4595b.a((byte[]) null);
                qjVar.close();
                throw th;
            }
        } else {
            throw new b1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ff, code lost:
        throw new com.google.android.gms.internal.ads.cb0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        r2 = java.lang.String.valueOf(r22.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0211, code lost:
        if (r2.length() != 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0213, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0218, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0221, code lost:
        r0 = new com.google.android.gms.internal.ads.c2();
        r5 = "socket";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0190, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0191, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0197, code lost:
        r0 = r10.c();
        com.google.android.gms.internal.ads.e4.b("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
        if (r13 != null) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
        r5 = new com.google.android.gms.internal.ads.ba0(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
        if (r0 == 401) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (r0 < 400) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d5, code lost:
        throw new com.google.android.gms.internal.ads.x00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d8, code lost:
        if (r0 < 500) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e3, code lost:
        throw new com.google.android.gms.internal.ads.b1(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e9, code lost:
        throw new com.google.android.gms.internal.ads.b1(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r0 = new com.google.android.gms.internal.ads.a(r5);
        r5 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f2, code lost:
        r0 = new com.google.android.gms.internal.ads.a90();
        r5 = "network";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0200 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0197  */
    @Override // com.google.android.gms.internal.ads.a70
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.ba0 a(com.google.android.gms.internal.ads.bc0<?> r22) {
        /*
        // Method dump skipped, instructions count: 557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i8.a(com.google.android.gms.internal.ads.bc0):com.google.android.gms.internal.ads.ba0");
    }
}
