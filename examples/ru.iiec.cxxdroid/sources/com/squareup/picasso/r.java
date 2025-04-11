package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import i.a0;
import i.b0;
import i.d;
import i.y;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class r extends y {
    private final j a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f6866b;

    /* access modifiers changed from: package-private */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    static final class b extends IOException {

        /* renamed from: b  reason: collision with root package name */
        final int f6867b;

        /* renamed from: c  reason: collision with root package name */
        final int f6868c;

        b(int i2, int i3) {
            super("HTTP " + i2);
            this.f6867b = i2;
            this.f6868c = i3;
        }
    }

    r(j jVar, a0 a0Var) {
        this.a = jVar;
        this.f6866b = a0Var;
    }

    private static y b(w wVar, int i2) {
        d dVar;
        if (i2 == 0) {
            dVar = null;
        } else if (q.a(i2)) {
            dVar = d.n;
        } else {
            d.a aVar = new d.a();
            if (!q.b(i2)) {
                aVar.b();
            }
            if (!q.c(i2)) {
                aVar.c();
            }
            dVar = aVar.a();
        }
        y.a aVar2 = new y.a();
        aVar2.b(wVar.f6912d.toString());
        if (dVar != null) {
            aVar2.a(dVar);
        }
        return aVar2.a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public int a() {
        return 2;
    }

    @Override // com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        a0 a2 = this.a.a(b(wVar, i2));
        b0 l2 = a2.l();
        if (a2.r()) {
            t.e eVar = a2.n() == null ? t.e.NETWORK : t.e.DISK;
            if (eVar == t.e.DISK && l2.l() == 0) {
                l2.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == t.e.NETWORK && l2.l() > 0) {
                this.f6866b.a(l2.l());
            }
            return new y.a(l2.m(), eVar);
        }
        l2.close();
        throw new b(a2.o(), wVar.f6911c);
    }

    @Override // com.squareup.picasso.y
    public boolean a(w wVar) {
        String scheme = wVar.f6912d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public boolean a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.y
    public boolean b() {
        return true;
    }
}
