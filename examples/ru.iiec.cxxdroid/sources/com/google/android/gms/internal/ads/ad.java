package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@k2
public final class ad {
    public static <T> jd<T> a(Throwable th) {
        return new jd<>(th);
    }

    public static <T> kd<T> a(T t) {
        return new kd<>(t);
    }

    public static <V> ld<V> a(ld<V> ldVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        wd wdVar = new wd();
        a((ld) wdVar, (Future) ldVar);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new ed(wdVar), j2, timeUnit);
        a((ld) ldVar, wdVar);
        wdVar.a(new fd(schedule), rd.f5433b);
        return wdVar;
    }

    public static <A, B> ld<B> a(ld<A> ldVar, vc<? super A, ? extends B> vcVar, Executor executor) {
        wd wdVar = new wd();
        ldVar.a(new dd(wdVar, vcVar, ldVar), executor);
        a((ld) wdVar, (Future) ldVar);
        return wdVar;
    }

    public static <A, B> ld<B> a(ld<A> ldVar, wc<A, B> wcVar, Executor executor) {
        wd wdVar = new wd();
        ldVar.a(new cd(wdVar, wcVar, ldVar), executor);
        a((ld) wdVar, (Future) ldVar);
        return wdVar;
    }

    public static <V, X extends Throwable> ld<V> a(ld<? extends V> ldVar, Class<X> cls, vc<? super X, ? extends V> vcVar, Executor executor) {
        wd wdVar = new wd();
        a((ld) wdVar, (Future) ldVar);
        ldVar.a(new gd(wdVar, ldVar, cls, vcVar, executor), rd.f5433b);
        return wdVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.internal.ads.i80 */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Future<T> future, T t) {
        try {
            return future.get(((Long) a50.g().a(k80.y1)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            qc.c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            x0.j().b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            qc.b("Error waiting for future.", e);
            x0.j().b(e, "Futures.resolveFuture");
            return t;
        }
    }

    public static <T> T a(Future<T> future, T t, long j2, TimeUnit timeUnit) {
        try {
            return future.get(j2, timeUnit);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            qc.c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            x0.j().a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            qc.b("Error waiting for future.", e);
            x0.j().a(e, "Futures.resolveFuture");
            return t;
        }
    }

    private static <V> void a(ld<? extends V> ldVar, wd<V> wdVar) {
        a((ld) wdVar, (Future) ldVar);
        ldVar.a(new hd(wdVar, ldVar), rd.f5433b);
    }

    public static <V> void a(ld<V> ldVar, xc<V> xcVar, Executor executor) {
        ldVar.a(new bd(xcVar, ldVar), executor);
    }

    private static <A, B> void a(ld<A> ldVar, Future<B> future) {
        ldVar.a(new id(ldVar, future), rd.f5433b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void a(com.google.android.gms.internal.ads.wd r1, com.google.android.gms.internal.ads.ld r2, java.lang.Class r3, com.google.android.gms.internal.ads.vc r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.kd r2 = a(r2)
            com.google.android.gms.internal.ads.ld r2 = a(r2, r4, r5)
            a(r2, r1)
            return
        L_0x002a:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad.a(com.google.android.gms.internal.ads.wd, com.google.android.gms.internal.ads.ld, java.lang.Class, com.google.android.gms.internal.ads.vc, java.util.concurrent.Executor):void");
    }

    static final /* synthetic */ void a(wd wdVar, vc vcVar, ld ldVar) {
        if (!wdVar.isCancelled()) {
            try {
                a(vcVar.b(ldVar.get()), wdVar);
            } catch (CancellationException unused) {
                wdVar.cancel(true);
            } catch (ExecutionException e2) {
                wdVar.a(e2.getCause());
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                wdVar.a(e3);
            } catch (Exception e4) {
                wdVar.a(e4);
            }
        }
    }
}
