package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Future;

@k2
public final class ld0 implements a70 {
    private ed0 a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4868b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4869c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4870d = new Object();

    public ld0(Context context) {
        this.f4869c = context;
    }

    private final Future<ParcelFileDescriptor> a(fd0 fd0) {
        md0 md0 = new md0(this);
        nd0 nd0 = new nd0(this, md0, fd0);
        qd0 qd0 = new qd0(this, md0);
        synchronized (this.f4870d) {
            this.a = new ed0(this.f4869c, x0.u().b(), nd0, qd0);
            this.a.j();
        }
        return md0;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.f4870d) {
            if (this.a != null) {
                this.a.g();
                this.a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        r0 = new java.lang.StringBuilder(52);
        r0.append("Http assets remote cache took ");
        r0.append(com.google.android.gms.ads.internal.x0.m().b() - r5);
        r0.append("ms");
        com.google.android.gms.internal.ads.l9.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00de, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ExcHandler: InterruptedException | ExecutionException | TimeoutException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:14:0x0093] */
    @Override // com.google.android.gms.internal.ads.a70
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ba0 a(com.google.android.gms.internal.ads.bc0<?> r18) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ld0.a(com.google.android.gms.internal.ads.bc0):com.google.android.gms.internal.ads.ba0");
    }
}
