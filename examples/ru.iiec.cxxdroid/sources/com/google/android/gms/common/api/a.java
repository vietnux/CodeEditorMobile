package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.y;
import java.util.Set;

public final class a<O extends d> {
    private final AbstractC0074a<?, O> a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f3467b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3468c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0074a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, f.a aVar, f.b bVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface AbstractC0075a extends c, AbstractC0076d {
            Account f();
        }

        public interface b extends c {
            GoogleSignInAccount a();
        }

        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        public interface AbstractC0076d extends d {
        }

        public interface e extends c, AbstractC0076d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(d.AbstractC0078d dVar);

        void a(d.j jVar);

        void a(r rVar, Set<Scope> set);

        boolean a();

        boolean b();

        int c();

        boolean d();

        com.google.android.gms.common.e[] e();

        String f();

        void g();

        boolean i();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i2, T t);

        String j();

        String k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0074a<C, O> aVar, g<C> gVar) {
        y.a(aVar, "Cannot construct an Api with a null ClientBuilder");
        y.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f3468c = str;
        this.a = aVar;
        this.f3467b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.f3467b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.f3468c;
    }

    public final AbstractC0074a<?, O> c() {
        y.b(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}
