package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.d0;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class v extends ThreadPoolExecutor {

    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: b  reason: collision with root package name */
        private final c f6909b;

        a(c cVar) {
            super(cVar, null);
            this.f6909b = cVar;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            t.f j2 = this.f6909b.j();
            t.f j3 = aVar.f6909b.j();
            return j2 == j3 ? this.f6909b.f6804b - aVar.f6909b.f6804b : j3.ordinal() - j2.ordinal();
        }
    }

    v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.c());
    }

    private void a(int i2) {
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public void a(NetworkInfo networkInfo) {
        int i2;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            a(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    a(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                    }
            }
            i2 = 2;
            a(i2);
            return;
        } else if (type == 1 || type == 6 || type == 9) {
            i2 = 4;
            a(i2);
            return;
        }
        a(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
