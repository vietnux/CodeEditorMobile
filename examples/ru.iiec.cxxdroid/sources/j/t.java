package j;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final t f9514d = new a();
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private long f9515b;

    /* renamed from: c  reason: collision with root package name */
    private long f9516c;

    class a extends t {
        a() {
        }

        @Override // j.t
        public t a(long j2) {
            return this;
        }

        @Override // j.t
        public t a(long j2, TimeUnit timeUnit) {
            return this;
        }

        @Override // j.t
        public void e() {
        }
    }

    public t a() {
        this.a = false;
        return this;
    }

    public t a(long j2) {
        this.a = true;
        this.f9515b = j2;
        return this;
    }

    public t a(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        } else if (timeUnit != null) {
            this.f9516c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public t b() {
        this.f9516c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f9515b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.a;
    }

    public void e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.a && this.f9515b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f9516c;
    }
}
