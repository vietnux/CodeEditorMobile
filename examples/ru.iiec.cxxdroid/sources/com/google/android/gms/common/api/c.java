package com.google.android.gms.common.api;

import android.text.TextUtils;
import c.e.a;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.b;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final a<s0<?>, b> f3469b;

    public c(a<s0<?>, b> aVar) {
        this.f3469b = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (s0<?> s0Var : this.f3469b.keySet()) {
            b bVar = this.f3469b.get(s0Var);
            if (bVar.x()) {
                z = false;
            }
            String a = s0Var.a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
