package iiec.androidterm.r;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class m {
    private l a;

    /* renamed from: b  reason: collision with root package name */
    private d f9402b;

    /* renamed from: c  reason: collision with root package name */
    private s f9403c;

    /* renamed from: d  reason: collision with root package name */
    private OutputStream f9404d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f9405e;

    /* renamed from: f  reason: collision with root package name */
    private String f9406f;

    /* renamed from: g  reason: collision with root package name */
    private q f9407g;

    /* renamed from: h  reason: collision with root package name */
    private n f9408h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9409i;

    /* renamed from: j  reason: collision with root package name */
    private Thread f9410j;

    /* renamed from: k  reason: collision with root package name */
    private c f9411k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f9412l;

    /* renamed from: m  reason: collision with root package name */
    private Thread f9413m;
    private c n;
    private Handler o;
    private CharBuffer p;
    private ByteBuffer q;
    private CharsetEncoder r;
    private d s;
    private boolean t;
    private Handler u;
    private s v;

    class a extends Handler {

        /* renamed from: iiec.androidterm.r.m$a$a  reason: collision with other inner class name */
        class RunnableC0146a implements Runnable {
            RunnableC0146a() {
            }

            public void run() {
                m.this.i();
            }
        }

        a() {
        }

        public void handleMessage(Message message) {
            if (m.this.t) {
                int i2 = message.what;
                if (i2 == 1) {
                    m.this.k();
                } else if (i2 == 4) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0146a());
                }
            }
        }
    }

    class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private byte[] f9415b = new byte[4096];

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9416c;

        b(boolean z) {
            this.f9416c = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x000f A[EDGE_INSN: B:11:0x000f->B:3:0x000f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[Catch:{ IOException | InterruptedException -> 0x0036 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                iiec.androidterm.r.m r0 = iiec.androidterm.r.m.this     // Catch:{ IOException | InterruptedException -> 0x0036 }
                java.io.InputStream r0 = iiec.androidterm.r.m.c(r0)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                byte[] r1 = r5.f9415b     // Catch:{ IOException | InterruptedException -> 0x0036 }
                int r0 = r0.read(r1)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                r1 = -1
                if (r0 != r1) goto L_0x0010
                goto L_0x0037
            L_0x0010:
                r1 = 0
            L_0x0011:
                if (r0 <= 0) goto L_0x0000
                iiec.androidterm.r.m r2 = iiec.androidterm.r.m.this     // Catch:{ IOException | InterruptedException -> 0x0036 }
                iiec.androidterm.r.c r2 = iiec.androidterm.r.m.d(r2)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                byte[] r3 = r5.f9415b     // Catch:{ IOException | InterruptedException -> 0x0036 }
                int r2 = r2.b(r3, r1, r0)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                int r1 = r1 + r2
                int r0 = r0 - r2
                iiec.androidterm.r.m r2 = iiec.androidterm.r.m.this     // Catch:{ IOException | InterruptedException -> 0x0036 }
                android.os.Handler r2 = iiec.androidterm.r.m.e(r2)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                iiec.androidterm.r.m r3 = iiec.androidterm.r.m.this     // Catch:{ IOException | InterruptedException -> 0x0036 }
                android.os.Handler r3 = iiec.androidterm.r.m.e(r3)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                r4 = 1
                android.os.Message r3 = r3.obtainMessage(r4)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                r2.sendMessage(r3)     // Catch:{ IOException | InterruptedException -> 0x0036 }
                goto L_0x0011
            L_0x0036:
            L_0x0037:
                boolean r0 = r5.f9416c
                if (r0 == 0) goto L_0x004f
                iiec.androidterm.r.m r0 = iiec.androidterm.r.m.this
                android.os.Handler r0 = iiec.androidterm.r.m.e(r0)
                iiec.androidterm.r.m r1 = iiec.androidterm.r.m.this
                android.os.Handler r1 = iiec.androidterm.r.m.e(r1)
                r2 = 4
                android.os.Message r1 = r1.obtainMessage(r2)
                r0.sendMessage(r1)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.m.b.run():void");
        }
    }

    class c extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private byte[] f9418b = new byte[4096];

        class a extends Handler {
            a() {
            }

            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 2) {
                    c.this.a();
                } else if (i2 == 3) {
                    Looper.myLooper().quit();
                }
            }
        }

        c() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a() {
            c cVar = m.this.n;
            byte[] bArr = this.f9418b;
            OutputStream outputStream = m.this.f9404d;
            int min = Math.min(cVar.a(), bArr.length);
            if (min != 0) {
                try {
                    cVar.a(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    outputStream.flush();
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
        }

        public void run() {
            Looper.prepare();
            m.this.o = new a();
            a();
            Looper.loop();
        }
    }

    public interface d {
        void a(m mVar);
    }

    public m() {
        this(false);
    }

    public m(boolean z) {
        this.f9402b = a.t;
        this.t = false;
        this.u = new a();
        this.p = CharBuffer.allocate(2);
        this.q = ByteBuffer.allocate(4);
        this.r = Charset.forName("UTF-8").newEncoder();
        this.r.onMalformedInput(CodingErrorAction.REPLACE);
        this.r.onUnmappableCharacter(CodingErrorAction.REPLACE);
        this.f9412l = new byte[4096];
        this.f9411k = new c(4096);
        this.f9410j = new b(z);
        this.f9410j.setName("TermSession input reader");
        this.n = new c(4096);
        this.f9413m = new c();
        this.f9413m.setName("TermSession output writer");
    }

    private void j() {
        Handler handler = this.o;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k() {
        try {
            b(this.f9412l, 0, this.f9411k.a(this.f9412l, 0, Math.min(this.f9411k.a(), this.f9412l.length)));
            h();
        } catch (InterruptedException unused) {
        }
    }

    public void a() {
        this.t = false;
        this.f9408h.b();
        q qVar = this.f9407g;
        if (qVar != null) {
            qVar.a();
        }
        Handler handler = this.o;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        try {
            this.f9405e.close();
            this.f9404d.close();
        } catch (IOException | NullPointerException unused) {
        }
        d dVar = this.s;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public void a(int i2) {
        ByteBuffer byteBuffer = this.q;
        if (i2 < 128) {
            byte[] array = byteBuffer.array();
            array[0] = (byte) i2;
            c(array, 0, 1);
            return;
        }
        CharBuffer charBuffer = this.p;
        CharsetEncoder charsetEncoder = this.r;
        charBuffer.clear();
        byteBuffer.clear();
        Character.toChars(i2, charBuffer.array(), 0);
        charsetEncoder.reset();
        charsetEncoder.encode(charBuffer, byteBuffer, true);
        charsetEncoder.flush(byteBuffer);
        c(byteBuffer.array(), 0, byteBuffer.position() - 1);
    }

    public void a(int i2, int i3) {
        this.f9407g = new q(i2, 10000, i3, this.f9402b);
        this.f9408h = new n(this, this.f9407g, i2, i3, this.f9402b);
        this.f9408h.a(this.f9409i);
        this.f9408h.a(this.a);
        this.t = true;
        this.f9410j.start();
        this.f9413m.start();
    }

    public void a(d dVar) {
        if (dVar == null) {
            dVar = a.t;
        }
        this.f9402b = dVar;
        n nVar = this.f9408h;
        if (nVar != null) {
            nVar.a(dVar);
        }
    }

    public void a(l lVar) {
        this.a = lVar;
    }

    public void a(d dVar) {
        this.s = dVar;
    }

    public void a(s sVar) {
        this.v = sVar;
    }

    public void a(InputStream inputStream) {
        this.f9405e = inputStream;
    }

    public void a(OutputStream outputStream) {
        this.f9404d = outputStream;
    }

    public void a(String str) {
        this.f9406f = str;
        g();
    }

    public void a(boolean z) {
        this.f9409i = z;
        n nVar = this.f9408h;
        if (nVar != null) {
            nVar.a(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i2, int i3) {
        this.f9408h.a(bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public n b() {
        return this.f9408h;
    }

    public void b(int i2, int i3) {
        n nVar = this.f9408h;
        if (nVar == null) {
            a(i2, i3);
        } else {
            nVar.a(i2, i3);
        }
    }

    public void b(s sVar) {
        n nVar = this.f9408h;
        if (nVar != null) {
            nVar.a(sVar);
        }
    }

    public void b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            c(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i2, int i3) {
        this.f9408h.a(bArr, i2, i3);
    }

    public String c() {
        return this.f9406f;
    }

    public void c(s sVar) {
        this.f9403c = sVar;
    }

    public void c(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            try {
                int b2 = this.n.b(bArr, i2, i3);
                i2 += b2;
                i3 -= b2;
                j();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public String d() {
        return this.f9407g.d();
    }

    public boolean e() {
        n nVar = this.f9408h;
        return nVar == null ? this.f9409i : nVar.k();
    }

    public boolean f() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public void g() {
        s sVar = this.v;
        if (sVar != null) {
            sVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void h() {
        s sVar = this.f9403c;
        if (sVar != null) {
            sVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        a();
    }
}
