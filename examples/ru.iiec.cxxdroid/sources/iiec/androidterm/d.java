package iiec.androidterm;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import iiec.androidterm.r.m;
import iiec.androidterm.r.s;
import iiec.androidterm.t.c;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class d extends m {
    private static Field C;
    private String A;
    private s B = new a();
    private final long w;
    private String x;
    final ParcelFileDescriptor y;
    c z;

    class a implements s {
        a() {
        }

        @Override // iiec.androidterm.r.s
        public void b() {
            d dVar = d.this;
            dVar.b(dVar.e());
        }
    }

    d(ParcelFileDescriptor parcelFileDescriptor, c cVar, boolean z2) {
        super(z2);
        this.y = parcelFileDescriptor;
        this.w = System.currentTimeMillis();
        a(cVar);
        b(e());
    }

    private static int a(ParcelFileDescriptor parcelFileDescriptor) {
        if (Build.VERSION.SDK_INT >= 12) {
            return b.a(parcelFileDescriptor);
        }
        try {
            l();
            return C.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (Exception e2) {
            throw new IOException("Unable to obtain file descriptor on this OS version: " + e2.getMessage());
        }
    }

    private static void l() {
        if (C == null) {
            C = FileDescriptor.class.getDeclaredField("descriptor");
            C.setAccessible(true);
        }
    }

    @Override // iiec.androidterm.r.m
    public void a() {
        try {
            this.y.close();
        } catch (IOException unused) {
        }
        super.a();
    }

    @Override // iiec.androidterm.r.m
    public void a(int i2, int i3) {
        super.a(i2, i3);
        b(e());
        b(this.B);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        if (this.y.getFileDescriptor().valid()) {
            try {
                Exec.setPtyWindowSizeInternal(a(this.y), i2, i3, i4, i5);
            } catch (IOException e2) {
                Log.e("exec", "Failed to set window size: " + e2.getMessage());
                if (k()) {
                    throw new IllegalStateException(e2);
                }
            }
        }
    }

    public void a(c cVar) {
        this.z = cVar;
        a(new iiec.androidterm.r.d(cVar.i()));
        a(cVar.c());
    }

    @Override // iiec.androidterm.r.m
    public void b(int i2, int i3) {
        a(i3, i2, 0, 0);
        super.b(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        if (this.y.getFileDescriptor().valid()) {
            try {
                Exec.setPtyUTF8ModeInternal(a(this.y), z2);
            } catch (IOException e2) {
                Log.e("exec", "Failed to set UTF mode: " + e2.getMessage());
                if (k()) {
                    throw new IllegalStateException(e2);
                }
            }
        }
    }

    public String c(String str) {
        String c2 = c();
        return (c2 == null || c2.length() <= 0) ? str : c2;
    }

    public void d(String str) {
        if (this.x == null) {
            this.x = str;
            return;
        }
        throw new IllegalStateException("Cannot change handle once set");
    }

    public void e(String str) {
        this.A = str;
    }

    /* access modifiers changed from: protected */
    @Override // iiec.androidterm.r.m
    public void i() {
        if (this.A != null) {
            try {
                byte[] bytes = ("\r\n[" + this.A + "]").getBytes("UTF-8");
                a(bytes, 0, bytes.length);
                h();
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    public String j() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.w + ',' + this.x + ')';
    }
}
