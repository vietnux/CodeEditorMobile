package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

final class t extends BroadcastReceiver {
    private s a;

    public t(s sVar) {
        this.a = sVar;
    }

    public final void a() {
        if (FirebaseInstanceId.n()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        s sVar = this.a;
        if (sVar != null && sVar.b()) {
            if (FirebaseInstanceId.n()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a(this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
