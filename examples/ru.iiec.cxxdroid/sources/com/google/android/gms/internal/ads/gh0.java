package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class gh0 implements pf0, fh0 {

    /* renamed from: b  reason: collision with root package name */
    private final eh0 f4423b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, e0<? super eh0>>> f4424c = new HashSet<>();

    public gh0(eh0 eh0) {
        this.f4423b = eh0;
    }

    @Override // com.google.android.gms.internal.ads.eh0
    public final void a(String str, e0<? super eh0> e0Var) {
        this.f4423b.a(str, e0Var);
        this.f4424c.remove(new AbstractMap.SimpleEntry(str, e0Var));
    }

    @Override // com.google.android.gms.internal.ads.pf0
    public final void a(String str, String str2) {
        qf0.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, Map map) {
        qf0.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ff0, com.google.android.gms.internal.ads.pf0
    public final void a(String str, JSONObject jSONObject) {
        qf0.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void b() {
        Iterator<AbstractMap.SimpleEntry<String, e0<? super eh0>>> it = this.f4424c.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, e0<? super eh0>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            l9.e(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f4423b.a(next.getKey(), next.getValue());
        }
        this.f4424c.clear();
    }

    @Override // com.google.android.gms.internal.ads.gg0, com.google.android.gms.internal.ads.pf0
    public final void b(String str) {
        this.f4423b.b(str);
    }

    @Override // com.google.android.gms.internal.ads.eh0
    public final void b(String str, e0<? super eh0> e0Var) {
        this.f4423b.b(str, e0Var);
        this.f4424c.add(new AbstractMap.SimpleEntry<>(str, e0Var));
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        qf0.a(this, str, jSONObject);
    }
}
