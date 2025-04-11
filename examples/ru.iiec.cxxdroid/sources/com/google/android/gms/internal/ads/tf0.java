package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@k2
public abstract class tf0<ReferenceT> {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<e0<? super ReferenceT>>> f5619b = new HashMap();

    private final synchronized void b(String str, Map<String, String> map) {
        if (qc.a(2)) {
            String valueOf = String.valueOf(str);
            l9.e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                l9.e(sb.toString());
            }
        }
        CopyOnWriteArrayList<e0<? super ReferenceT>> copyOnWriteArrayList = this.f5619b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<e0<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rd.a.execute(new uf0(this, it.next(), map));
            }
        }
    }

    public final synchronized void a(String str, e0<? super ReferenceT> e0Var) {
        CopyOnWriteArrayList<e0<? super ReferenceT>> copyOnWriteArrayList = this.f5619b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(e0Var);
        }
    }

    public final synchronized void a(String str, o<e0<? super ReferenceT>> oVar) {
        CopyOnWriteArrayList<e0<? super ReferenceT>> copyOnWriteArrayList = this.f5619b.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<e0<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                e0<? super ReferenceT> next = it.next();
                if (oVar.a(next)) {
                    arrayList.add(next);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final boolean a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        x0.f();
        b(path, u9.a(uri));
        return true;
    }

    public final synchronized void b(String str, e0<? super ReferenceT> e0Var) {
        CopyOnWriteArrayList<e0<? super ReferenceT>> copyOnWriteArrayList = this.f5619b.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f5619b.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(e0Var);
    }

    public abstract ReferenceT k();

    public synchronized void l() {
        this.f5619b.clear();
    }
}
