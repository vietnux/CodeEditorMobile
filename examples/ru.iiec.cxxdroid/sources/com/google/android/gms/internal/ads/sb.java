package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@k2
public final class sb {
    private Map<Integer, Bitmap> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f5525b = new AtomicInteger(0);

    public final int a(Bitmap bitmap) {
        if (bitmap == null) {
            qc.b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f5525b.getAndIncrement();
        this.a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    public final Bitmap a(Integer num) {
        return this.a.get(num);
    }

    public final void b(Integer num) {
        this.a.remove(num);
    }
}
