package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* access modifiers changed from: package-private */
public final class lc {
    long a;

    /* renamed from: b  reason: collision with root package name */
    final String f4861b;

    /* renamed from: c  reason: collision with root package name */
    final String f4862c;

    /* renamed from: d  reason: collision with root package name */
    final long f4863d;

    /* renamed from: e  reason: collision with root package name */
    final long f4864e;

    /* renamed from: f  reason: collision with root package name */
    final long f4865f;

    /* renamed from: g  reason: collision with root package name */
    final long f4866g;

    /* renamed from: h  reason: collision with root package name */
    final List<z50> f4867h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    lc(java.lang.String r16, com.google.android.gms.internal.ads.tw r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r3 = r0.f5657b
            long r4 = r0.f5658c
            long r6 = r0.f5659d
            long r8 = r0.f5660e
            long r10 = r0.f5661f
            java.util.List<com.google.android.gms.internal.ads.z50> r1 = r0.f5663h
            if (r1 == 0) goto L_0x0012
            r12 = r1
            goto L_0x0047
        L_0x0012:
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f5662g
            java.util.ArrayList r2 = new java.util.ArrayList
            int r12 = r1.size()
            r2.<init>(r12)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r1.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            com.google.android.gms.internal.ads.z50 r13 = new com.google.android.gms.internal.ads.z50
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r13.<init>(r14, r12)
            r2.add(r13)
            goto L_0x0025
        L_0x0046:
            r12 = r2
        L_0x0047:
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r8, r10, r12)
            byte[] r0 = r0.a
            int r0 = r0.length
            long r0 = (long) r0
            r2 = r15
            r2.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc.<init>(java.lang.String, com.google.android.gms.internal.ads.tw):void");
    }

    private lc(String str, String str2, long j2, long j3, long j4, long j5, List<z50> list) {
        this.f4861b = str;
        this.f4862c = "".equals(str2) ? null : str2;
        this.f4863d = j2;
        this.f4864e = j3;
        this.f4865f = j4;
        this.f4866g = j5;
        this.f4867h = list;
    }

    static lc a(md mdVar) {
        if (lb.b((InputStream) mdVar) == 538247942) {
            return new lc(lb.a(mdVar), lb.a(mdVar), lb.c(mdVar), lb.c(mdVar), lb.c(mdVar), lb.c(mdVar), lb.b(mdVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            lb.a(outputStream, 538247942);
            lb.a(outputStream, this.f4861b);
            lb.a(outputStream, this.f4862c == null ? "" : this.f4862c);
            lb.a(outputStream, this.f4863d);
            lb.a(outputStream, this.f4864e);
            lb.a(outputStream, this.f4865f);
            lb.a(outputStream, this.f4866g);
            List<z50> list = this.f4867h;
            if (list != null) {
                lb.a(outputStream, list.size());
                for (z50 z50 : list) {
                    lb.a(outputStream, z50.a());
                    lb.a(outputStream, z50.b());
                }
            } else {
                lb.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            e4.a("%s", e2.toString());
            return false;
        }
    }
}
