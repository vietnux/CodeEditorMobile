package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

public abstract class c {

    public static final class a {
        private volatile boolean a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f2706b;

        /* renamed from: c  reason: collision with root package name */
        private volatile j f2707c;

        /* synthetic */ a(Context context, e0 e0Var) {
            this.f2706b = context;
        }

        public a a(j jVar) {
            this.f2707c = jVar;
            return this;
        }

        public c a() {
            if (this.f2706b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f2707c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (this.a) {
                return new d(null, this.a, this.f2706b, this.f2707c);
            } else {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
        }

        public a b() {
            this.a = true;
            return this;
        }
    }

    public static a a(Context context) {
        return new a(context, null);
    }

    public abstract g a(Activity activity, f fVar);

    public abstract void a();

    public abstract void a(a aVar, b bVar);

    public abstract void a(e eVar);

    public abstract void a(l lVar, m mVar);

    public abstract void a(String str, i iVar);
}
