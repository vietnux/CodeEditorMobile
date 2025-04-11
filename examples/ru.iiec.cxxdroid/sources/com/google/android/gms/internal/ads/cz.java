package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class cz {
    private final tx a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4057b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4058c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Method f4059d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?>[] f4060e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f4061f = new CountDownLatch(1);

    public cz(tx txVar, String str, String str2, Class<?>... clsArr) {
        this.a = txVar;
        this.f4057b = str;
        this.f4058c = str2;
        this.f4060e = clsArr;
        this.a.c().submit(new dz(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.a.e().a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:4:? A[ExcHandler: fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:6:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.tx r0 = r3.a     // Catch:{ all -> 0x0035 }
            dalvik.system.DexClassLoader r0 = r0.d()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.tx r1 = r3.a     // Catch:{ all -> 0x0035 }
            byte[] r1 = r1.f()     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r3.f4057b     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ all -> 0x0035 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001e
        L_0x0018:
            java.util.concurrent.CountDownLatch r0 = r3.f4061f
            r0.countDown()
            return
        L_0x001e:
            com.google.android.gms.internal.ads.tx r1 = r3.a     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            byte[] r1 = r1.f()     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r2 = r3.f4058c     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.Class<?>[] r2 = r3.f4060e     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            r3.f4059d = r0     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r3.f4059d     // Catch:{ fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, fx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            goto L_0x0018
        L_0x0035:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r3.f4061f
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cz.b():void");
    }

    public final Method a() {
        if (this.f4059d != null) {
            return this.f4059d;
        }
        try {
            if (!this.f4061f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f4059d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
