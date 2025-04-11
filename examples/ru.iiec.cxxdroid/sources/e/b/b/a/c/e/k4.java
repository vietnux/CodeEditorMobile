package e.b.b.a.c.e;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class k4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7388b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7389c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7390d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7391e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ s f7392f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ a4 f7393g;

    k4(a4 a4Var, AtomicReference atomicReference, String str, String str2, String str3, s sVar) {
        this.f7393g = a4Var;
        this.f7388b = atomicReference;
        this.f7389c = str;
        this.f7390d = str2;
        this.f7391e = str3;
        this.f7392f = sVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<w> b2;
        synchronized (this.f7388b) {
            try {
                r0 d2 = a4.d(this.f7393g);
                if (d2 == null) {
                    this.f7393g.a().y().a("Failed to get conditional properties", z0.a(this.f7389c), this.f7390d, this.f7391e);
                    this.f7388b.set(Collections.emptyList());
                    this.f7388b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f7389c)) {
                    atomicReference2 = this.f7388b;
                    b2 = d2.a(this.f7390d, this.f7391e, this.f7392f);
                } else {
                    atomicReference2 = this.f7388b;
                    b2 = d2.b(this.f7389c, this.f7390d, this.f7391e);
                }
                atomicReference2.set(b2);
                a4.e(this.f7393g);
                atomicReference = this.f7388b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                this.f7393g.a().y().a("Failed to get conditional properties", z0.a(this.f7389c), this.f7390d, e2);
                this.f7388b.set(Collections.emptyList());
                atomicReference = this.f7388b;
            } catch (Throwable th) {
                this.f7388b.notify();
                throw th;
            }
        }
    }
}
