package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class r10 {
    private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);

    /* renamed from: b  reason: collision with root package name */
    private Base64OutputStream f5370b = new Base64OutputStream(this.a, 10);

    public final void a(byte[] bArr) {
        this.f5370b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f5370b.close();
        } catch (IOException e2) {
            qc.b("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.a.close();
            str = this.a.toString();
        } catch (IOException e3) {
            qc.b("HashManager: Unable to convert to Base64.", e3);
            str = "";
        } catch (Throwable th) {
            this.a = null;
            this.f5370b = null;
            throw th;
        }
        this.a = null;
        this.f5370b = null;
        return str;
    }
}
