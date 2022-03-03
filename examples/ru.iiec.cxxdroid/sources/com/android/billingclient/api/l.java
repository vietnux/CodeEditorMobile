package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

public class l {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f2754b;

    public static class a {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f2755b;

        /* synthetic */ a(x xVar) {
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(List<String> list) {
            this.f2755b = new ArrayList(list);
            return this;
        }

        public l a() {
            if (this.a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f2755b != null) {
                l lVar = new l();
                lVar.a = this.a;
                lVar.f2754b = this.f2755b;
                return lVar;
            } else {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }

    public List<String> b() {
        return this.f2754b;
    }
}
