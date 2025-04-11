package com.android.billingclient.api;

public final class a {
    private String a;

    /* renamed from: com.android.billingclient.api.a$a  reason: collision with other inner class name */
    public static final class C0067a {
        private String a;

        /* synthetic */ C0067a(n nVar) {
        }

        public C0067a a(String str) {
            this.a = str;
            return this;
        }

        public a a() {
            if (this.a != null) {
                a aVar = new a(null);
                aVar.a = this.a;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }
    }

    /* synthetic */ a(n nVar) {
    }

    public static C0067a b() {
        return new C0067a(null);
    }

    public String a() {
        return this.a;
    }
}
