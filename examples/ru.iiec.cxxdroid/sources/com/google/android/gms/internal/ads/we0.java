package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.x0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@k2
public final class we0 {
    private final Map<xe0, ye0> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedList<xe0> f5935b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private rd0 f5936c;

    static Set<String> a(j40 j40) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(j40.f4676d.keySet());
        Bundle bundle = j40.n.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    private static void a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static void a(String str, xe0 xe0) {
        if (qc.a(2)) {
            l9.e(String.format(str, xe0));
        }
    }

    private static String[] a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i2 = 0; i2 < split.length; i2++) {
                split[i2] = new String(Base64.decode(split[i2], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    static j40 b(j40 j40) {
        j40 d2 = d(j40);
        Bundle bundle = d2.n.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        d2.f4676d.putBoolean("_skipMediation", true);
        return d2;
    }

    private final String b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<xe0> it = this.f5935b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(it.next().toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static boolean b(String str) {
        try {
            return Pattern.matches((String) a50.g().a(k80.Y0), str);
        } catch (RuntimeException e2) {
            x0.j().a(e2, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static j40 c(j40 j40) {
        j40 d2 = d(j40);
        String[] split = ((String) a50.g().a(k80.U0)).split(",");
        for (String str : split) {
            a(d2.n, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                a(d2.f4676d, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return d2;
    }

    private static String c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    private static j40 d(j40 j40) {
        Parcel obtain = Parcel.obtain();
        j40.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        j40 createFromParcel = j40.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) a50.g().a(k80.L0)).booleanValue() ? createFromParcel.t() : createFromParcel;
    }

    /* access modifiers changed from: package-private */
    public final ze0 a(j40 j40, String str) {
        if (b(str)) {
            return null;
        }
        int i2 = new h5(this.f5936c.a()).a().n;
        j40 c2 = c(j40);
        String c3 = c(str);
        xe0 xe0 = new xe0(c2, c3, i2);
        ye0 ye0 = this.a.get(xe0);
        if (ye0 == null) {
            a("Interstitial pool created at %s.", xe0);
            ye0 = new ye0(c2, c3, i2);
            this.a.put(xe0, ye0);
        }
        this.f5935b.remove(xe0);
        this.f5935b.add(xe0);
        ye0.g();
        while (true) {
            if (this.f5935b.size() <= ((Integer) a50.g().a(k80.V0)).intValue()) {
                break;
            }
            xe0 remove = this.f5935b.remove();
            ye0 ye02 = this.a.get(remove);
            a("Evicting interstitial queue for %s.", remove);
            while (ye02.c() > 0) {
                ze0 a2 = ye02.a((j40) null);
                if (a2.f6202e) {
                    bf0.j().b();
                }
                a2.a.q2();
            }
            this.a.remove(remove);
        }
        while (ye0.c() > 0) {
            ze0 a3 = ye0.a(c2);
            if (a3.f6202e) {
                if (x0.m().a() - a3.f6201d > ((long) ((Integer) a50.g().a(k80.X0)).intValue()) * 1000) {
                    a("Expired interstitial at %s.", xe0);
                    bf0.j().a();
                }
            }
            String str2 = a3.f6199b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(str2.length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            a(sb.toString(), xe0);
            return a3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int c2;
        int e2;
        if (this.f5936c != null) {
            for (Map.Entry<xe0, ye0> entry : this.a.entrySet()) {
                xe0 key = entry.getKey();
                ye0 value = entry.getValue();
                if (qc.a(2) && (e2 = value.e()) < (c2 = value.c())) {
                    l9.e(String.format("Loading %s/%s pooled interstitials for %s.", Integer.valueOf(c2 - e2), Integer.valueOf(c2), key));
                }
                int f2 = value.f() + 0;
                while (true) {
                    if (value.c() >= ((Integer) a50.g().a(k80.W0)).intValue()) {
                        break;
                    }
                    a("Pooling and loading one new interstitial for %s.", key);
                    if (value.a(this.f5936c)) {
                        f2++;
                    }
                }
                bf0.j().a(f2);
            }
            rd0 rd0 = this.f5936c;
            if (rd0 != null) {
                SharedPreferences.Editor edit = rd0.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Map.Entry<xe0, ye0> entry2 : this.a.entrySet()) {
                    xe0 key2 = entry2.getKey();
                    ye0 value2 = entry2.getValue();
                    if (value2.h()) {
                        edit.putString(key2.toString(), new df0(value2).a());
                        a("Saved interstitial queue for %s.", key2);
                    }
                }
                edit.putString("PoolKeys", b());
                edit.apply();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(rd0 rd0) {
        if (this.f5936c == null) {
            this.f5936c = rd0.b();
            rd0 rd02 = this.f5936c;
            if (rd02 != null) {
                SharedPreferences sharedPreferences = rd02.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f5935b.size() > 0) {
                    xe0 remove = this.f5935b.remove();
                    ye0 ye0 = this.a.get(remove);
                    a("Flushing interstitial queue for %s.", remove);
                    while (ye0.c() > 0) {
                        ye0.a((j40) null).a.q2();
                    }
                    this.a.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                        if (!entry.getKey().equals("PoolKeys")) {
                            df0 a2 = df0.a((String) entry.getValue());
                            xe0 xe0 = new xe0(a2.a, a2.f4103b, a2.f4104c);
                            if (!this.a.containsKey(xe0)) {
                                this.a.put(xe0, new ye0(a2.a, a2.f4103b, a2.f4104c));
                                hashMap.put(xe0.toString(), xe0);
                                a("Restored interstitial queue for %s.", xe0);
                            }
                        }
                    }
                    for (String str : a(sharedPreferences.getString("PoolKeys", ""))) {
                        xe0 xe02 = (xe0) hashMap.get(str);
                        if (this.a.containsKey(xe02)) {
                            this.f5935b.add(xe02);
                        }
                    }
                } catch (IOException | RuntimeException e2) {
                    x0.j().a(e2, "InterstitialAdPool.restore");
                    qc.c("Malformed preferences value for InterstitialAdPool.", e2);
                    this.a.clear();
                    this.f5935b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(j40 j40, String str) {
        rd0 rd0 = this.f5936c;
        if (rd0 != null) {
            int i2 = new h5(rd0.a()).a().n;
            j40 c2 = c(j40);
            String c3 = c(str);
            xe0 xe0 = new xe0(c2, c3, i2);
            ye0 ye0 = this.a.get(xe0);
            if (ye0 == null) {
                a("Interstitial pool created at %s.", xe0);
                ye0 = new ye0(c2, c3, i2);
                this.a.put(xe0, ye0);
            }
            ye0.a(this.f5936c, j40);
            ye0.g();
            a("Inline entry added to the queue at %s.", xe0);
        }
    }
}
