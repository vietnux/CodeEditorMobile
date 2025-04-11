package e.b.b.a.c.e;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class l4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7414b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7415c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7416d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7417e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7418f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ s f7419g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ a4 f7420h;

    l4(a4 a4Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, s sVar) {
        this.f7420h = a4Var;
        this.f7414b = atomicReference;
        this.f7415c = str;
        this.f7416d = str2;
        this.f7417e = str3;
        this.f7418f = z;
        this.f7419g = sVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<p5> a;
        synchronized (this.f7414b) {
            try {
                r0 d2 = a4.d(this.f7420h);
                if (d2 == null) {
                    this.f7420h.a().y().a("Failed to get user properties", z0.a(this.f7415c), this.f7416d, this.f7417e);
                    this.f7414b.set(Collections.emptyList());
                    this.f7414b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f7415c)) {
                    atomicReference2 = this.f7414b;
                    a = d2.a(this.f7416d, this.f7417e, this.f7418f, this.f7419g);
                } else {
                    atomicReference2 = this.f7414b;
                    a = d2.a(this.f7415c, this.f7416d, this.f7417e, this.f7418f);
                }
                atomicReference2.set(a);
                a4.e(this.f7420h);
                atomicReference = this.f7414b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                this.f7420h.a().y().a("Failed to get user properties", z0.a(this.f7415c), this.f7416d, e2);
                this.f7414b.set(Collections.emptyList());
                atomicReference = this.f7414b;
            } catch (Throwable th) {
                this.f7414b.notify();
                throw th;
            }
        }
    }
}
