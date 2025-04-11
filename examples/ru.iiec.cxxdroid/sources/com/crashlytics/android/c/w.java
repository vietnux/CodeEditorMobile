package com.crashlytics.android.c;

import android.content.Context;
import f.a.a.a.n.b.k;
import f.a.a.a.n.d.b;
import f.a.a.a.n.d.c;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class w extends b<a0> {

    /* renamed from: g  reason: collision with root package name */
    private f.a.a.a.n.g.b f2871g;

    w(Context context, c0 c0Var, k kVar, c cVar) {
        super(context, c0Var, kVar, cVar, 100);
    }

    /* access modifiers changed from: package-private */
    public void a(f.a.a.a.n.g.b bVar) {
        this.f2871g = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.d.b
    public String c() {
        UUID randomUUID = UUID.randomUUID();
        return "sa" + "_" + randomUUID.toString() + "_" + this.f8491c.a() + ".tap";
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.d.b
    public int e() {
        f.a.a.a.n.g.b bVar = this.f2871g;
        return bVar == null ? super.e() : bVar.f8536c;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.n.d.b
    public int f() {
        f.a.a.a.n.g.b bVar = this.f2871g;
        return bVar == null ? super.f() : bVar.f8537d;
    }
}
