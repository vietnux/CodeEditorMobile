package androidx.activity.result.h;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.h.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a<String[], Map<String, Boolean>> {
    static Intent a(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    public Intent a(Context context, String[] strArr) {
        return a(strArr);
    }

    @Override // androidx.activity.result.h.a
    public Map<String, Boolean> a(int i2, Intent intent) {
        if (i2 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i3 = 0; i3 < length; i3++) {
            hashMap.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
        }
        return hashMap;
    }

    public a.C0005a<Map<String, Boolean>> b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new a.C0005a<>(Collections.emptyMap());
        }
        c.e.a aVar = new c.e.a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = c.h.d.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new a.C0005a<>(aVar);
        }
        return null;
    }
}
