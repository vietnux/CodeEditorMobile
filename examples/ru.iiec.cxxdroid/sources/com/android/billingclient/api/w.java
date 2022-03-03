package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.g;
import e.b.b.a.c.f.a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class w {
    static g a(Bundle bundle, String str, String str2) {
        String format;
        g gVar = v.f2782j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int a = a.a(bundle, "BillingClient");
            String b2 = a.b(bundle, "BillingClient");
            g.a c2 = g.c();
            c2.a(a);
            c2.a(b2);
            g a2 = c2.a();
            if (a != 0) {
                a.b("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(a)));
                return a2;
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else if (stringArrayList3 != null) {
                    return v.f2783k;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            }
        }
        a.b("BillingClient", format);
        return gVar;
    }
}
