package e.b.b.a.c.e;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class a4 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private final o4 f7154c;

    /* renamed from: d  reason: collision with root package name */
    private r0 f7155d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f7156e;

    /* renamed from: f  reason: collision with root package name */
    private final f0 f7157f;

    /* renamed from: g  reason: collision with root package name */
    private final e5 f7158g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f7159h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final f0 f7160i;

    protected a4(d2 d2Var) {
        super(d2Var);
        this.f7158g = new e5(d2Var.b());
        this.f7154c = new o4(this);
        this.f7157f = new b4(this, d2Var);
        this.f7160i = new g4(this, d2Var);
    }

    /* access modifiers changed from: private */
    public final void F() {
        d();
        this.f7158g.b();
        this.f7157f.a(p0.I.a().longValue());
    }

    /* access modifiers changed from: private */
    public final void G() {
        d();
        if (z()) {
            a().F().a("Inactivity, disconnecting from the service");
            y();
        }
    }

    /* access modifiers changed from: private */
    public final void H() {
        d();
        a().F().a("Processing queued up service tasks", Integer.valueOf(this.f7159h.size()));
        for (Runnable runnable : this.f7159h) {
            try {
                runnable.run();
            } catch (Exception e2) {
                a().y().a("Task exception while flushing queue", e2);
            }
        }
        this.f7159h.clear();
        this.f7160i.a();
    }

    private final s a(boolean z) {
        return i().a(z ? a().G() : null);
    }

    /* access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        d();
        if (this.f7155d != null) {
            this.f7155d = null;
            a().F().a("Disconnected from device MeasurementService", componentName);
            d();
            B();
        }
    }

    private final void a(Runnable runnable) {
        d();
        if (z()) {
            runnable.run();
        } else if (((long) this.f7159h.size()) >= 1000) {
            a().y().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f7159h.add(runnable);
            this.f7160i.a(60000);
            B();
        }
    }

    /* access modifiers changed from: protected */
    public final void A() {
        d();
        t();
        s a = a(false);
        m().y();
        a(new c4(this, a));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.a4.B():void");
    }

    /* access modifiers changed from: protected */
    public final void C() {
        d();
        t();
        a(new e4(this, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void D() {
        d();
        t();
        a(new h4(this, a(true)));
    }

    /* access modifiers changed from: package-private */
    public final Boolean E() {
        return this.f7156e;
    }

    /* access modifiers changed from: protected */
    public final void a(n0 n0Var, String str) {
        y.a(n0Var);
        d();
        t();
        a(new i4(this, true, m().a(n0Var), n0Var, a(true), str));
    }

    /* access modifiers changed from: protected */
    public final void a(p5 p5Var) {
        d();
        t();
        a(new m4(this, m().a(p5Var), p5Var, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void a(r0 r0Var) {
        d();
        y.a(r0Var);
        this.f7155d = r0Var;
        F();
        H();
    }

    /* access modifiers changed from: package-private */
    public final void a(r0 r0Var, a aVar, s sVar) {
        int i2;
        b1 y;
        String str;
        d();
        t();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List<a> a = m().a(100);
            if (a != null) {
                arrayList.addAll(a);
                i2 = a.size();
            } else {
                i2 = 0;
            }
            if (aVar != null && i2 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                a aVar2 = (a) obj;
                if (aVar2 instanceof n0) {
                    try {
                        r0Var.a((n0) aVar2, sVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        y = a().y();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof p5) {
                    try {
                        r0Var.a((p5) aVar2, sVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        y = a().y();
                        str = "Failed to send attribute to the service";
                    }
                } else if (aVar2 instanceof w) {
                    try {
                        r0Var.a((w) aVar2, sVar);
                    } catch (RemoteException e4) {
                        e = e4;
                        y = a().y();
                        str = "Failed to send conditional property to the service";
                    }
                } else {
                    a().y().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
        return;
        y.a(str, e);
    }

    /* access modifiers changed from: protected */
    public final void a(w3 w3Var) {
        d();
        t();
        a(new f4(this, w3Var));
    }

    /* access modifiers changed from: protected */
    public final void a(w wVar) {
        y.a(wVar);
        d();
        t();
        a(new j4(this, true, m().a(wVar), new w(wVar), a(true), wVar));
    }

    public final void a(AtomicReference<String> atomicReference) {
        d();
        t();
        a(new d4(this, atomicReference, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<w>> atomicReference, String str, String str2, String str3) {
        d();
        t();
        a(new k4(this, atomicReference, str, str2, str3, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<p5>> atomicReference, String str, String str2, String str3, boolean z) {
        d();
        t();
        a(new l4(this, atomicReference, str, str2, str3, z, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<p5>> atomicReference, boolean z) {
        d();
        t();
        a(new n4(this, atomicReference, a(false), z));
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final void y() {
        d();
        t();
        try {
            com.google.android.gms.common.s.a.a().b(getContext(), this.f7154c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f7155d = null;
    }

    public final boolean z() {
        d();
        t();
        return this.f7155d != null;
    }
}
