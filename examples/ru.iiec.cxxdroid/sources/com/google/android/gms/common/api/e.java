package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.y;
import java.util.Collections;

public class e<O extends a.d> {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f3470b;

    /* renamed from: c  reason: collision with root package name */
    private final O f3471c;

    /* renamed from: d  reason: collision with root package name */
    private final s0<O> f3472d;

    /* renamed from: e  reason: collision with root package name */
    private final Looper f3473e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3474f;

    /* renamed from: g  reason: collision with root package name */
    private final f f3475g;

    /* renamed from: h  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.e f3476h;

    public static class a {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f3477b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0077a {
            private k a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f3478b;

            public C0077a a(k kVar) {
                y.a(kVar, "StatusExceptionMapper must not be null.");
                this.a = kVar;
                return this;
            }

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f3478b == null) {
                    this.f3478b = Looper.getMainLooper();
                }
                return new a(this.a, this.f3478b);
            }
        }

        static {
            new C0077a().a();
        }

        private a(k kVar, Account account, Looper looper) {
            this.a = kVar;
            this.f3477b = looper;
        }
    }

    public e(Context context, a<O> aVar, O o, a aVar2) {
        y.a(context, "Null context is not permitted.");
        y.a(aVar, "Api must not be null.");
        y.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.f3470b = aVar;
        this.f3471c = o;
        this.f3473e = aVar2.f3477b;
        this.f3472d = s0.a(this.f3470b, this.f3471c);
        this.f3475g = new a0(this);
        this.f3476h = com.google.android.gms.common.api.internal.e.a(this.a);
        this.f3474f = this.f3476h.a();
        k kVar = aVar2.a;
        this.f3476h.a((e<?>) this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.k r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.k):void");
    }

    private final <A extends a.b, T extends c<? extends j, A>> T a(int i2, T t) {
        t.c();
        this.f3476h.a(this, i2, t);
        return t;
    }

    public a.f a(Looper looper, e.a<O> aVar) {
        return this.f3470b.c().a(this.a, looper, b().a(), this.f3471c, aVar, aVar);
    }

    public f a() {
        return this.f3475g;
    }

    public <A extends a.b, T extends c<? extends j, A>> T a(T t) {
        a(0, t);
        return t;
    }

    public f0 a(Context context, Handler handler) {
        return new f0(context, handler, b().a());
    }

    /* access modifiers changed from: protected */
    public e.a b() {
        Account account;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        e.a aVar = new e.a();
        O o = this.f3471c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.f3471c;
            account = o2 instanceof a.d.AbstractC0075a ? ((a.d.AbstractC0075a) o2).f() : null;
        } else {
            account = a3.t();
        }
        aVar.a(account);
        O o3 = this.f3471c;
        aVar.a((!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : a2.D());
        aVar.a(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public final int c() {
        return this.f3474f;
    }

    public Looper d() {
        return this.f3473e;
    }

    public final s0<O> e() {
        return this.f3472d;
    }
}
