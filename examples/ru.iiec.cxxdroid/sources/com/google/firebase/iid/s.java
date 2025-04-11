package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class s implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final long f6658b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f6659c = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f6660d;

    /* renamed from: e  reason: collision with root package name */
    private final g f6661e;

    s(FirebaseInstanceId firebaseInstanceId, g gVar, long j2) {
        this.f6660d = firebaseInstanceId;
        this.f6661e = gVar;
        this.f6658b = j2;
        this.f6659c.setReferenceCounted(false);
    }

    private final boolean a(String str) {
        String str2;
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            char c2 = 65535;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals("U")) {
                            c2 = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    this.f6660d.a(str4);
                    if (FirebaseInstanceId.n()) {
                        str2 = "subscribe operation succeeded";
                    }
                } else if (c2 == 1) {
                    this.f6660d.b(str4);
                    if (FirebaseInstanceId.n()) {
                        str2 = "unsubscribe operation succeeded";
                    }
                }
                Log.d("FirebaseInstanceId", str2);
            } catch (IOException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }

    private final boolean c() {
        r d2 = this.f6660d.d();
        if (d2 != null && !d2.a(this.f6661e.c())) {
            return true;
        }
        try {
            String e2 = this.f6660d.e();
            if (e2 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (d2 == null || (d2 != null && !e2.equals(d2.a))) {
                Context a = a();
                Intent intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
                intent2.setClass(a, FirebaseInstanceIdReceiver.class);
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e3) {
            String valueOf = String.valueOf(e3.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (a(r1) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d() {
        /*
            r3 = this;
        L_0x0000:
            com.google.firebase.iid.FirebaseInstanceId r0 = r3.f6660d
            monitor-enter(r0)
            com.google.firebase.iid.q r1 = com.google.firebase.iid.FirebaseInstanceId.m()     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0028 }
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            boolean r0 = r3.a(r1)
            if (r0 != 0) goto L_0x0020
            r0 = 0
            return r0
        L_0x0020:
            com.google.firebase.iid.q r0 = com.google.firebase.iid.FirebaseInstanceId.m()
            r0.a(r1)
            goto L_0x0000
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.s.d():boolean");
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f6660d.c().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId;
        this.f6659c.acquire();
        try {
            boolean z = true;
            this.f6660d.a(true);
            if (this.f6661e.b() == 0) {
                z = false;
            }
            if (!z) {
                firebaseInstanceId = this.f6660d;
            } else {
                if (!b()) {
                    new t(this).a();
                } else if (!c() || !d()) {
                    this.f6660d.a(this.f6658b);
                } else {
                    firebaseInstanceId = this.f6660d;
                }
            }
            firebaseInstanceId.a(false);
        } finally {
            this.f6659c.release();
        }
    }
}
