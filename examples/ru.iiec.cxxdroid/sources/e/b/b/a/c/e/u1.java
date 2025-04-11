package e.b.b.a.c.e;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.y;

public final class u1 {
    private final x1 a;

    public u1(x1 x1Var) {
        y.a(x1Var);
        this.a = x1Var;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        y.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        d2 a2 = d2.a(context);
        z0 a3 = a2.a();
        if (intent == null) {
            a3.B().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        a3.F().a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a3.F().a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a2.c().a(new v1(this, a2, a3));
            } catch (Exception e2) {
                a3.B().a("Install Referrer Reporter encountered a problem", e2);
            }
            BroadcastReceiver.PendingResult a4 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                a3.F().a("Install referrer extras are null");
                if (a4 != null) {
                    a4.finish();
                    return;
                }
                return;
            }
            a3.D().a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a5 = a2.h().a(Uri.parse(stringExtra));
            if (a5 == null) {
                a3.F().a("No campaign defined in install referrer broadcast");
                if (a4 != null) {
                    a4.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                a3.B().a("Install referrer is missing timestamp");
            }
            a2.c().a(new w1(this, a2, longExtra, a5, context, a3, a4));
        }
    }
}
