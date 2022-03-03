package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@k2
public final class e9 implements h10 {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final a9 f4196b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<s8> f4197c;

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<d9> f4198d;

    public e9() {
        this(a50.d());
    }

    private e9(String str) {
        this.a = new Object();
        this.f4197c = new HashSet<>();
        this.f4198d = new HashSet<>();
        this.f4196b = new a9(str);
    }

    public final Bundle a(Context context, b9 b9Var, String str) {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f4196b.a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator<d9> it = this.f4198d.iterator();
            while (it.hasNext()) {
                d9 next = it.next();
                bundle2.putBundle(next.b(), next.a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<s8> it2 = this.f4197c.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            b9Var.a(this.f4197c);
            this.f4197c.clear();
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.a) {
            this.f4196b.a();
        }
    }

    public final void a(d9 d9Var) {
        synchronized (this.a) {
            this.f4198d.add(d9Var);
        }
    }

    public final void a(j40 j40, long j2) {
        synchronized (this.a) {
            this.f4196b.a(j40, j2);
        }
    }

    public final void a(s8 s8Var) {
        synchronized (this.a) {
            this.f4197c.add(s8Var);
        }
    }

    public final void a(HashSet<s8> hashSet) {
        synchronized (this.a) {
            this.f4197c.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.h10
    public final void a(boolean z) {
        long a2 = x0.m().a();
        if (z) {
            if (a2 - x0.j().m().i() > ((Long) a50.g().a(k80.G0)).longValue()) {
                this.f4196b.f3775d = -1;
                return;
            }
            this.f4196b.f3775d = x0.j().m().j();
            return;
        }
        x0.j().m().a(a2);
        x0.j().m().b(this.f4196b.f3775d);
    }

    public final void b() {
        synchronized (this.a) {
            this.f4196b.b();
        }
    }
}
