package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ww {

    /* renamed from: c  reason: collision with root package name */
    private static final ConditionVariable f5966c = new ConditionVariable();

    /* renamed from: d  reason: collision with root package name */
    protected static volatile v20 f5967d = null;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Random f5968e = null;
    private tx a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile Boolean f5969b;

    public ww(tx txVar) {
        this.a = txVar;
        txVar.c().execute(new xw(this));
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : b().nextInt();
        } catch (RuntimeException unused) {
            return b().nextInt();
        }
    }

    private static Random b() {
        if (f5968e == null) {
            synchronized (ww.class) {
                if (f5968e == null) {
                    f5968e = new Random();
                }
            }
        }
        return f5968e;
    }

    public final void a(int i2, int i3, long j2) {
        try {
            f5966c.block();
            if (this.f5969b.booleanValue() && f5967d != null) {
                sl slVar = new sl();
                slVar.f5539c = this.a.a.getPackageName();
                slVar.f5540d = Long.valueOf(j2);
                x20 a2 = f5967d.a(iv.a(slVar));
                a2.a(i3);
                a2.b(i2);
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
