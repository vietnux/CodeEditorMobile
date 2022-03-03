package e.b.b.a.c.e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.s.a;

public final class o4 implements ServiceConnection, d.a, d.b {
    private volatile boolean a;

    /* renamed from: b  reason: collision with root package name */
    private volatile y0 f7482b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a4 f7483c;

    protected o4(a4 a4Var) {
        this.f7483c = a4Var;
    }

    public final void a() {
        this.f7483c.d();
        Context context = this.f7483c.getContext();
        synchronized (this) {
            if (this.a) {
                this.f7483c.a().F().a("Connection attempt already in progress");
            } else if (this.f7482b != null) {
                this.f7483c.a().F().a("Already awaiting connection attempt");
            } else {
                this.f7482b = new y0(context, Looper.getMainLooper(), this, this);
                this.f7483c.a().F().a("Connecting to remote service");
                this.a = true;
                this.f7482b.j();
            }
        }
    }

    public final void a(Intent intent) {
        this.f7483c.d();
        Context context = this.f7483c.getContext();
        a a2 = a.a();
        synchronized (this) {
            if (this.a) {
                this.f7483c.a().F().a("Connection attempt already in progress");
                return;
            }
            this.f7483c.a().F().a("Using local app measurement service");
            this.a = true;
            a2.a(context, intent, a4.a(this.f7483c), 129);
        }
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(b bVar) {
        y.a("MeasurementServiceConnection.onConnectionFailed");
        z0 A = this.f7483c.a.A();
        if (A != null) {
            A.B().a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.f7482b = null;
        }
        this.f7483c.c().a(new t4(this));
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void e(int i2) {
        y.a("MeasurementServiceConnection.onConnectionSuspended");
        this.f7483c.a().E().a("Service connection suspended");
        this.f7483c.c().a(new s4(this));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0022 */
    @Override // com.google.android.gms.common.internal.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onConnected"
            com.google.android.gms.common.internal.y.a(r4)
            monitor-enter(r3)
            r4 = 0
            e.b.b.a.c.e.y0 r0 = r3.f7482b     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            android.os.IInterface r0 = r0.v()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            e.b.b.a.c.e.r0 r0 = (e.b.b.a.c.e.r0) r0     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r3.f7482b = r4     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            e.b.b.a.c.e.a4 r1 = r3.f7483c     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            e.b.b.a.c.e.z1 r1 = r1.c()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            e.b.b.a.c.e.r4 r2 = new e.b.b.a.c.e.r4     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r2.<init>(r3, r0)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r1.a(r2)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            goto L_0x0027
        L_0x0020:
            r4 = move-exception
            goto L_0x0029
        L_0x0022:
            r3.f7482b = r4     // Catch:{ all -> 0x0020 }
            r4 = 0
            r3.a = r4     // Catch:{ all -> 0x0020 }
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            return
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.o4.j(android.os.Bundle):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y.a("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.f7483c.a().y().a("Service connected with null binder");
                return;
            }
            r0 r0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        r0Var = queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new t0(iBinder);
                    }
                    this.f7483c.a().F().a("Bound to IMeasurementService interface");
                } else {
                    this.f7483c.a().y().a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f7483c.a().y().a("Service connect failed to get IMeasurementService");
            }
            if (r0Var == null) {
                this.a = false;
                try {
                    a.a().b(this.f7483c.getContext(), a4.a(this.f7483c));
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f7483c.c().a(new p4(this, r0Var));
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        y.a("MeasurementServiceConnection.onServiceDisconnected");
        this.f7483c.a().E().a("Service disconnected");
        this.f7483c.c().a(new q4(this, componentName));
    }
}
