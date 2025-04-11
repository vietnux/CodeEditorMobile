package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.s.a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class n0 implements ServiceConnection {
    int a;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f6639b;

    /* renamed from: c  reason: collision with root package name */
    s0 f6640c;

    /* renamed from: d  reason: collision with root package name */
    final Queue<d<?>> f6641d;

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<d<?>> f6642e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l0 f6643f;

    private n0(l0 l0Var) {
        this.f6643f = l0Var;
        this.a = 0;
        this.f6639b = new Messenger(new Handler(Looper.getMainLooper(), new o0(this)));
        this.f6641d = new ArrayDeque();
        this.f6642e = new SparseArray<>();
    }

    private final void c() {
        l0.b(this.f6643f).execute(new q0(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (this.a == 2 && this.f6641d.isEmpty() && this.f6642e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            a.a().b(l0.a(this.f6643f), this);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2) {
        d<?> dVar = this.f6642e.get(i2);
        if (dVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f6642e.remove(i2);
            dVar.a(new e(3, "Timed out waiting for response"));
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            a.a().b(l0.a(this.f6643f), this);
            e eVar = new e(i2, str);
            for (d<?> dVar : this.f6641d) {
                dVar.a(eVar);
            }
            this.f6641d.clear();
            for (int i4 = 0; i4 < this.f6642e.size(); i4++) {
                this.f6642e.valueAt(i4).a(eVar);
            }
            this.f6642e.clear();
        } else if (i3 == 3) {
            this.a = 4;
        } else if (i3 != 4) {
            int i5 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i5);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.a(new com.google.firebase.iid.e(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.os.Message r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n0.a(android.os.Message):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(d dVar) {
        int i2 = this.a;
        if (i2 == 0) {
            this.f6641d.add(dVar);
            y.b(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!a.a().a(l0.a(this.f6643f), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                l0.b(this.f6643f).schedule(new p0(this), 30, TimeUnit.SECONDS);
            }
            return true;
        } else if (i2 == 1) {
            this.f6641d.add(dVar);
            return true;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    int i3 = this.a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        } else {
            this.f6641d.add(dVar);
            c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.f6640c = new s0(iBinder);
            this.a = 2;
            c();
        } catch (RemoteException e2) {
            a(0, e2.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
