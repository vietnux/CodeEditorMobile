package i.f0.e;

import j.c;
import j.g;
import j.r;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private boolean f8855c;

    e(r rVar) {
        super(rVar);
    }

    @Override // j.g, j.r
    public void a(c cVar, long j2) {
        if (this.f8855c) {
            cVar.skip(j2);
            return;
        }
        try {
            super.a(cVar, j2);
        } catch (IOException e2) {
            this.f8855c = true;
            a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(IOException iOException) {
        throw null;
    }

    @Override // j.g, java.io.Closeable, java.lang.AutoCloseable, j.r
    public void close() {
        if (!this.f8855c) {
            try {
                super.close();
            } catch (IOException e2) {
                this.f8855c = true;
                a(e2);
            }
        }
    }

    @Override // j.g, j.r, java.io.Flushable
    public void flush() {
        if (!this.f8855c) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.f8855c = true;
                a(e2);
            }
        }
    }
}
