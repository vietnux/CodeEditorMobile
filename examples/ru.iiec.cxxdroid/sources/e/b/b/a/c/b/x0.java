package e.b.b.a.c.b;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

public final class x0 implements p0 {
    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public static Status a(int i2) {
        String str;
        if (i2 == -6508) {
            str = "SUCCESS_CACHE_STALE";
        } else if (i2 == 6507) {
            str = "FETCH_THROTTLED_STALE";
        } else if (i2 == -6506) {
            str = "SUCCESS_CACHE";
        } else if (i2 != -6505) {
            switch (i2) {
                case 6500:
                    str = "NOT_AUTHORIZED_TO_FETCH";
                    break;
                case 6501:
                    str = "ANOTHER_FETCH_INFLIGHT";
                    break;
                case 6502:
                    str = "FETCH_THROTTLED";
                    break;
                case 6503:
                    str = "NOT_AVAILABLE";
                    break;
                case 6504:
                    str = "FAILURE_CACHE";
                    break;
                default:
                    str = d.a(i2);
                    break;
            }
        } else {
            str = "SUCCESS_FRESH";
        }
        return new Status(i2, str);
    }

    public static HashMap<String, TreeMap<String, byte[]>> a(e eVar) {
        DataHolder u;
        if (eVar == null || (u = eVar.u()) == null) {
            return null;
        }
        k kVar = (k) new com.google.android.gms.common.data.d(u, k.CREATOR).get(0);
        eVar.w();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap<>();
        for (String str : kVar.t().keySet()) {
            TreeMap<String, byte[]> treeMap = new TreeMap<>();
            hashMap.put(str, treeMap);
            Bundle bundle = kVar.t().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    static List<byte[]> b(e eVar) {
        DataHolder v;
        if (eVar == null || (v = eVar.v()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (g1 g1Var : new com.google.android.gms.common.data.d(v, g1.CREATOR)) {
            arrayList.add(g1Var.t());
        }
        eVar.x();
        return arrayList;
    }

    @Override // e.b.b.a.c.b.p0
    public final g<t0> a(f fVar, r0 r0Var) {
        if (fVar == null || r0Var == null) {
            return null;
        }
        return fVar.a(new y0(this, fVar, r0Var));
    }
}
