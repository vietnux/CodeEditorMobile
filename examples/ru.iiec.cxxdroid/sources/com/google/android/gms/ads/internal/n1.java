package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.n40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@k2
public final class n1 {
    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public static Object[] a(String str, j40 j40, String str2, int i2, n40 n40) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(j40.f4675c));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(j40.f4676d));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(j40.f4677e));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = j40.f4678f;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(j40.f4679g));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(j40.f4680h));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(j40.f4681i));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(j40.f4682j);
        }
        if (hashSet.contains("location")) {
            Location location = j40.f4684l;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(j40.f4685m);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(j40.n));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(j40.o));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = j40.p;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(j40.q);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(j40.r);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(j40.s));
        }
        return arrayList.toArray();
    }
}
