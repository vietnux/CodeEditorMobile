package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.d;
import java.util.Set;

public abstract class l<T extends IInterface> extends d<T> implements a.f, m {
    private final Set<Scope> w;
    private final Account x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected l(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.e r13, com.google.android.gms.common.api.f.a r14, com.google.android.gms.common.api.f.b r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.n r3 = com.google.android.gms.common.internal.n.a(r10)
            com.google.android.gms.common.g r4 = com.google.android.gms.common.g.a()
            com.google.android.gms.common.internal.y.a(r14)
            r7 = r14
            com.google.android.gms.common.api.f$a r7 = (com.google.android.gms.common.api.f.a) r7
            com.google.android.gms.common.internal.y.a(r15)
            r8 = r15
            com.google.android.gms.common.api.f$b r8 = (com.google.android.gms.common.api.f.b) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.l.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.f$a, com.google.android.gms.common.api.f$b):void");
    }

    protected l(Context context, Looper looper, n nVar, g gVar, int i2, e eVar, f.a aVar, f.b bVar) {
        super(context, looper, nVar, gVar, i2, a(aVar), a(bVar), eVar.e());
        this.x = eVar.a();
        Set<Scope> c2 = eVar.c();
        b(c2);
        this.w = c2;
    }

    private static d.a a(f.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new i0(aVar);
    }

    private static d.b a(f.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new j0(bVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.d
    public int c() {
        return super.c();
    }

    @Override // com.google.android.gms.common.internal.d
    public final Account l() {
        return this.x;
    }

    @Override // com.google.android.gms.common.internal.d
    public e[] t() {
        return new e[0];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final Set<Scope> u() {
        return this.w;
    }
}
