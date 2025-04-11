package com.crashlytics.android.e;

import f.a.a.a.c;
import f.a.a.a.l;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.r;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

class m0 implements y {
    private final File a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3009b;

    /* renamed from: c  reason: collision with root package name */
    private r f3010c;

    /* access modifiers changed from: package-private */
    public class a implements r.d {
        final /* synthetic */ byte[] a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f3011b;

        a(m0 m0Var, byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.f3011b = iArr;
        }

        @Override // f.a.a.a.n.b.r.d
        public void a(InputStream inputStream, int i2) {
            try {
                inputStream.read(this.a, this.f3011b[0], i2);
                int[] iArr = this.f3011b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    public class b {
        public final byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3012b;

        public b(m0 m0Var, byte[] bArr, int i2) {
            this.a = bArr;
            this.f3012b = i2;
        }
    }

    public m0(File file, int i2) {
        this.a = file;
        this.f3009b = i2;
    }

    private void b(long j2, String str) {
        if (this.f3010c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.f3009b / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.f3010c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes("UTF-8"));
                while (!this.f3010c.m() && this.f3010c.o() > this.f3009b) {
                    this.f3010c.n();
                }
            } catch (IOException e2) {
                c.g().c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    private b e() {
        if (!this.a.exists()) {
            return null;
        }
        f();
        r rVar = this.f3010c;
        if (rVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[rVar.o()];
        try {
            this.f3010c.a(new a(this, bArr, iArr));
        } catch (IOException e2) {
            c.g().c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(this, bArr, iArr[0]);
    }

    private void f() {
        if (this.f3010c == null) {
            try {
                this.f3010c = new r(this.a);
            } catch (IOException e2) {
                l g2 = c.g();
                g2.c("CrashlyticsCore", "Could not open log file: " + this.a, e2);
            }
        }
    }

    @Override // com.crashlytics.android.e.y
    public void a() {
        i.a(this.f3010c, "There was a problem closing the Crashlytics log file.");
        this.f3010c = null;
    }

    @Override // com.crashlytics.android.e.y
    public void a(long j2, String str) {
        f();
        b(j2, str);
    }

    @Override // com.crashlytics.android.e.y
    public d b() {
        b e2 = e();
        if (e2 == null) {
            return null;
        }
        return d.a(e2.a, 0, e2.f3012b);
    }

    @Override // com.crashlytics.android.e.y
    public byte[] c() {
        b e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.a;
    }

    @Override // com.crashlytics.android.e.y
    public void d() {
        a();
        this.a.delete();
    }
}
