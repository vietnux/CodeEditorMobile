package e.b.d.w;

import e.b.d.j;
import e.b.d.w.m.n;
import e.b.d.y.c;
import java.io.Writer;

public final class k {

    /* access modifiers changed from: private */
    public static final class a extends Writer {

        /* renamed from: b  reason: collision with root package name */
        private final Appendable f7960b;

        /* renamed from: c  reason: collision with root package name */
        private final C0112a f7961c = new C0112a();

        /* renamed from: e.b.d.w.k$a$a  reason: collision with other inner class name */
        static class C0112a implements CharSequence {

            /* renamed from: b  reason: collision with root package name */
            char[] f7962b;

            C0112a() {
            }

            public char charAt(int i2) {
                return this.f7962b[i2];
            }

            public int length() {
                return this.f7962b.length;
            }

            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f7962b, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f7960b = appendable;
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i2) {
            this.f7960b.append((char) i2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            C0112a aVar = this.f7961c;
            aVar.f7962b = cArr;
            this.f7960b.append(aVar, i2, i3 + i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new e.b.d.k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new e.b.d.r(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return e.b.d.l.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new e.b.d.r(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new e.b.d.r(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' e.b.d.y.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.b.d.j a(e.b.d.y.a r2) {
        /*
            r2.B()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            e.b.d.t<e.b.d.j> r1 = e.b.d.w.m.n.X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.a(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            e.b.d.j r2 = (e.b.d.j) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            e.b.d.r r0 = new e.b.d.r
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            e.b.d.k r0 = new e.b.d.k
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            e.b.d.r r0 = new e.b.d.r
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            e.b.d.l r2 = e.b.d.l.a
            return r2
        L_0x002b:
            e.b.d.r r0 = new e.b.d.r
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.k.a(e.b.d.y.a):e.b.d.j");
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static void a(j jVar, c cVar) {
        n.X.a(cVar, jVar);
    }
}
