package i;

import j.c;
import j.e;
import java.io.Closeable;

public abstract class b0 implements Closeable {

    /* access modifiers changed from: package-private */
    public class a extends b0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f8745c;

        a(u uVar, long j2, e eVar) {
            this.f8744b = j2;
            this.f8745c = eVar;
        }

        @Override // i.b0
        public long l() {
            return this.f8744b;
        }

        @Override // i.b0
        public e m() {
            return this.f8745c;
        }
    }

    public static b0 a(u uVar, long j2, e eVar) {
        if (eVar != null) {
            return new a(uVar, j2, eVar);
        }
        throw new NullPointerException("source == null");
    }

    public static b0 a(u uVar, byte[] bArr) {
        c cVar = new c();
        cVar.write(bArr);
        return a(uVar, (long) bArr.length, cVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i.f0.c.a(m());
    }

    public abstract long l();

    public abstract e m();
}
