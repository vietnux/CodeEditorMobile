package com.crashlytics.android.e;

import android.os.Process;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class e {
    private static final AtomicLong a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    private static String f2910b;

    public e(p pVar) {
        byte[] bArr = new byte[10];
        c(bArr);
        b(bArr);
        a(bArr);
        String c2 = i.c(pVar.f());
        String a2 = i.a(bArr);
        f2910b = String.format(Locale.US, "%s-%s-%s-%s", a2.substring(0, 12), a2.substring(12, 16), a2.subSequence(16, 20), c2.substring(0, 12)).toUpperCase(Locale.US);
    }

    private void a(byte[] bArr) {
        byte[] b2 = b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b2[0];
        bArr[9] = b2[1];
    }

    private static byte[] a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void b(byte[] bArr) {
        byte[] b2 = b(a.incrementAndGet());
        bArr[6] = b2[0];
        bArr[7] = b2[1];
    }

    private static byte[] b(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j2));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a2 = a(time / 1000);
        bArr[0] = a2[0];
        bArr[1] = a2[1];
        bArr[2] = a2[2];
        bArr[3] = a2[3];
        byte[] b2 = b(time % 1000);
        bArr[4] = b2[0];
        bArr[5] = b2[1];
    }

    public String toString() {
        return f2910b;
    }
}
