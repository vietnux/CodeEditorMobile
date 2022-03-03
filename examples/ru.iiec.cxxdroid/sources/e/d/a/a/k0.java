package e.d.a.a;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class k0 extends k {

    /* renamed from: g  reason: collision with root package name */
    protected final m0 f8232g;

    public k0(File file, m0 m0Var, String str, String str2) {
        super(file, str, str2);
        this.f8232g = m0Var;
    }

    private void a() {
    }

    private char[] a(long j2) {
        o0.a(!this.f8227b.equals("Auto"), "AUTO encoding not yet resolved");
        o0.a(!this.f8228c.equals("Auto"), "AUTO line break terminator not yet resolved");
        if (this.f8227b.equals("UTF-16BE") || this.f8227b.equals("UTF-16LE")) {
            j2 >>>= 1;
        }
        if (j2 <= 2147483647L) {
            int p = m0.p((int) j2);
            if (p != -1) {
                return new char[p];
            }
            throw new OutOfMemoryError();
        }
        throw new OutOfMemoryError();
    }

    public void a(String str) {
        byte[] bytes = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            this.f8227b = "UTF-8";
            byteArrayInputStream.mark(0);
            this.f8228c = a.a(byteArrayInputStream, this.f8227b);
            byteArrayInputStream.reset();
            char[] a = a((long) bytes.length);
            h0 a2 = this.f8231f.a(byteArrayInputStream, a, this.f8227b, this.f8228c, this.f8229d);
            if (!this.f8229d.b()) {
                this.f8232g.a(a, this.f8227b, this.f8228c, a2.a(), a2.b());
                b(1);
            } else {
                a(1);
            }
        } finally {
            byteArrayInputStream.close();
        }
    }

    public void run() {
        this.f8229d.a();
        try {
            a();
        } catch (OutOfMemoryError unused) {
            a(1, 1, "Not enough memory");
        } catch (IOException e2) {
            a(1, 0, e2.getLocalizedMessage());
        }
    }
}
