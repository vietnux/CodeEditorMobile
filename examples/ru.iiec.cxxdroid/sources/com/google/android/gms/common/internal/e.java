package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import e.b.b.a.d.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class e {
    private final Account a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f3644b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f3645c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f3646d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3647e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3648f;

    /* renamed from: g  reason: collision with root package name */
    private final c f3649g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f3650h;

    public static final class a {
        private Account a;

        /* renamed from: b  reason: collision with root package name */
        private c.e.b<Scope> f3651b;

        /* renamed from: c  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f3652c;

        /* renamed from: d  reason: collision with root package name */
        private int f3653d = 0;

        /* renamed from: e  reason: collision with root package name */
        private View f3654e;

        /* renamed from: f  reason: collision with root package name */
        private String f3655f;

        /* renamed from: g  reason: collision with root package name */
        private String f3656g;

        /* renamed from: h  reason: collision with root package name */
        private c f3657h = c.f7765i;

        public final a a(Account account) {
            this.a = account;
            return this;
        }

        public final a a(String str) {
            this.f3656g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f3651b == null) {
                this.f3651b = new c.e.b<>();
            }
            this.f3651b.addAll(collection);
            return this;
        }

        public final e a() {
            return new e(this.a, this.f3651b, this.f3652c, this.f3653d, this.f3654e, this.f3655f, this.f3656g, this.f3657h);
        }

        public final a b(String str) {
            this.f3655f = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> a;
    }

    public e(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, c cVar) {
        this.a = account;
        this.f3644b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f3646d = map == null ? Collections.EMPTY_MAP : map;
        this.f3647e = str;
        this.f3648f = str2;
        this.f3649g = cVar;
        HashSet hashSet = new HashSet(this.f3644b);
        for (b bVar : this.f3646d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.f3645c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.a;
    }

    public final void a(Integer num) {
        this.f3650h = num;
    }

    public final Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f3645c;
    }

    public final Integer d() {
        return this.f3650h;
    }

    public final String e() {
        return this.f3648f;
    }

    public final String f() {
        return this.f3647e;
    }

    public final Set<Scope> g() {
        return this.f3644b;
    }

    public final c h() {
        return this.f3649g;
    }
}
