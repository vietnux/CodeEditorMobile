package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.p;
import com.google.firebase.iid.u;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends u {

    /* renamed from: g  reason: collision with root package name */
    private static final Queue<String> f6679g = new ArrayDeque(10);

    static void a(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    static boolean b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.firebase.iid.u
    public final Intent a(Intent intent) {
        return p.b().a();
    }

    public void a() {
    }

    public void a(c cVar) {
    }

    public void a(String str) {
    }

    public void a(String str, Exception exc) {
    }

    @Override // com.google.firebase.iid.u
    public final boolean b(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!b(intent.getExtras())) {
            return true;
        }
        f.b(this, intent);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
    @Override // com.google.firebase.iid.u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r12) {
        /*
        // Method dump skipped, instructions count: 464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}
