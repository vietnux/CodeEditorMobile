package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
public final class c2 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final Object f7192b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<b2<?>> f7193c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ z1 f7194d;

    public c2(z1 z1Var, String str, BlockingQueue<b2<?>> blockingQueue) {
        this.f7194d = z1Var;
        y.a((Object) str);
        y.a(blockingQueue);
        this.f7193c = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.f7194d.a().B().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f7192b) {
            this.f7192b.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        r1 = r6.f7194d.f7733j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r6.f7194d.f7734k.release();
        r6.f7194d.f7733j.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r6 != r6.f7194d.f7727d) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        r6.f7194d.f7727d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r6 != r6.f7194d.f7728e) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r6.f7194d.f7728e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        r6.f7194d.a().y().a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.c2.run():void");
    }
}
