package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import c.e.g;
import java.util.ArrayDeque;
import java.util.Queue;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    private static p f6644e;
    private final g<String, String> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6645b = null;

    /* renamed from: c  reason: collision with root package name */
    final Queue<Intent> f6646c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f6647d = new ArrayDeque();

    private p() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(android.content.Context r6, android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.p.a(android.content.Context, android.content.Intent):int");
    }

    public static PendingIntent a(Context context, int i2, Intent intent, int i3) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
        intent2.putExtra("wrapped_intent", intent);
        return PendingIntent.getBroadcast(context, i2, intent2, 1073741824);
    }

    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            if (f6644e == null) {
                f6644e = new p();
            }
            pVar = f6644e;
        }
        return pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r4, java.lang.String r5, android.content.Intent r6) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            r1 = -842411455(0xffffffffcdc9d241, float:-4.23249952E8)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 41532704(0x279bd20, float:1.8347907E-37)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "com.google.firebase.INSTANCE_ID_EVENT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x004b
            if (r0 == r2) goto L_0x0048
            java.lang.String r4 = "Unknown service action: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x003a
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0040
        L_0x003a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0040:
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.w(r5, r4)
            r4 = 500(0x1f4, float:7.0E-43)
            return r4
        L_0x0048:
            java.util.Queue<android.content.Intent> r0 = r3.f6647d
            goto L_0x004d
        L_0x004b:
            java.util.Queue<android.content.Intent> r0 = r3.f6646c
        L_0x004d:
            r0.offer(r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            java.lang.String r5 = r4.getPackageName()
            r6.setPackage(r5)
            int r4 = r3.a(r4, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.p.a(android.content.Context, java.lang.String, android.content.Intent):int");
    }

    public final Intent a() {
        return this.f6647d.poll();
    }
}
