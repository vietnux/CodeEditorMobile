package com.android.billingclient.api;

public final class g {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private String f2735b;

    public static class a {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private String f2736b = "";

        /* synthetic */ a(u uVar) {
        }

        public a a(int i2) {
            this.a = i2;
            return this;
        }

        public a a(String str) {
            this.f2736b = str;
            return this;
        }

        public g a() {
            g gVar = new g();
            gVar.a = this.a;
            gVar.f2735b = this.f2736b;
            return gVar;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f2735b;
    }

    public int b() {
        return this.a;
    }
}
