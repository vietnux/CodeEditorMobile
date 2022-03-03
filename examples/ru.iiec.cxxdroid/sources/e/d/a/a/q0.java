package e.d.a.a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class q0 extends k {

    /* renamed from: g  reason: collision with root package name */
    private j f8264g;

    /* renamed from: h  reason: collision with root package name */
    private int f8265h = 0;

    public q0(File file, j jVar, String str, String str2) {
        super(file, str, str2);
        boolean z = false;
        this.f8264g = jVar;
        this.f8265h = this.f8264g.f();
        o0.a(this.f8265h > 0 ? true : z, "File to save must have at least 1 char");
    }

    private void b() {
    }

    private void c() {
        if (this.f8227b.equals("Auto")) {
            this.f8227b = this.f8264g.i();
        }
        if (this.f8228c.equals("Auto")) {
            this.f8228c = this.f8264g.h();
        }
    }

    public String a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        try {
            c();
            this.f8231f.a(byteArrayOutputStream, this.f8264g, this.f8227b, this.f8228c, this.f8229d);
            if (!this.f8229d.b()) {
                b(2);
            } else {
                a(2);
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (Exception unused) {
            return "";
        }
    }

    public void run() {
        this.f8229d.a();
        try {
            b();
        } catch (IOException e2) {
            a(2, 0, e2.getLocalizedMessage());
        }
    }
}
