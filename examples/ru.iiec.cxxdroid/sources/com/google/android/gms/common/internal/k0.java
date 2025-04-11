package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.s.a;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class k0 extends n implements Handler.Callback {

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<n.a, l0> f3678c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f3679d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3680e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3681f;

    /* renamed from: g  reason: collision with root package name */
    private final long f3682g;

    /* renamed from: h  reason: collision with root package name */
    private final long f3683h;

    k0(Context context) {
        this.f3679d = context.getApplicationContext();
        this.f3680e = new Handler(context.getMainLooper(), this);
        this.f3681f = a.a();
        this.f3682g = 5000;
        this.f3683h = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.n
    public final boolean a(n.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        y.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3678c) {
            l0 l0Var = this.f3678c.get(aVar);
            if (l0Var == null) {
                l0Var = new l0(this, aVar);
                l0Var.a(serviceConnection, str);
                l0Var.a(str);
                this.f3678c.put(aVar, l0Var);
            } else {
                this.f3680e.removeMessages(0, aVar);
                if (!l0Var.a(serviceConnection)) {
                    l0Var.a(serviceConnection, str);
                    int c2 = l0Var.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(l0Var.b(), l0Var.a());
                    } else if (c2 == 2) {
                        l0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = l0Var.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.n
    public final void b(n.a aVar, ServiceConnection serviceConnection, String str) {
        y.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3678c) {
            l0 l0Var = this.f3678c.get(aVar);
            if (l0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (l0Var.a(serviceConnection)) {
                l0Var.b(serviceConnection, str);
                if (l0Var.e()) {
                    this.f3680e.sendMessageDelayed(this.f3680e.obtainMessage(0, aVar), this.f3682g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f3678c) {
                n.a aVar = (n.a) message.obj;
                l0 l0Var = this.f3678c.get(aVar);
                if (l0Var != null && l0Var.e()) {
                    if (l0Var.d()) {
                        l0Var.b("GmsClientSupervisor");
                    }
                    this.f3678c.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.f3678c) {
                n.a aVar2 = (n.a) message.obj;
                l0 l0Var2 = this.f3678c.get(aVar2);
                if (l0Var2 != null && l0Var2.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b2 = l0Var2.b();
                    if (b2 == null) {
                        b2 = aVar2.b();
                    }
                    if (b2 == null) {
                        b2 = new ComponentName(aVar2.c(), "unknown");
                    }
                    l0Var2.onServiceDisconnected(b2);
                }
            }
            return true;
        }
    }
}
